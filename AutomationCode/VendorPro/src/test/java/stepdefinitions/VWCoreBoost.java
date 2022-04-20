package stepdefinitions;

import org.junit.Assert;

import Driver.Driver;
import PageObjects.VWCoreBoostPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VWCoreBoost {
	
	private VWCoreBoostPage VWpage = new VWCoreBoostPage(Driver.getDriver());
	
	/*-------------------------------------------------------------Creation of New Targets-------------------------------------------------------*/
	
	@Given("User is on the new target creation page")
	public void user_is_on_the_new_target_creation_page() throws InterruptedException {
	   
		Driver.getDriver().get("https://bca-rms--uat.my.salesforce.com");
		VWpage.UserisonTargetPage();
		 
	}

	@When("User selects the VW core&boost value and clicks next")
	public void user_selects_the_vw_core_boost_value_and_clicks_next() {
		Assert.assertTrue( VWpage.AssertPage1().contains("New Target: VW Core & Boost Value"));
	}

	@And("User fills all the mandatory fields and clicks Save")
	public void user_fills_all_the_mandatory_fields_and_clicks_save() throws InterruptedException {
	   VWpage.UserFillsMandatoryFields();
	}

	@Then("New Target for VW Core&boost is created successfully")
	public void new_target_for_vw_core_boost_is_created_successfully() {
		Assert.assertTrue( VWpage.AssertValue1().contains("Volkswagen"));
		Assert.assertTrue( VWpage.AssertValue2().contains("VW Core & Boost Value"));
	}

	
	/*-------------------------------------------------------------Addition of 1st dealer-------------------------------------------------------*/
	@Given("User clicks on New to add the 1st Dealer")
	public void user_clicks_on_new_to_add_the_1st_dealer() throws InterruptedException {
	    VWpage.UserClicksNew();
	}

	@When("User enters the 1st Dealer Details and Clicks Save")
	public void user_enters_the_1st_dealer_details_and_clicks_save() throws InterruptedException {
	    VWpage.UserEntersDealers();
	}

	@Then("New 1st Dealer is added Successfully")
	public void new_1st_dealer_is_added_successfully() {
		Assert.assertTrue( VWpage.AssertDealer1().contains("JJ123"));
	}
	
	
	
	
	/*-------------------------------------------------------------Addition of 1st vehicle-------------------------------------------------------*/
	@Given("User clicks on New to add the 1st Vehicle")
	public void user_clicks_on_new_to_add_the_1st_vehicle() throws InterruptedException {
	   VWpage.UserClicksNewVehicle();
	}

	@When("User enters the 1st Vehicle Details and Clicks Save")
	public void user_enters_the_1st_vehicle_details_and_clicks_save() throws InterruptedException {
	   VWpage.UserEntersVehicle();
	}

	@Then("New 1st Vehicle is added Successfully")
	public void new_1st_vehicle_is_added_successfully() {
		Assert.assertTrue( VWpage.AssertVehicle1().contains("81323"));
	}

	
	/*-------------------------------------------------------------Addition of 2nd vehicle-------------------------------------------------------*/
	
	@Given("User clicks on New to add the 2nd Vehicle")
	public void user_clicks_on_new_to_add_the_2nd_vehicle() throws InterruptedException {
		 VWpage.UserClicksNewVehicle2();
	}

	@When("User enters the 2nd Vehicle Details and Clicks Save")
	public void user_enters_the_2nd_vehicle_details_and_clicks_save() throws InterruptedException {
		 VWpage.UserEntersVehicle2();
	}

	@Then("New 2nd Vehicle is added Successfully")
	public void new_2nd_vehicle_is_added_successfully() {
		Assert.assertTrue( VWpage.AssertVehicle2().contains("78476"));
	}

	
	/*-------------------------------------------------------------Addition of 3rd vehicle-------------------------------------------------------*/
	
	@Given("User clicks on New to add the 3rd Vehicle")
	public void user_clicks_on_new_to_add_the_3rd_vehicle() throws InterruptedException {
		 VWpage.UserClicksNewVehicle3();
	}

	@When("User enters the 3rd Vehicle Details and Clicks Save")
	public void user_enters_the_3rd_vehicle_details_and_clicks_save() throws InterruptedException {
		 VWpage.UserEntersVehicle3();
	}

	@Then("New 3rd Vehicle is added Successfully")
	public void new_3rd_vehicle_is_added_successfully() {
		Assert.assertTrue( VWpage.AssertVehicle3().contains("81817"));
	}

	
	/*-------------------------------------------------------------Addition of 4th vehicle-------------------------------------------------------*/
	
	@Given("User clicks on New to add the 4th Vehicle")
	public void user_clicks_on_new_to_add_the_4th_vehicle() throws InterruptedException {
		 VWpage.UserClicksNewVehicle4();
	}

	@When("User enters the 4th Vehicle Details and Clicks Save")
	public void user_enters_the_4th_vehicle_details_and_clicks_save() throws InterruptedException {
		 VWpage.UserEntersVehicle4();
	}

	@Then("New 4th Vehicle is added Successfully")
	public void new_4th_vehicle_is_added_successfully() {
		Assert.assertTrue( VWpage.AssertVehicle4().contains("86143"));
	}
	
/*-------------------------------------------------------------Addition of 5th vehicle-------------------------------------------------------*/
	
	@Given("User clicks on New to add the 5th Vehicle")
	public void user_clicks_on_new_to_add_the_5th_vehicle() throws InterruptedException {
		 VWpage.UserClicksNewVehicle5();
	}

	@When("User enters the 5th Vehicle Details and Clicks Save")
	public void user_enters_the_5th_vehicle_details_and_clicks_save() throws InterruptedException {
		 VWpage.UserEntersVehicle5();
	}

	@Then("New 5th Vehicle is added Successfully")
	public void new_5th_vehicle_is_added_successfully() {
		Assert.assertTrue( VWpage.AssertVehicle5().contains("87990"));
	}
	
/*-------------------------------------------------------------Addition of 6th vehicle-------------------------------------------------------*/
	
	@Given("User clicks on New to add the 6th Vehicle")
	public void user_clicks_on_new_to_add_the_6th_vehicle() throws InterruptedException {
		 VWpage.UserClicksNewVehicle6();
	}

	@When("User enters the 6th Vehicle Details and Clicks Save")
	public void user_enters_the_6th_vehicle_details_and_clicks_save() throws InterruptedException {
		 VWpage.UserEntersVehicle6();
	}

	@Then("New 6th Vehicle is added Successfully")
	public void new_6th_vehicle_is_added_successfully() {
		Assert.assertTrue( VWpage.AssertVehicle6().contains("49305"));
	}
	
/*-------------------------------------------------------------Addition of 7th vehicle-------------------------------------------------------*/
	
	@Given("User clicks on New to add the 7th Vehicle")
	public void user_clicks_on_new_to_add_the_7th_vehicle() throws InterruptedException {
		 VWpage.UserClicksNewVehicle7();
	}

	@When("User enters the 7th Vehicle Details and Clicks Save")
	public void user_enters_the_7th_vehicle_details_and_clicks_save() throws InterruptedException {
		 VWpage.UserEntersVehicle7();
	}

	@Then("New 7th Vehicle is added Successfully")
	public void new_7th_vehicle_is_added_successfully() {
		Assert.assertTrue( VWpage.AssertVehicle7().contains("6+"));
	}
	
	/*-------------------------------------------------------------Creation of IMS Purchase Record-1-------------------------------------------------------*/
	
	@Given("User is on the IMS purchase record and Clicks new")
	public void user_is_on_the_ims_purchase_record_and_clicks_new() throws InterruptedException {
	 VWpage.UserClicksNewonIMS();
	}

	@When("User enters the 1st Record Mandatory fields and Clicks Save")
	public void user_enters_the_1st_record_mandatory_fields_and_clicks_save() throws InterruptedException {
		VWpage.UserCreatesIMS1();
	}

	@Then("New 1st Vehicle purchase record is created Successfully")
	public void new_1st_vehicle_purchase_record_is_created_successfully() {
		Assert.assertTrue( VWpage.AssertIMS1().contains("TUV78IO"));
	}
	
	
/*-------------------------------------------------------------Creation of IMS Purchase Record-2-------------------------------------------------------*/
	
	
	@When("User enters the 2nd Record Mandatory fields and Clicks Save")
	public void user_enters_the_2nd_record_mandatory_fields_and_clicks_save() throws InterruptedException {
		VWpage.UserCreatesIMS2();
	}

	@Then("New 2nd Vehicle purchase record is created Successfully")
	public void new_2nd_vehicle_purchase_record_is_created_successfully() {
		Assert.assertTrue( VWpage.AssertIMS2().contains("XYZ90IM"));
	}
	
/*-------------------------------------------------------------Creation of IMS Purchase Record-3-------------------------------------------------------*/
	
	
	@When("User enters the 3rd Record Mandatory fields and Clicks Save")
	public void user_enters_the_3rd_record_mandatory_fields_and_clicks_save() throws InterruptedException {
		VWpage.UserCreatesIMS3();
	}

	@Then("New 3rd Vehicle purchase record is created Successfully")
	public void new_3rd_vehicle_purchase_record_is_created_successfully() {
		Assert.assertTrue( VWpage.AssertIMS3().contains("HIX66CO"));
	}
	
/*-------------------------------------------------------------Creation of IMS Purchase Record-4-------------------------------------------------------*/
	
	
	@When("User enters the 4th Record Mandatory fields and Clicks Save")
	public void user_enters_the_4th_record_mandatory_fields_and_clicks_save() throws InterruptedException {
		VWpage.UserCreatesIMS4();
	}

	@Then("New 4th Vehicle purchase record is created Successfully")
	public void new_4th_vehicle_purchase_record_is_created_successfully() {
		Assert.assertTrue( VWpage.AssertIMS4().contains("BBU11TI"));
	}
	
/*-------------------------------------------------------------Creation of IMS Purchase Record-5-------------------------------------------------------*/
	
	
	@When("User enters the 5th Record Mandatory fields and Clicks Save")
	public void user_enters_the_5th_record_mandatory_fields_and_clicks_save() throws InterruptedException {
		VWpage.UserCreatesIMS5();
	}

	@Then("New 5th Vehicle purchase record is created Successfully")
	public void new_5th_vehicle_purchase_record_is_created_successfully() {
		Assert.assertTrue( VWpage.AssertIMS5().contains("XXT09BB"));
	}
/*-------------------------------------------------------------Creation of IMS Purchase Record-6-------------------------------------------------------*/
	
	
	@When("User enters the 6th Record Mandatory fields and Clicks Save")
	public void user_enters_the_th6_record_mandatory_fields_and_clicks_save() throws InterruptedException {
		VWpage.UserCreatesIMS6();
	}

	@Then("New 6th Vehicle purchase record is created Successfully")
	public void new_6th_vehicle_purchase_record_is_created_successfully() {
		Assert.assertTrue( VWpage.AssertIMS6().contains("JOH66OP"));
	}
/*-------------------------------------------------------------Creation of IMS Purchase Record-4-------------------------------------------------------*/
	
	
	@When("User enters the 7th Record Mandatory fields and Clicks Save")
	public void user_enters_the_7th_record_mandatory_fields_and_clicks_save() throws InterruptedException {
		VWpage.UserCreatesIMS7();
	}

	@Then("New 7th Vehicle purchase record is created Successfully")
	public void new_7th_vehicle_purchase_record_is_created_successfully() {
		Assert.assertTrue( VWpage.AssertIMS7().contains("LEA55TI"));
	}

	/*-------------------------------------------------------------Final Calculations-------------------------------------------------------*/
	
	@Given("User is on Targets")
	public void user_is_on_targets() throws InterruptedException {
		  VWpage.UserClicksTarget();
	}

	@When("user clicks on newly created Target")
	public void user_clicks_on_newly_created_target() throws InterruptedException {
		 VWpage.UserClicksNewTarget();
	}

	@Then("Validation of records happens")
	public void validation_of_records_happens() {
	
		Assert.assertTrue( VWpage.AssertCorePurchase().contains("4"));
		Assert.assertTrue( VWpage.AssertNonCorePurchase().contains("3"));
		Assert.assertTrue( VWpage.AssertCoreBonus().contains("£2,400.00"));
		Assert.assertTrue( VWpage.AssertNonCoreBonus().contains("£1,800.00"));
		Assert.assertTrue( VWpage.AssertTotalBonus().contains("£4,200.00"));
	}
}
