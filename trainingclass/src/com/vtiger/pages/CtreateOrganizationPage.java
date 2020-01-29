package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.Genericlib;

public class CtreateOrganizationPage 
{
	@FindBy(name="accountname")
	private WebElement organizationnametb;
	
	@FindBy(id="email2")
	private WebElement emailtb;
	
	@FindBy(id="phone")
	private WebElement phonetb;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement savetb;
	
	@FindBy(xpath="//img[@title='Select']")
	private WebElement membertb;
	
	public CtreateOrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getOrganizationNametb(String orgName)
	{
		organizationnametb.sendKeys(orgName);
		
	}
	public void getPhonetb(String phno)
	{
		phonetb.sendKeys(phno);
		
	}
	public void getEmailtbtb(String  email)
	{
		emailtb.sendKeys(email);
		
	}
	public void clickOnMembertb()
	{
		membertb.click();
		
	}
	public void clickOnSavetb()
	{
		Genericlib lib=new Genericlib();
		
		savetb.click();
		
	}
	public void Organization(String name,String email,String phno)
	{
		organizationnametb.sendKeys(name);
		emailtb.sendKeys(email);
		phonetb.sendKeys(phno);
		
		savetb.click();
		
		
	}
	public void Organization(String name,String email)
	{
		organizationnametb.sendKeys(name);
		emailtb.sendKeys(email);
		
		
		savetb.click();
		
		
	}
	WebDriver driver;
	public void Organization()
	{
		Genericlib lib=new Genericlib();
		String orgname = lib.read_XL_Data("organizationname", 1, 0)+lib.randomNum();
		String email = lib.read_XL_Data("organizationname", 1, 1);
		String phno=lib.read_XL_Data("organizationname", 1, 2);
		organizationnametb.sendKeys(orgname);
		emailtb.sendKeys(email);
		phonetb.sendKeys(phno);
		savetb.click();
	}
	public OrgInfPage Organization1(String orgname,String phno)
	{
		Genericlib lib=new Genericlib();
		
		organizationnametb.sendKeys(orgname);
	     phonetb.sendKeys(phno);
		savetb.click();
		OrgInfPage oip=new OrgInfPage(driver);
		
		return oip;
				
				
	}
	
	


}
