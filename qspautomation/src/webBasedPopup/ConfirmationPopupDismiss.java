package webBasedPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopupDismiss {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/pmpaw/Desktop/wcsa2workhtml/alert.html");
		
		driver.findElement(By.xpath("//button[.='Try it']")).click();
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}

}
