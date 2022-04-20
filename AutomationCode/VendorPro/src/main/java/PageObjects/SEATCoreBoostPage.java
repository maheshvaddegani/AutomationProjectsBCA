package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SEATCoreBoostPage {
	
	
	 private WebDriver driver;
	  
	 private By userId = By.id("username");
	 private By password = By.id("password");
	 private By Login = By.id("Login");
	 private By Targets = By.xpath("//a[@title='Targets']");
	 private By New = By.xpath("//a[@title='New']");
	 private By SEATCB = By.xpath("(//span[@class='slds-radio--faux'])[6]");
	 private By Next = By.xpath("//span[text()='Next']");
	 private By AssertPage1 = By.xpath("//h2[text()='New Target: SEAT Core & Boost Value']");
	  
	
	 private By GroupAccountName = By.xpath("(//input[@role='combobox'])[2]");
	 private By Starttime = By.xpath("(//input[@name='Start_Date__c'])[1]");
	 private By Parent = By.xpath("//input[@placeholder='Search Parent Targets...']");
	 private By TargetNote = By.xpath("//input[@name='Target__c']");
	 private By Endtime = By.xpath("(//input[@name='End_Date__c'])[1]");
	 private By TargetType = By.xpath("(//input[@role='combobox'])[5]");
	 private By TargetperiodType = By.xpath("(//input[@role='combobox'])[7]");
	 private By TargetPeriod = By.xpath("//lightning-base-combobox-item[@data-value='Monthly']");
	 
	  private By SEATNonCore = By.xpath("//input[@name='Non_Core_Vehicle_Value__c']");
	  private By SEATCore = By.xpath("//input[@name='Core_Vehicle_Value__c']");
	  private By SEATCount = By.xpath("//input[@name='Count_Only__c']");
	  private By Save = By.xpath("//button[@name='SaveEdit']");
	  private By AssertValue1 = By.xpath("//lightning-formatted-text[text()='Seat']");
	  private By AssertValue2 = By.xpath("//span[text()='SEAT Core & Boost Value']");
	  
	  
	  private By NewDealer = By.xpath("(//button[@name='New'])[1]");
	  private By Dealer1 = By.xpath("//input[@placeholder='Search Accounts...']");
	  private By Dealerid1 = By.xpath("//input[@placeholder='Search Related Dealerships...']");
	  private By Purchases = By.xpath("//input[@name='Number_of_Purchases_Needed__c']");
	  private By AssertDealer1 = By.xpath("//span[text()='JJSEAT']");
	  
	  private By NewVehicle = By.xpath("(//button[@name='New'])[2]");
	  private By VehicleName = By.xpath("//input[@name='Name']");
	  private By Vehicle1 = By.xpath("//input[@placeholder='Search Vehicles...']");
	  private By CheckinCore = By.xpath("//span[text()='Core Vehicle']");
	  private By AssertVehicle1 = By.xpath("//lightning-formatted-text[text()='81589']");
	  private By AssertVehicle2 = By.xpath("//lightning-formatted-text[text()='84985']");
	  private By AssertVehicle3 = By.xpath("//lightning-formatted-text[text()='85109']");
	  private By AssertVehicle4 = By.xpath("//lightning-formatted-text[text()='87878']");
	  
	  
	  private By IMS = By.xpath("//a[@title='IMS Purchase Records']");
	  private By Purchasestatus = By.xpath("(//input[@role='combobox'])[2]");
	  private By VATstatus = By.xpath("(//input[@role='combobox'])[3]");
	  private By VIN = By.xpath("//input[@name='VIN__c']");
	  private By FranchiseID = By.xpath("//input[@name='Dealer_Franchise_ID__c']");
	  private By RegNo = By.xpath("//input[@name='Vehicle_Registration__c']");
	  private By CAPID = By.xpath("//input[@name='CAP_Id__c']");
	  private By SoldDate = By.xpath("//input[@name='Sold_Date_Time__c']");
	  private By Model = By.xpath("//input[@name='Model__c']");
	  private By AssertVP1 = By.xpath("//lightning-formatted-text[text()='BBN87II']");
	  private By AssertVP2 = By.xpath("//lightning-formatted-text[text()='AAQ76WW']");
	  private By AssertVP3 = By.xpath("//lightning-formatted-text[text()='GGU14GN']");
	  private By AssertVP4 = By.xpath("//lightning-formatted-text[text()='LPA54OI']");
	  
	 
	  private By AssertCoreBonus = By.xpath("//lightning-formatted-text[text()='£900.00']");
	  private By AssertNonCoreBonus = By.xpath("//lightning-formatted-text[text()='£1,200.00']");
	  private By AssertTotalBonus = By.xpath("//lightning-formatted-text[text()='£2,100.00']");
	  
	  private By targetValue = By.xpath("(//a[@target='_blank'])[1]");
	  
	  public SEATCoreBoostPage(WebDriver driver)
	  {
		  this.driver = driver;
	  }
/*------------------------------------------------------------------Create New Target----------------------------------------------------------------------*/	  
	  public void UserisonTargetPage() throws InterruptedException
	  {   
		  driver.findElement(userId).sendKeys("john.johnson-biz@bca.com.rms.uat");
		  driver.findElement(password).sendKeys("Salesforce21#");
		  driver.findElement(Login).click();
		  Thread.sleep(5000);
		  WebElement element = driver.findElement(Targets);
	      JavascriptExecutor executor = (JavascriptExecutor)driver;
	      executor.executeScript("arguments[0].click();", element);
	      Thread.sleep(2000);
		  WebElement element1 = driver.findElement(New);
	      JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	      executor1.executeScript("arguments[0].click();", element1);
	      driver.findElement(SEATCB).click();
		  driver.findElement(Next).click();
	  }
	  
	  public String AssertPage1()
	  {   
		  WebDriverWait wait = new WebDriverWait(driver,100);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertPage1));
	   return driver.findElement(AssertPage1).getText();
	  
	  }
	  
	  public void UserFillsMandatoryFields() throws InterruptedException
	  {
	      
	      driver.findElement(GroupAccountName).sendKeys("JJ Cars");
	      WebElement from1 = driver.findElement(GroupAccountName); 
	      Thread.sleep(1500);
	      from1.sendKeys(Keys.ARROW_DOWN);
	      from1.sendKeys(Keys.ENTER);
	      
	      driver.findElement(Starttime).sendKeys("12/10/2021");
	      
	      driver.findElement(Parent).click();
	      driver.findElement(Parent).sendKeys("JJ Cars SEAT Trimester 4 2021");
		  WebElement from2 = driver.findElement(Parent);  
		  Thread.sleep(2500);
		  from2.sendKeys(Keys.ARROW_DOWN);
	      from2.sendKeys(Keys.ENTER);
	      
	      driver.findElement(TargetNote).sendKeys("Test Target SEAT");
	      
	      WebDriverWait wait1 = new WebDriverWait(driver,1000);
	 	  wait1.until(ExpectedConditions.visibilityOfElementLocated(TargetType));	
	      WebElement element2 = driver.findElement(TargetType);
	      JavascriptExecutor executor2 = (JavascriptExecutor)driver;
	      executor2.executeScript("arguments[0].click();", element2);
		  WebElement from3 = driver.findElement(TargetType);     
	      from3.sendKeys(Keys.ARROW_DOWN);
	      from3.sendKeys(Keys.ENTER);
	      
	      driver.findElement(Endtime).sendKeys("31/10/2021");
	      
	      WebDriverWait wait2 = new WebDriverWait(driver,1000);
	 	  wait2.until(ExpectedConditions.elementToBeClickable(TargetperiodType));	   
	 	  driver.findElement(TargetperiodType).click();
	 	  WebElement element3 = driver.findElement(TargetperiodType);
	      JavascriptExecutor executor3 = (JavascriptExecutor)driver;
	      executor3.executeScript("arguments[0].click();", element3);
	 	  
	 	  WebDriverWait wait3 = new WebDriverWait(driver,1000);
	 	  wait3.until(ExpectedConditions.elementToBeClickable(TargetPeriod));	  
		  driver.findElement(TargetPeriod).click();
		
		  
		  JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	      	 jse1.executeScript("scroll(0, 700);");
	      	
	      	 
	      	 driver.findElement(SEATNonCore).sendKeys("450");
	      	 driver.findElement(SEATCore).sendKeys("600");
	      	 driver.findElement(SEATCount).sendKeys("0");
	      	
	      	 
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
	  
	  
	  
	   /*------------------------------------------------------------------Add New dealers-Dealer-1----------------------------------------------------------------------*/	
	  
	  public void UserClicksNew() throws InterruptedException
	  {   
		  JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		   	 jse2.executeScript("scroll(0, 1200);");
		   	 Thread.sleep(2000);
		  driver.findElement(NewDealer).click();
		  
	  }
	  
	  public void UserEntersDealers() throws InterruptedException
	  {   
		  driver.findElement(Dealer1).sendKeys("JJ Cars");
	      WebElement from4 = driver.findElement(Dealer1); 
	      Thread.sleep(1500);
	      from4.sendKeys(Keys.ARROW_DOWN);
	      from4.sendKeys(Keys.ENTER);
	      
	      driver.findElement(Dealerid1).sendKeys("MD-008320");
	      WebElement from5 = driver.findElement(Dealerid1); 
	      Thread.sleep(1500);
	     from5.sendKeys(Keys.ARROW_DOWN);
	     from5.sendKeys(Keys.ARROW_DOWN);
	      from5.sendKeys(Keys.ENTER);
	      
	      
		  driver.findElement(Purchases).sendKeys("4");
	      
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
	  
	  
	  
	 
		  
		  
		   /*------------------------------------------------------------------Add New Vehicles-Vehicle1----------------------------------------------------------------------*/	
		  
		  public void UserClicksNewVehicle() throws InterruptedException
		  {   
			  JavascriptExecutor jse3 = (JavascriptExecutor)driver;
			   	 jse3.executeScript("scroll(0, 2000);");
			   	 Thread.sleep(2500);
			  driver.findElement(NewVehicle).click();
			  
		  }
		  
		  public void UserEntersVehicle() throws InterruptedException
		  {   
			  driver.findElement(VehicleName).sendKeys("ARONA");
		      
		      
		      driver.findElement(Vehicle1).sendKeys("VEH-000000994");
		      WebElement from5 = driver.findElement(Vehicle1); 
		      Thread.sleep(2000);
		      from5.sendKeys(Keys.ARROW_DOWN);
		      from5.sendKeys(Keys.ENTER);
		      
		      driver.findElement(Save).click();
		      Thread.sleep(1000);
		      JavascriptExecutor jse3 = (JavascriptExecutor)driver;
			   	 jse3.executeScript("scroll(0, 1200);");
		  }
		  
		  public String AssertVehicle1()
		  {   
			  WebDriverWait wait = new WebDriverWait(driver,100);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertVehicle1));
		   return driver.findElement(AssertVehicle1).getText();
		  
		  }
		  
  /*------------------------------------------------------------------Add New Vehicles-Vehicle2----------------------------------------------------------------------*/	
		  
		  public void UserClicksNewVehicle2() throws InterruptedException
		  {   
			  JavascriptExecutor jse2 = (JavascriptExecutor)driver;
			   	 jse2.executeScript("scroll(0, 2500);");
			   	 Thread.sleep(2000);
			  driver.findElement(NewVehicle).click();
			  
		  }
		  
		  public void UserEntersVehicle2() throws InterruptedException
		  {   
			  driver.findElement(VehicleName).sendKeys("ATECA");
			  
			  
		      //driver.findElement(CheckinCore).click();
		      WebElement element2 = driver.findElement(CheckinCore);
		      JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		      executor2.executeScript("arguments[0].click();", element2);
		      
		      Thread.sleep(1000);
		      driver.findElement(Vehicle1).sendKeys("VEH-000001016");
		      WebElement from5 = driver.findElement(Vehicle1); 
		      Thread.sleep(2000);
		      from5.sendKeys(Keys.ARROW_DOWN);
		      from5.sendKeys(Keys.ENTER);
		      
		
		      
		      driver.findElement(Save).click();
		      Thread.sleep(1000);
		      JavascriptExecutor jse3 = (JavascriptExecutor)driver;
			   	 jse3.executeScript("scroll(0, 1200);");
		  }
		  
		  public String AssertVehicle2()
		  {   
			  WebDriverWait wait = new WebDriverWait(driver,100);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertVehicle2));
		   return driver.findElement(AssertVehicle2).getText();
		  
		  }
		  
		  
   /*------------------------------------------------------------------Add New Vehicles-Vehicle3----------------------------------------------------------------------*/	
		  
		  public void UserClicksNewVehicle3() throws InterruptedException
		  {   
			  JavascriptExecutor jse2 = (JavascriptExecutor)driver;
			   	 jse2.executeScript("scroll(0, 2000);");
			   	 Thread.sleep(2000);
			  driver.findElement(NewVehicle).click();
			  
		  }
		  
		  public void UserEntersVehicle3() throws InterruptedException
		  {   
			  driver.findElement(VehicleName).sendKeys("LEON");
			  Thread.sleep(1000);
		      
		      driver.findElement(Vehicle1).sendKeys("VEH-000001071");
		      WebElement from5 = driver.findElement(Vehicle1); 
		      Thread.sleep(2000);
		      from5.sendKeys(Keys.ARROW_DOWN);
		      from5.sendKeys(Keys.ENTER);
		      
		      driver.findElement(Save).click();
		      Thread.sleep(1000);
		      JavascriptExecutor jse3 = (JavascriptExecutor)driver;
			   	 jse3.executeScript("scroll(0, 1200);");
		  }
		  
		  public String AssertVehicle3()
		  {   
			  WebDriverWait wait = new WebDriverWait(driver,100);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertVehicle3));
		   return driver.findElement(AssertVehicle3).getText();
		  
		  }
		  
 /*------------------------------------------------------------------Add New Vehicles-Vehicle4----------------------------------------------------------------------*/	
		  
		  public void UserClicksNewVehicle4() throws InterruptedException
		  {   
			  JavascriptExecutor jse2 = (JavascriptExecutor)driver;
			   	 jse2.executeScript("scroll(0, 2000);");
			   	 Thread.sleep(1000);
			  driver.findElement(NewVehicle).click();
			  
		  }
		  
		  public void UserEntersVehicle4() throws InterruptedException
		  {   
			  driver.findElement(VehicleName).sendKeys("TARRACO");
			  
			  //driver.findElement(CheckinCore).click();
			  WebElement element2 = driver.findElement(CheckinCore);
		      JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		      executor2.executeScript("arguments[0].click();", element2);
			  Thread.sleep(1000);
		      
		      driver.findElement(Vehicle1).sendKeys("VEH-000001094");
		      WebElement from5 = driver.findElement(Vehicle1); 
		      Thread.sleep(2000);
		      from5.sendKeys(Keys.ARROW_DOWN);
		      from5.sendKeys(Keys.ENTER);
		      
		     
		      
		      driver.findElement(Save).click();
		      Thread.sleep(1000);
		      JavascriptExecutor jse3 = (JavascriptExecutor)driver;
			   	 jse3.executeScript("scroll(0, 1200);");
		  }
		  
		  public String AssertVehicle4()
		  {   
			  WebDriverWait wait = new WebDriverWait(driver,100);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertVehicle4));
		   return driver.findElement(AssertVehicle4).getText();
		  
		  }
		  
