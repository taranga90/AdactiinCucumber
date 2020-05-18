package adactin.stepdefination;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import adactin.base.BaseMain;
import io.cucumber.core.api.Scenario;
import io.cucumber.core.event.Status;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseMain{

	@Before
	public void beforeScenario(Scenario sc) {
		String name = sc.getName();
		System.out.println("Scenario name : "+name);
	}
	
	@After
	public void afterScenario(Scenario sc) {
		Status st = sc.getStatus();
		System.out.println(st);
		
		if(sc.isFailed()) {
			TakesScreenshot tk = (TakesScreenshot)driver;
			byte[] bt = tk.getScreenshotAs(OutputType.BYTES);
			sc.embed(bt, "scenarioScreenshot/png");
		}
	}
	
}
