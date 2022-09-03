package operationlMethodsOfDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/pmpaw/Desktop/wcsa2workhtml/multiselectdropdown.html");
		WebElement multiselectdd = driver.findElement(By.id("menu"));
		Select sel = new Select(multiselectdd);
		
		for(int i=2;i<=6;i++)
		{
		     sel.deselectByIndex(i);	
			
		}
		
		WebElement op = sel.getFirstSelectedOption();
		String textOfselectedop = op.getText();
		System.out.println(textOfselectedop);
		
	}

}
