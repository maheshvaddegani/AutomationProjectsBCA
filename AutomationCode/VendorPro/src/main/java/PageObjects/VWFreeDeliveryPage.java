package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Driver.Driver;

public class VWFreeDeliveryPage {
	

	
	 private WebDriver driver;
	  
	  private By userId = By.id("username");
	  private By password = By.id("password");
	  private By Login = By.id("Login");
	  private By Targets = By.xpath("//a[@title='Targets']");
	  private By New = By.xpath("//a[@title='New']");
	  private By VWFree = By.xpath("(//span[@class='slds-radio--faux'])[9]");
	  private By Next = By.xpath("//span[text()='Next']");
	  private By AssertPage1 = By.xpath("//h2[text()='New Target: VW Free Delivery']");
	  
	  private By Brand = By.xpath("(//input[@role='combobox'])[3]");
	  private By GroupAccountName = By.xpath("(//input[@role='combobox'])[4]");
	  private By Starttime = By.xpath("(//input[@name='Start_Date__c'])[1]");
	  private By Parent = By.xpath("//input[@placeholder='Search Parent Targets...']");
	  private By TargetNote = By.xpath("//input[@name='Target__c']");
	  private By Endtime = By.xpath("(//input[@name='End_Date__c'])[1]");
	  private By TargetType = By.xpath("(//input[@role='combobox'])[7]");
	  private By TargetperiodType = By.xpath("(//input[@role='combobox'])[9]");
	  private By TargetPeriod = By.xpath("//lightning-base-combobox-item[@data-value='Monthly']");
	  private By TargetAchieved = By.xpath("//input[@name='Target_Achieved__c']");
	  private By FreeDelivery = By.xpath("//input[@name='Free_Delivery_Achieved__c']");
	  private By AdditionalPurchase = By.xpath("//input[@name='Additional_Purchases_Needed_this_Period__c']");
	  private By Save = By.xpath("//button[@name='SaveEdit']");
	  private By AssertValue1 = By.xpath("//lightning-formatted-text[text()='Volkswagen']");
	  private By AssertValue2 = By.xpath("//span[text()='VW Free Delivery']");
	  
	  
	  private By NewDealer = By.xpath("(//button[@name='New'])[1]");
	  private By Dealer1 = By.xpath("//input[@placeholder='Search Accounts...']");
	  private By Dealerid1 = By.xpath("//input[@placeholder='Search Related Dealerships...']");
	  private By NoOfPur = By.xpath("//input[@name='Number_of_Purchases_Needed__c']");
	  private By AssertDealer1 = By.xpath("//lightning-formatted-text[text()='JJ12345']");
	  
	  private By AssertDeliveryCharge = By.xpath("//lightning-formatted-text[text()='£160.00']");
	  private By AssertTotalDelivery = By.xpath("//lightning-formatted-text[text()='£160.00']");
	  private By AssertFreeDelivery = By.xpath("(//lightning-formatted-number[text()='2'])[3]");
	  
	  
	  public VWFreeDeliveryPage(WebDriver driver)
	  {
		  this.driver = driver;
	  }
/*------------------------------------------------------------------Create New Target----------------------------------------------------------------------*/	  
	  public void UserisonTargetPage1() throws InterruptedException
	  {   
		  driver.findElement(userId).sendKeys("john.johnson-biz@bca.com");
		  driver.findElement(password).sendKeys("Salesforce12#");
		  driver.findElement(Login).click();
		  Thread.sleep(5000);
		  WebElement element = driver.findElement(Targets);
	      JavascriptExecutor executor = (JavascriptExecutor)driver;
	      executor.executeScript("arguments[0].click();", element);
	      Thread.sleep(2000);
		  WebElement element1 = driver.findElement(New);
	      JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	      executor1.executeScript("arguments[0].click();", element1);
	      driver.findElement(VWFree).click();
		  driver.findElement(Next).click();
	  }
	  
