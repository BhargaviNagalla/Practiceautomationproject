package com.automation_testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(format = {"pretty"}, features =
"C:\\Users\\Hemanth\\Desktop\\AUTOMATIONTESTING_COMBINED_PROJECT\\AUTOMATIONTESTING_COMBINED_PROJECT\\src\\test\\resources\\features\\",
        glue={"com.automation_stepdefinition"},
plugin = { "html:reports/cucumber-html-report","json:re"
		+ "ports/cucumber-html-report/jsonreport",
"com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},dryRun=false)

public class combined_feature_testrunner{
	
	@AfterClass
    public static void extendReport()
  {
      Reporter.loadXMLConfig("\\src\\test\\resources\\testdata\\extent-config.xml");
      Reporter.setSystemInfo("user", System.getProperty("user.name"));
      Reporter.setSystemInfo("os", "Windows");
      Reporter.setTestRunnerOutput("Sample test runner output message");
  }   
      
	
}