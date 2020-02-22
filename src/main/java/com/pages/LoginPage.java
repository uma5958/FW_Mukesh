package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.base.BasePage;

public class LoginPage extends BasePage {

	// Initializing the Page Objects:................................................................
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}

	// Objects Repository(OR):........................................................................
	By username = By.id("txtLoginName");
	By password = By.name("password");
	By loginBtn = By.id("btnLogin");
	By menuBtn = By.xpath("(//i[contains(@style,'color: #FFFFFF;')])[1]"); // Test
	By newiQaptureBtn = By.xpath("//span[text()='iQapture']");
	By dashBoardLink = By.xpath("//span[text()='Dashboard']");
	By valuechainLogo = By.xpath("//img[contains(@src,'ex.png')]");
	By errorMsg = By.xpath(".//*[@id='info']/span");
	
	
















	// Actions:......................................................................................
	public String validate_LoginPage_Title(){
		return driver.getTitle();
	}

	public DashBoardPage login(String un, String pwd){
		writeText(driver, username, un);
		writeText(driver, password, pwd);
		ajaxClick(driver, loginBtn);
		ajaxClick(driver, menuBtn);
		ajaxClick(driver, newiQaptureBtn);
		Assert.assertTrue(getElement(driver, dashBoardLink).isDisplayed());
		return new DashBoardPage();
	}

	public void verify_Valuechain_wesite_navigation_on_clicking_Valuechain_logo(String expTitle) throws Exception {
		ajaxClick(driver, valuechainLogo);
		switchToNewWindow(driver);
		Thread.sleep(3000);
		String actTitle = getPageTitle(driver);
		Reporter.log("Title of the page is: "+actTitle, true);
		Assert.assertTrue(actTitle.equalsIgnoreCase(expTitle), "Unable to navigate valuechain website");
	}





}



