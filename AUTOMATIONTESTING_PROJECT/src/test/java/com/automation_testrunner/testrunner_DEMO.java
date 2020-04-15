package com.automation_testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




//Cucumber class
		@RunWith(Cucumber.class)
		@CucumberOptions
		(
			 features = "src/test/resources/features/testcase_demo.feature",
					 glue = {"com.automation_stepdefinition"},
			 plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport",
			    		"com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},
		tags = {" @tc_04_Demosite_filedownload"}
		)
public class testrunner_DEMO
{	
		@AfterClass
		      public static void extendReport()
		    {
		        Reporter.loadXMLConfig("\\src\\test\\resources\\testdata\\extent-config.xml");
		        Reporter.setSystemInfo("user", System.getProperty("user.name"));
		        Reporter.setSystemInfo("os", "Windows");
		        Reporter.setTestRunnerOutput("Sample test runner output message");
		    }   
		        
}
