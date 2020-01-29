package genericlibraries;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductAndCom extends Genericlib

{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		 WebDriver driver=new ChromeDriver();
		 Genericlib lib=new Genericlib();
		 String cname="rambo"+lib.randomNum();
		 driver.manage().window().maximize();
		 lib.waitForElement(driver);
		 driver.get("http://localhost:8888/");
	     driver.findElement(By.name("user_name")).sendKeys("admin");
		 driver.findElement(By.name("user_password")).sendKeys("1234567890");
		 driver.findElement(By.id("submitButton")).click();
		 driver.findElement(By.xpath("(//a[text()='Products'])[1]")).click();
		 driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
		  WebElement pn = driver.findElement(By.name("productname"));
		  pn.sendKeys("carwww");
		 driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]"));
		WebElement more = driver.findElement(By.xpath("(//td[@class='tabUnSelected'])[11]"));
		lib.moveToElement(driver, more);
		driver.findElement(By.linkText("Campaigns")).click();
		driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
		driver.findElement(By.name("campaignname")).sendKeys(cname);
		driver.findElement(By.xpath("//img[@alt='Select']")).click();
		lib.switchChildWindow(driver);
	
		
		 WebElement ls = driver.findElement(By.name("search_field"));
		 lib.select(ls, "Product Name");
		 driver.findElement(By.id("search_txt")).sendKeys("carwww",Keys.ENTER);
		driver.findElement(By.linkText("carwww")).click();
		lib.switchToParentWindow(driver);
		
	  driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
	  driver.findElement(By.linkText("Campaigns")).click();
	 WebElement lc = driver.findElement(By.id("bas_searchfield"));
	 lib.select(lc, "Campaign Name");
	 driver.findElement(By.xpath("//input[@class='txtBox']")).sendKeys(cname,Keys.ENTER);
	String text = driver.findElement(By.linkText(cname)).getText();
	if(text.equals(cname))
	{
		System.out.println("campaign created");
	}
		
		
		
		 
	}

}