/*------------------------------------------------------------------IMS/VP1----------------------------------------------------------------------*/	
		  
		  public void UserClicksNewonIMS() throws InterruptedException
		  {   
			 
			  WebElement element = driver.findElement(IMS);
		      JavascriptExecutor executor = (JavascriptExecutor)driver;
		      executor.executeScript("arguments[0].click();", element);
		      Thread.sleep(1000);
		      WebDriverWait wait = new WebDriverWait(driver,100);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(New));
			  WebElement element1 = driver.findElement(New);
		      JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		      executor1.executeScript("arguments[0].click();", element1);
		      Thread.sleep(1500);
			  
		  }
		  
		  public void UserCreatesIMS1() throws InterruptedException
		  {   
			 
		      
		      
		      driver.findElement(Purchasestatus).click();
		      WebElement from5 = driver.findElement(Purchasestatus); 
		      Thread.sleep(1500);
		      from5.sendKeys(Keys.ARROW_DOWN);
		      from5.sendKeys(Keys.ENTER);
		      
		      driver.findElement(VATstatus).click();
		      WebElement from6 = driver.findElement(VATstatus); 
		      Thread.sleep(1500);
		      from6.sendKeys(Keys.ARROW_DOWN);
		      from6.sendKeys(Keys.ENTER);
		      
		      driver.findElement(VIN).sendKeys("2244551145");
		      
		      driver.findElement(FranchiseID).sendKeys("JJSEAT");
		      
		      driver.findElement(RegNo).sendKeys("BBN87II");
		      
		      driver.findElement(CAPID).sendKeys("81589");
		      
		      driver.findElement(SoldDate).sendKeys("24/10/2021");
		      
		      driver.findElement(Model).sendKeys("ARONA");
		      
		      driver.findElement(Save).click();
		      Thread.sleep(1000);

		      
		  }
		  
		  public String AssertIMS1()
		  {   
			  WebDriverWait wait = new WebDriverWait(driver,100);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertVP1));
		   return driver.findElement(AssertVP1).getText();
		  
		  }
		  
