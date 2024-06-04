package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myAccount {

	WebDriver ldriver;
	
	//Constructor
	public  myAccount(WebDriver rdriver)
	{
		ldriver =rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(id = "email_create") 
	WebElement emailAddress;
	
	@FindBy(id ="SubmitCreate")
	WebElement createAccount;
	
	
	
	public void enterEmailAdd(String email) 
	{
		emailAddress.sendKeys(email);
	}
	
	
	public void createAcc()
	{
		createAccount.click();
	}
	
}
