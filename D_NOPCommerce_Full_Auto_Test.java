package A_Testing_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D_NOPCommerce_Full_Auto_Test
{
	public static void main (String argd[])
	{
		try {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-Core_Java\\SeleniumTesting\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en");
		Thread.sleep(500);
		
		
		
		
		driver.close();
		}
		catch
		(Exception e)
		{
			e.printStackTrace();
		}
	}
}
