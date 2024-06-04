package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

	WebDriver driver;
	
	public SignUpPage(WebDriver rdriver)
	{
		driver =rdriver;
		
		PageFactory.initElements(rdriver, this);
	}	
	
	
	//identify the  element 
	@FindBy(linkText = "Sign in") 
	WebElement signin;
	
	//Performing action on the webelement
	
	public void clickOnSignIn() 
	{
		signin.click();
	}
	
	
	
}
