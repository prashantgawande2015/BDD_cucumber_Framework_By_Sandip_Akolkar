package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * The Cucumber Runner class is the main class for executing Cucumber tests. 
 * It is responsible for-->1) discovering feature files, 
 * 2)reading them, and 3)executing the associated step definitions 
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "com.qa.stepdefinations" }, plugin = { "pretty",
				"html:target/cucumber-reports/Cucumber.html" },tags= {"@employeeCRUD5TCS"}, monochrome = true)

//json:target/cucumber-reports/Cucumber.json
//html:target/cucumber-reports/Cucumber.html
public class Runner {
	
}
