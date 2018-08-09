package jenkinsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class orangeHrmLogin {
	@Test
	public static void test() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Learning\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumlearns-trials641.orangehrmlive.com");
		System.out.println("OrangeHRM website is launched");
		
		//UserName
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		System.out.println("Admin is entered in the UserName text-box");
		
		//Password
		driver.findElement(By.id("txtPassword")).sendKeys("SeleniumTest");
		System.out.println("SeleniumTest is entered in the password text-box");
		
		//Login button
		driver.findElement(By.xpath("*//input[@name='Submit']")).click();
		System.out.println("Login button is clicked");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@id='account-name']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		System.out.println("Logout button is clicked");
		
		driver.close();
		System.out.println("browser is closed");
	
	}


}
