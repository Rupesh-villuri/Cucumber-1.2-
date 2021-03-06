Feature: checking DataTable with Maps option in cucumber

Scenario: Verify the user able to provide details using DataTable as Maps

Given : Launch CRM Page
When :login credentials are available
	| username | password |
	| rupesh.villuri@gmail.com | LearnAutomation |
	
# this data will be applicable only for this step/clause

 And Click on new Contacts
 Then Enter contact details
 	| FirstName | LastName | info |
 	| Mahendra  | Baahubali | King of Mahismati |
 	| Arjun | Suravaram | Booked in certificates scam |
 	| Amarendra | Baahubali | Actual king |
 	
 
 
 
 