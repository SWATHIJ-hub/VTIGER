package com.vtiger.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.Genericlib;

public class MemberLookPage 
{
	@FindBy(name="search_field")
	private WebElement selectlistbox;
	
	@FindBy(linkText="Organization Name")
	private WebElement organizationname;
	
	@FindBy(name="search_text")
	private WebElement searchbox;
	
	@FindBy(xpath="((//table[@class='small'])[3]/tbody/tr[2]/td[1]/a")
	private WebElement webtablename;
	
	public MemberLookPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnSelectlistbox(String option)
	{
		selectlistbox.click();
		organizationname.click();
		
		/*
		 * Genericlib lib=new Genericlib(); lib.select(selectlistbox, option);
		 */
		
	}
	
	public void searchbox(String name )
	{
		
		searchbox.sendKeys(name,Keys.ENTER);
		Genericlib lib=new Genericlib();
		lib.select(selectlistbox, name);
		
		
		
		
		
	}
	
	public void searchOnWebTable(String membername)
	{
		if(webtablename.getText().equals(membername))
		webtablename.click();
		
		
	}

}
