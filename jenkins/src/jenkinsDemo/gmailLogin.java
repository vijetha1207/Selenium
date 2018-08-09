package jenkinsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class gmailLogin {
	

	@Test
	public static void test () throws Exception
	{
		//Gmail login test cases
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\eclipse workspace\\jars and downloads\\drivers\\google chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&flowName=GlifWebSignIn&flowEntry=AddSession");
		System.out.println("Gmail website is launched");
		driver.findElement(By.name("identifier")).sendKeys("a.vijetha@gmail.com");
		System.out.println("email id is entered in text-box");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		System.out.println("Next button is clicked");
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("Hamsika07");
		System.out.println("password is entered in text-box");
		/*driver.findElement(By.xpath("//span[text()='Next']")).click();
		System.out.println("next button is clicked");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[@class='gb_8a gbii']")).click();
		//driver.findElement(By.xpath("//div[@aria-label='Account Information']")).click();
		System.out.println("account information is clicked");
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//a[@href='https://accounts.google.com/Logout']")).click();
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		System.out.println("Sign out is clicked");*/
		driver.close();
		System.out.println("browser is closed");
	}

}


