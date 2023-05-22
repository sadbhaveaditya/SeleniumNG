package A_Testing_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class H_Customized_Alert
{
	public static void main (String argd[])
		{ //Accept Alert
			try
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-Core_Java\\SeleniumTesting\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://sweetalert2.github.io/");
				driver.manage().window().maximize();
				
				Thread.sleep(5000);
				
				WebElement alert1 = driver.findElement(By.xpath("(//button[@class='show-example-btn'])[1]"));
				Thread.sleep(1000);
				
				alert1.click();
				Thread.sleep(9000);
				
				WebElement OK = driver.findElement(By.xpath("(//button[@class='swal2-confirm swal2-styled'])"));
				Thread.sleep(1000);
				
				OK.click();
			
				driver.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
					
		}
}