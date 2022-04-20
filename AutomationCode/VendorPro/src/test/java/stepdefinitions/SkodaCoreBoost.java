package stepdefinitions;

import org.junit.Assert;

import Driver.Driver;
import PageObjects.SkodaCoreBoostPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SkodaCoreBoost {
	
	
private SkodaCoreBoostPage Skodapage = new SkodaCoreBoostPage(Driver.getDriver());
	
	
	@Given("User is on the target creation page Skoda")
	public void user_is_on_the_target_creation_page_skoda() throws InterruptedException {
		Driver.getDriver().get("https://bca-rms--uat.lightning.force.com/lightning/o/Target__c/list?filterName=Recent");
		  Skodapage.UserisonTargetPage();
	}

	@When("User selects the SkodaCore&Boost and clicks next")
	public void user_selects_the_skoda_core_boost_and_clicks_next() {
		Assert.assertTrue( Skodapage.AssertPage1().contains("New Target: Skoda Core & Boost Value"));
	
	}

	@And("User fills all the mandatory fields for SkodaCore&Boost and clicks Save")
	public void user_fills_all_the_mandatory_fields_for_skoda_core_boost_and_clicks_save() throws InterruptedException {
	
		Skodapage.UserFillsMandatoryFields();
	
	}

	@Then("New Target for SkodaCore&Boost is created successfully")
	public void new_target_for_skoda_core_boost_is_created_successfully() {
		Assert.assertTrue( Skodapage.AssertValue1().contains("Skoda"));
		Assert.assertTrue( Skodapage.AssertValue2().contains("Skoda Core & Boost Value"));
	
	}

	
	
	
	@Given("User clicks on New to add the 1st Dealer for SkodaCore&Boost")
	public void user_clicks_on_new_to_add_the_1st_dealer_for_skoda_core_boost() throws InterruptedException {
		   Skodapage.UserClicksNew();
	
	}

	@When("User enters the 1st Dealer Details for SkodaCore&Boost and Clicks Save")
	public void user_enters_the_1st_dealer_details_for_skoda_core_boost_and_clicks_save() throws InterruptedException {
	   
		Skodapage.UserEntersDealers();
	}

	@Then("New 1st Dealer is added Successfully for SkodaCore&Boost")
	public void new_1st_dealer_is_added_successfully_for_skoda_core_boost() {
	   
		Assert.assertTrue( Skodapage.AssertDealer1().contains("JJSKODA"));
	}

	
	
	
	@Given("User clicks on New to add the 1st Vehicle for SkodaCore&Boost")
	public void user_clicks_on_new_to_add_the_1st_vehicle_for_skoda_core_boost() throws InterruptedException {
	   
		Skodapage.UserClicksNewVehicle();
	}

	@When("User enters the 1st Vehicle Details for SkodaCore&Boost and Clicks Save")
	public void user_enters_the_1st_vehicle_details_for_skoda_core_boost_and_clicks_save() throws InterruptedException {
		Skodapage.UserEntersVehicle();
	
	}

	@Then("New 1st Vehicle is added Successfully for SkodaCore&Boost")
	public void new_1st_vehicle_is_added_successfully_for_skoda_core_boost() {
		Assert.assertTrue( Skodapage.AssertVehicle1().contains("90338"));
	
	}
	
	
	

	@Given("User clicks on New to add the 2nd Vehicle for SkodaCore&Boost")
	public void user_clicks_on_new_to_add_the_2nd_vehicle_for_skoda_core_boost() throws InterruptedException {
	   
		Skodapage.UserClicksNewVehicle2();
	}

	@When("User enters the 2nd Vehicle Details for SkodaCore&Boost and Clicks Save")
	public void user_enters_the_2nd_vehicle_details_for_skoda_core_boost_and_clicks_save() throws InterruptedException {
	   
		Skodapage.UserEntersVehicle2();
	}

	@Then("New 2nd Vehicle is added Successfully for SkodaCore&Boost")
	public void new_2nd_vehicle_is_added_successfully_for_skoda_core_boost() {
		Assert.assertTrue( Skodapage.AssertVehicle2().contains("77520"));
	
	}

	
	
	@Given("User clicks on New to add the 3rd Vehicle for SkodaCore&Boost")
	public void user_clicks_on_new_to_add_the_3rd_vehicle_for_skoda_core_boost() throws InterruptedException {
	   
		Skodapage.UserClicksNewVehicle3();
	}

	@When("User enters the 3rd Vehicle Details for SkodaCore&Boost and Clicks Save")
	public void user_enters_the_3rd_vehicle_details_for_skoda_core_boost_and_clicks_save() throws InterruptedException {
		Skodapage.UserEntersVehicle3();
	
	}

	@Then("New 3rd Vehicle is added Successfully for SkodaCore&Boost")
	public void new_3rd_vehicle_is_added_successfully_for_skoda_core_boost() {
	   
		Assert.assertTrue( Skodapage.AssertVehicle3().contains("87198"));
	}

	
	
	
	@Given("User clicks on New to add the 4th Vehicle for SkodaCore&Boost")
	public void user_clicks_on_new_to_add_the_4th_vehicle_for_skoda_core_boost() throws InterruptedException {
	   
		Skodapage.UserClicksNewVehicle4();
	}

	@When("User enters the 4th Vehicle Details for SkodaCore&Boost and Clicks Save")
	public void user_enters_the_4th_vehicle_details_for_skoda_core_boost_and_clicks_save() throws InterruptedException {
		Skodapage.UserEntersVehicle4();
	
	}

	@Then("New 4th Vehicle is added Successfully for SkodaCore&Boost")
	public void new_4th_vehicle_is_added_successfully_for_skoda_core_boost() {
		Assert.assertTrue( Skodapage.AssertVehicle4().contains("85876"));
	
	}
	
	@Given("User clicks on New to add the 5th Vehicle for SkodaCore&Boost")
	public void user_clicks_on_new_to_add_the_5th_vehicle_for_skoda_core_boost() throws InterruptedException {
	   
		Skodapage.UserClicksNewVehicle5();
	}

	@When("User enters the 5th Vehicle Details for SkodaCore&Boost and Clicks Save")
	public void user_enters_the_5th_vehicle_details_for_skoda_core_boost_and_clicks_save() throws InterruptedException {
		Skodapage.UserEntersVehicle5();
	
	}

	@Then("New 5th Vehicle is added Successfully for SkodaCore&Boost")
	public void new_5th_vehicle_is_added_successfully_for_skoda_core_boost() {
		Assert.assertTrue( Skodapage.AssertVehicle5().contains("89020"));
	
	}
	
	
	@Given("User clicks on New to add the 6th Vehicle for SkodaCore&Boost")
	public void user_clicks_on_new_to_add_the_6th_vehicle_for_skoda_core_boost() throws InterruptedException {
	   
		Skodapage.UserClicksNewVehicle6();
	}

	@When("User enters the 6th Vehicle Details for SkodaCore&Boost and Clicks Save")
	public void user_enters_the_6th_vehicle_details_for_skoda_core_boost_and_clicks_save() throws InterruptedException {
		Skodapage.UserEntersVehicle6();
	
	}

	@Then("New 6th Vehicle is added Successfully for SkodaCore&Boost")
	public void new_6th_vehicle_is_added_successfully_for_skoda_core_boost() {
		Assert.assertTrue( Skodapage.AssertVehicle6().contains("80112"));
	
	}
	
	@Given("User clicks on New to add the 7th Vehicle for SkodaCore&Boost")
	public void user_clicks_on_new_to_add_the_7th_vehicle_for_skoda_core_boost() throws InterruptedException {
	   
		Skodapage.UserClicksNewVehicle7();
	}

	@When("User enters the 7th Vehicle Details for SkodaCore&Boost and Clicks Save")
	public void user_enters_the_7th_vehicle_details_for_skoda_core_boost_and_clicks_save() throws InterruptedException {
		Skodapage.UserEntersVehicle7();
	
	}

	@Then("New 7th Vehicle is added Successfully for SkodaCore&Boost")
	public void new_7th_vehicle_is_added_successfully_for_skoda_core_boost() {
		Assert.assertTrue( Skodapage.AssertVehicle7().contains("91390"));
	
	}
	
	

	@Given("User is on the IMS purchase record and Clicks new for SkodaCore&Boost")
	public void user_is_on_the_ims_purchase_record_and_clicks_new_for_skoda_core_boost() throws InterruptedException {
	   
		Skodapage.UserClicksNewonIMS();
	}

	@When("User enters the 1st Record Mandatory fields for SkodaCore&Boost and Clicks Save")
	public void user_enters_the_1st_record_mandatory_fields_for_skoda_core_boost_and_clicks_save() throws InterruptedException {
		Skodapage.UserCreatesIMS1();
	
	}

	@Then("New 1st Vehicle purchase record is created Successfully for SkodaCore&Boost")
	public void new_1st_vehicle_purchase_record_is_created_successfully_for_skoda_core_boost() {
	   
		Assert.assertTrue( Skodapage.AssertIMS1().contains("EEW44YU"));
	}

	
	
	
	@When("User enters the 2nd Record Mandatory fields for SkodaCore&Boost and Clicks Save")
	public void user_enters_the_2nd_record_mandatory_fields_for_skoda_core_boost_and_clicks_save() throws InterruptedException {
	   
		Skodapage.UserCreatesIMS2();
	}

	@Then("New 2nd Vehicle purchase record is created Successfully for SkodaCore&Boost")
	public void new_2nd_vehicle_purchase_record_is_created_successfully_for_skoda_core_boost() {
	   
		Assert.assertTrue( Skodapage.AssertIMS2().contains("CXT11LK"));
	}
	
	
	
	

	@When("User enters the 3rd Record Mandatory fields for SkodaCore&Boost and Clicks Save")
	public void user_enters_the_3rd_record_mandatory_fields_for_skoda_core_boost_and_clicks_save() throws InterruptedException {
		Skodapage.UserCreatesIMS3();
	
	}

	@Then("New 3rd Vehicle purchase record is created Successfully for SkodaCore&Boost")
	public void new_3rd_vehicle_purchase_record_is_created_successfully_for_skoda_core_boost() {
		Assert.assertTrue( Skodapage.AssertIMS3().contains("FHJ89LM"));
	
	}

	
	
	
	@When("User enters the 4th Record Mandatory fields for SkodaCore&Boost and Clicks Save")
	public void user_enters_the_4th_record_mandatory_fields_for_skoda_core_boost_and_clicks_save() throws InterruptedException {
	   
		Skodapage.UserCreatesIMS4();
	}

	@Then("New 4th Vehicle purchase record is created Successfully for SkodaCore&Boost")
	public void new_4th_vehicle_purchase_record_is_created_successfully_for_skoda_core_boost() {
		Assert.assertTrue( Skodapage.AssertIMS4().contains("IKM89GB"));
	
	}
	
	@When("User enters the 5th Record Mandatory fields for SkodaCore&Boost and Clicks Save")
	public void user_enters_the_5th_record_mandatory_fields_for_skoda_core_boost_and_clicks_save() throws InterruptedException {
	   
		Skodapage.UserCreatesIMS5();
	}

	@Then("New 5th Vehicle purchase record is created Successfully for SkodaCore&Boost")
	public void new_5th_vehicle_purchase_record_is_created_successfully_for_skoda_core_boost() {
		Assert.assertTrue( Skodapage.AssertIMS5().contains("PPO22HN"));
	
	}
	
	@When("User enters the 6th Record Mandatory fields for SkodaCore&Boost and Clicks Save")
	public void user_enters_the_6th_record_mandatory_fields_for_skoda_core_boost_and_clicks_save() throws InterruptedException {
	   
		Skodapage.UserCreatesIMS6();
	}

	@Then("New 6th Vehicle purchase record is created Successfully for SkodaCore&Boost")
	public void new_6th_vehicle_purchase_record_is_created_successfully_for_skoda_core_boost() {
		Assert.assertTrue( Skodapage.AssertIMS6().contains("JPR88JO"));
	
	}
	
	@When("User enters the 7th Record Mandatory fields for SkodaCore&Boost and Clicks Save")
	public void user_enters_the_7th_record_mandatory_fields_for_skoda_core_boost_and_clicks_save() throws InterruptedException {
	   
		Skodapage.UserCreatesIMS7();
	}

	@Then("New 7th Vehicle purchase record is created Successfully for SkodaCore&Boost")
	public void new_7th_vehicle_purchase_record_is_created_successfully_for_skoda_core_boost() {
		Assert.assertTrue( Skodapage.AssertIMS7().contains("SHA65JP"));
	
	}
	

}
