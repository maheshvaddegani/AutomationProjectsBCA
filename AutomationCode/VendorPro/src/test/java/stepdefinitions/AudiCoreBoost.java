package stepdefinitions;

import org.junit.Assert;

import Driver.Driver;
import PageObjects.AudiCoreBoostPage;
import PageObjects.VWFreeDeliveryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AudiCoreBoost {
	
	private AudiCoreBoostPage Audipage = new AudiCoreBoostPage(Driver.getDriver());
	
	
	@Given("User is on the target creation page Audi")
	public void user_is_on_the_target_creation_page_audi() throws InterruptedException {
		Driver.getDriver().get("https://bca-rms--uat.my.salesforce.com");
		  Audipage.UserisonTargetPage2();
	}

	@When("User selects the AudiCore&Boost and clicks next")
	public void user_selects_the_audi_core_boost_and_clicks_next() {
		Assert.assertTrue( Audipage.AssertPage2().contains("New Target: Core & Boost Value"));
	
	}

	@And("User fills all the mandatory fields for AudiCore&Boost and clicks Save")
	public void user_fills_all_the_mandatory_fields_for_audi_core_boost_and_clicks_save() throws InterruptedException {
	
		Audipage.UserFillsMandatoryFields2();
	
	}

	@Then("New Target for AudiCore&Boost is created successfully")
	public void new_target_for_audi_core_boost_is_created_successfully() {
		Assert.assertTrue( Audipage.AssertValue1().contains("Audi"));
		Assert.assertTrue( Audipage.AssertValue2().contains("Core & Boost Value"));
	
	}

	
	
	
	@Given("User clicks on New to add the 1st Dealer for AudiCore&Boost")
	public void user_clicks_on_new_to_add_the_1st_dealer_for_audi_core_boost() throws InterruptedException {
		   Audipage.UserClicksNew();
	
	}

	@When("User enters the 1st Dealer Details for AudiCore&Boost and Clicks Save")
	public void user_enters_the_1st_dealer_details_for_audi_core_boost_and_clicks_save() throws InterruptedException {
	   
		Audipage.UserEntersDealers();
	}

	@Then("New 1st Dealer is added Successfully for AudiCore&Boost")
	public void new_1st_dealer_is_added_successfully_for_audi_core_boost() {
	   
		Assert.assertTrue( Audipage.AssertDealer1().contains("JJAUDI"));
	}

	
	
	
	@Given("User clicks on New to add the 1st Vehicle for AudiCore&Boost")
	public void user_clicks_on_new_to_add_the_1st_vehicle_for_audi_core_boost() throws InterruptedException {
	   
		Audipage.UserClicksNewVehicle();
	}

	@When("User enters the 1st Vehicle Details for AudiCore&Boost and Clicks Save")
	public void user_enters_the_1st_vehicle_details_for_audi_core_boost_and_clicks_save() throws InterruptedException {
		Audipage.UserEntersVehicle();
	
	}

	@Then("New 1st Vehicle is added Successfully for AudiCore&Boost")
	public void new_1st_vehicle_is_added_successfully_for_audi_core_boost() {
		Assert.assertTrue( Audipage.AssertVehicle1().contains("85420"));
	
	}
	
	
	

	@Given("User clicks on New to add the 2nd Vehicle for AudiCore&Boost")
	public void user_clicks_on_new_to_add_the_2nd_vehicle_for_audi_core_boost() throws InterruptedException {
	   
		Audipage.UserClicksNewVehicle2();
	}

	@When("User enters the 2nd Vehicle Details for AudiCore&Boost and Clicks Save")
	public void user_enters_the_2nd_vehicle_details_for_audi_core_boost_and_clicks_save() throws InterruptedException {
	   
		Audipage.UserEntersVehicle2();
	}

	@Then("New 2nd Vehicle is added Successfully for AudiCore&Boost")
	public void new_2nd_vehicle_is_added_successfully_for_audi_core_boost() {
		Assert.assertTrue( Audipage.AssertVehicle2().contains("92314"));
	
	}

	
	
	@Given("User clicks on New to add the 3rd Vehicle for AudiCore&Boost")
	public void user_clicks_on_new_to_add_the_3rd_vehicle_for_audi_core_boost() throws InterruptedException {
	   
		Audipage.UserClicksNewVehicle3();
	}

	@When("User enters the 3rd Vehicle Details for AudiCore&Boost and Clicks Save")
	public void user_enters_the_3rd_vehicle_details_for_audi_core_boost_and_clicks_save() throws InterruptedException {
		Audipage.UserEntersVehicle3();
	
	}

	@Then("New 3rd Vehicle is added Successfully for AudiCore&Boost")
	public void new_3rd_vehicle_is_added_successfully_for_audi_core_boost() {
	   
		Assert.assertTrue( Audipage.AssertVehicle3().contains("85077"));
	}

	
	
	
	@Given("User clicks on New to add the 4th Vehicle for AudiCore&Boost")
	public void user_clicks_on_new_to_add_the_4th_vehicle_for_audi_core_boost() throws InterruptedException {
	   
		Audipage.UserClicksNewVehicle4();
	}

	@When("User enters the 4th Vehicle Details for AudiCore&Boost and Clicks Save")
	public void user_enters_the_4th_vehicle_details_for_audi_core_boost_and_clicks_save() throws InterruptedException {
		Audipage.UserEntersVehicle4();
	
	}

	@Then("New 4th Vehicle is added Successfully for AudiCore&Boost")
	public void new_4th_vehicle_is_added_successfully_for_audi_core_boost() {
		Assert.assertTrue( Audipage.AssertVehicle4().contains("86572"));
	
	}
	
	
	

	@Given("User is on the IMS purchase record and Clicks new for AudiCore&Boost")
	public void user_is_on_the_ims_purchase_record_and_clicks_new_for_audi_core_boost() throws InterruptedException {
	   
		Audipage.UserClicksNewonIMS();
	}

	@When("User enters the 1st Record Mandatory fields for AudiCore&Boost and Clicks Save")
	public void user_enters_the_1st_record_mandatory_fields_for_audi_core_boost_and_clicks_save() throws InterruptedException {
		Audipage.UserCreatesIMS1();
	
	}

	@Then("New 1st Vehicle purchase record is created Successfully for AudiCore&Boost")
	public void new_1st_vehicle_purchase_record_is_created_successfully_for_audi_core_boost() {
	   
		Assert.assertTrue( Audipage.AssertIMS1().contains("XXX00EE"));
	}

	
	
	
	@When("User enters the 2nd Record Mandatory fields for AudiCore&Boost and Clicks Save")
	public void user_enters_the_2nd_record_mandatory_fields_for_audi_core_boost_and_clicks_save() throws InterruptedException {
	   
		Audipage.UserCreatesIMS2();
	}

	@Then("New 2nd Vehicle purchase record is created Successfully for AudiCore&Boost")
	public void new_2nd_vehicle_purchase_record_is_created_successfully_for_audi_core_boost() {
	   
		Assert.assertTrue( Audipage.AssertIMS2().contains("AAA78BB"));
	}
	
	
	
	

	@When("User enters the 3rd Record Mandatory fields for AudiCore&Boost and Clicks Save")
	public void user_enters_the_3rd_record_mandatory_fields_for_audi_core_boost_and_clicks_save() throws InterruptedException {
		Audipage.UserCreatesIMS3();
	
	}

	@Then("New 3rd Vehicle purchase record is created Successfully for AudiCore&Boost")
	public void new_3rd_vehicle_purchase_record_is_created_successfully_for_audi_core_boost() {
		Assert.assertTrue( Audipage.AssertIMS3().contains("NNN99MM"));
	
	}

	
	
	
	@When("User enters the 4th Record Mandatory fields for AudiCore&Boost and Clicks Save")
	public void user_enters_the_4th_record_mandatory_fields_for_audi_core_boost_and_clicks_save() throws InterruptedException {
	   
		Audipage.UserCreatesIMS4();
	}

	@Then("New 4th Vehicle purchase record is created Successfully for AudiCore&Boost")
	public void new_4th_vehicle_purchase_record_is_created_successfully_for_audi_core_boost() {
		Assert.assertTrue( Audipage.AssertIMS4().contains("GGG8II"));
	
	}
	
	
	@Given("User Clicks Targets")
	public void user_clicks_targets() throws InterruptedException {
		Audipage.UserClicksTarget();
	}

	@When("user clicks on newly created Audi Target")
	public void user_clicks_on_newly_created_audi_target() throws InterruptedException {
		Audipage.UserClicksNewTarget();
	}

	@Then("Validation of Audi records happens")
	public void validation_of_audi_records_happens() {
		//Assert.assertTrue( Audipage.AssertCorePurchase().contains("2"));
		//Assert.assertTrue( Audipage.AssertNonCorePurchase().contains("2"));
		Assert.assertTrue( Audipage.AssertCoreBonus().contains("£600.00"));
		Assert.assertTrue( Audipage.AssertTotalBonus().contains("£600.00"));
	}

}
