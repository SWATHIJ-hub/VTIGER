package genericlibraries;

import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Genericlib 
{
	
	public void waitForElement(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	public void waitForElementPage(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void waitForTitlePage(WebDriver driver,String expected)
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains(expected));
	}
	public void waitAndElementToClick(WebDriver driver,WebElement element) throws InterruptedException
	{
		int count=0;
		while(count<=20)
		{
			try
			{
				element.click();
				break;
			}
			catch(Throwable e)
			{
				Thread.sleep(1000);
				count++;
				
			}
			
		}
		
		   
		
	}
	public void select(WebElement element,String options)
	{
		Select lst=new Select(element);
		lst.selectByVisibleText(options);
	}
	
	public void select(WebElement element,int index)
	{
		Select lst=new Select(element);
		lst.selectByIndex(index);;
	}
	public void moveToElement(WebDriver driver,WebElement element)
	{
		 Actions act=new Actions(driver);
		 act.moveToElement(element).perform();
	}
	public void rightClick(WebDriver driver,WebElement element)
	{
		 Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	public int randomNum()
	{
		Random run=new Random();
		return run.nextInt(1000);
	}
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void dismissAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	public void takesScreenShort(WebDriver driver,String path) 
	{
		try
		{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dsc=new File(path);
		FileUtils.copyFile(src, dsc);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	static String childwindowID;
	static String parentwindowID;
	public void switchChildWindow(WebDriver driver)
	{
		Set<String> wh=driver.getWindowHandles();
		Iterator<String> it=wh.iterator();
		parentwindowID=it.next();
		childwindowID=it.next();
		driver.switchTo().window(childwindowID);
		
	}
	public void switchToParentWindow(WebDriver driver )
	{
		driver.switchTo().window(parentwindowID);
	}
	
	public static String read_XL_Data(String sheet,int row,int cell)
	{
		String data=" ";
		try
		{
			 Workbook wb = WorkbookFactory.create(new FileInputStream("./testdata/inputs.xlsx"));
		     data=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		   
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
		return data;
	}
	public static void takesScreenshot1(WebDriver driver ,String path) 
	{
		try
		{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dsc = new File("./takesScreenshot/"+path+".png");
		FileUtils.copyFile(src, dsc);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	public  String  getDataFromProperties(String key) throws IOException
	{
		FileInputStream fisObj = new FileInputStream("./dataResource/common.properties");
		Properties pObj=new Properties();
		pObj.load(fisObj);
		 
		 String value=pObj.getProperty(key);
		 return value;
		
		
		
	}
	public static Robot robot()
	{
		Robot r=null;
		try
		{
			r=new Robot();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			
		}
		return r;
	}
	public static void verifyPage(WebDriver driver,String expectedtitle)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleContains(expectedtitle));
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
		System.out.println("The Page is Verifyed Sucessfully==>"+expectedtitle);
	}

	
	
				
		
	

}
