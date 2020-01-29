package trainingclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GmailFace 
{
	@Test
	public void selectMsgText()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com");
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]"))));
		driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]")).sendKeys("swathisatyappa@gmail.com",Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]"))));
		driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]")).sendKeys("96324952",Keys.ENTER);
		List<WebElement> lst = driver.findElements(By.xpath("//table[@class='F cf zt']/tbody/tr[*]/td[6]/div"));
		for(WebElement wb:lst)
		{
		   if(wb.getText().equals("facebook"))
		   {
			   System.out.println(wb.getText());
			   break;
		   }
		}
		
	}
	

}
