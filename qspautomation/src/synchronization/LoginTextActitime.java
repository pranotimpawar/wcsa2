package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTextActitime {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("http://127.0.0.1/login.do;jsessionid=18myb2leo5syh");
		  
		  String loginpageTitle = driver.getTitle();
		  
		  if(loginpageTitle.contentEquals("actiTime - Login"))
		  {
			  System.out.println("Login page title is verified | test case is passed ");
		  }
		  
		  else
		  {
			  System.out.println("Login page title is not verified | test case is failed");		  }
		  
		  driver.findElement(By.name("username")).sendKeys("admin");
		  driver.findElement(By.name("pwd")).sendKeys("manage");
		  driver.findElement(By.id("loginButton")).click();
		    
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		  wait.until(ExpectedConditions.titleContains("pranoti"));
		  
		  System.out.println("home page title isverified | test case is passed");
	}

}
