/**
 * @author UmaMaheswararao
 */

package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pages.DashBoardPage;
import com.pages.LoginPage;

public class DashBoardPageTest extends BaseTest {
	
	@Test
	public void Verify_HomePage_Title_Test(){
		DashBoardPage dashBoard = PageFactory.initElements(driver, LoginPage.class).login(prop.getProperty("username"), prop.getProperty("password"));
		String dashBoardTitle = dashBoard.verifyHomePageTitle();
		Assert.assertTrue(dashBoardTitle.contains("Valuechain.com"),"Home page title not matched");
		Reporter.log("Title Verified - Test PASS", true);
	}

	@Test
	public void Verify_DashBoardLink_Test(){
		DashBoardPage dashBoard = PageFactory.initElements(driver, LoginPage.class).login(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertTrue(dashBoard.verifyDashboardLink(), "Dashboard Link Not Present - Test FAIL");
		Reporter.log("DashBoardLink Verified - Test PASS", true);
	}








}
