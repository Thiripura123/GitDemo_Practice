package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features="src/main/java/Feature",
	glue ="Stepdefinition",stepNotifications=true,tags="@MobileTest",monochrome=true,dryRun=true,
	plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/test.xml"})

public class TestRunner {

}
