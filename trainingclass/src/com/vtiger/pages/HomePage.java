package com.vtiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vitiger.generic.Genericlib;

public class HomePage 
{
	@FindBy(linkText="Organizations")
	private WebElement organizationmadule;
	
	@FindBy(linkText="Products")
	private WebElement productmadule;
	
	@FindBy(xpath="(//td[@class='tabUnSelected'])[11]")
	private WebElement moremadule;
	
	@FindBy(linkText="Campaigns")
	private WebElement compaginmadule;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminicon;
	
	@FindBy(linkText ="Sign Out")
	private WebElement logout1;
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnOrganization()
	{
		organizationmadule.click();
		
	}
	public void clickOnProduct()
	{
		productmadule.click();
		
	}
	public void clickOnMoremadule()
	{
		moremadule.click();
		
	}
	
	public void clickOnCompaginmadule()
	{
		Actions act=new Actions(driver);
		act.moveToElement(moremadule).perform();
		compaginmadule.click();
		
	}
	
	
	public void logout()
	{
	
	   Genericlib lib=new Genericlib(); 
	   lib.waitForElementPage(driver, adminicon);
	   lib.moveToElement(driver, adminicon);
	   
	   logout1.click();
	  
	 }
	
	



}
