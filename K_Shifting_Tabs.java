package A_Testing_Basics;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class K_Shifting_Tabs
{
	public static void main (String argd[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-Core_Java\\SeleniumTesting\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		 driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
		 try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	      // Keys.Chord string
	      String clickl = Keys.chord(Keys.CONTROL,Keys.ENTER);
	      try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	      // open the link in new tab, Keys.Chord string passed to sendKeys
	      driver.findElement(
	      By.xpath("//*[text()='Terms of Use']")).sendKeys(clickl);
	      try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	      // hold all window handles in array list
	      ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	      
	      //switch to new tab
	      driver.switchTo().window(newTb.get(1));
	      
	      System.out.println("Page title of new tab: " + driver.getTitle());
	      
	      //switch to parent window
	      driver.switchTo().window(newTb.get(0));
	      System.out.println("Page title of parent window: " + driver.getTitle());
	      driver.quit();
	}
}