package adactin.runners;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import adactin.utility.JVMReport;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\features\\loginTest.feature"},
glue = {"adactin.stepdefination"},
tags = {"@functional"},
plugin = {"json:Reports\\jsonReport.json"},
monochrome = true,
dryRun = false)

public class RunnerClass {
	
	@AfterClass
	public static void afterTestRunner() {
		JVMReport.generateJVMReport(System.getProperty("user.dir")+"\\Reports\\jsonReport.json");
	}
}
