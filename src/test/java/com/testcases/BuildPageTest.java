/**
 * @author UmaMaheswararao
 */

package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pages.BuildPage;
import com.pages.DashBoardPage;
import com.pages.LoginPage;

public class BuildPageTest extends BaseTest {
	
	@Test
	public void Verify_BuidPage_Test() {
		DashBoardPage dashBoard = PageFactory.initElements(driver, LoginPage.class).login(prop.getProperty("username"), prop.getProperty("password"));
		BuildPage build = dashBoard.clickOnBuildLink();
		Assert.assertTrue(build.verify_IQuapturePage(), "New IQapture Button is Missing on the Page");
		Reporter.log("New IQapture Button Present - Test PASS", true);
	}

	@Test(dependsOnMethods="Verify_BuidPage_Test")
	public void Create_Folder_Test() throws Exception {
		DashBoardPage dashBoard = PageFactory.initElements(driver, LoginPage.class).login(prop.getProperty("username"), prop.getProperty("password"));
		BuildPage build = dashBoard.clickOnBuildLink();
		build.verify_Create_Folder(reader.getCellData("Build", 0, 1), 
				reader.getCellData("Build", 1, 1));
	}

	

	
	
	
	
	
}
