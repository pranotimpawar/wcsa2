package screenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class way4 {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		
		EventFiringWebDriver efw = new EventFiringWebDriver(driver);
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/screenshot4.jpg");
		Files.copy(src,  dest);
		
	}

}
