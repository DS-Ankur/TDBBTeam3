package cucumberoptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class) // comment it out if you want to run it through TestNG xml
@CucumberOptions(
		features = "src/test/java/features",
		glue = "StepDefinitions")
public class TestRunner extends AbstractTestNGCucumberTests{   ///extend to AbstractTestNGCucumberTests only if you 
	//want to run it through TestNG xml otherwise it willtreat it as Junit

}
