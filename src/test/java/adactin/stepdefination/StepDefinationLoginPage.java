package adactin.stepdefination;

import org.junit.Assert;

import adactin.base.BaseMain;
import adactin.pageobject.LoginPageObject;
import adactin.utility.Utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationLoginPage extends BaseMain {

	LoginPageObject loginPage;
	Utility utility;
	@Given("user intialize the brower")
	public void user_intialize_the_brower() {
	    initialization();
	}

	@When("user enter the username and password")
	public void user_enter_the_username_and_password() {
		loginPage = new LoginPageObject();
		utility = new Utility();
		utility.configExcel("C:\\Users\\taranga\\eclipse-workspace\\adactincucumber\\src\\test\\resources\\testData\\adactinTestData.xlsx");
	    writeText(loginPage.getUserName(),utility.getData("LoginTest",1,0));
	    writeText(loginPage.getPassWd(), utility.getData("LoginTest",1,1));
	}
	

	@When("user enter the valid username and invalid password")
	public void user_enter_the_valid_username_and_invalid_password() {
    
	}
	
	@When("user click on Login button")
	public void user_click_on_Login_button() {
	   loginPage = new LoginPageObject();
	   clickbtn(loginPage.getBtnlogin());
	}

	@Then("user verify the home page")
	public void user_verify_the_home_page() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		boolean rlt = url.contains("SearchHotel");
	    Assert.assertTrue("Incorrect username or password", rlt);;
	}

	@Then("user close the brower")
	public void user_close_the_brower() {
	    tearDown();
	}
	
}
