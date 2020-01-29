package com.vtiger.scripts;

import org.testng.annotations.Test;

import com.vitiger.generic.BaseClass;
import com.vitiger.generic.Genericlib;
import com.vtiger.pages.CeateCampaignPage;
import com.vtiger.pages.CreateProductPage;
import com.vtiger.pages.HomePage;
import com.vtiger.pages.ProductPage;

public class TestCreateProduct extends BaseClass

{
	@Test(groups= {"smoketest"})
	public void createProductTest() throws InterruptedException 
	{
		HomePage hp=new HomePage(driver);
		
		  hp.clickOnProduct();
		 
		  ProductPage pp=new ProductPage(driver);
		  pp.cliclOnCreateProduct();
		  CreateProductPage cpp=new CreateProductPage(driver);
		  cpp.createProduct();
		 
	}
	@Test(groups= {"regrassiontest"})
	public void CreateProductTest1() throws InterruptedException
	{
		Genericlib lib=new Genericlib();
		HomePage hp=new HomePage(driver);
		 hp.clickOnProduct();
		 
		 ProductPage pp=new ProductPage(driver);
		 pp.cliclOnCreateProduct();
		 CreateProductPage cpp=new CreateProductPage(driver);
		String pname = lib.read_XL_Data("productname", 1, 0);
		 cpp.createProduct(pname);
		 
		
	}
	@Test(groups={"regrassiontest"})
	public void CreateProductTest2() throws InterruptedException
	{
		Genericlib lib=new Genericlib();
		HomePage hp=new HomePage(driver);
		 hp.clickOnProduct();
		 
		 ProductPage pp=new ProductPage(driver);
		 pp.cliclOnCreateProduct();
		 CreateProductPage cpp=new CreateProductPage(driver);
		String pname = lib.read_XL_Data("productname", 1, 0);
		String partN = lib.read_XL_Data("productname", 1, 1);
		
		 cpp.createProduct(pname, partN);
		 
		
	}
		 
		

}
