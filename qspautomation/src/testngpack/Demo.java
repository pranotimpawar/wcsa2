package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void a() {
	  
	  Reporter.log("Hi I am from method a",true);
  }
}
