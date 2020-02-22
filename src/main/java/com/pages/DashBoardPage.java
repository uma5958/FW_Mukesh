/**
 * @author UmaMaheswararao
 */

package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BasePage;

public class DashBoardPage extends BasePage {

	// Initializing the Page Objects:................................................................
	public DashBoardPage() {
		PageFactory.initElements(driver, this);
	}

	// Objects Repository(OR):........................................................................
	// Home Page Links
	@FindBy(xpath="//span[contains(text(),'Dashboard')]")
	@CacheLookup
	static WebElement dashBoardLink;

	@FindBy(xpath="//span[contains(text(),'Build')]")
	WebElement buildLink;

	@FindBy(xpath="//span[contains(text(),'Capture')]")
	static WebElement captureLink;

	@FindBy(xpath="//span[contains(text(),'Analyse')]")
	static WebElement AnalyseLink;

	@FindBy(xpath = "//span[contains(.,'Settings')]")
	WebElement SettingsLink;

	


	// Actions:......................................................................................
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}

	// Navigating DashBoard Link
	public boolean verifyDashboardLink(){
		return dashBoardLink.isDisplayed();
	}

	// Navigating Build Link
	public BuildPage clickOnBuildLink() {
		ajaxJsClick(driver, buildLink);
		return new BuildPage();
	}

	// Navigating Capture Link
	public CapturePage clickOnCaptureLink() {
		ajaxJsClick(driver, captureLink);
		return new CapturePage();
	}

	// Navigating to Analyse Link
	public AnalysePage clickOnAnalyseLink() {
		ajaxJsClick(driver, AnalyseLink);
		return new AnalysePage();
	}

	// Navigating to Settings Link
	public SettingsPage clickOnSettingsLink() {
		ajaxJsClick(driver, SettingsLink);
		return new SettingsPage();
	}



















}
