/**
 * @author UmaMaheswararao
 */

package com.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.base.BasePage;

public class CapturePage extends BasePage {


	// Initializing the Page Objects:................................................................
	public CapturePage() {
		PageFactory.initElements(driver, this);
	}
	
	// Objects Repository(OR):........................................................................
	//Page Title Verification
	@FindBy(xpath="//a[text()='Capture']")
	WebElement captureText;
	
	@FindBy(xpath=".//*[@id='txtSearch']")
	static WebElement searchBox;

	@FindBy(css=".fa.fa-search")
	static WebElement searchBtn;
	
	@FindBy(xpath="//a[@title='Add Record']")
	WebElement addBtn;
	
	@FindBy(xpath=".//*[@id='btnSave']")
	static WebElement saveBtn;

	// Navigating to Questionnaires
	@FindBy(xpath=".//*[@id='btnFolderBack']")
	WebElement folderBackBtn;

	@FindBy(xpath="//h3[text()='Demo1']")
	WebElement demo1Folder;

	@FindBy(xpath="//h3[text()='Demo2']")
	WebElement demo2Folder;

	@FindBy(xpath="//h3[text()='HR Maintenance']")
	WebElement findQuestionnaire;









	// Actions:......................................................................................
	public String verifyPageTitle() {
		return captureText.getText();
	}

	public void verify_Navigating_To_Questionnaires_Directory() throws Exception {
		ajaxJsClick(driver, folderBackBtn);
		Thread.sleep(1000);
		ajaxJsClick(driver, folderBackBtn);
		ajaxJsClick(driver, demo1Folder);
		ajaxJsClick(driver, demo2Folder);
		waitForElementVisibility(driver, findQuestionnaire);
		String actual=findQuestionnaire.getText();
		String expected = "HR Maintenance";
		Assert.assertEquals(actual, expected, "Questionnaires Not Found");
		Reporter.log("Successfully Navigated To The Questionnaires Directory", true);
	}

	




}
