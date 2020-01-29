package com.vtiger.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vitiger.generic.BaseClass;
import com.vitiger.generic.Genericlib;
import com.vtiger.pages.CeateCampaignPage;
import com.vtiger.pages.CreateProductPage;
import com.vtiger.pages.HomePage;
import com.vtiger.pages.ProductPage;

public class TestCreateCampagin extends BaseClass

{
	@Test(groups={"regrassiontest"})
	public void createCampaginTest() throws InterruptedException 
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnCompaginmadule();
	    CeateCampaignPage ccp=new CeateCampaignPage(driver);
		ccp.createCampagin1();
		
		
	}
	
	@Test(groups={"smoketest"})
	public void createCampaignTest1() throws InterruptedException
	{
		Genericlib lib=new Genericlib();
	
		HomePage hp=new HomePage(driver);
		hp.clickOnCompaginmadule();
	    CeateCampaignPage ccp=new CeateCampaignPage(driver);
	    String cname = lib.read_XL_Data("campaginname", 1, 0)+lib.randomNum();
	    ccp.CreateCampagin1(cname);
	   
		
	}
	@Test(groups={"regrassiontest"})
	public void createCampaginTest2() throws InterruptedException
	{
		Genericlib lib=new Genericlib();
		
		HomePage hp=new HomePage(driver);
		hp.clickOnCompaginmadule();
	    CeateCampaignPage ccp=new CeateCampaignPage(driver);
	    String cname = lib.read_XL_Data("campaginname", 1, 0);
	    String sponsor = lib.read_XL_Data("campaginname", 1, 2);
	    ccp.CreateCampagin1(cname, sponsor);
		
	}
		
		
		
		
		
		
	

}
