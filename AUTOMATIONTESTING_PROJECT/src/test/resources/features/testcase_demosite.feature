  Feature: to verify the demosite feature on_Practice_Automation

#@TC_01

#Scenario: Validate the login fuctionality
#Given Launch the browser and enter the url
#When Login page is opened
#When Enter the "<username>" and "<password>"
#Then Click the login button
  @TC_02
  Scenario: Upload file and Remove the uploaded file
    Given the url is opened in the website
    When the more is mouse overed and click on the File Upload
    When File is Selected
    Then remove the uploaded file

  @TC_03
  Scenario: Leave mandatory fields and click on register
    Given the url is open in the browser
    When the demosite is clicked
    When the details are given and leaving the mandatory fields
    Then click on submit and take screenshot

  @TC_04
  Scenario:  Play the Video in demosite
    Given the url is opened in the browser
    When the url is launched click on demosite
    When mouseover to the video and click on youtube
    When play the video
    Then tap on escape key and quit

  @TC_05
  Scenario: Get Alert message in demosite
    Given Opens url in the browser
    When automation site is opens
    Then Click on SwitchTo and alerts
    Then get the alert text

