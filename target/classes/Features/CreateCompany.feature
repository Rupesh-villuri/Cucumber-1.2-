Feature: Create Compant in CRM

Scenario Outline: verify user able to create multiple companies

Given CRM login page launched
When provide login crdentials "rupesh.villuri@gmail.com" and "LearnAutomation"
Then user launched home page
Then provide company details "<CompanyName>" and "<Location>" and "<Status>" and Click Save

Examples:
	| CompanyName  | Location  | Status   |
	| Vizag Steels | vizag     | New      |
	| Cognizant    | Hyderabad | Inactive |
	| TCS          | Amaravati | Active   | 
	





