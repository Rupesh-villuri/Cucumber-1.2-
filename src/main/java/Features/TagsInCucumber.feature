Feature: Understand the concept of Tags in Cucumber

@SmokeTest @RegressionTest @End2EndTest
Scenario: Login to the CRM application
Given : url available
Then : enter user credentials

@SmokeTest @RegressionTest
Scenario: Verify Home Page screen
Given:User_CRM logged into application
Then:  verify Home Screen details
And : Check all spells are correct on screen

@SmokeTest @End2EndTest
Scenario: verify contacts screen
Given : Contacts link present on screen
Then : Click on Contacts link
And : verify details on home page

@RegressionTest @End2EndTest
Scenario: verify create company page
Given :user on home page
Then : Click on company Page link

@RegressionTest @End2EndTest
Scenario: verify Deals page
Given : Deals page link available on Home screen
Then ick on Deals link
And : navigate to home screen

@SmokeTest @RegressionTest @End2EndTest
Scenario: verify user able to create new contact 
Given:user able to see new on contact page
Then :Create new contact

@RegressionTest @End2EndTest
Scenario: verify user able to edit contact details
Given : Contacts already exists
Then : edit contact details

@RegressionTest @End2EndTest
Scenario: Verify user can create duplicate contact
Given :contacts exists
Then :create a contact with existing details

@SmokeTest @End2EndTest
Scenario: verify user able to create company
Given : Company link is working 
Then : Create new company details

@RegressionTest @End2EndTest
Scenario: verify user can modify company details
Given : company details already available
Then : Modify company details

@SmokeTest @RegressionTest
Scenario: verify user can create Deals
Given : user able to acces deals page
Then : create new deals

@RegressionTest
Scenario: verify cases page
Given :cases page link is available on home screen
Then : navigate to cases page

@SmokeTest @RegressionTest
Scenario: Create new case
Given : user is on cases page
Then : Create new case

@RegressionTest @End2EndTest
Scenario: verify user is able to edit the cases
Given : Cases are already avaialable
Then : Edit the available case

@RegressionTest
Scenario: Verify Forms page
Given : Forms link is avialble on Home page
Then : Click on Forms page

@SmokeTest @End2EndTest
Scenario: Verify user can create new form
Given : User is on forms page
Then : Create new form

@RegressionTest
Scenario: verify user can create multiple forms
Given :user is able to create a single form
Then : Create multiple forms

@RegressionTest @End2EndTest
Scenario: Verify user can edit the forms
Given :Forms already exists
Then : Edit any form




 






