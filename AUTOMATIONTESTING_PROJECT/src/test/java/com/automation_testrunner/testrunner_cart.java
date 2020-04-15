package com.automation_testrunner;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//Cucumber 
		@RunWith(Cucumber.class)
		@CucumberOptions
		(
			
			features = "src/test/resources/features/testcase_cart.feature",
					
			glue = {"com.automation_stepdefinition"},
			plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport",
				        		"com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"}
		    //tags = {"@tc_01_login, @tc_02_verifytitle,@tc_03_stockandcart,@tc_04_deleteitem,@tc_05_checkout"}
		)
		
public class testrunner_cart {
			@AfterClass
		      public static void extendReport()
		    {
		        Reporter.loadXMLConfig("\\src\\test\\resources\\testdata\\extent-config.xml");
		        Reporter.setSystemInfo("user", System.getProperty("user.name"));
		        Reporter.setSystemInfo("os", "Windows");
		        Reporter.setTestRunnerOutput("Sample test runner output message");
		    }
}

