package assingment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildWindow {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Open a popup window"));
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		Set<String> allHandles = driver.getWindowHandles();
		for(String handle:allHandles)
		{
			driver.switchTo().window(handle);
			System.out.println(handle);
			
		}
		driver.close();
		
		
}

}
