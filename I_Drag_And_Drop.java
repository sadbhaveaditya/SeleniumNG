package A_Testing_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class I_Drag_And_Drop
{
	public static void main (String argd[])
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-Core_Java\\SeleniumTesting\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://jqueryui.com/");
			driver.manage().window().maximize();
			
			WebElement droppablebutton = driver.findElement(By.xpath("//a[@href='http://jqueryui.com/droppable/']"));
			Thread.sleep(500);
			droppablebutton.click();
			Thread.sleep(500);
			
			WebElement frames = driver.findElement(By.xpath("//iframe[@src='/resources/demos/droppable/default.html']"));
			Thread.sleep(500);
			
			driver.switchTo().frame(frames);
			Thread.sleep(500);
			
			WebElement drags = driver.findElement(By.xpath("/html/body/div[1]"));
			Thread.sleep(500);
			
			WebElement drops = driver.findElement(By.xpath("/html/body/div[2]"));
			Thread.sleep(500);
			
			//predefine class and object
			
			Actions action =new Actions(driver);
			
			//object predefine parameterized method
			
			action.dragAndDrop(drags, drops).build().perform();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}