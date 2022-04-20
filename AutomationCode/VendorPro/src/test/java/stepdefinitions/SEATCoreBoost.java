package stepdefinitions;

import org.junit.Assert;

import Driver.Driver;
import PageObjects.SEATCoreBoostPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SEATCoreBoost {
	
	
private SEATCoreBoostPage SEATpage = new SEATCoreBoostPage(Driver.getDriver());
	
	
	@Given("User is on the target creation page SEAT")
	public void user_is_on_the_target_creation_page_seat() throws InterruptedException {
		Driver.getDriver().get("https://bca-rms--uat.my.salesforce.com");
		  SEATpage.UserisonTargetPage();
	}

	@When("User selects the SEATCore&Boost and clicks next")
	public void user_selects_the_seat_core_boost_and_clicks_next() {
		Assert.assertTrue( SEATpage.AssertPage1().contains("New Target: SEAT Core & Boost Value"));
	
	}

	@And("User fills all the mandatory fields for SEATCore&Boost and clicks Save")
	public void user_fills_all_the_mandatory_fields_for_seat_core_boost_and_clicks_save() throws InterruptedException {
	
		SEATpage.UserFillsMandatoryFields();
	
	}

	@Then("New Target for SEATCore&Boost is created successfully")
	public void new_target_for_seat_core_boost_is_created_successfully() {
		Assert.assertTrue( SEATpage.AssertValue1().contains("Seat"));
		Assert.assertTrue( SEATpage.AssertValue2().contains("SEAT Core & Boost Value"));
	
	}

	
	
	
	@Given("User clicks on New to add the 1st Dealer for SEATCore&Boost")
	public void user_clicks_on_new_to_add_the_1st_dealer_for_seat_core_boost() throws InterruptedException {
		   SEATpage.UserClicksNew();
	
	}

	@When("User enters the 1st Dealer Details for SEATCore&Boost and Clicks Save")
	public void user_enters_the_1st_dealer_details_for_seat_core_boost_and_clicks_save() throws InterruptedException {
	   
		SEATpage.UserEntersDealers();
	}

	@Then("New 1st Dealer is added Successfully for SEATCore&Boost")
	public void new_1st_dealer_is_added_successfully_for_seat_core_boost() {
	   
		Assert.assertTrue( SEATpage.AssertDealer1().contains("JJSEAT"));
	}

	
	
	@Given("User clicks on New to add the 1st Vehicle for SEATCore&Boost")
	public void user_clicks_on_new_to_add_the_1st_vehicle_for_seat_core_boost() throws InterruptedException {
	   
		SEATpage.UserClicksNewVehicle();
	}

	@When("User enters the 1st Vehicle Details for SEATCore&Boost and Clicks Save")
	public void user_enters_the_1st_vehicle_details_for_seat_core_boost_and_clicks_save() throws InterruptedException {
		SEATpage.UserEntersVehicle();
	
	}

	@Then("New 1st Vehicle is added Successfully for SEATCore&Boost")
	public void new_1st_vehicle_is_added_successfully_for_seat_core_boost() {
		Assert.assertTrue( SEATpage.AssertVehicle1().contains("81589"));
	
	}
	
	
	

	@Given("User clicks on New to add the 2nd Vehicle for SEATCore&Boost")
	public void user_clicks_on_new_to_add_the_2nd_vehicle_for_seat_core_boost() throws InterruptedException {
	   
		SEATpage.UserClicksNewVehicle2();
	}

	@When("User enters the 2nd Vehicle Details for SEATCore&Boost and Clicks Save")
	public void user_enters_the_2nd_vehicle_details_for_seat_core_boost_and_clicks_save() throws InterruptedException {
	   
		SEATpage.UserEntersVehicle2();
	}

	@Then("New 2nd Vehicle is added Successfully for SEATCore&Boost")
	public void new_2nd_vehicle_is_added_successfully_for_seat_core_boost() {
		Assert.assertTrue( SEATpage.AssertVehicle2().contains("84985"));
	
	}

	
	
	@Given("User clicks on New to add the 3rd Vehicle for SEATCore&Boost")
	public void user_clicks_on_new_to_add_the_3rd_vehicle_for_seat_core_boost() throws InterruptedException {
	   
		SEATpage.UserClicksNewVehicle3();
	}

	@When("User enters the 3rd Vehicle Details for SEATCore&Boost and Clicks Save")
	public void user_enters_the_3rd_vehicle_details_for_seat_core_boost_and_clicks_save() throws InterruptedException {
		SEATpage.UserEntersVehicle3();
	
	}

	@Then("New 3rd Vehicle is added Successfully for SEATCore&Boost")
	public void new_3rd_vehicle_is_added_successfully_for_seat_core_boost() {
	   
		Assert.assertTrue( SEATpage.AssertVehicle3().contains("85109"));
	}

	
	
	
	@Given("User clicks on New to add the 4th Vehicle for SEATCore&Boost")
	public void user_clicks_on_new_to_add_the_4th_vehicle_for_seat_core_boost() throws InterruptedException {
	   
		SEATpage.UserClicksNewVehicle4();
	}

	@When("User enters the 4th Vehicle Details for SEATCore&Boost and Clicks Save")
	public void user_enters_the_4th_vehicle_details_for_seat_core_boost_and_clicks_save() throws InterruptedException {
		SEATpage.UserEntersVehicle4();
	
	}

	@Then("New 4th Vehicle is added Successfully for SEATCore&Boost")
	public void new_4th_vehicle_is_added_successfully_for_seat_core_boost() {
		Assert.assertTrue( SEATpage.AssertVehicle4().contains("87878"));
	
	}
	
	
	

	@Given("User is on the IMS purchase record and Clicks new for SEATCore&Boost")
	public void user_is_on_the_ims_purchase_record_and_clicks_new_for_seat_core_boost() throws InterruptedException {
	   
		SEATpage.UserClicksNewonIMS();
	}

	@When("User enters the 1st Record Mandatory fields for SEATCore&Boost and Clicks Save")
	public void user_enters_the_1st_record_mandatory_fields_for_seat_core_boost_and_clicks_save() throws InterruptedException {
		SEATpage.UserCreatesIMS1();
	
	}

	@Then("New 1st Vehicle purchase record is created Successfully for SEATCore&Boost")
	public void new_1st_vehicle_purchase_record_is_created_successfully_for_seat_core_boost() {
	   
		Assert.assertTrue( SEATpage.AssertIMS1().contains("BBN87II"));
	}

	
	
	
	@When("User enters the 2nd Record Mandatory fields for SEATCore&Boost and Clicks Save")
	public void user_enters_the_2nd_record_mandatory_fields_for_seat_core_boost_and_clicks_save() throws InterruptedException {
	   
		SEATpage.UserCreatesIMS2();
	}

	@Then("New 2nd Vehicle purchase record is created Successfully for SEATCore&Boost")
	public void new_2nd_vehicle_purchase_record_is_created_successfully_for_seat_core_boost() {
	   
		Assert.assertTrue( SEATpage.AssertIMS2().contains("AAQ76WW"));
	}
	
	
	
	

	@When("User enters the 3rd Record Mandatory fields for SEATCore&Boost and Clicks Save")
	public void user_enters_the_3rd_record_mandatory_fields_for_seat_core_boost_and_clicks_save() throws InterruptedException {
		SEATpage.UserCreatesIMS3();
	
	}

	@Then("New 3rd Vehicle purchase record is created Successfully for SEATCore&Boost")
	public void new_3rd_vehicle_purchase_record_is_created_successfully_for_seat_core_boost() {
		Assert.assertTrue( SEATpage.AssertIMS3().contains("GGU14GN"));
	
	}

	
	
	
	@When("User enters the 4th Record Mandatory fields for SEATCore&Boost and Clicks Save")
	public void user_enters_the_4th_record_mandatory_fields_for_seat_core_boost_and_clicks_save() throws InterruptedException {
	   
		SEATpage.UserCreatesIMS4();
	}

	@Then("New 4th Vehicle purchase record is created Successfully for SEATCore&Boost")
	public void new_4th_vehicle_purchase_record_is_created_successfully_for_seat_core_boost() {
		Assert.assertTrue( SEATpage.AssertIMS4().contains("LPA54OI"));
	
	}
	
	
	@Given("User Clicks Targets for Validation")
	public void user_clicks_targets_for_validation() throws InterruptedException {
		SEATpage.UserClicksTarget();
	}

	@When("user clicks on newly created SEAT Target")
	public void user_clicks_on_newly_created_seat_target() throws InterruptedException {
		SEATpage.UserClicksNewTarget();
	}

	@Then("Validation of SEAT records happens")
	public void validation_of_seat_records_happens() {
		Assert.assertTrue( SEATpage.AssertCoreBonus().contains("£900.00"));
		Assert.assertTrue( SEATpage.AssertNonCoreBonus().contains("£1,200.00"));
		Assert.assertTrue( SEATpage.AssertTotalBonus().contains("£2,100.00"));
	}

}


