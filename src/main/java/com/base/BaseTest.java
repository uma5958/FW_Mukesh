package com.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.util.ExcelUtility;


public class BaseTest extends BasePage {
	
	public ExcelUtility reader;
	
	@BeforeMethod
	public void setup() {
		initialization();
		reader = new ExcelUtility("./src/main/java/com/testdata/NewiQaptureData.xlsx");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
