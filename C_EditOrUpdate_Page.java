package A_Testing_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_EditOrUpdate_Page
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
			Thread.sleep(500);
			driver.findElement(By.xpath("//span[@class='sidebar-collapse-icon fa-solid fa-chevron-down']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("(//i[@class='fa-solid fa-helmet-safety'])[1]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("(//a[@class='fa-solid fa-pen-to-square text-blue'])[1]")).click();
			/*Thread.sleep(500);
			driver.findElement(By.xpath("(//textarea[@id='address']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("(//input[@id='contact']")).sendKeys("7777777777");
			Thread.sleep(500);*/
			driver.findElement(By.xpath("(//a[@onclick='return add()']")).click();
			Thread.sleep(500);

		

			
		
			Thread.sleep(9000);
			driver.close();
			}
			catch
			(Exception e)
			{
				e.printStackTrace();
			}
		}
	
}