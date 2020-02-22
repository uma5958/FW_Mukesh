/**
 * @author UmaMaheswararao
 */

package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pages.LoginPage;

public class LoginPageTest extends BaseTest {
	
	@Test
	public void LoginPage_Title_Test(){
		
		Assert.fail();
		
		String title = PageFactory.initElements(driver, LoginPage.class).validate_LoginPage_Title();
		Assert.assertEquals(title, "login");
		Reporter.log("LoginPage Title Verified", true);
	}
	
	@Test(dependsOnMethods="LoginPage_Title_Test")
	public void Login_Test() throws Exception{
		PageFactory.initElements(driver, LoginPage.class).login(prop.getProperty("username"), prop.getProperty("password"));
		Reporter.log("User Loggedin Successfully & Dash Board Page Opened", true);
	}
	
	@Test(dependsOnMethods="LoginPage_Title_Test")
	public void verify_Valuechain_wesite_navigation_on_clicking_Valuechain_logo_Test() throws Exception{
		PageFactory.initElements(driver, LoginPage.class).verify_Valuechain_wesite_navigation_on_clicking_Valuechain_logo("Valuechain | Smart Manufacturing Software to Create World-Class Supply Chains");
		Reporter.log("User able to navigate valuechain website on clicking Valuechain log", true);
	}
	

	
	
	
	
	
	

}
