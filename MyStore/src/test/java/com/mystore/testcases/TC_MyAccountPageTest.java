package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.mystore.pageObject.SignUpPage;
import com.mystore.pageObject.UserMyAccount;
import com.mystore.pageObject.accountCreation;
import com.mystore.pageObject.myAccount;


public class TC_MyAccountPageTest extends BaseClass
{

	@Test
	public void verifyRegistrationLogin()
	{
		driver.get(url);
		logger.info("URL Opened");
		
		SignUpPage sp = new SignUpPage(driver);
		
		sp.clickOnSignIn();
		logger.info("Clicked on the Sign On");
		
		myAccount acc = new myAccount(driver);
		
		acc.enterEmailAdd("suyogtesting981@gmail.com");
		logger.info("Email address entered in the Field");
		
		acc.createAcc();
		logger.info("Clicked on the Created Account btn");
		
		accountCreation createUser = new accountCreation(driver);
		
		logger.info("Account Creation Started by Entering Details");
		
		createUser.selectTitle();
		createUser.enterFirstName("Suyog");
		createUser.enterLastName("Borade");
		createUser.enterPassword("test1234");
		createUser.selectDay("14");
		createUser.selectMonth("2");
		createUser.selectYear("2000");
		
		createUser.clickOnRegister();
		
		logger.info("Account Creation Comoleted");
		
		UserMyAccount reguser = new UserMyAccount(driver);
		
		String text1 = reguser.validUser();
		
		Assert.assertEquals("Suyog Borade", text1);
		
		logger.info("User validate Complete ");
	}
}