	  public String AssertPage1()
	  {   
		  WebDriverWait wait = new WebDriverWait(driver,100);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertPage1));
	   return driver.findElement(AssertPage1).getText();
	  
	  }
	  
	  public void UserFillsMandatoryFields1() throws InterruptedException
	  {
	      
	      driver.findElement(GroupAccountName).sendKeys("JJ Cars");
	      WebElement from1 = driver.findElement(GroupAccountName); 
	      Thread.sleep(1500);
	      from1.sendKeys(Keys.ARROW_DOWN);
	      from1.sendKeys(Keys.ENTER);
	      
	      driver.findElement(Starttime).sendKeys("21/06/2021");
	      
	      driver.findElement(Parent).click();
	      driver.findElement(Parent).sendKeys("JJ Cars Trimester 2 2021 VRB VW");
		  WebElement from2 = driver.findElement(Parent);  
		  Thread.sleep(2500);
		  from2.sendKeys(Keys.ARROW_DOWN);
	      from2.sendKeys(Keys.ENTER);
	      
	      driver.findElement(TargetNote).sendKeys("Test VW Delivery");
	      
	      WebDriverWait wait1 = new WebDriverWait(driver,1000);
	 	  wait1.until(ExpectedConditions.visibilityOfElementLocated(TargetType));	
	      WebElement element2 = driver.findElement(TargetType);
	      JavascriptExecutor executor2 = (JavascriptExecutor)driver;
	      executor2.executeScript("arguments[0].click();", element2);
		  WebElement from3 = driver.findElement(TargetType);     
	      from3.sendKeys(Keys.ARROW_DOWN);
	      from3.sendKeys(Keys.ENTER);
	      
	      driver.findElement(Endtime).sendKeys("21/06/2021");
	      
	      WebDriverWait wait2 = new WebDriverWait(driver,1000);
	 	  wait2.until(ExpectedConditions.elementToBeClickable(TargetperiodType));	   
	 	  driver.findElement(TargetperiodType).click();
	 	  WebElement element3 = driver.findElement(TargetperiodType);
	      JavascriptExecutor executor3 = (JavascriptExecutor)driver;
	      executor3.executeScript("arguments[0].click();", element3);
	 	  
	 	  WebDriverWait wait3 = new WebDriverWait(driver,1000);
	 	  wait3.until(ExpectedConditions.elementToBeClickable(TargetPeriod));	  
		  driver.findElement(TargetPeriod).click();
		  
		  WebElement element1 = driver.findElement(TargetAchieved);
	      JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	      executor1.executeScript("arguments[0].click();", element1);
		  
		  driver.findElement(AdditionalPurchase).sendKeys("2");
		  
		  JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	      	 jse1.executeScript("scroll(0, 700);");
	      	 
	      	 WebElement element4 = driver.findElement(FreeDelivery);
		      JavascriptExecutor executor4 = (JavascriptExecutor)driver;
		      executor4.executeScript("arguments[0].click();", element4);
	      	 
	      	 driver.findElement(Save).click();
	    }
	  
	  public String AssertValue1()
	  {   
		  WebDriverWait wait = new WebDriverWait(driver,100);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertValue1));
	   return driver.findElement(AssertValue1).getText();
	   
		
	  
	  } 
	  
	
   	 
	  public String AssertValue2()
	  {   
		  WebDriverWait wait = new WebDriverWait(driver,100);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertValue2));
	   return driver.findElement(AssertValue2).getText();
	  
	  }
	  
	  
	  
	  public void UserClicksNew() throws InterruptedException
	  {   
		  JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		   	 jse2.executeScript("scroll(0, 1200);");
		   	 Thread.sleep(2000);
		  driver.findElement(NewDealer).click();
		  
	  }
	  
	  public void UserEntersDealers() throws InterruptedException
	  {   
		  driver.findElement(Dealer1).sendKeys("JJ");
	      WebElement from4 = driver.findElement(Dealer1); 
	      Thread.sleep(1500);
	      from4.sendKeys(Keys.ARROW_DOWN);
	      from4.sendKeys(Keys.ENTER);
	      
	      driver.findElement(Dealerid1).click();
	      WebElement from5 = driver.findElement(Dealerid1); 
	      Thread.sleep(2500);
	      from5.sendKeys(Keys.ENTER);
	      
	      //driver.findElement(NoOfPur).sendKeys("3");
	      
	      driver.findElement(Save).click();
	      Thread.sleep(1000);
	      JavascriptExecutor jse3 = (JavascriptExecutor)driver;
		   	 jse3.executeScript("scroll(0, 1200);");
	  }
	  
	  public String AssertDealer1()
	  {   
		  WebDriverWait wait = new WebDriverWait(driver,100);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertDealer1));
	   return driver.findElement(AssertDealer1).getText();
	  
	  }
	  
	  
	  
	  
	  public String AssertDelCharge()
	  {   
		  JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		   	 jse2.executeScript("scroll(0,300);");
		  WebDriverWait wait = new WebDriverWait(driver,100);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertDeliveryCharge));
	   return driver.findElement(AssertDeliveryCharge).getText();
	  
	  }
	  public String AssertTotalDelCharge()
	  {   
		  WebDriverWait wait = new WebDriverWait(driver,100);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertTotalDelivery));
	   return driver.findElement(AssertTotalDelivery).getText();
	  
	  }
	  public String AssertFreeDel()
	  {   
		  
		  WebDriverWait wait = new WebDriverWait(driver,100);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertFreeDelivery));
	   return driver.findElement(AssertFreeDelivery).getText();
	  
	  }
	  

}
