package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src//test//java//features", glue="step_definitions", monochrome = true,
tags = {},dryRun = false,
plugin = {"pretty", "html:target/cucumber","json:target/cucumber.json", 
				})

public class TestRunner  extends AbstractTestNGCucumberTests {
	
	

}
