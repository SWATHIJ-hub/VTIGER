package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgInfPage
{
	@FindBy(id="dtlview_Organization Name")
	private WebElement orginftb;
	
	public OrgInfPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrginftb() 
	{
		return orginftb;
	}
	
	

}
