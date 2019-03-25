package cucumberOptions;



import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/resources",
		glue="stepDefinitions")

public class TestRunner extends AbstractTestNGCucumberTests{

}

