package webBasedPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupgetText {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/pmpaw/Desktop/wcsa2workhtml/confirmation.html");
		
		driver.findElement(By.xpath("//button[.='I am Hungry']")).click();
		Thread.sleep(3000);
		
		Alert al = driver.switchTo().alert();
		al.accept();
		String text = al.getText();
		System.out.println(text);
	
	}

}
