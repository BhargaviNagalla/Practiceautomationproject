package com.testrunners;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
features = "src\\test\\resources\\feature\\testcase.feature",
glue = {"com.stepdefinations"},
 plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport",
"com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},
//tags = {"@TS_01_login,@TS_02_Edit_and_save_Billing_Address,@TS_03_Edit_and_Save_Shipping_Address,@TS_04_Demosite_Valid_Register,@TS_05_update_Account_Details"},
tags= {"@TS_04_Demosite_Valid_Register"},
monochrome = true
)
public class PracticeAutomationTestingtestrunner {
	@AfterClass
    public static void extendReport()
  {
      Reporter.loadXMLConfig("C:\\Users\\User\\eclipse-workspace\\PracticeAutomationTesting1\\src\\test\\resources\\testdata\\extent-config.xml");
      Reporter.setSystemInfo("user", System.getProperty("user.name"));
      Reporter.setSystemInfo("os", "Windows");
      Reporter.setTestRunnerOutput("Sample test runner output message");
  }

	  

}
