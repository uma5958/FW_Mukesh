/**
 * @author UmaMaheswararao
 */

package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pages.CapturePage;
import com.pages.DashBoardPage;
import com.pages.LoginPage;

public class CapturePageTest extends BaseTest {

	@Test
	public void CapturePage_Title_Test() {
		DashBoardPage dashBoard = PageFactory.initElements(driver, LoginPage.class).login(prop.getProperty("username"), prop.getProperty("password"));
		CapturePage capture = dashBoard.clickOnCaptureLink();
		String actual = capture.verifyPageTitle();
		String expected = "Capture";
		Assert.assertEquals(actual, expected, "Capture Page Not Opened");
		Reporter.log("Capture Page Opened Successfully", true);
	}

	@Test(dependsOnMethods="CapturePage_Title_Test")
	public void Navigating_To_Questionnaires_Directory_Test() throws Exception {
		DashBoardPage dashBoard = PageFactory.initElements(driver, LoginPage.class).login(prop.getProperty("username"), prop.getProperty("password"));
		CapturePage capture = dashBoard.clickOnCaptureLink();
		capture.verify_Navigating_To_Questionnaires_Directory();
	}
	
	
	
	
	
	
	
	

	
	
}
