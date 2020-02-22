/**

 * @author UmaMaheswararao
 */

package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pages.AnalysePage;
import com.pages.DashBoardPage;
import com.pages.LoginPage;

public class AnalysePageTest extends BaseTest {

	@Test
	public void AnalysePage_Test() throws Exception {
		DashBoardPage dashBoard = PageFactory.initElements(driver, LoginPage.class).login(prop.getProperty("username"), prop.getProperty("password"));
		AnalysePage analyse = dashBoard.clickOnAnalyseLink();
		analyse.verify_AnalysePage();
		Reporter.log("Analyse Page Verified Successfully",true);
	}

	@Test(dependsOnMethods="AnalysePage_Test")
	public void Questionnaire_selection_Test() throws Exception {
		DashBoardPage dashBoard = PageFactory.initElements(driver, LoginPage.class).login(prop.getProperty("username"), prop.getProperty("password"));
		AnalysePage analyse = dashBoard.clickOnAnalyseLink();
		analyse.verify_Questionnaire_selection(reader.getCellData("Analyse", 0, 1));
		Reporter.log("Questionnaire selected successfully",true);
	}






}
