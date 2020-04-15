package com.automation_testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src//test//resources//features//testcase_demosite.feature", // Giving the address of feature file
		plugin = { "html:target/cucumber-html-report" }, // Extracting the reports in target folder
		//tags = { "@TC_02,@TC_03,@TC_04,@TC_05"},// Giving the tags of the scenarios to run
		tags = {"@TC_02"},
		glue = { "com.automation_stepdefinition" }, // To store the methods generated from feature file
		monochrome = true // Console for the Cucumber test are readable
)
public class runner_demosite 
{
		

}
