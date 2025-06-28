package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.ElementActions;
import com.qa.util.WaitMethods;

import cucumber.api.Scenario;

/**
 *  
 *  'Add Employee page' with page object repository & page operation methods
 */
public class AddEmployeePage {
	WebDriver driver;
	Scenario scenario;
	
	
	// step 1: Elements located using @FindBy annoation
	
	@FindBy(xpath="//span[text()='PIM']")
	WebElement pimPageLink;
	
	//@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	@FindBy(xpath="//span/child::h6[text()='PIM']")
	WebElement pimPageTitle;
	
	//------------------------------------------------
	// xpath for Navigate to 'Add Employee' page
	
	@FindBy(xpath = "//a[text()='Add Employee']")
	WebElement addEmployeeLink;

	@FindBy(xpath = "//input[@name='firstName']")
	WebElement empFirstNameField;;

	@FindBy(xpath = "//input[@name='middleName']")
	WebElement empMiddleNameField;

	@FindBy(xpath = "//input[@name='lastName']")
	WebElement empLastName;

	@FindBy(xpath = "//button[text()=' Save ']")
	WebElement saveButton;
	
	//--------x paths to Searh Emp operations---------------------------------------
	
	
	// alternet xpath
	//a[text()='Employee List']
	//OR
	//@FindBy(xpath="//a[contains( text(),'Employee List')]")
	@FindBy(xpath="//a[text()='Employee List']")
	WebElement employeeListlink;
	
	
	
	@FindBy(xpath = "//label[text()='Employee Name']/following::input[1]")
	WebElement searchbyEmpNameField;

	@FindBy(xpath = "//button[text()=' Search ']")
	WebElement SearchButton;

	@FindBy(xpath = "//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']/child::div[3]")
	WebElement searhedAmpFnameandMName;

	//@FindBy(xpath="//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']/child::div[9]")
	@FindBy(xpath="//div[@role='table']//div[1]//div[1]//div[9]//div[1]//button[1]//i[1]")
	WebElement editEmployeeButton;
	
	@FindBy(xpath = "//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']/child::div[9]/child::div/button[2]")
	WebElement deleteButton;

	@FindBy(xpath = "//button[text()=' Yes, Delete ']")
	WebElement confirmDeleteButton;
	
	// step 2: Page class constructor
	public AddEmployeePage(WebDriver driver, Scenario scenario) {

		this.driver = driver;
		this.scenario=scenario;
		PageFactory.initElements(driver, this);
	}
	
	
	// step 3: Page opeartion 'Methods'
	
	// Opeartion method-1: navigate to PIM page
	
	public String navigateToPIMPage() {
		
		ElementActions.clickElement(driver, pimPageLink, scenario);
		return ElementActions.getText(driver, pimPageTitle, scenario);
		
	}
	
	
	// Operation method-2: Navigate to 'Add Employee page'
	
		public void navigateToAddEmployeePage() 	
		{
			ElementActions.clickElement(driver, addEmployeeLink, scenario);
		}
	
	// Operation method-3 : 'Add NEW employee' record
	
	public void addnewEmployee(String firstName, String middleName,String lastName)
	{
		ElementActions.sendKeys(driver, empFirstNameField, scenario, firstName);
		WaitMethods.staticWait(5000);
		
		ElementActions.sendKeys(driver, empMiddleNameField, scenario, middleName);
		WaitMethods.staticWait(5000);
		
		ElementActions.sendKeys(driver, empLastName, scenario, lastName);
		WaitMethods.staticWait(5000);
		
		ElementActions.clickElement(driver, saveButton, scenario);
		WaitMethods.staticWait(5000);
	}

	//-----------------------Page operations methods to Search Employee--------
	
	
	// Opeation method 4:Nevigte to Employee List page
	
	public void navigateToEmployeeListPage() {
		ElementActions.clickElement(driver, employeeListlink, scenario);

	}

	// Operation methods 5: Search Employee by 'Name'
	public String searchEmployeeByname(String fName, String mName, String lName)
 {

		//ElementActions.sendKeys(driver, searchbyEmpNameField, scenario, fName + " " + mName + " " + lName);
		ElementActions.sendKeys(driver, searchbyEmpNameField, scenario, fName + " " + mName + " " );
		WaitMethods.staticWait(5000);
		ElementActions.clickElement(driver, SearchButton, scenario);
		WaitMethods.staticWait(5000);
		return ElementActions.getText(driver, searhedAmpFnameandMName, scenario);

	}
	
	public void editEmpinfo(String fnameAppendValue, String mNameAppendValue, String lNameAppendValue) {
		ElementActions.clickElement(driver, editEmployeeButton, scenario);
		WaitMethods.staticWait(5000);
		ElementActions.sendKeys(driver, empFirstNameField, scenario, fnameAppendValue);
		WaitMethods.staticWait(5000);
		ElementActions.sendKeys(driver, empMiddleNameField, scenario, mNameAppendValue);
		WaitMethods.staticWait(5000);
		ElementActions.sendKeys(driver, empLastName, scenario, lNameAppendValue);
		WaitMethods.staticWait(5000);
		ElementActions.clickElement(driver, saveButton, scenario);

	}
	
	public void deleteSearhedEmp() {

		ElementActions.clickElement(driver, deleteButton, scenario);
		ElementActions.clickElement(driver, confirmDeleteButton, scenario);

	}
	
}
