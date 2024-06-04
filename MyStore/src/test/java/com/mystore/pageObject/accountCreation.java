package com.mystore.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class accountCreation {

	 WebDriver driver;
	
	public accountCreation(WebDriver rdriver)
	{
		driver=rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(id = "id_gender1")
	WebElement title;
	
	@FindBy(id="customer_firstname")
	WebElement firstname;
	
	@FindBy(id="customer_lastname")
	WebElement lastname;
	
	@FindBy(id="passwd")
	WebElement password;
	
	@FindBy(id="days")
	WebElement day;
	
	@FindBy(id="months")
	WebElement month;
	
	@FindBy(id="years")
	WebElement year;
	
	@FindBy(id="submitAccount")
	WebElement registerbtn;
	
	public void selectTitle()
	{
		title.click();
	}
	
	public void enterFirstName(String fname) 
	{
		firstname.sendKeys(fname);
	}
	
	public void enterLastName(String lname)
	{
		lastname.sendKeys(lname);
	}
	
	public void enterPassword(String pasword)
	{
		password.sendKeys(pasword);
	}
	
	public void selectDay(String text1) 
	{
		Select sl = new Select(day);
		sl.selectByValue(text1);
	}
	
	public void selectMonth(String text2) 
	{
		Select sl = new Select(month);
		sl.selectByValue(text2);
	}
	
	public void selectYear(String text3) 
	{
		Select sl = new Select(year);
		sl.selectByValue(text3);
	}
	
	public void clickOnRegister()
	{
		registerbtn.click();
	}
	
}
