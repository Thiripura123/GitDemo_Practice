package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions
(
	features="src/main/java/Feature",
	glue ="Stepdefinition",tags="@MobileTest",monochrome=true
	//plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:/target/Failed_Scenario.txt"}
	)
		
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
