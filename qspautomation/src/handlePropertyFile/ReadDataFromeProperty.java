package handlePropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromeProperty {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./data/config.property");
		
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty("browser");
		System.out.println(value);
		
	}
	
}
