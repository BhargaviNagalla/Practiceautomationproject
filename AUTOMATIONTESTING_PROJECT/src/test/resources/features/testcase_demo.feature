Feature:  Testing the demosite features for Automationtesting Website

  @tc_01_register
  Scenario Outline: Register the website
    Given Launch the browser and enter url
    When Register page is opened
    Then Enter "<emailid>" and "<password>"
    And Click the register button
    
     Examples: 
      | emailid  |       | password  |
      | madhu@gmail.com |      | madhu@123 |
    
#@tc_02_login
 # Scenario: Validate the login fuctionality
  #  Given Launch the browser and enter url
   # When opened the login page
   # Then Enter the username and password
   # And Click the login button
    
    @tc_03_Demosite_UserRegister
    Scenario: To register the demosite giving Invalid details
			Given the user launch the browser and url
			When opens the Practice automation website and click_the Demo site button
			Then enter invalid details
			Then click on submit button
    
    @tc_04_Demosite_filedownload
    Scenario: Download the file in the demosite-Filedownload
			Given Open url in the browser
			When Automation site is opened
			Then Click on more and click filedownload
			Then download the file

	@tc_05_Demosite_Dynamicdata
		Scenario: Get the dynamic data in the demosite-DynamicData
			Given Open the url in the browser
			When Automation site is opened and click demosite
			Then Click on more and click dynamic data
			Then Click on Dynamic data and get the data