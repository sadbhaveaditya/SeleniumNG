package A_Testing_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_Open_Chrome_And_URL 
{
	public static void main (String argd[])
	{
		try {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-Core_Java\\SeleniumTesting\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tms.pisystindia.com/admin/login");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pisystindia@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		}
		catch
		(Exception e)
		{
			e.printStackTrace();
		}
	}
}
