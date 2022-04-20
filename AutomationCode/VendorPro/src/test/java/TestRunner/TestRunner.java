package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		stepNotifications = true ,
		features = {"src/test/resources/features"},
		glue= {"stepdefinitions" , "Hooks"},
				tags= "@AudiCoreBoost or ~@VWCoreBoost or ~@SkodaCoreBoost or ~@SkodaFreeDelivery or ~@SEATCoreBoost"
						 ,
				plugin = {"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestRunner {

}


 