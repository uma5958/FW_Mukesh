/**
 * @author UmaMaheswararao
 */

package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.base.BasePage;

public class BuildPage extends BasePage {

	// Initializing the Page Objects:................................................................
	public BuildPage() {
		PageFactory.initElements(driver, this);
	}

	// Objects Repository(OR):........................................................................
	@FindBy(xpath=".//*[@id='btnFolderBack']")
	WebElement folderBackBtn;

	@FindBy(xpath=".//*[@id='btnNew']")
	WebElement AddBtn;

	@FindBy(xpath=".//*[@id='DS_NAME']")
	WebElement nameTxtBox;

	@FindBy(xpath=".//*[@id='btnSave']")
	WebElement saveBtn;

	@FindBy(xpath=".//*[@id='divDS_NAME']")
	WebElement savedItem;

	@FindBy(xpath = "//a[contains(@id,'btnPageBack')]")
	WebElement pageBackBtn;

	// Create Folder
	@FindBy(xpath=".//*[@id='btnFolder']")
	WebElement folderBtn;

	By fb = By.xpath(".//*[@id='btnFolder']");

	@FindBy(xpath="(//p[contains(.,'iQapture')])[1]")
	WebElement parentFolder;

	@FindBy(xpath=".//*[@id='btnNew']")
	WebElement AddFolderBtn;

	@FindBy(xpath=".//*[@id='DC_NAME']")
	WebElement folderNameTextBox;

	@FindBy(xpath=".//*[@id='DC_DESC']")
	WebElement descTxt;

	@FindBy(xpath="//a[@title='Save']")
	WebElement folderSaveBtn;

	@FindBy(xpath=".//*[@id='divEditFolder']/div/div/div[1]/button")
	WebElement closeFolderEditPage;

	@FindBy(xpath=".//*[@id='row0']/div[2]/div/ul/li[2]/a")
	WebElement RightArrow;

	














	// Actions:......................................................................................
	public boolean verify_IQuapturePage() {
		return AddBtn.isDisplayed();
	}

	public void verify_Create_Folder(String folderName, String description) throws Exception {
		ajaxJsClick(driver, fb);
		ajaxJsClick(driver, parentFolder);
		ajaxJsClick(driver, AddFolderBtn);
		jsType(driver, folderNameTextBox, folderName);
		jsType(driver, descTxt, description);
		ajaxJsClick(driver, folderSaveBtn);
		try {
			WebElement folder = driver.findElement(By.xpath("//*[text()='"+folderName+"']"));
			waitForElementVisibility(driver, folder);
			Assert.assertTrue(folder.isDisplayed());
			Reporter.log("Folder created successfully",true);
		} catch (NoSuchElementException | TimeoutException e) {
			ajaxJsClick(driver, RightArrow);
			WebElement folder = driver.findElement(By.xpath("//*[text()='"+folderName+"']"));
			waitForElementVisibility(driver, folder);
			Assert.assertTrue(folder.isDisplayed());
			Reporter.log("Folder created successfully",true);
		} catch (AssertionError e) {
			Reporter.log("Folder NOT created", true);
			Assert.fail();
		}
	}




}

