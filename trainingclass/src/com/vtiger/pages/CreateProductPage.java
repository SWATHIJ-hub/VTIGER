package com.vtiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.Genericlib;

public class CreateProductPage extends Genericlib

{
	
	@FindBy(name="productname")
	private WebElement productname;
	
	@FindBy(id="productcode")
	private WebElement partname;
	
	
	@FindBy(xpath="(//input[@value='  Save  '])[1]")
	private WebElement savetb;
	
	WebDriver driver;
	
	public CreateProductPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void getProductName(String name)
	{
		 
		productname.sendKeys(name);
		
	}
	public void clickOnSave()
	{
		savetb.click();
		
	}
	
	public void createProduct() throws InterruptedException 
	{
		Genericlib lib=new Genericlib();
		String pn = lib.read_XL_Data("productname", 1, 0)+lib.randomNum();
		productname.sendKeys(pn);
		lib.waitAndElementToClick(driver, driver.findElement(By.xpath("(//input[@value='  Save  '])[1]")));
		savetb.click();
	}
	public void createProduct(String pname) throws InterruptedException 
	{
		Genericlib lib=new Genericlib();
		
		productname.sendKeys(pname);
		lib.waitAndElementToClick(driver, driver.findElement(By.xpath("(//input[@value='  Save  '])[1]")));
	    savetb.click();
	}
		public void createProduct(String pname,String partN) throws InterruptedException
		{
			Genericlib lib=new Genericlib();
			productname.sendKeys(pname);
			partname.sendKeys(partN);
			lib.waitAndElementToClick(driver, driver.findElement(By.xpath("(//input[@value='  Save  '])[1]")));
			savetb.click();
			
		}
		
		



}
