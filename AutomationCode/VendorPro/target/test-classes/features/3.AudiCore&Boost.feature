@AudiCoreBoost
Feature: Creation , Addition of Targets/Target Dealerships/Vehicles and validating all the fields for Audi Core&Boost
Scenario: Validation of Audi Core&Boost
Given User is on the target creation page Audi
When User selects the AudiCore&Boost and clicks next
And User fills all the mandatory fields for AudiCore&Boost and clicks Save
Then New Target for AudiCore&Boost is created successfully

Given User clicks on New to add the 1st Dealer for AudiCore&Boost
When User enters the 1st Dealer Details for AudiCore&Boost and Clicks Save
Then New 1st Dealer is added Successfully for AudiCore&Boost

Given User clicks on New to add the 1st Vehicle for AudiCore&Boost
When User enters the 1st Vehicle Details for AudiCore&Boost and Clicks Save
Then New 1st Vehicle is added Successfully for AudiCore&Boost

Given User clicks on New to add the 2nd Vehicle for AudiCore&Boost
When User enters the 2nd Vehicle Details for AudiCore&Boost and Clicks Save
Then New 2nd Vehicle is added Successfully for AudiCore&Boost

Given User clicks on New to add the 3rd Vehicle for AudiCore&Boost
When User enters the 3rd Vehicle Details for AudiCore&Boost and Clicks Save
Then New 3rd Vehicle is added Successfully for AudiCore&Boost

Given User clicks on New to add the 4th Vehicle for AudiCore&Boost
When User enters the 4th Vehicle Details for AudiCore&Boost and Clicks Save
Then New 4th Vehicle is added Successfully for AudiCore&Boost

Given User is on the IMS purchase record and Clicks new for AudiCore&Boost
When User enters the 1st Record Mandatory fields for AudiCore&Boost and Clicks Save
Then New 1st Vehicle purchase record is created Successfully for AudiCore&Boost

Given User is on the IMS purchase record and Clicks new for AudiCore&Boost
When User enters the 2nd Record Mandatory fields for AudiCore&Boost and Clicks Save
Then New 2nd Vehicle purchase record is created Successfully for AudiCore&Boost

Given User is on the IMS purchase record and Clicks new for AudiCore&Boost
When User enters the 3rd Record Mandatory fields for AudiCore&Boost and Clicks Save
Then New 3rd Vehicle purchase record is created Successfully for AudiCore&Boost

Given User is on the IMS purchase record and Clicks new for AudiCore&Boost
When User enters the 4th Record Mandatory fields for AudiCore&Boost and Clicks Save
Then New 4th Vehicle purchase record is created Successfully for AudiCore&Boost

Given User Clicks Targets
When user clicks on newly created Audi Target
Then Validation of Audi records happens