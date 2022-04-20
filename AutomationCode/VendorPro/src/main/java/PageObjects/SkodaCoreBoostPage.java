package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SkodaCoreBoostPage {
	
	 private WebDriver driver;
	  
	 private By userId = By.id("username");
	 private By password = By.id("password");
	 private By Login = By.id("Login");
	 private By Targets = By.xpath("//a[@title='Targets']");
	 private By New = By.xpath("//a[@title='New']");
	 private By SkodaCB = By.xpath("(//span[@class='slds-radio--faux'])[8]");
	 private By Next = By.xpath("//span[text()='Next']");
	 private By AssertPage1 = By.xpath("//h2[text()='New Target: Skoda Core & Boost Value']");
	  
	 
	 private By GroupAccountName = By.xpath("(//input[@role='combobox'])[2]");
	 private By Starttime = By.xpath("(//input[@name='Start_Date__c'])[1]");
	 private By Parent = By.xpath("//input[@placeholder='Search Parent Targets...']");
	 private By TargetNote = By.xpath("//input[@name='Target__c']");
	 private By Endtime = By.xpath("(//input[@name='End_Date__c'])[1]");
	 private By TargetType = By.xpath("(//input[@role='combobox'])[4]");
	  private By Save = By.xpath("//button[@name='SaveEdit']");
	  private By AssertValue1 = By.xpath("//lightning-formatted-text[text()='Skoda']");
	  private By AssertValue2 = By.xpath("//span[text()='Skoda Core & Boost Value']");
	  
	  
	  private By NewDealer = By.xpath("(//button[@name='New'])[1]");
	  private By Dealer1 = By.xpath("//input[@placeholder='Search Accounts...']");
	  private By Dealerid1 = By.xpath("//input[@placeholder='Search Related Dealerships...']");
	  private By Purchases = By.xpath("//input[@name='Number_of_Purchases_Needed__c']");
	  private By AssertDealer1 = By.xpath("//span[text()='JJSKODA']");
	  
	  private By NewVehicle = By.xpath("(//button[@name='New'])[2]");
	  private By VehicleName = By.xpath("//input[@name='Name']");
	  private By Vehicle1 = By.xpath("//input[@placeholder='Search Vehicles...']");
	  private By CheckinCore = By.xpath("//span[text()='Core Vehicle']");
	  private By AssertVehicle1 = By.xpath("//lightning-formatted-text[text()='90338']");
	  private By AssertVehicle2 = By.xpath("//lightning-formatted-text[text()='77520']");
	  private By AssertVehicle3 = By.xpath("//lightning-formatted-text[text()='87198']");
	  private By AssertVehicle4 = By.xpath("//lightning-formatted-text[text()='85876']");
	  private By AssertVehicle5 = By.xpath("//lightning-formatted-text[text()='89020']");
	  private By AssertVehicle6 = By.xpath("//lightning-formatted-text[text()='80112']");
	  private By AssertVehicle7 = By.xpath("//lightning-formatted-text[text()='91390']");
	  
	  private By IMS = By.xpath("//a[@title='IMS Purchase Records']");
	  private By SoldPrice = By.xpath("//input[@name='Sold_Price__c']");
	  private By Purchasestatus = By.xpath("(//input[@role='combobox'])[2]");
	  private By VATstatus = By.xpath("(//input[@role='combobox'])[3]");
	  private By VIN = By.xpath("//input[@name='VIN__c']");
	  private By FranchiseID = By.xpath("//input[@name='Dealer_Franchise_ID__c']");
	  private By RegNo = By.xpath("//input[@name='Vehicle_Registration__c']");
	  private By CAPID = By.xpath("//input[@name='CAP_Id__c']");
	  private By SoldDate = By.xpath("//input[@name='Sold_Date_Time__c']");
	  private By Model = By.xpath("//input[@name='Model__c']");
	  private By AssertVP1 = By.xpath("//lightning-formatted-text[text()='EEW44YU']");
	  private By AssertVP2 = By.xpath("//lightning-formatted-text[text()='CXT11LK']");
	  private By AssertVP3 = By.xpath("//lightning-formatted-text[text()='FHJ89LM']");
	  private By AssertVP4 = By.xpath("//lightning-formatted-text[text()='IKM89GB']");
	  private By AssertVP5 = By.xpath("//lightning-formatted-text[text()='PPO22HN']");
	  private By AssertVP6 = By.xpath("//lightning-formatted-text[text()='JPR88JO']");
	  private By AssertVP7 = By.xpath("//lightning-formatted-text[text()='SHA65JP']");
	  
	 
	  private By AssertCoreBonus = By.xpath("//lightning-formatted-text[text()='£900.00']");
	  private By AssertNonCoreBonus = By.xpath("//lightning-formatted-text[text()='£1,200.00']");
	  private By AssertTotalBonus = By.xpath("//lightning-formatted-text[text()='£2,100.00']");
	  
	  private By targetValue = By.xpath("(//a[@target='_blank'])[1]");
	  
	  public SkodaCoreBoostPage(WebDriver driver)
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
//		  WebElement element = driver.findElement(Targets);
//	      JavascriptExecutor executor = (JavascriptExecutor)driver;
//	      executor.executeScript("arguments[0].click();", element);
//	      Thread.sleep(2000);
		  WebElement element1 = driver.findElement(New);
	      JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	      executor1.executeScript("arguments[0].click();", element1);
	      driver.findElement(SkodaCB).click();
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
	      driver.findElement(Parent).sendKeys("JJ Cars Skoda Trimester 4 2021");
		  WebElement from2 = driver.findElement(Parent);  
		  Thread.sleep(2500);
		  from2.sendKeys(Keys.ARROW_DOWN);
	      from2.sendKeys(Keys.ENTER);
	      
	      driver.findElement(TargetNote).sendKeys("Test Target Skoda");
	      
	      WebDriverWait wait1 = new WebDriverWait(driver,1000);
	 	  wait1.until(ExpectedConditions.visibilityOfElementLocated(TargetType));	
	      WebElement element2 = driver.findElement(TargetType);
	      JavascriptExecutor executor2 = (JavascriptExecutor)driver;
	      executor2.executeScript("arguments[0].click();", element2);
		  WebElement from3 = driver.findElement(TargetType);     
	      from3.sendKeys(Keys.ARROW_DOWN);
	      from3.sendKeys(Keys.ENTER);
	      
	      driver.findElement(Endtime).sendKeys("31/10/2021");
	      
		 
		  
		  JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	      	 jse1.executeScript("scroll(0, 700);");
	      	
	      	 
	      	
	      	 
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
	      
	      driver.findElement(Dealerid1).sendKeys("MD-008318");
	      WebElement from5 = driver.findElement(Dealerid1); 
	      Thread.sleep(2500);
	      from5.sendKeys(Keys.ARROW_DOWN);
	      from5.sendKeys(Keys.ENTER);
	      
	      driver.findElement(Purchases).sendKeys("7");
	      
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
			  driver.findElement(VehicleName).sendKeys("FABIA");
		      
		      
		      driver.findElement(Vehicle1).sendKeys("VEH-000001101");
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
			  driver.findElement(VehicleName).sendKeys("KODIAQ");
			  
			  
		      //driver.findElement(CheckinCore).click();
		      WebElement element2 = driver.findElement(CheckinCore);
		      JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		      executor2.executeScript("arguments[0].click();", element2);
		      
		      Thread.sleep(1000);
		      driver.findElement(Vehicle1).sendKeys("VEH-000001171");
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
			  driver.findElement(VehicleName).sendKeys("OCTAVIA");
			  Thread.sleep(1000);
		      
		      driver.findElement(Vehicle1).sendKeys("VEH-000001228");
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
			  driver.findElement(VehicleName).sendKeys("SUPERB");
			  
			  //driver.findElement(CheckinCore).click();
			  WebElement element2 = driver.findElement(CheckinCore);
		      JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		      executor2.executeScript("arguments[0].click();", element2);
			  Thread.sleep(1000);
		      
		      driver.findElement(Vehicle1).sendKeys("VEH-000001298");
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
		  
 /*------------------------------------------------------------------Add New Vehicles-Vehicle5----------------------------------------------------------------------*/	
		  
		  public void UserClicksNewVehicle5() throws InterruptedException
		  {   
			  JavascriptExecutor jse2 = (JavascriptExecutor)driver;
			   	 jse2.executeScript("scroll(0, 2000);");
			   	 Thread.sleep(1000);
			  driver.findElement(NewVehicle).click();
			  
		  }
		  
		  public void UserEntersVehicle5() throws InterruptedException
		  {   
			  driver.findElement(VehicleName).sendKeys("SCALA");
			  
			  //driver.findElement(CheckinCore).click();
			  WebElement element2 = driver.findElement(CheckinCore);
		      JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		      executor2.executeScript("arguments[0].click();", element2);
			  Thread.sleep(1000);
		      
		      driver.findElement(Vehicle1).sendKeys("VEH-000001244");
		      WebElement from5 = driver.findElement(Vehicle1); 
		      Thread.sleep(2000);
		      from5.sendKeys(Keys.ARROW_DOWN);
		      from5.sendKeys(Keys.ENTER);
		      
		     
		      
		      driver.findElement(Save).click();
		      Thread.sleep(1000);
		      JavascriptExecutor jse3 = (JavascriptExecutor)driver;
			   	 jse3.executeScript("scroll(0, 1200);");
		  }
		  
		  public String AssertVehicle5()
		  {   
			  WebDriverWait wait = new WebDriverWait(driver,100);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertVehicle5));
		   return driver.findElement(AssertVehicle5).getText();
		  
		  }
 /*------------------------------------------------------------------Add New Vehicles-Vehicle6----------------------------------------------------------------------*/	
		  
		  public void UserClicksNewVehicle6() throws InterruptedException
		  {   
			  JavascriptExecutor jse2 = (JavascriptExecutor)driver;
			   	 jse2.executeScript("scroll(0, 2000);");
			   	 Thread.sleep(1000);
			  driver.findElement(NewVehicle).click();
			  
		  }
		  
		  public void UserEntersVehicle6() throws InterruptedException
		  {   
			  driver.findElement(VehicleName).sendKeys("RAPID SPACEBACK");
			  
			  //driver.findElement(CheckinCore).click();
			  WebElement element2 = driver.findElement(CheckinCore);
		      JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		      executor2.executeScript("arguments[0].click();", element2);
			  Thread.sleep(1000);
		      
		      driver.findElement(Vehicle1).sendKeys("VEH-000001236");
		      WebElement from5 = driver.findElement(Vehicle1); 
		      Thread.sleep(2000);
		      from5.sendKeys(Keys.ARROW_DOWN);
		      from5.sendKeys(Keys.ENTER);
		      
		     
		      
		      driver.findElement(Save).click();
		      Thread.sleep(1000);
		      JavascriptExecutor jse3 = (JavascriptExecutor)driver;
			   	 jse3.executeScript("scroll(0, 1200);");
		  }
		  
		  public String AssertVehicle6()
		  {   
			  WebDriverWait wait = new WebDriverWait(driver,100);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertVehicle6));
		   return driver.findElement(AssertVehicle6).getText();
		  
		  }
 /*------------------------------------------------------------------Add New Vehicles-Vehicle7----------------------------------------------------------------------*/	
		  
		  public void UserClicksNewVehicle7() throws InterruptedException
		  {   
			  JavascriptExecutor jse2 = (JavascriptExecutor)driver;
			   	 jse2.executeScript("scroll(0, 2000);");
			   	 Thread.sleep(1000);
			  driver.findElement(NewVehicle).click();
			  
		  }
		  
		  public void UserEntersVehicle7() throws InterruptedException
		  {   
			  driver.findElement(VehicleName).sendKeys("KAMIQ");
			  
			  //driver.findElement(CheckinCore).click();
			  WebElement element2 = driver.findElement(CheckinCore);
		      JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		      executor2.executeScript("arguments[0].click();", element2);
			  Thread.sleep(1000);
		      
		      driver.findElement(Vehicle1).sendKeys("VEH-000001127");
		      WebElement from5 = driver.findElement(Vehicle1); 
		      Thread.sleep(2000);
		      from5.sendKeys(Keys.ARROW_DOWN);
		      from5.sendKeys(Keys.ENTER);
		      
		     
		      
		      driver.findElement(Save).click();
		      Thread.sleep(1000);
		      JavascriptExecutor jse3 = (JavascriptExecutor)driver;
			   	 jse3.executeScript("scroll(0, 1200);");
		  }
		  
		  public String AssertVehicle7()
		  {   
			  WebDriverWait wait = new WebDriverWait(driver,100);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertVehicle7));
		   return driver.findElement(AssertVehicle7).getText();
		  
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
			 
			  driver.findElement(SoldPrice).sendKeys("10000");
		      
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
		      
		      driver.findElement(VIN).sendKeys("123456777");
		      
		      driver.findElement(FranchiseID).sendKeys("JJSKODA");
		      
		      driver.findElement(RegNo).sendKeys("EEW44YU");
		      
		      driver.findElement(CAPID).sendKeys("90338");
		      
		      driver.findElement(SoldDate).sendKeys("24/10/2021");
		      
		      driver.findElement(Model).sendKeys("FABIA");
		      
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
			 
			  driver.findElement(SoldPrice).sendKeys("15000");
		      
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
		      
		      driver.findElement(VIN).sendKeys("24681379");
		      
		      driver.findElement(FranchiseID).sendKeys("JJSKODA");
		      
		      driver.findElement(RegNo).sendKeys("CXT11LK");
		      
		      driver.findElement(CAPID).sendKeys("77520");
		      
		      driver.findElement(SoldDate).sendKeys("24/10/2021");
		      
		      driver.findElement(Model).sendKeys("KODIAQ");
		      
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
			 
		      
			  driver.findElement(SoldPrice).sendKeys("12000");
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
		      
		      driver.findElement(VIN).sendKeys("852456159");
		      
		      driver.findElement(FranchiseID).sendKeys("JJSKODA");
		      
		      driver.findElement(RegNo).sendKeys("FHJ89LM");
		      
		      driver.findElement(CAPID).sendKeys("87198");
		      
		      driver.findElement(SoldDate).sendKeys("24/10/2021");
		      
		      driver.findElement(Model).sendKeys("OCTAVIA");
		      
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
			 
			  driver.findElement(SoldPrice).sendKeys("20000");
		      
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
		      
		      driver.findElement(VIN).sendKeys("357654159");
		      
		      driver.findElement(FranchiseID).sendKeys("JJSKODA");
		      
		      driver.findElement(RegNo).sendKeys("IKM89GB");
		      
		      driver.findElement(CAPID).sendKeys("85876");
		      
		      driver.findElement(SoldDate).sendKeys("24/10/2021");
		      
		      driver.findElement(Model).sendKeys("SUPERB");
		      
		      driver.findElement(Save).click();
		      Thread.sleep(1000);

		      
		  }
		  
		  public String AssertIMS4()
		  {   
			  WebDriverWait wait = new WebDriverWait(driver,100);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertVP4));
		   return driver.findElement(AssertVP4).getText();
		  
		  }
		  
		  /*------------------------------------------------------------------IMS/VP5----------------------------------------------------------------------*/	
		  
			 
		  public void UserCreatesIMS5() throws InterruptedException
		  {   
			 
			  driver.findElement(SoldPrice).sendKeys("11000");
		      
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
		      
		      driver.findElement(VIN).sendKeys("54788765");
		      
		      driver.findElement(FranchiseID).sendKeys("JJSKODA");
		      
		      driver.findElement(RegNo).sendKeys("PPO22HN");
		      
		      driver.findElement(CAPID).sendKeys("85876");
		      
		      driver.findElement(SoldDate).sendKeys("24/10/2021");
		      
		      driver.findElement(Model).sendKeys("SCALA");
		      
		      driver.findElement(Save).click();
		      Thread.sleep(1000);

		      
		  }
		  
		  public String AssertIMS5()
		  {   
			  WebDriverWait wait = new WebDriverWait(driver,100);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertVP5));
		   return driver.findElement(AssertVP5).getText();
		  
		  }
		  
		  
		  /*------------------------------------------------------------------IMS/VP6----------------------------------------------------------------------*/	
		  
			 
		  public void UserCreatesIMS6() throws InterruptedException
		  {   
			 
			  driver.findElement(SoldPrice).sendKeys("17000");
		      
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
		      
		      driver.findElement(VIN).sendKeys("2884441");
		      
		      driver.findElement(FranchiseID).sendKeys("JJSKODA");
		      
		      driver.findElement(RegNo).sendKeys("JPR88JO");
		      
		      driver.findElement(CAPID).sendKeys("85876");
		      
		      driver.findElement(SoldDate).sendKeys("24/10/2021");
		      
		      driver.findElement(Model).sendKeys("RAPID SPACEBACK");
		      
		      driver.findElement(Save).click();
		      Thread.sleep(1000);

		      
		  }
		  
		  public String AssertIMS6()
		  {   
			  WebDriverWait wait = new WebDriverWait(driver,100);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertVP6));
		   return driver.findElement(AssertVP6).getText();
		  
		  }
		  /*------------------------------------------------------------------IMS/VP7----------------------------------------------------------------------*/	
		  
			 
		  public void UserCreatesIMS7() throws InterruptedException
		  {   
			 
		      
			  driver.findElement(SoldPrice).sendKeys("16000");
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
		      
		      driver.findElement(VIN).sendKeys("68892214");
		      
		      driver.findElement(FranchiseID).sendKeys("JJSKODA");
		      
		      driver.findElement(RegNo).sendKeys("SHA65JP");
		      
		      driver.findElement(CAPID).sendKeys("85876");
		      
		      driver.findElement(SoldDate).sendKeys("24/10/2021");
		      
		      driver.findElement(Model).sendKeys("KAMIQ");
		      
		      driver.findElement(Save).click();
		      Thread.sleep(1000);

		      
		  }
		  
		  
		  public String AssertIMS7()
		  {   
			  WebDriverWait wait = new WebDriverWait(driver,100);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(AssertVP7));
		   return driver.findElement(AssertVP7).getText();
		  
		  }
		  
		  /*------------------------------------------------------------------Final Validations----------------------------------------------------------------------*/	  
		  
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






