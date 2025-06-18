package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.ElementActions;

import cucumber.api.Scenario;

public class LoginPage {
WebDriver driver;
Scenario scenario;

	
	//step 1: Element located using @FindBy annoataion
	
@FindBy(xpath = "//input[@name='username']")
WebElement userNameField;

@FindBy(xpath="//input[@name='password']")
WebElement passwordField;

@FindBy(xpath="//button[@type='submit']")
WebElement loginButton;
	
	// step 2: use pageclass constructor
// this constructor of class which will initilize 'gloabl driver variable'

public LoginPage(WebDriver driver, Scenario scenario) {

	this.driver = driver;
	this.scenario=scenario;
	PageFactory.initElements(driver, this);
}


/**
 * @param username
 * @param password
 * @param texttotype
 * @return
 * 
 * This is page opreation method will enter username, and password from config file
 * and return the home page
 */
//public String logintoApplication(String userName, String password, String texttotype)
public String logintoApplication(String userName, String password)
{
	//ElementActions.sendKeys(driver, userNameField, scenario, texttotype);
	
	ElementActions.sendKeys(driver, userNameField, scenario, userName);
	ElementActions.sendKeys(driver, passwordField, scenario, password);
	ElementActions.clickElement(driver, loginButton, scenario);
	
	
	return ElementActions.getText(driver, loginButton, scenario);
	
	
}


{
	
}
}
