package adactin.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adactin.base.BaseMain;

public class LoginPageObject extends BaseMain{

	//constructor
	
	public LoginPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	//Object repository
	
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement passWd;
	
	@FindBy(id="login")
	private WebElement btnlogin;
	
	//getters
	
	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWd() {
		return passWd;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
}
