package testngpack;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion1 {
  @Test
  public void actiTime() 
  {
	  Reporter.log("enter the url",true);
	  SoftAssert softassert = new SoftAssert();
	  softassert.assertEquals(false, true);
	  Reporter.log("verify the title of the login page",true);
	  Reporter.log("enter the username",true);
	  Reporter.log("enter the password",true);
	  
	  Reporter.log("click on login button",true);
	  Reporter.log("verify the home page",true);
	  Reporter.log("create user",true);
	  Reporter.log("delete user",true);
	  Reporter.log("create reports",true);
	  softassert.assertAll();
	 
  }
}
