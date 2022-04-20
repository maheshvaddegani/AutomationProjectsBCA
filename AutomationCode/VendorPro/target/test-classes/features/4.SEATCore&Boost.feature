@SEATCoreBoost
Feature: Creation , Addition of Targets/Target Dealerships/Vehicles and validating all the fields for SEAT Core&Boost
Scenario: Validation of SEAT Core&Boost
Given User is on the target creation page SEAT
When User selects the SEATCore&Boost and clicks next
And User fills all the mandatory fields for SEATCore&Boost and clicks Save
Then New Target for SEATCore&Boost is created successfully

Given User clicks on New to add the 1st Dealer for SEATCore&Boost
When User enters the 1st Dealer Details for SEATCore&Boost and Clicks Save
Then New 1st Dealer is added Successfully for SEATCore&Boost

Given User clicks on New to add the 1st Vehicle for SEATCore&Boost
When User enters the 1st Vehicle Details for SEATCore&Boost and Clicks Save
Then New 1st Vehicle is added Successfully for SEATCore&Boost

Given User clicks on New to add the 2nd Vehicle for SEATCore&Boost
When User enters the 2nd Vehicle Details for SEATCore&Boost and Clicks Save
Then New 2nd Vehicle is added Successfully for SEATCore&Boost

Given User clicks on New to add the 3rd Vehicle for SEATCore&Boost
When User enters the 3rd Vehicle Details for SEATCore&Boost and Clicks Save
Then New 3rd Vehicle is added Successfully for SEATCore&Boost

Given User clicks on New to add the 4th Vehicle for SEATCore&Boost
When User enters the 4th Vehicle Details for SEATCore&Boost and Clicks Save
Then New 4th Vehicle is added Successfully for SEATCore&Boost

Given User is on the IMS purchase record and Clicks new for SEATCore&Boost
When User enters the 1st Record Mandatory fields for SEATCore&Boost and Clicks Save
Then New 1st Vehicle purchase record is created Successfully for SEATCore&Boost

Given User is on the IMS purchase record and Clicks new for SEATCore&Boost
When User enters the 2nd Record Mandatory fields for SEATCore&Boost and Clicks Save
Then New 2nd Vehicle purchase record is created Successfully for SEATCore&Boost

Given User is on the IMS purchase record and Clicks new for SEATCore&Boost
When User enters the 3rd Record Mandatory fields for SEATCore&Boost and Clicks Save
Then New 3rd Vehicle purchase record is created Successfully for SEATCore&Boost

Given User is on the IMS purchase record and Clicks new for SEATCore&Boost
When User enters the 4th Record Mandatory fields for SEATCore&Boost and Clicks Save
Then New 4th Vehicle purchase record is created Successfully for SEATCore&Boost

Given User Clicks Targets for Validation
When user clicks on newly created SEAT Target
Then Validation of SEAT records happens

