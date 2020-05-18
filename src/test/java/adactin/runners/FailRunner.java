package adactin.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"@src\\test\\resources\\failed.txt"},
glue = {"adactin.stepdefination"},
plugin = {"pretty"})

public class FailRunner {

}
