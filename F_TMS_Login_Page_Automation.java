package A_Testing_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F_TMS_Login_Page_Automation
{
	public static void main (String argd[])
	{	//Valid Log In Case
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-Core_Java\\SeleniumTesting\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://tms.pisystindia.com/admin/login");
			Thread.sleep(500);
			
			WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
			Thread.sleep(500);
			
			WebElement Pass = driver.findElement(By.xpath("//input[@type='password']"));
			Thread.sleep(500);
			
			WebElement Conti = driver.findElement(By.xpath("//button[@type='submit']"));
			Thread.sleep(5000);
			
			Email.sendKeys("pisystindia@gmail.com");
			Thread.sleep(5000);
			Pass.sendKeys("123456");
			Thread.sleep(5000);
			Conti.click();
			Thread.sleep(5000);
			driver.close();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//Invalid LogIn Case 1
		//Blank Email,Correct Password
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-Core_Java\\SeleniumTesting\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://tms.pisystindia.com/admin/login");
			WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
			Thread.sleep(500);
			
			WebElement Pass = driver.findElement(By.xpath("//input[@type='password']"));
			Thread.sleep(500);
			
			WebElement Conti = driver.findElement(By.xpath("//button[@type='submit']"));
			Thread.sleep(5000);
			Thread.sleep(500);
			Email.sendKeys("");
			Thread.sleep(5000);
			Pass.sendKeys("123456");
			Thread.sleep(5000);
			Conti.click();
			Thread.sleep(5000);
			
			
			
			driver.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//Invalid LogIn Case 2
		//Blank Email, Wrong Password
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-Core_Java\\SeleniumTesting\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://tms.pisystindia.com/admin/login");
			WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
			Thread.sleep(500);
					
			WebElement Pass = driver.findElement(By.xpath("//input[@type='password']"));
			Thread.sleep(500);
					
			WebElement Conti = driver.findElement(By.xpath("//button[@type='submit']"));
			Thread.sleep(5000);
			Thread.sleep(500);
			Email.sendKeys("");
			Thread.sleep(5000);
			Pass.sendKeys("130697");
			Thread.sleep(5000);
			Conti.click();
			Thread.sleep(5000);
					
					
					
			driver.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//Invalid LogIn Case 3
		//Valid Email Blank Password
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-Core_Java\\SeleniumTesting\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://tms.pisystindia.com/admin/login");
			WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
			Thread.sleep(500);
					
			WebElement Pass = driver.findElement(By.xpath("//input[@type='password']"));
			Thread.sleep(500);
					
			WebElement Conti = driver.findElement(By.xpath("//button[@type='submit']"));
			Thread.sleep(5000);
			Thread.sleep(500);
			Email.sendKeys("pisystindia@gmail.com");
			Thread.sleep(5000);
			Pass.sendKeys("");
			Thread.sleep(5000);
			Conti.click();
			Thread.sleep(5000);
					
					
					
			driver.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//Invalid LogIn Case 4
		//Valid Email Invalid Password
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-Core_Java\\SeleniumTesting\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://tms.pisystindia.com/admin/login");
			WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
			Thread.sleep(500);
					
			WebElement Pass = driver.findElement(By.xpath("//input[@type='password']"));
			Thread.sleep(500);
					
			WebElement Conti = driver.findElement(By.xpath("//button[@type='submit']"));
			Thread.sleep(5000);
			Thread.sleep(500);
			Email.sendKeys("pisystindia@gmail.com");
			Thread.sleep(5000);
			Pass.sendKeys("130697");
			Thread.sleep(5000);
			Conti.click();
			Thread.sleep(5000);
					
					
					
			driver.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//Invalid LogIn Case 5
		//Blank Email Blank Password
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-Core_Java\\SeleniumTesting\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://tms.pisystindia.com/admin/login");
			WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
			Thread.sleep(500);
					
			WebElement Pass = driver.findElement(By.xpath("//input[@type='password']"));
			Thread.sleep(500);
					
			WebElement Conti = driver.findElement(By.xpath("//button[@type='submit']"));
			Thread.sleep(5000);
			Thread.sleep(500);
			Email.sendKeys("");
			Thread.sleep(5000);
			Pass.sendKeys("");
			Thread.sleep(5000);
			Conti.click();
			Thread.sleep(5000);
					
					
					
			driver.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//Invalid LogIn Case 6
		//Invalid Email Invalid Password
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-Core_Java\\SeleniumTesting\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://tms.pisystindia.com/admin/login");
			WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
			Thread.sleep(500);
					
			WebElement Pass = driver.findElement(By.xpath("//input[@type='password']"));
			Thread.sleep(500);
					
			WebElement Conti = driver.findElement(By.xpath("//button[@type='submit']"));
			Thread.sleep(5000);
			Thread.sleep(500);
			Email.sendKeys("Aditya@gmail.com");
			Thread.sleep(5000);
			Pass.sendKeys("130697");
			Thread.sleep(5000);
			Conti.click();
			Thread.sleep(5000);
					
					
					
			driver.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//Invalid LogIn Case 7
		//Invalid Email Invalid Password
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-Core_Java\\SeleniumTesting\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://tms.pisystindia.com/admin/login");
			WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
			Thread.sleep(500);
					
			WebElement Pass = driver.findElement(By.xpath("//input[@type='password']"));
			Thread.sleep(500);
					
			WebElement Conti = driver.findElement(By.xpath("//button[@type='submit']"));
			Thread.sleep(5000);
			Thread.sleep(500);
			Email.sendKeys("@gmail.com");
			Thread.sleep(5000);
			Pass.sendKeys("130697");
			Thread.sleep(5000);
			Conti.click();
			Thread.sleep(5000);
					
					
					
			driver.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//Invalid LogIn Case 8
		//Invalid Email Invalid Password
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-Core_Java\\SeleniumTesting\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://tms.pisystindia.com/admin/login");
			WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
			Thread.sleep(500);
					
			WebElement Pass = driver.findElement(By.xpath("//input[@type='password']"));
			Thread.sleep(500);
					
			WebElement Conti = driver.findElement(By.xpath("//button[@type='submit']"));
			Thread.sleep(5000);
			Thread.sleep(500);
			Email.sendKeys("gmail.com");
			Thread.sleep(5000);
			Pass.sendKeys("130697");
			Thread.sleep(5000);
			Conti.click();
			Thread.sleep(5000);
					
					
					
			driver.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		//Invalid LogIn Case 9
		//Invalid Email Invalid Password
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-Core_Java\\SeleniumTesting\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://tms.pisystindia.com/admin/login");
			WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
			Thread.sleep(500);
					
			WebElement Pass = driver.findElement(By.xpath("//input[@type='password']"));
			Thread.sleep(500);
					
			WebElement Conti = driver.findElement(By.xpath("//button[@type='submit']"));
			Thread.sleep(5000);
			Thread.sleep(500);
			Email.sendKeys("Aditya@gmail");
			Thread.sleep(5000);
			Pass.sendKeys("130697");
			Thread.sleep(5000);
			Conti.click();
			Thread.sleep(5000);
					
					
					
			driver.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
			
		
	}
}