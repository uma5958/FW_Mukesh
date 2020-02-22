/**
 * @author UmaMaheswararao
 */

package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pages.DashBoardPage;
import com.pages.LoginPage;
import com.pages.SettingsPage;

public class SettingsPageTest extends BaseTest {

	@Test
	public void verify_Navigate_to_Settings_page_Test() {
		DashBoardPage dashBoard = PageFactory.initElements(driver, LoginPage.class).login(prop.getProperty("username"), prop.getProperty("password"));
		SettingsPage settings = dashBoard.clickOnSettingsLink();
		settings.verify_Navigate_to_Settings_page();
		Reporter.log("Settings Page Opened Successfully", true);
	}







}
