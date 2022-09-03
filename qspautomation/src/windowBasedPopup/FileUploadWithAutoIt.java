package windowBasedPopup;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadWithAutoIt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
	    driver.findElement(By.id("menu_pim_addEmployee")).click();
	    
	    Thread.sleep(3000);
	    WebElement fileUploadButton = driver.findElement(By.xpath("//input[@id='photofile']"));
	    //fileUploadButton.click();
	    Actions act = new Actions(driver);
	    act.doubleClick(fileUploadButton ).perform();
	    
	    Thread.sleep(3000);
	    File file = new File("");
	    
	    
		
		

	}

}
