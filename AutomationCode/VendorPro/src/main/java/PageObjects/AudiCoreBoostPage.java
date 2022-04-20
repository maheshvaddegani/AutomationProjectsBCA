package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AudiCoreBoostPage {
	
	
	 private WebDriver driver;
	  
	  private By userId = By.id("username");
	  private By password = By.id("password");
	  private By Login = By.id("Login");
	  private By Targets = By.xpath("//a[@title='Targets']");
	  private By New = By.xpath("//div[@title='New']");
	  private By CoreBoost = By.xpath("(//span[@class='slds-radio--faux'])[2]");
	  private By Next = By.xpath("//span[text()='Next']");
	  private By AssertPage1 = By.xpath("//h2[text()='New Target: Core & Boost Value']");
	  
	  private By Brand = By.xpath("(//input[@role='combobox'])[1]");
	  private By SelectBrand = By.xpath("//lightning-base-combobox-item[@data-value='Audi']");
	  private By GroupAccountName = By.xpath("(//input[@role='combobox'])[2]");
	  private By Startdate = By.xpath("(//input[@name='Start_Date__c'])[1]");
	  private By Starttime = By.xpath("(//input[@name='Start_Date__c'])[2]");
	  private By Time = By.xpath("//lightning-base-combobox-item[@data-value='00:00:00.000']");
	  private By Parent = By.xpath("//input[@placeholder='Search Parent Targets...']");
	  private By TargetNote = By.xpath("//input[@name='Target__c']");
	  private By Enddate = By.xpath("(//input[@name='End_Date__c'])[1]");
	  private By TargetType = By.xpath("(//input[@role='combobox'])[6]");
	  private By TargetperiodType = By.xpath("(//input[@role='combobox'])[4]");
	  private By TargetPeriod = By.xpath("//lightning-base-combobox-item[@data-value='Monthly']");
	  private By NonCoreValue =  By.xpath("//input[@name='Non_Core_Vehicle_Value__c']");
	  private By CoreValue = By.xpath("//input[@name='Core_Vehicle_Value__c']");
	  private By Save = By.xpath("//button[@name='SaveEdit']");
	  private By AssertValue1 = By.xpath("//lightning-formatted-text[text()='Audi']");
	  private By AssertValue2 = By.xpath("//span[text()='Core & Boost Value']");
	  
	  
	  
	  private By NewDealer = By.xpath("(//button[@name='New'])[1]");
	  private By Dealer1 = By.xpath("//input[@placeholder='Search Accounts...']");
	  private By Dealerid1 = By.xpath("//input[@placeholder='Search Related Dealerships...']");
	  private By Purchases = By.xpath("//input[@name='Number_of_Purchases_Needed__c']");
	  private By AssertDealer1 = By.xpath("//span[text()='JJAUDI']");
	 
	  
	  private By NewVehicle = By.xpath("(//button[@name='New'])[2]");
	  private By VehicleName = By.xpath("//input[@name='Name']");
	  private By Vehicle1 = By.xpath("//input[@placeholder='Search Vehicles...']");
	  private By CheckinCore = By.xpath("//span[text()='Core Vehicle']");
	  private By AssertVehicle1 = By.xpath("//lightning-formatted-text[text()='85420']");
	  private By AssertVehicle2 = By.xpath("//lightning-formatted-text[text()='92314']");
	  private By AssertVehicle3 = By.xpath("//lightning-formatted-text[text()='85077']");
	  private By AssertVehicle4 = By.xpath("//lightning-formatted-text[text()='86572']");
	  
	  
	  private By IMS = By.xpath("//a[@title='IMS Purchase Records']");
	  private By Purchasestatus = By.xpath("(//input[@role='combobox'])[2]");
	  private By VATstatus = By.xpath("(//input[@role='combobox'])[3]");
	  private By VIN = By.xpath("//input[@name='VIN__c']");
	  private By FranchiseID = By.xpath("//input[@name='Dealer_Franchise_ID__c']");
	  private By RegNo = By.xpath("//input[@name='Vehicle_Registration__c']");
	  private By CAPID = By.xpath("//input[@name='CAP_Id__c']");
	  private By SoldDate = By.xpath("//input[@name='Sold_Date_Time__c']");
	  private By Model = By.xpath("//input[@name='Model__c']");
	  private By AssertVP1 = By.xpath("//lightning-formatted-text[text()='XXX00EE']");
	  private By AssertVP2 = By.xpath("//lightning-formatted-text[text()='AAA78BB']");
	  private By AssertVP3 = By.xpath("//lightning-formatted-text[text()='NNN99MM']");
	  private By AssertVP4 = By.xpath("//lightning-formatted-text[text()='GGG8II']");
	  
	  
	  private By AssertCorePurchase = By.xpath("(//lightning-formatted-number[text()='2'])[6]");
	  private By AssertNonCorePurchase = By.xpath("(//lightning-formatted-number[text()='2'])[7]");
	  private By AssertCoreBonus = By.xpath("(//lightning-formatted-text[text()='£600.00'])[1]");
	  private By AssertTotalBonus = By.xpath("(//lightning-formatted-text[text()='£600.00'])[2]");
	  
	  private By targetValue = By.xpath("(//a[@target='_blank'])[1]");
	  
	  
	  public  AudiCoreBoostPage (WebDriver driver)
	  {
		  this.driver = driver;
	  }
/*------------------------------------------------------------------Create New Target----------------------------------------------------------------------*/	  
	  public void UserisonTargetPage2() throws InterruptedException
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
	      driver.findElement(CoreBoost).click();
		  driver.findElement(Next).click();
	  }
	  
	  public String AssertPage2()
	  {   
		  WebDriverWait wait = new WebDriverWait(driver,100);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertPage1));
	   return driver.findElement(AssertPage1).getText();
	  
	  }
	  
	  public void UserFillsMandatoryFields2() throws InterruptedException
	  {
		  
		  driver.findElement(Brand).click();
		  WebDriverWait wait2 = new WebDriverWait(driver,1000);
		  wait2.until(ExpectedConditions.visibilityOfElementLocated(SelectBrand));	 
		driver.findElement(SelectBrand).click();
		
		  driver.findElement(TargetNote).sendKeys("Test Audi Core&Boost");
	      
	      driver.findElement(GroupAccountName).sendKeys("JJ Cars");
	      WebElement from1 = driver.findElement(GroupAccountName); 
	      Thread.sleep(2500);
	      from1.sendKeys(Keys.ARROW_DOWN);
	      from1.sendKeys(Keys.ARROW_DOWN);
	      from1.sendKeys(Keys.ENTER);
	      
	      driver.findElement(Startdate).sendKeys("11/10/2021");
	      WebElement element4 = driver.findElement(Starttime);
	      JavascriptExecutor executor4 = (JavascriptExecutor)driver;
	      executor4.executeScript("arguments[0].click();", element4);
	      driver.findElement(Time).click();
	      
	      WebDriverWait wait3 = new WebDriverWait(driver,1000);
	 	  wait3.until(ExpectedConditions.elementToBeClickable(TargetperiodType));	   
	 	  WebElement element3 = driver.findElement(TargetperiodType);
	      JavascriptExecutor executor3 = (JavascriptExecutor)driver;
	      executor3.executeScript("arguments[0].click();", element3);
	      
	      WebDriverWait wait4 = new WebDriverWait(driver,1000);
	 	  wait4.until(ExpectedConditions.elementToBeClickable(TargetPeriod));	  
		  driver.findElement(TargetPeriod).click();
	      
	      driver.findElement(Parent).click();
	      driver.findElement(Parent).sendKeys("JJ Cars Audi");
		  WebElement from2 = driver.findElement(Parent);  
		  Thread.sleep(2500);
		  from2.sendKeys(Keys.ARROW_DOWN);
	      from2.sendKeys(Keys.ENTER);
	      
	    
	      
	      WebDriverWait wait1 = new WebDriverWait(driver,1000);
	 	  wait1.until(ExpectedConditions.visibilityOfElementLocated(TargetType));	
	      WebElement element2 = driver.findElement(TargetType);
	      JavascriptExecutor executor2 = (JavascriptExecutor)driver;
	      executor2.executeScript("arguments[0].click();", element2);
		  WebElement from3 = driver.findElement(TargetType);     
	      from3.sendKeys(Keys.ARROW_DOWN);
	      from3.sendKeys(Keys.ENTER);
	      
	      driver.findElement(Enddate).sendKeys("31/10/2021");
	     
	 	 
		  
		  JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	      	 jse1.executeScript("scroll(0, 900);");
	      	 driver.findElement(NonCoreValue).sendKeys("0");
		      
		      driver.findElement(CoreValue).sendKeys("300");
	      	 
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
		  driver.findElement(Dealer1).sendKeys("JJ");
	      WebElement from4 = driver.findElement(Dealer1); 
	      Thread.sleep(1500);
	      from4.sendKeys(Keys.ARROW_DOWN);
	      from4.sendKeys(Keys.ENTER);
	      
	      driver.findElement(Dealerid1).sendKeys("MD-008319");
	      WebElement from5 = driver.findElement(Dealerid1); 
	      Thread.sleep(2500);
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
			  driver.findElement(VehicleName).sendKeys("A3 SPORTBACK");
		      
		      
		      driver.findElement(Vehicle1).sendKeys("VEH-000000780");
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
			  driver.findElement(VehicleName).sendKeys("A5 CABRIOLET");
			  
			  
		      //driver.findElement(CheckinCore).click();
		      WebElement element2 = driver.findElement(CheckinCore);
		      JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		      executor2.executeScript("arguments[0].click();", element2);
		      
		      Thread.sleep(1000);
		      driver.findElement(Vehicle1).sendKeys("VEH-000000803");
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
			  driver.findElement(VehicleName).sendKeys("Q8");
			  Thread.sleep(1000);
		      
		      driver.findElement(Vehicle1).sendKeys("VEH-000000888");
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
			  driver.findElement(VehicleName).sendKeys("TT ROADSTER");
			  
			  //driver.findElement(CheckinCore).click();
			  WebElement element2 = driver.findElement(CheckinCore);
		      JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		      executor2.executeScript("arguments[0].click();", element2);
			  Thread.sleep(1000);
		      
		      driver.findElement(Vehicle1).sendKeys("VEH-000000926");
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
		      
		      driver.findElement(VIN).sendKeys("99889988");
		      
		      driver.findElement(FranchiseID).sendKeys("JJAUDI");
		      
		      driver.findElement(RegNo).sendKeys("XXX00EE");
		      
		      driver.findElement(CAPID).sendKeys("85420");
		      
		      driver.findElement(SoldDate).sendKeys("23/10/2021");
		      
		      driver.findElement(Model).sendKeys("A3 SPORTBACK");
		      
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
		      
		      driver.findElement(VIN).sendKeys("00665524");
		      
		      driver.findElement(FranchiseID).sendKeys("JJAUDI");
		      
		      driver.findElement(RegNo).sendKeys("AAA78BB");
		      
		      driver.findElement(CAPID).sendKeys("92314");
		      
		      driver.findElement(SoldDate).sendKeys("23/10/2021");
		      
		      driver.findElement(Model).sendKeys("A5 CABRIOLET");
		      
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
		      
		      driver.findElement(VIN).sendKeys("44115588");
		      
		      driver.findElement(FranchiseID).sendKeys("JJAUDI");
		      
		      driver.findElement(RegNo).sendKeys("NNN99MM");
		      
		      driver.findElement(CAPID).sendKeys("85077");
		      
		      driver.findElement(SoldDate).sendKeys("23/10/2021");
		      
		      driver.findElement(Model).sendKeys("Q8");
		      
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
		      
		      driver.findElement(VIN).sendKeys("79988552");
		      
		      driver.findElement(FranchiseID).sendKeys("JJAUDI");
		      
		      driver.findElement(RegNo).sendKeys("GGG8II");
		      
		      driver.findElement(CAPID).sendKeys("86572");
		      
		      driver.findElement(SoldDate).sendKeys("23/10/2021");
		      
		      driver.findElement(Model).sendKeys("TT ROADSTER");
		      
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
		 
		  public String AssertCorePurchase()
		  {   
			  JavascriptExecutor jse2 = (JavascriptExecutor)driver;
			   	 jse2.executeScript("scroll(0,300);");
			  WebDriverWait wait = new WebDriverWait(driver,100);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertCorePurchase));
		   return driver.findElement(AssertCorePurchase).getText();
		  
		  }
		  public String AssertNonCorePurchase()
		  {   
			  WebDriverWait wait = new WebDriverWait(driver,100);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertNonCorePurchase));
		   return driver.findElement(AssertNonCorePurchase).getText();
		  
		  }
		  public String AssertCoreBonus()
		  {   
			  JavascriptExecutor jse2 = (JavascriptExecutor)driver;
			   	 jse2.executeScript("scroll(0,300);");
			  WebDriverWait wait = new WebDriverWait(driver,100);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertCoreBonus));
		   return driver.findElement(AssertCoreBonus).getText();
		  
		  }
		  
		  public String AssertTotalBonus()
		  {   
			  WebDriverWait wait = new WebDriverWait(driver,100);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertTotalBonus));
		   return driver.findElement(AssertTotalBonus).getText();
		  
		  }
		  

	  

}



