package com.vitiger.generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.vtiger.pages.HomePage;
import com.vtiger.pages.LoginPage;

public class BaseClass

{
	public Genericlib lib = new Genericlib();
	public WebDriver driver;
	
	/*
	 * @BeforeSuite public void configBs() {
	 * 
	 * }
	 */
	

	@BeforeClass(groups = { "smoketest", "regrassiontest" })
	public void configBc() throws IOException {
		String Browser = lib.getDataFromProperties("browser");
		System.out.println("=====launch the browser=====");
		if (Browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (Browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}

	}

	@BeforeMethod(groups = { "smoketest", "regrassiontest" })
	public void congigBm() throws IOException {
		String URL = lib.getDataFromProperties("url");

		System.out.println("login");
		LoginPage lp = new LoginPage(driver);
		lib.waitForElement(driver);
		driver.get(URL);
		lp.login();

	}

	
	  @AfterMethod(groups= {"smoketest","regrassiontest"})
	  public void conficAm() 
	  {
	 
	  System.out.println("logout"); HomePage hp=new HomePage(driver); hp.logout();
	 
	  }
	  
	  @AfterClass(groups= {"smoketest","regrassiontest"}) 
	  public void confinac()
	  {
	  driver.close();
	  }
	  
	

}
