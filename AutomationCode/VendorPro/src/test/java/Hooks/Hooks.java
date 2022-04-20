package Hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Driver.Driver;
import Util.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {

	private Driver driverf;
	private ConfigReader configReader;
	private WebDriver driver;
	Properties prop;
	
	@Before(order = 0)
	public void getProperty() {
		configReader=new ConfigReader();
		prop=configReader.init_prop();
	}
	
	@Before(order=1)
	public void launchBrowser() {
		String browserName=prop.getProperty("browser");
		driverf=new Driver();
		driver = driverf.init_driver(browserName);
		
	}
	
	@After(order=0)
	public void quitBrowser() {
		driver.quit();
	}
	
	@After(order=1)
	public void teardown(Scenario scenario) {
		
	if(scenario.isFailed()) {
		String screenshotName=scenario.getName().replace(" ", "_");
		byte[] sourcepath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(sourcepath,"image/png",screenshotName);
	}
	}
	
}