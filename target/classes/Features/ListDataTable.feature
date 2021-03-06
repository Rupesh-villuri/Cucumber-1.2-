Feature: To create company details using DataTables List

Scenario: Creating company details using Datatables List feature in Cucumber

 Given : CRM page is launched
 When : Enter CRM user credentials
  | rupesh.villuri@gmail.com | LearnAutomation |
 Then Home Page launched
 Then Enter the company details
  | Vizag Steels | vizag     | New      |
 Then Close the browser
 
 
