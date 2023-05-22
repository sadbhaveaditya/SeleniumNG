package A_Testing_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class G_Default_Browser_Alert
{
	public static void main (String argd[])
		{ //Accept Alert
			try
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-Core_Java\\SeleniumTesting\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://sweetalert2.github.io/");
				driver.manage().window().maximize();
				Thread.sleep(9000);
				
				JavascriptExecutor js =(JavascriptExecutor) driver ;
				js.executeScript("window.scrollBy(0,250)","");
				Thread.sleep(9000);
				
				WebElement alert = driver.findElement(By.xpath("//button[text()='Show normal alert' ]"));
				Thread.sleep(9000);
				alert.click();
				Thread.sleep(9000);
				driver.switchTo().alert().accept();
				Thread.sleep(9000);
				driver.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			/*//Dismiss Alert
			try
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-Core_Java\\SeleniumTesting\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://sweetalert2.github.io/");
				driver.manage().window().maximize();
				Thread.sleep(9000);
				
				JavascriptExecutor js =(JavascriptExecutor) driver ;
				js.executeScript("window.scrollBy(0,250)","");
				Thread.sleep(9000);
				
				WebElement alert = driver.findElement(By.xpath("//button[text()='Show normal alert' ]"));
				Thread.sleep(9000);
				alert.click();
				Thread.sleep(9000);
				driver.switchTo().alert().dismiss();
				Thread.sleep(9000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}*/
		}
}