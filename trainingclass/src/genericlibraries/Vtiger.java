package genericlibraries;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger extends Genericlib

{

	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Genericlib gls=new Genericlib();
		String pname="xyz"+gls.randomNum();
		gls.waitForElement(driver);
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("1234567890");
		driver.findElement(By.id("submitButton")).click();	
		 driver.findElement(By.linkText("Organizations")).click();
		
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		 driver.findElement(By.name("accountname")).sendKeys("xyz"+gls.randomNum());
		driver.findElement(By.id("email2")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("otherphone")).sendKeys("123344678");
		gls.randomNum();
		driver.findElement(By.xpath("(//input[@value='  Save  '])[1]")).click();
		gls.waitAndElementToClick(driver, driver.findElement(By.linkText("Organizations")));
	      
		driver.findElement(By.linkText("Organizations")).click();
		WebElement sb = driver.findElement(By.id("bas_searchfield"));
		gls.select(sb, "Organization Name");
		driver.findElement(By.xpath("//input[@class='txtBox']")).sendKeys("xyz"+gls.randomNum(),Keys.ENTER);
		String text = driver.findElement(By.linkText(pname)).getText();
		if(text.equals("xyz"+gls.randomNum()))
		{
			System.out.println("product is created");
		}
		
		
	
	
		
		
		
	

	}

}
