package com.vtiger.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.Genericlib;

public class ProductPage 
{
	
	
	@FindBy(xpath="//img[@alt='Create Product...']")
	private WebElement createproduct1;
	
	
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void cliclOnCreateProduct()
	{
		
		createproduct1.click();
	}
	/*
	 * public CreateProduct navigateToProductPage() {
	 * 
	 * }
	 */
	


}
