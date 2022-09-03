package webBasedPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopup {
	
     public static void main(String[] args) throws InterruptedException {
		
    	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
 		driver.get("file:///C:/Users/pmpaw/Desktop/wcsa2workhtml/alert.html");
 		Thread.sleep(3000);
 		driver.findElement(By.xpath("//button[.='Try it']")).click();
 		Thread.sleep(2000);
 		Alert al = driver.switchTo().alert();
 		al.accept();
	}
     

}
