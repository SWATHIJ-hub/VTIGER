package com.vtiger.scripts;

import org.testng.annotations.Test;

import com.vitiger.generic.BaseClass;
import com.vitiger.generic.Genericlib;
import com.vtiger.pages.CtreateOrganizationPage;
import com.vtiger.pages.HomePage;
import com.vtiger.pages.LoginPage;
import com.vtiger.pages.OrganizationPage;

public class TestOrganization extends BaseClass

{
	@Test(groups={"regrassiontest"})
	public void testCreateOrg()
	{
		Genericlib lib=new Genericlib();
		 String orgN = lib.read_XL_Data("organizationname", 1, 0)+lib.randomNum();
		 String email = lib.read_XL_Data("organizationname", 1, 1);
		 String phno = lib.read_XL_Data("organizationname", 1, 2);
		 
		HomePage hp=new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		
		hp.clickOnOrganization();
	    OrganizationPage op=new OrganizationPage(driver);
	     op.navigateToCreateOrg();
	     CtreateOrganizationPage cop=new CtreateOrganizationPage(driver);
	     cop.Organization(orgN, email, phno);
	}
	@Test(groups="regrassiontest")
	public void testCreateOrg1()
	{
		
		HomePage hp=new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		
		hp.clickOnOrganization();
	    OrganizationPage op=new OrganizationPage(driver);
	     op.navigateToCreateOrg();
	     CtreateOrganizationPage cop=new CtreateOrganizationPage(driver);
	     cop.Organization();
	}
	@Test(groups={"smoketest"})
	public void testCreateOrg2()
	{
		Genericlib lib=new Genericlib();
		 String orgN = lib.read_XL_Data("organizationname", 1, 0)+lib.randomNum();
		 String phno = lib.read_XL_Data("organizationname", 1, 2);
		 
		HomePage hp=new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		
		hp.clickOnOrganization();
	    OrganizationPage op=new OrganizationPage(driver);
	     op.navigateToCreateOrg();
	     CtreateOrganizationPage cop=new CtreateOrganizationPage(driver);
	     cop.Organization(orgN, phno);
	}
	@Test(groups={"regrassiontest"})
	public void testCreateOrg3()
	{
		Genericlib lib=new Genericlib();
		 String orgN = lib.read_XL_Data("organizationname", 1, 0)+lib.randomNum();
		 String email = lib.read_XL_Data("organizationname", 1, 1);
		 
		HomePage hp=new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		
		hp.clickOnOrganization();
	    OrganizationPage op=new OrganizationPage(driver);
	     op.navigateToCreateOrg();
	     CtreateOrganizationPage cop=new CtreateOrganizationPage(driver);
	     cop.Organization(orgN, email);
	}
	
	     

	     

	    
		
		
		 
	
	

}
