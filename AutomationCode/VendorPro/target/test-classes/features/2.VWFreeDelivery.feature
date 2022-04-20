@VWFreeDelivery
Feature: Creation , Addition of Targets/Target Dealerships/Vehicles and validating all the fields for VW Free Delivery
Scenario: Validation of VW Free Delivery
Given User is on the target creation page
When User selects the VW Free Delivery and clicks next
And User fills all the mandatory fields for free delivery and clicks Save
Then New Target for VW free delivery is created successfully

Given User clicks on New to add the 1st Dealer for VWFreeDelivery
When User enters the 1st Dealer Details for VWFreeDelivery and Clicks Save
Then New 1st Dealer is added Successfully for VWFreeDelivery

Given User clicks on New to add the 1st Vehicle for VWFreeDelivery
When User enters the 1st Vehicle Details for VWFreeDelivery and Clicks Save
Then New 1st Vehicle is added Successfully for VWFreeDelivery

Given User clicks on New to add the 2nd Vehicle for VWFreeDelivery
When User enters the 2nd Vehicle Details for VWFreeDelivery and Clicks Save
Then New 2nd Vehicle is added Successfully for VWFreeDelivery

Given User clicks on New to add the 3rd Vehicle for VWFreeDelivery
When User enters the 3rd Vehicle Details for VWFreeDelivery and Clicks Save
Then New 3rd Vehicle is added Successfully for VWFreeDelivery

Given User clicks on New to add the 4th Vehicle for VWFreeDelivery
When User enters the 4th Vehicle Details for VWFreeDelivery and Clicks Save
Then New 4th Vehicle is added Successfully for VWFreeDelivery

Given User is on the IMS purchase record and Clicks new for VWFreeDelivery
When User enters the 1st Record Mandatory fields for VWFreeDelivery and Clicks Save
Then New 1st Vehicle purchase record is created Successfully for VWFreeDelivery

Given User is on the IMS purchase record and Clicks new for VWFreeDelivery
When User enters the 2nd Record Mandatory fields for VWFreeDelivery and Clicks Save
Then New 2nd Vehicle purchase record is created Successfully for VWFreeDelivery

Given User is on the IMS purchase record and Clicks new for VWFreeDelivery
When User enters the 3rd Record Mandatory fields for VWFreeDelivery and Clicks Save
Then New 3rd Vehicle purchase record is created Successfully for VWFreeDelivery

Given User is on the IMS purchase record and Clicks new for VWFreeDelivery
When User enters the 4th Record Mandatory fields for VWFreeDelivery and Clicks Save
Then New 4th Vehicle purchase record is created Successfully for VWFreeDelivery

Given User Clicks on Targets
When user clicks on newly created VW FreeDelivery Target
Then Validation of VW FreeDelivery records happens


