Feature: Validation in Salesforce Claims
Scenario: Validation of the Claim Case in Salesforce
Given user is on the RMS Contacts page and clicks new
When user enters all the mandatory fields for the contact
And user clicks on Save
Then New Contact is created successfully 