package stepdefinitions;

import org.junit.Assert;

import Driver.Driver;
import PageObjects.SkodaFreeDeliveryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SkodaFreeDelivery {
	
	private SkodaFreeDeliveryPage Skodapage = new SkodaFreeDeliveryPage(Driver.getDriver());
	
	
	@Given("User is on the target creation page Skoda free delivery")
	public void user_is_on_the_target_creation_page_skoda_free_delivery() throws InterruptedException {
		Driver.getDriver().get("https://bca-rms--uat.my.salesforce.com");
	    Skodapage.UserisonTargetPage();
	}

	@When("User selects the Skoda Free Delivery and clicks next")
	public void user_selects_the_skoda_free_delivery_and_clicks_next() {
		Assert.assertTrue( Skodapage.AssertPage1().contains("New Target: Free Delivery"));
	}

	@When("User fills all the mandatory fields for Skoda free delivery and clicks Save")
	public void user_fills_all_the_mandatory_fields_for_skoda_free_delivery_and_clicks_save() throws InterruptedException {
		Skodapage.UserFillsMandatoryFields();
	}

	@Then("New Target for Skoda free delivery is created successfully")
	public void new_target_for_skoda_free_delivery_is_created_successfully() {
		Assert.assertTrue( Skodapage.AssertValue1().contains("Skoda"));
		Assert.assertTrue( Skodapage.AssertValue2().contains("Free Delivery"));
	}

	
	
	
	
	/*-------------------------------------------------------------Addition of 1st dealer-------------------------------------------------------*/
	@Given("User clicks on New to add the 1st Dealer for SkodaFreeDelivery")
	public void user_clicks_on_new_to_add_the_1st_dealer_for_skodafreedelivery() throws InterruptedException {
	    Skodapage.UserClicksNew();
	}

	@When("User enters the 1st Dealer Details for SkodaFreeDelivery and Clicks Save")
	public void user_enters_the_1st_dealer_details_for_skodafreedelivery_and_clicks_save() throws InterruptedException {
	    Skodapage.UserEntersDealers();
	}

	@Then("New 1st Dealer is added Successfully for SkodaFreeDelivery")
	public void new_1st_dealer_is_added_successfully_for_skodafreedelivery() {
		Assert.assertTrue( Skodapage.AssertDealer1().contains("JJSKODA"));
	}
	
	
	
	
	
	/*-------------------------------------------------------------Addition of 1st vehicle-------------------------------------------------------*/
	@Given("User clicks on New to add the 1st Vehicle for SkodaFreeDelivery")
	public void user_clicks_on_new_to_add_the_1st_vehicle_for_skodafreedelivery() throws InterruptedException {
	   Skodapage.UserClicksNewVehicle();
	}

	@When("User enters the 1st Vehicle Details for SkodaFreeDelivery and Clicks Save")
	public void user_enters_the_1st_vehicle_details__for_skodafreedelivery_and_clicks_save() throws InterruptedException {
	   Skodapage.UserEntersVehicle();
	}

	@Then("New 1st Vehicle is added Successfully for SkodaFreeDelivery")
	public void new_1st_vehicle_is_added_successfully_for_skodafreedelivery() {
		Assert.assertTrue( Skodapage.AssertVehicle1().contains("90338"));
	}

	
	/*-------------------------------------------------------------Addition of 2nd vehicle-------------------------------------------------------*/
	
	@Given("User clicks on New to add the 2nd Vehicle for SkodaFreeDelivery")
	public void user_clicks_on_new_to_add_the_2nd_vehicle_for_skodafreedelivery() throws InterruptedException {
		 Skodapage.UserClicksNewVehicle2();
	}

	@When("User enters the 2nd Vehicle Details for SkodaFreeDelivery and Clicks Save")
	public void user_enters_the_2nd_vehicle_details__for_skodafreedelivery_and_clicks_save() throws InterruptedException {
		 Skodapage.UserEntersVehicle2();
	}

	@Then("New 2nd Vehicle is added Successfully for SkodaFreeDelivery")
	public void new_2nd_vehicle_is_added_successfully_for_skodafreedelivery() {
		Assert.assertTrue( Skodapage.AssertVehicle2().contains("77520"));
	}

	
	/*-------------------------------------------------------------Addition of 3rd vehicle-------------------------------------------------------*/
	
	@Given("User clicks on New to add the 3rd Vehicle for SkodaFreeDelivery")
	public void user_clicks_on_new_to_add_the_3rd_vehicle_for_skodafreedelivery() throws InterruptedException {
		 Skodapage.UserClicksNewVehicle3();
	}

	@When("User enters the 3rd Vehicle Details for SkodaFreeDelivery and Clicks Save")
	public void user_enters_the_3rd_vehicle_details__for_skodafreedelivery_and_clicks_save() throws InterruptedException {
		 Skodapage.UserEntersVehicle3();
	}

	@Then("New 3rd Vehicle is added Successfully for SkodaFreeDelivery")
	public void new_3rd_vehicle_is_added_successfully_for_skodafreedelivery() {
		Assert.assertTrue( Skodapage.AssertVehicle3().contains("87198"));
	}

	
	/*-------------------------------------------------------------Addition of 4th vehicle-------------------------------------------------------*/
	
	@Given("User clicks on New to add the 4th Vehicle for SkodaFreeDelivery")
	public void user_clicks_on_new_to_add_the_4th_vehicle_for_skodafreedelivery() throws InterruptedException {
		 Skodapage.UserClicksNewVehicle4();
	}

	@When("User enters the 4th Vehicle Details for SkodaFreeDelivery and Clicks Save")
	public void user_enters_the_4th_vehicle_details__for_skodafreedelivery_and_clicks_save() throws InterruptedException {
		 Skodapage.UserEntersVehicle4();
	}

	@Then("New 4th Vehicle is added Successfully for SkodaFreeDelivery")
	public void new_4th_vehicle_is_added_successfully_for_skodafreedelivery() {
		Assert.assertTrue( Skodapage.AssertVehicle4().contains("85876"));
	}
	
	/*-------------------------------------------------------------Creation of IMS Purchase Record-1-------------------------------------------------------*/
	
	@Given("User is on the IMS purchase record and Clicks new for SkodaFreeDelivery")
	public void user_is_on_the_ims_purchase_record_and_clicks_new_for_skodafreedelivery() throws InterruptedException {
	 Skodapage.UserClicksNewonIMS();
	}

	@When("User enters the 1st Record Mandatory fields for SkodaFreeDelivery and Clicks Save")
	public void user_enters_the_1st_record_mandatory_fields__for_skodafreedelivery_and_clicks_save() throws InterruptedException {
		Skodapage.UserCreatesIMS1();
	}

	@Then("New 1st Vehicle purchase record is created Successfully for SkodaFreeDelivery")
	public void new_1st_vehicle_purchase_record_is_created_successfully_for_skodafreedelivery() {
		Assert.assertTrue( Skodapage.AssertIMS1().contains("EEW44YU"));
	}
	
	
/*-------------------------------------------------------------Creation of IMS Purchase Record-2-------------------------------------------------------*/
	
	
	@When("User enters the 2nd Record Mandatory fields for SkodaFreeDelivery and Clicks Save")
	public void user_enters_the_2nd_record_mandatory_fields__for_skodafreedelivery_and_clicks_save() throws InterruptedException {
		Skodapage.UserCreatesIMS2();
	}

	@Then("New 2nd Vehicle purchase record is created Successfully for SkodaFreeDelivery")
	public void new_2nd_vehicle_purchase_record_is_created_successfully_for_skodafreedelivery() {
		Assert.assertTrue( Skodapage.AssertIMS2().contains("CXT11LK"));
	}
	
/*-------------------------------------------------------------Creation of IMS Purchase Record-3-------------------------------------------------------*/
	
	
	@When("User enters the 3rd Record Mandatory fields for SkodaFreeDelivery and Clicks Save")
	public void user_enters_the_3rd_record_mandatory_fields__for_skodafreedelivery_and_clicks_save() throws InterruptedException {
		Skodapage.UserCreatesIMS3();
	}

	@Then("New 3rd Vehicle purchase record is created Successfully for SkodaFreeDelivery")
	public void new_3rd_vehicle_purchase_record_is_created_successfully_for_skodafreedelivery() {
		Assert.assertTrue( Skodapage.AssertIMS3().contains("FHJ89LM"));
	}
	
/*-------------------------------------------------------------Creation of IMS Purchase Record-4-------------------------------------------------------*/
	
	
	@When("User enters the 4th Record Mandatory fields for SkodaFreeDelivery and Clicks Save")
	public void user_enters_the_4th_record_mandatory_fields__for_skodafreedelivery_and_clicks_save() throws InterruptedException {
		Skodapage.UserCreatesIMS4();
	}

	@Then("New 4th Vehicle purchase record is created Successfully for SkodaFreeDelivery")
	public void new_4th_vehicle_purchase_record_is_created_successfully_for_skodafreedelivery() {
		Assert.assertTrue( Skodapage.AssertIMS4().contains("IKM89GB"));
	}

	
	
	
	
	@Given("User Clicks on recent Targets")
	public void user_clicks_on_recent_targets() throws InterruptedException {
		Skodapage.UserClicksTarget();
	}

	@When("user clicks on newly created Skoda FreeDelivery Target")
	public void user_clicks_on_newly_created_skoda_free_delivery_target() throws InterruptedException {
		 Skodapage.UserClicksNewTarget();
	}

	@Then("Validation of Skoda FreeDelivery records happens")
	public void validation_of_skoda_free_delivery_records_happens() {
		Assert.assertTrue( Skodapage.AssertDeliveryCost().contains("£160.00"));
		Assert.assertTrue( Skodapage.AssertDeliveryRebate().contains("£320.00"));
		Assert.assertTrue( Skodapage.AssertTotalBonus().contains("2"));
	}

	
	
}