/*------------------------------------------------------------------IMS/VP2----------------------------------------------------------------------*/	
		  
		 
		  public void UserCreatesIMS2() throws InterruptedException
		  {   
			 
		      
		      
		      driver.findElement(Purchasestatus).click();
		      WebElement from5 = driver.findElement(Purchasestatus); 
		      Thread.sleep(1500);
		      from5.sendKeys(Keys.ARROW_DOWN);
		      from5.sendKeys(Keys.ENTER);
		      
		      driver.findElement(VATstatus).click();
		      WebElement from6 = driver.findElement(VATstatus); 
		      Thread.sleep(1500);
		      from6.sendKeys(Keys.ARROW_DOWN);
		      from6.sendKeys(Keys.ENTER);
		      
		      driver.findElement(VIN).sendKeys("6577412333");
		      
		      driver.findElement(FranchiseID).sendKeys("JJSEAT");
		      
		      driver.findElement(RegNo).sendKeys("AAQ76WW");
		      
		      driver.findElement(CAPID).sendKeys("84985");
		      
		      driver.findElement(SoldDate).sendKeys("24/10/2021");
		      
		      driver.findElement(Model).sendKeys("ATECA");
		      
		      driver.findElement(Save).click();
		      Thread.sleep(1000);

		      
		  }
		  
		  public String AssertIMS2()
		  {   
			  WebDriverWait wait = new WebDriverWait(driver,100);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertVP2));
		   return driver.findElement(AssertVP2).getText();
		  
		  }
		  
		  /*------------------------------------------------------------------IMS/VP3----------------------------------------------------------------------*/	
		  
			 
		  public void UserCreatesIMS3() throws InterruptedException
		  {   
			 
		      
		      
		      driver.findElement(Purchasestatus).click();
		      WebElement from5 = driver.findElement(Purchasestatus); 
		      Thread.sleep(1500);
		      from5.sendKeys(Keys.ARROW_DOWN);
		      from5.sendKeys(Keys.ENTER);
		      
		      driver.findElement(VATstatus).click();
		      WebElement from6 = driver.findElement(VATstatus); 
		      Thread.sleep(1500);
		      from6.sendKeys(Keys.ARROW_DOWN);
		      from6.sendKeys(Keys.ENTER);
		      
		      driver.findElement(VIN).sendKeys("214558546");
		      
		      driver.findElement(FranchiseID).sendKeys("JJSEAT");
		      
		      driver.findElement(RegNo).sendKeys("GGU14GN");
		      
		      driver.findElement(CAPID).sendKeys("85109");
		      
		      driver.findElement(SoldDate).sendKeys("24/10/2021");
		      
		      driver.findElement(Model).sendKeys("LEON");
		      
		      driver.findElement(Save).click();
		      Thread.sleep(1000);

		      
		  }
		  
		  public String AssertIMS3()
		  {   
			  WebDriverWait wait = new WebDriverWait(driver,100);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertVP3));
		   return driver.findElement(AssertVP3).getText();
		  
		  }
		  
		  /*------------------------------------------------------------------IMS/VP4----------------------------------------------------------------------*/	
		  
			 
		  public void UserCreatesIMS4() throws InterruptedException
		  {   
			 
		      
		      
		      driver.findElement(Purchasestatus).click();
		      WebElement from5 = driver.findElement(Purchasestatus); 
		      Thread.sleep(1500);
		      from5.sendKeys(Keys.ARROW_DOWN);
		      from5.sendKeys(Keys.ENTER);
		      
		      driver.findElement(VATstatus).click();
		      WebElement from6 = driver.findElement(VATstatus); 
		      Thread.sleep(1500);
		      from6.sendKeys(Keys.ARROW_DOWN);
		      from6.sendKeys(Keys.ENTER);
		      
		      driver.findElement(VIN).sendKeys("06654128");
		      
		      driver.findElement(FranchiseID).sendKeys("JJSEAT");
		      
		      driver.findElement(RegNo).sendKeys("LPA54OI");
		      
		      driver.findElement(CAPID).sendKeys("87878");
		      
		      driver.findElement(SoldDate).sendKeys("24/10/2021");
		      
		      driver.findElement(Model).sendKeys("TARRACO");
		      
		      driver.findElement(Save).click();
		      Thread.sleep(1000);

		      
		  }
		  
		  public String AssertIMS4()
		  {   
			  WebDriverWait wait = new WebDriverWait(driver,100);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertVP4));
		   return driver.findElement(AssertVP4).getText();
		  
		  }
		  
		  
		  
		  public void UserClicksTarget() throws InterruptedException
		  {   
			  
			 driver.navigate().refresh();
			  
			  WebElement element = driver.findElement(Targets);
		      JavascriptExecutor executor = (JavascriptExecutor)driver;
		      executor.executeScript("arguments[0].click();", element);
		     
		    
		  }
		  
		  public void UserClicksNewTarget() throws InterruptedException
		  {   
			  
			  WebElement element1 = driver.findElement(targetValue);
			  JavascriptExecutor executor1 = (JavascriptExecutor)driver;
			  executor1.executeScript("arguments[0].click();", element1);
			  Thread.sleep(2000);
		  }	  
		 
		 
		  public String AssertCoreBonus()
		  {   
			  JavascriptExecutor jse2 = (JavascriptExecutor)driver;
			   	 jse2.executeScript("scroll(0,300);");
			  WebDriverWait wait = new WebDriverWait(driver,100);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertCoreBonus));
		   return driver.findElement(AssertCoreBonus).getText();
		  
		  }
		  public String AssertNonCoreBonus()
		  {   
			  WebDriverWait wait = new WebDriverWait(driver,100);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertNonCoreBonus));
		   return driver.findElement(AssertNonCoreBonus).getText();
		  
		  }
		  public String AssertTotalBonus()
		  {   
			  WebDriverWait wait = new WebDriverWait(driver,100);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertTotalBonus));
		   return driver.findElement(AssertTotalBonus).getText();
		  
		  }
		  
}



