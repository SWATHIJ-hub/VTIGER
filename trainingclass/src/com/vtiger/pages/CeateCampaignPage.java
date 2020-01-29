package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.Genericlib;

public class CeateCampaignPage 
{
	@FindBy(name="campaignname")
	private WebElement campaginnametb;
	
	@FindBy(id="sponsor")
	private WebElement sponsortb;
	
	@FindBy(xpath="//img[@title='Select']")
	private WebElement selectproduct;
	
	@FindBy(xpath="//input[@class='crmButton small save']")
	private WebElement savebt;
	
	public CeateCampaignPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void getCampaginName(String cname)
	{
		
		 campaginnametb.sendKeys(cname);
		
	}
	
	public void clickOnSelectProduct()
	{
		selectproduct.click();
		
	}
	public void clickOnSavebtt()
	{
		savebt.click();
		
	}
	 WebDriver driver;
	public void createCampagin()
	{
		Genericlib lib=new Genericlib();
		String cname = lib.read_XL_Data("campaginname", 1, 0)+lib.randomNum();
		
		selectproduct.click();
		lib.switchChildWindow(driver);
		ProductPage pp=new ProductPage(driver);
		
		lib.switchToParentWindow(driver);
		savebt.click();
		
		
		
		
	}
	public void createCampagin1() throws InterruptedException
	{
		Genericlib lib=new Genericlib();
		String cname = lib.read_XL_Data("campaginname", 1, 0)+lib.randomNum();
		String pn = lib.read_XL_Data("campaginname", 1, 1);
		CampaginPage cp=new CampaginPage(driver);
		cp.clickOncreatecompagin();
		campaginnametb.sendKeys(cname);
		
		lib.waitAndElementToClick(driver,savebt );
		savebt.click();
		
		
		
		
	}
	public void CreateCampagin1(String cname) throws InterruptedException
	{
		Genericlib lib=new Genericlib();
		CampaginPage cp=new CampaginPage(driver);
		cp.clickOncreatecompagin();
		campaginnametb.sendKeys(cname);
		lib.waitAndElementToClick(driver,savebt );
		savebt.click();
		
		
	}
	public void CreateCampagin1(String cname,String sponsor) throws InterruptedException
	{
		Genericlib lib=new Genericlib();
		CampaginPage cp=new CampaginPage(driver);
		cp.clickOncreatecompagin();
		campaginnametb.sendKeys(cname);
		sponsortb.sendKeys(sponsor);
		
		lib.waitAndElementToClick(driver,savebt );
		savebt.click();

		
		
	}

}
