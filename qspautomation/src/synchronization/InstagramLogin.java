package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.instagram.com/accounts/login/");
		    driver.findElement(By.name("username")).sendKeys("Admin");
		    driver.findElement(By.name("password")).sendKeys("admin123");
		    driver.findElement(By.cssSelector("button[class*='  L3NKy  ']")).click();
		    
	}
}
