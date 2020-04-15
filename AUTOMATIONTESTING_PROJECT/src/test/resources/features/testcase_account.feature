@Practice.AutomationTesting.in
Feature:  Testing the account features for Practice_Automation_Testing website
#@TS_01_login
 #Scenario: Validate the login fuctionality
#Given Launch the browser and enter the url
#When Login page is opened
#Then Enter the "<username>" and "<password>"
#And Click the login button
    

@TS_02_Edit_and_save_Billing_Address
Scenario: edit and save Billing Address
Given open url in a browser07
When login into application with"<username>" and "<password>" 
When click on the addresses 
When click edit billing address
When fill the billing details
When click save Addresses
Then Assert Billing addresses changes successfully

@TS_03_Edit_and_Save_Shipping_Address
Scenario: edit and save shipping addresses details
Given open url in a browser_08
When login with "<username>" and "<password>"
When click on the addresses tab
When click on edit shipping addresses
When fill the shipping details
When click on save addresses button
Then Assert shipping addresses changed successfully 

@TS_04_Demosite_Valid_Register
Scenario: Demosite - register
Given open the url in the browser06
When click demosite- register menu
When fill all the valid details
Then click submit button



@TS_05_update_Account_Details
Scenario: Update details and chane password
Given open the url in the browser_09
When login with the "<Username>" and "<Password>" 
When click on the account details
When upadte details with new password
Then click save changes button