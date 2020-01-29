package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.Genericlib;

public class CampaginPage 
 
{
	@FindBy(xpath="//img[@title='Create Campaign...']")
	private WebElement createcompagin;
    
	@FindBy(id="bas_searchfield")
	private WebElement listbox;
	
	@FindBy(name="search_text")
	private WebElement searchbox;
	
	public CampaginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOncreatecompagin()
	{
		createcompagin.click();
	}
	public void selectListbox(String option)
	{
		Genericlib lib=new Genericlib();
		lib.select(listbox, option);
		
	}

	public void clickOnsearchbox(String name)
	{
		 Genericlib lib=new Genericlib();
		 name="name"+lib.randomNum();
		searchbox.click();
	}


}
