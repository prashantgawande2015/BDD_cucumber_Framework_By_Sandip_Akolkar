package com.qa.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.Scenario;

/**
 * This class has all selenium 	'Web Element Methods' with wait
 * mechanism applied with exception hadling.
 */
public class ElementActions {
	
	
	
	
	
	/**
	 * @param driver
	 * @param elem
	 * @param scenario
	 * This method helps to clear field value
	 */
	//------------------Method-1-:clearFieldvalue()----------------------
	public static void clearFieldvalue(WebDriver driver, WebElement elem, Scenario scenario) {

		try {
			WaitMethods.waitFor(driver, elem, WaitMethods.ELEMENT_TO_BE_CLICKABLE, scenario);
		} catch (Exception E) {
			scenario.write(" Error while waiting for clicking on Emmenet ");
		}
		try {
			elem.clear();
		} catch (Exception E) {
			scenario.write(" Error on clicking the element after wating !");
		}

	}
	
	
	//----------------------------Method-2: clickElement()---------------------------------
	
	/**
	 * @param driver
	 * @param elem
	 * @param scenario
	 * This method will take 'element' as 'parameter' and wait  for
	 * 'explicit wait time' and then perform 'Operations'
	 * 
	 */ 
	public static void clickElement(WebDriver driver, WebElement elem, Scenario scenario) {

		try {
			WaitMethods.waitFor(driver, elem, WaitMethods.ELEMENT_TO_BE_CLICKABLE, scenario);
		} catch (Exception E) {
			scenario.write(" Error while waiting for clicking on Emmenet ");
		}
		try {
			elem.click();
		} catch (Exception E) {
			scenario.write(" Error on clicking the element after wating !");
		}

	}

//----------------------------Method-3 : Sendkeys()------------
	
	/**
	 * @param driver
	 * @param elem
	 * @param scenario
	 * @param texttoType
	 * 
	 * This method accepth the 'Text' to type and wait for 'Fluent wait'
	 * time until element to be clickable and then type 'Text'
	 * 
	 */
	public static void sendKeys(WebDriver driver, WebElement elem, Scenario scenario, String texttoType) {

		try {
			WaitMethods.waitFor(driver, elem, WaitMethods.ELEMENT_TO_BE_CLICKABLE, scenario);
		} catch (Exception E) {
			scenario.write(" Error while waiting for clicking on Emmenet ");
		}

		try {
			elem.sendKeys(texttoType);
		} catch (Exception E) {
			scenario.write(" Error on typeing the text in element after wating !");
		}

	}

	
	//--------------------Method 4:-: getText()---------------------------------
	
	/**
	 * @param driver
	 * @param elem
	 * @param scenario
	 * @return
	 * This method 	wait for 'Fluent wait time' and when element is 'Visible'
	 * get the Text & return 'String value'
	 */
	public static String getText(WebDriver driver, WebElement elem, Scenario scenario) {

		String texttoReturn = null;
		try {
			WaitMethods.waitFor(driver, elem, WaitMethods.ELEMENT_TO_BE_VISIBLE, scenario);
		} catch (Exception E) {
			scenario.write(" Error while waiting for Element visibility  ");
		}
		try {
			texttoReturn = elem.getText();
		} catch (Exception E) {
			scenario.write(" Error on fetching  the text in element after wating !");
		}
		return texttoReturn;

	}
	
	
	//-------------------------------Method 5:selectOptionFromDropDown()------------
	
	/**
	 * @param driver
	 * @param elem
	 * @param scenario
	 * @param option
	 * 
	 * This method will accept the 'option as parameter' and 'Select' the 
	 * value from 'DropDown'
	 */
	public static void selectOptionFromDropDown(WebDriver driver, WebElement elem, Scenario scenario, String option) {

		try {
			WaitMethods.waitFor(driver, elem, WaitMethods.ELEMENT_TO_BE_CLICKABLE, scenario);
		} catch (Exception E) {
			scenario.write(" Error while waiting for Element to be clickable   ");
		}

		Select objselect = new Select(elem);

		try {
			objselect.selectByValue(option);
		} catch (Exception E) {
			scenario.write(" Error while selecting the option from Dropdown! ");

		}

	}
	
	
	
	
}
