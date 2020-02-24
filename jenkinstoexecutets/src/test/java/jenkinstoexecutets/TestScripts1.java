package jenkinstoexecutets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestScripts1 
{
	@Test
	public void excuteTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:/www.google.com");
		String t = driver.getTitle();
		System.out.println(t);
	}

}
