@SkodaFreeDelivery
Feature: Creation , Addition of Targets/Target Dealerships/Vehicles and validating all the fields for Skoda Free Delivery
Scenario: Validation of Skoda Free Delivery
Given User is on the target creation page Skoda free delivery
When User selects the Skoda Free Delivery and clicks next
And User fills all the mandatory fields for Skoda free delivery and clicks Save
Then New Target for Skoda free delivery is created successfully

Given User clicks on New to add the 1st Dealer for SkodaFreeDelivery
When User enters the 1st Dealer Details for SkodaFreeDelivery and Clicks Save
Then New 1st Dealer is added Successfully for SkodaFreeDelivery

Given User clicks on New to add the 1st Vehicle for SkodaFreeDelivery
When User enters the 1st Vehicle Details for SkodaFreeDelivery and Clicks Save
Then New 1st Vehicle is added Successfully for SkodaFreeDelivery

Given User clicks on New to add the 2nd Vehicle for SkodaFreeDelivery
When User enters the 2nd Vehicle Details for SkodaFreeDelivery and Clicks Save
Then New 2nd Vehicle is added Successfully for SkodaFreeDelivery

Given User clicks on New to add the 3rd Vehicle for SkodaFreeDelivery
When User enters the 3rd Vehicle Details for SkodaFreeDelivery and Clicks Save
Then New 3rd Vehicle is added Successfully for SkodaFreeDelivery

Given User clicks on New to add the 4th Vehicle for SkodaFreeDelivery
When User enters the 4th Vehicle Details for SkodaFreeDelivery and Clicks Save
Then New 4th Vehicle is added Successfully for SkodaFreeDelivery

Given User is on the IMS purchase record and Clicks new for SkodaFreeDelivery
When User enters the 1st Record Mandatory fields for SkodaFreeDelivery and Clicks Save
Then New 1st Vehicle purchase record is created Successfully for SkodaFreeDelivery

Given User is on the IMS purchase record and Clicks new for SkodaFreeDelivery
When User enters the 2nd Record Mandatory fields for SkodaFreeDelivery and Clicks Save
Then New 2nd Vehicle purchase record is created Successfully for SkodaFreeDelivery

Given User is on the IMS purchase record and Clicks new for SkodaFreeDelivery
When User enters the 3rd Record Mandatory fields for SkodaFreeDelivery and Clicks Save
Then New 3rd Vehicle purchase record is created Successfully for SkodaFreeDelivery

Given User is on the IMS purchase record and Clicks new for SkodaFreeDelivery
When User enters the 4th Record Mandatory fields for SkodaFreeDelivery and Clicks Save
Then New 4th Vehicle purchase record is created Successfully for SkodaFreeDelivery

