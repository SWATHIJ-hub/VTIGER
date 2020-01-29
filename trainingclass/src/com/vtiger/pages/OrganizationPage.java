package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage 
{
	WebDriver driver;
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createorganization;
	
	
	public OrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public CtreateOrganizationPage navigateToCreateOrg()
	{
		createorganization.click();
		return new CtreateOrganizationPage(driver);
	}

	
	
	

}
