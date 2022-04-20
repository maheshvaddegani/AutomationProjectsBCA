package stepdefinitions;

import org.junit.Assert;

import Driver.Driver;
import PageObjects.VWCoreBoostPage;
import PageObjects.VWFreeDeliveryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VWFreeDelivery {
	
	private VWCoreBoostPage VWpage = new VWCoreBoostPage(Driver.getDriver());
	private VWFreeDeliveryPage VWFDpage = new VWFreeDeliveryPage(Driver.getDriver());
	
	
	
	@Given("User is on the target creation page")
	public void user_is_on_the_target_creation_page() throws InterruptedException {
		Driver.getDriver().get("https://bca-rms--uat.my.salesforce.com");
	    VWFDpage.UserisonTargetPage1();
	}

	@When("User selects the VW Free Delivery and clicks next")
	public void user_selects_the_vw_free_delivery_and_clicks_next() {
		Assert.assertTrue( VWFDpage.AssertPage1().contains("New Target: VW Free Delivery"));
	}

	@And("User fills all the mandatory fields for free delivery and clicks Save")
	public void user_fills_all_the_mandatory_fields_for_free_delivery_and_clicks_save() throws InterruptedException {
		VWFDpage.UserFillsMandatoryFields1();
	}

	@Then("New Target for VW free delivery is created successfully")
	public void new_target_for_vw_free_delivery_is_created_successfully() {
		Assert.assertTrue( VWFDpage.AssertValue1().contains("Volkswagen"));
		Assert.assertTrue( VWFDpage.AssertValue2().contains("VW Free Delivery"));
	}
	
	
	/*-------------------------------------------------------------Addition of 1st dealer-------------------------------------------------------*/
	@Given("User clicks on New to add the 1st Dealer for VWFreeDelivery")
	public void user_clicks_on_new_to_add_the_1st_dealer_for_vwfreedelivery() throws InterruptedException {
	    VWFDpage.UserClicksNew();
	}

	@When("User enters the 1st Dealer Details for VWFreeDelivery and Clicks Save")
	public void user_enters_the_1st_dealer_details_for_vwfreedelivery_and_clicks_save() throws InterruptedException {
	    VWFDpage.UserEntersDealers();
	}

	@Then("New 1st Dealer is added Successfully for VWFreeDelivery")
	public void new_1st_dealer_is_added_successfully_for_vwfreedelivery() {
		Assert.assertTrue( VWFDpage.AssertDealer1().contains("JJ12345"));
	}
	
	
	
	
	
	/*-------------------------------------------------------------Addition of 1st vehicle-------------------------------------------------------*/
	@Given("User clicks on New to add the 1st Vehicle for VWFreeDelivery")
	public void user_clicks_on_new_to_add_the_1st_vehicle_for_vwfreedelivery() throws InterruptedException {
	   VWpage.UserClicksNewVehicle();
	}

	@When("User enters the 1st Vehicle Details for VWFreeDelivery and Clicks Save")
	public void user_enters_the_1st_vehicle_details__for_vwfreedelivery_and_clicks_save() throws InterruptedException {
	   VWpage.UserEntersVehicle();
	}

	@Then("New 1st Vehicle is added Successfully for VWFreeDelivery")
	public void new_1st_vehicle_is_added_successfully_for_vwfreedelivery() {
		Assert.assertTrue( VWpage.AssertVehicle1().contains("81323A"));
	}

	
	/*-------------------------------------------------------------Addition of 2nd vehicle-------------------------------------------------------*/
	
	@Given("User clicks on New to add the 2nd Vehicle for VWFreeDelivery")
	public void user_clicks_on_new_to_add_the_2nd_vehicle_for_vwfreedelivery() throws InterruptedException {
		 VWpage.UserClicksNewVehicle2();
	}

	@When("User enters the 2nd Vehicle Details for VWFreeDelivery and Clicks Save")
	public void user_enters_the_2nd_vehicle_details__for_vwfreedelivery_and_clicks_save() throws InterruptedException {
		 VWpage.UserEntersVehicle2();
	}

	@Then("New 2nd Vehicle is added Successfully for VWFreeDelivery")
	public void new_2nd_vehicle_is_added_successfully_for_vwfreedelivery() {
		Assert.assertTrue( VWpage.AssertVehicle2().contains("78476"));
	}

	
	/*-------------------------------------------------------------Addition of 3rd vehicle-------------------------------------------------------*/
	
	@Given("User clicks on New to add the 3rd Vehicle for VWFreeDelivery")
	public void user_clicks_on_new_to_add_the_3rd_vehicle_for_vwfreedelivery() throws InterruptedException {
		 VWpage.UserClicksNewVehicle3();
	}

	@When("User enters the 3rd Vehicle Details for VWFreeDelivery and Clicks Save")
	public void user_enters_the_3rd_vehicle_details__for_vwfreedelivery_and_clicks_save() throws InterruptedException {
		 VWpage.UserEntersVehicle3();
	}

	@Then("New 3rd Vehicle is added Successfully for VWFreeDelivery")
	public void new_3rd_vehicle_is_added_successfully_for_vwfreedelivery() {
		Assert.assertTrue( VWpage.AssertVehicle3().contains("81817"));
	}

	
	/*-------------------------------------------------------------Addition of 4th vehicle-------------------------------------------------------*/
	
	@Given("User clicks on New to add the 4th Vehicle for VWFreeDelivery")
	public void user_clicks_on_new_to_add_the_4th_vehicle_for_vwfreedelivery() throws InterruptedException {
		 VWpage.UserClicksNewVehicle4();
	}

	@When("User enters the 4th Vehicle Details for VWFreeDelivery and Clicks Save")
	public void user_enters_the_4th_vehicle_details__for_vwfreedelivery_and_clicks_save() throws InterruptedException {
		 VWpage.UserEntersVehicle4();
	}

	@Then("New 4th Vehicle is added Successfully for VWFreeDelivery")
	public void new_4th_vehicle_is_added_successfully_for_vwfreedelivery() {
		Assert.assertTrue( VWpage.AssertVehicle4().contains("86143"));
	}
	
	/*-------------------------------------------------------------Creation of IMS Purchase Record-1-------------------------------------------------------*/
	
	@Given("User is on the IMS purchase record and Clicks new for VWFreeDelivery")
	public void user_is_on_the_ims_purchase_record_and_clicks_new_for_vwfreedelivery() throws InterruptedException {
	 VWpage.UserClicksNewonIMS();
	}

	@When("User enters the 1st Record Mandatory fields for VWFreeDelivery and Clicks Save")
	public void user_enters_the_1st_record_mandatory_fields__for_vwfreedelivery_and_clicks_save() throws InterruptedException {
		VWpage.UserCreatesIMS1();
	}

	@Then("New 1st Vehicle purchase record is created Successfully for VWFreeDelivery")
	public void new_1st_vehicle_purchase_record_is_created_successfully_for_vwfreedelivery() {
		Assert.assertTrue( VWpage.AssertIMS1().contains("TUV78IO"));
	}
	
	
/*-------------------------------------------------------------Creation of IMS Purchase Record-2-------------------------------------------------------*/
	
	
	@When("User enters the 2nd Record Mandatory fields for VWFreeDelivery and Clicks Save")
	public void user_enters_the_2nd_record_mandatory_fields__for_vwfreedelivery_and_clicks_save() throws InterruptedException {
		VWpage.UserCreatesIMS2();
	}

	@Then("New 2nd Vehicle purchase record is created Successfully for VWFreeDelivery")
	public void new_2nd_vehicle_purchase_record_is_created_successfully_for_vwfreedelivery() {
		Assert.assertTrue( VWpage.AssertIMS2().contains("XYZ90IM"));
	}
	
/*-------------------------------------------------------------Creation of IMS Purchase Record-3-------------------------------------------------------*/
	
	
	@When("User enters the 3rd Record Mandatory fields for VWFreeDelivery and Clicks Save")
	public void user_enters_the_3rd_record_mandatory_fields__for_vwfreedelivery_and_clicks_save() throws InterruptedException {
		VWpage.UserCreatesIMS3();
	}

	@Then("New 3rd Vehicle purchase record is created Successfully for VWFreeDelivery")
	public void new_3rd_vehicle_purchase_record_is_created_successfully_for_vwfreedelivery() {
		Assert.assertTrue( VWpage.AssertIMS3().contains("HIX66CO"));
	}
	
/*-------------------------------------------------------------Creation of IMS Purchase Record-4-------------------------------------------------------*/
	
	
	@When("User enters the 4th Record Mandatory fields for VWFreeDelivery and Clicks Save")
	public void user_enters_the_4th_record_mandatory_fields__for_vwfreedelivery_and_clicks_save() throws InterruptedException {
		VWpage.UserCreatesIMS4();
	}

	@Then("New 4th Vehicle purchase record is created Successfully for VWFreeDelivery")
	public void new_4th_vehicle_purchase_record_is_created_successfully_for_vwfreedelivery() {
		Assert.assertTrue( VWpage.AssertIMS4().contains("BBU11TI"));
	}

	
	
	@Given("User Clicks on Targets")
	public void user_clicks_on_targets() throws InterruptedException {
		 VWpage.UserClicksTarget();
	}

	@When("user clicks on newly created VW FreeDelivery Target")
	public void user_clicks_on_newly_created_vw_free_delivery_target() throws InterruptedException {
		 VWpage.UserClicksNewTarget();
	}

	@Then("Validation of VW FreeDelivery records happens")
	public void validation_of_vw_free_delivery_records_happens() {
		Assert.assertTrue( VWFDpage.AssertDelCharge().contains("£160.00"));
		Assert.assertTrue( VWFDpage.AssertTotalDelCharge().contains("£320.00"));
		Assert.assertTrue( VWFDpage.AssertFreeDel().contains("2"));
	}


}
