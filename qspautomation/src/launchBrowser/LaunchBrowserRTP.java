package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserRTP {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		//took the user input
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the browser name , chrome or firefox");
		String browservalue = sc.nextLine();
		
		//browserValue variable contains the name of the browser which is supposed to be opened
		
		if (browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//avoid IllegalStateException
			driver = new ChromeDriver();//open chrome browser
			driver.manage().window().maximize();//maximize the browser
			driver.get("https://www.google.com");//launch the web application
			Thread.sleep(5000);//wait for 5 seconds
		}
		else if(browservalue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			Thread.sleep(5000);
		}
		
		else
		{
			System.out.println("type valid input");
		}
	}

}
