/**
 * @author UmaMaheswararao
 */

package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.base.BasePage;

public class AnalysePage extends BasePage {

	// Initializing the Page Objects:................................................................
	public AnalysePage() {
		PageFactory.initElements(driver, this);
	}

	// Objects Repository(OR):........................................................................
	// Page verification
	@FindBy(xpath=".//*[@id='searchAnalyses']")
	WebElement analysesSearchBox;

	// verify Questionnaire selection 
	@FindBy(xpath=".//*[@id='searchAnalyses']//preceding::span[1]")
	WebElement searchQuestionnaireBtn;

	@FindBy(xpath=".//*[@id='analysesName']/span")
	WebElement selectedQuestionnaire;

	By addReprtBtn = By.xpath("//a[@title='Create new report']");





	// Actions:......................................................................................

	public void verify_AnalysePage() throws Exception {
		waitForElementVisibility(driver, analysesSearchBox);
		Assert.assertTrue(analysesSearchBox.isDisplayed(), "Unable to Navigate Analyse Page");
		driver.findElement(By.xpath("//a[contains(@title,'Return to parent folder')]")).click();
		waitForAjax(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@title,'Return to parent folder')]")).click();
		waitForAjax(driver);
	}

	public void verify_Questionnaire_selection(String QuestionnaireName) throws Exception {
		waitForElementVisibility(driver, analysesSearchBox);
		jsType(driver, analysesSearchBox, QuestionnaireName);
		ajaxJsClick(driver, searchQuestionnaireBtn); 
		WebElement questionnaire = driver.findElement(By.xpath("//h3[text()='"+QuestionnaireName+"']"));
		waitForElementVisibility(driver, questionnaire);
		questionnaire.click();
		waitForAjax(driver);
		waitForElementVisibility(driver, selectedQuestionnaire);
		Assert.assertTrue(selectedQuestionnaire.isDisplayed(),"Questionnaire Selected Successfully");
		Reporter.log("Questionnaire selected successfully",true);
		Assert.assertTrue(getElement(driver, addReprtBtn).isDisplayed(), "Create report button is not displaying");
		Reporter.log("Create report button is displayed",true);
	}








}
