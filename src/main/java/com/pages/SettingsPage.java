/**
 * @author UmaMaheswararao
 */

package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.BasePage;

public class SettingsPage extends BasePage {

	// Initializing the Page Objects:................................................................
	public SettingsPage() {
		PageFactory.initElements(driver, this);
	}

	// Objects Repository(OR):........................................................................
	// Page verification
	@FindBy(xpath = "//span[contains(.,'Setup')]")
	WebElement setUpText;

	// Dashboard Timescale
	@FindBy(xpath = "//select[contains(@id,'Timescale')]")
	WebElement timeScaleDD;

	@FindBy(xpath = "//span[@class='title'][contains(.,'Dashboard')]")
	WebElement dashBoardLink;

	@FindBy(xpath = "//input[contains(@id,'period')]")
	WebElement filterBtn;

	// People
	@FindBy(xpath = "//i[contains(@id,'btnActPeople')]")
	WebElement addPeopleBtn;

	@FindBy(xpath = "//input[contains(@id,'txtSearch')]")
	WebElement peopleSearchBox;

	@FindBy(xpath = "//a[contains(@id,'SearPeopleBtn')]")
	WebElement peopleSearchBtn;

	@FindBy(xpath=".//*[contains(@id,'UserAdd')]")
	WebElement AddUserBtn;

	@FindBy(xpath="//button[contains(@onclick, 'closePeopleModal')]")
	WebElement closeUserDlg;

	@FindBy(xpath = "//span[@class='title'][contains(.,'Build')]")
	WebElement buildLink;

	@FindBy(xpath=".//*[@id='btnNew']")
	WebElement AddBtn;

	@FindBy(xpath=".//*[@id='DS_NAME']")
	WebElement nameTxtBox;

	@FindBy(xpath=".//*[@id='btnSave']")
	WebElement saveBtn;

	@FindBy(xpath=".//*[@id='btnMore']/a")
	WebElement moreBtn;

	@FindBy(xpath=".//*[@id='datasetset']/a")
	WebElement settingsBtn;

	@FindBy(xpath=".//*[@id='btnFolder']")
	WebElement folderBtn;

	// Defaults
	@FindBy(xpath="//span[contains(.,'Modern')]")
	WebElement enableClassicFolderStyleBtn;

	@FindBy(xpath="//a[@id='btnFolder']")
	WebElement foldersBtn;

	// Tool tips 
	@FindBy(xpath="//label[contains(.,'Timescale')]/..//div")
	WebElement timeScaleTooltipIcon;

	@FindBy(xpath="//label[contains(.,'People')]/..//div")
	WebElement peopleTooltipIcon;

	@FindBy(xpath="//label[contains(.,'Folder Structure')]/..//div")
	WebElement folderStructureTooltipIcon;

	@FindBy(xpath="//label[contains(.,'Question Type')]/..//div")
	WebElement questionTypeTooltipIcon;

	@FindBy(xpath="//label[contains(.,'Text')]/..//div")
	WebElement textTooltipIcon;

	@FindBy(xpath="//label[contains(.,'Date Time')]/..//div")
	WebElement dateTimeTooltipIcon;

	@FindBy(xpath="//label[contains(.,'Number')]/..//div")
	WebElement numberTooltipIcon;

	@FindBy(xpath="//label[contains(.,'Multi Choice')]/..//div")
	WebElement multiChoiceTooltipIcon;

	@FindBy(xpath="//label[contains(.,'Advanced')]/..//div")
	WebElement advancedTooltipIcon;











	// Actions:......................................................................................
	public void verify_Navigate_to_Settings_page() {
		Assert.assertTrue(setUpText.isDisplayed(), "Settings pagfe not opened");
	}







}
