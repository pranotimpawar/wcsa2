package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calculater {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		
		driver.findElement(By.xpath("//span[@onclick='r(2)' and .='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@onclick='r(3)' and .='3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@onclick='r(4)' and .='4']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[@onclick=\"r('+')\"])")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@onclick='r(4)' and .='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@onclick='r(3)' and .='3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@onclick='r(2)' and .='2']")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
		System.out.println(text);
		
		driver.navigate().refresh();
		
	
	}

}
