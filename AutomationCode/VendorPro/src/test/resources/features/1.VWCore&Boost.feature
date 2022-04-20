@VWCoreBoost
Feature: Creation , Addition of Targets/Target Dealerships/Vehicles and validating all the fields for VW Core&Boost
Scenario: Validation of core & boost values for VW
Given User is on the new target creation page
When User selects the VW core&boost value and clicks next
And User fills all the mandatory fields and clicks Save
Then New Target for VW Core&boost is created successfully

Given User clicks on New to add the 1st Dealer
When User enters the 1st Dealer Details and Clicks Save
Then New 1st Dealer is added Successfully

Given User clicks on New to add the 1st Vehicle
When User enters the 1st Vehicle Details and Clicks Save
Then New 1st Vehicle is added Successfully

Given User clicks on New to add the 2nd Vehicle
When User enters the 2nd Vehicle Details and Clicks Save
Then New 2nd Vehicle is added Successfully

Given User clicks on New to add the 3rd Vehicle
When User enters the 3rd Vehicle Details and Clicks Save
Then New 3rd Vehicle is added Successfully

Given User clicks on New to add the 4th Vehicle
When User enters the 4th Vehicle Details and Clicks Save
Then New 4th Vehicle is added Successfully

Given User clicks on New to add the 5th Vehicle
When User enters the 5th Vehicle Details and Clicks Save
Then New 5th Vehicle is added Successfully

Given User clicks on New to add the 6th Vehicle
When User enters the 6th Vehicle Details and Clicks Save
Then New 6th Vehicle is added Successfully

Given User clicks on New to add the 7th Vehicle
When User enters the 7th Vehicle Details and Clicks Save
Then New 7th Vehicle is added Successfully

Given User is on the IMS purchase record and Clicks new
When User enters the 1st Record Mandatory fields and Clicks Save
Then New 1st Vehicle purchase record is created Successfully

Given User is on the IMS purchase record and Clicks new
When User enters the 2nd Record Mandatory fields and Clicks Save
Then New 2nd Vehicle purchase record is created Successfully

Given User is on the IMS purchase record and Clicks new
When User enters the 3rd Record Mandatory fields and Clicks Save
Then New 3rd Vehicle purchase record is created Successfully

Given User is on the IMS purchase record and Clicks new
When User enters the 4th Record Mandatory fields and Clicks Save
Then New 4th Vehicle purchase record is created Successfully

Given User is on the IMS purchase record and Clicks new
When User enters the 5th Record Mandatory fields and Clicks Save
Then New 5th Vehicle purchase record is created Successfully

Given User is on the IMS purchase record and Clicks new
When User enters the 6th Record Mandatory fields and Clicks Save
Then New 6th Vehicle purchase record is created Successfully

Given User is on the IMS purchase record and Clicks new
When User enters the 7th Record Mandatory fields and Clicks Save
Then New 7th Vehicle purchase record is created Successfully

Given User is on Targets
When user clicks on newly created Target
Then Validation of records happens
