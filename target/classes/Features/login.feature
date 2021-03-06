Feature: Free CRM Login feature

# without Examples keyword
Scenario: Free CRM login Test Scenario
Given User is already in login page
When title of login page is Cogmento CRM Page
Then user enters "rupesh.villuri@gmail.com" and "LearnAutomation"
Then Click on Login
Then Verify the logged in user in displayname



#with Examples keyword
Scenario Outline: Verify user able to create contacts Test Scenario
Given User is already on home page
When contacts link is available on home page
And user clicks on new Contacts
Then user provides "<FirstName>" and "<LastName>" and Save

Examples:
	| FirstName | LastName |
	| Mahendra  | Baahubali |
	| Amarendra | Baahubali |
	

