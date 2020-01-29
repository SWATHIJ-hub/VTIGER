package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vitiger.generic.Genericlib;

public class LoginPage 
{
	@FindBy(name="user_name")
	private WebElement untb;
	
	@FindBy(name="user_password")
	private WebElement pwtb;
	
	@FindBy(id="submitButton")
	private WebElement logintb;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getUserName(String un)
	{
		untb.sendKeys(un);
	}
	
	public void getpassword(String pw)
	{
		pwtb.sendKeys(pw);
	}
	
	public void clickOnLogin()
	{
		logintb.click();
	}
	
	public void login( String USERNAME,String PASSWORD)
	{
		untb.sendKeys(USERNAME);
		pwtb.sendKeys(PASSWORD);
		logintb.click();
		
	}
	public void login()
	{
		Genericlib lib=new Genericlib();
		String un = lib.read_XL_Data("loginpage", 1, 0);
		String pw=lib.read_XL_Data("loginpage", 1, 1);
		untb.sendKeys(un);
		pwtb.sendKeys(pw);
		logintb.click();
	}


	

}
