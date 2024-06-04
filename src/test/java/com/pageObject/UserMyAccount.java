package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserMyAccount {

	WebDriver driver;
	
	public UserMyAccount(WebDriver rdriver)
	{
		driver=rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[@class='account']")
	WebElement name;
	
	public String validUser()
	{
		String text = name.getText();
		
		return text;
	}
}
