package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartFilter {

public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[.='✕']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptop");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='_3879cV' and .='Core i5']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and .='Brand']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='_3879cV' and .='HP']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and .='Operating System']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='_3879cV' and .='Windows 10']")).click();
	Thread.sleep(3000);
	String priceOfTheFirstSuggestion = driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
	System.out.println("priceOfTheFirstSuggestion"+priceOfTheFirstSuggestion);
	
}

}