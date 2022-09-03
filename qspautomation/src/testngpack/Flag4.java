package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
  @Test
  public void actiTimeLogin()
  {
	  int i=9/0;
	  System.out.println();
	  Reporter.log("Login successful",true);
	  	  
  }
  
  @Test(dependsOnMethods = "actiTimeLogin" )
  public void actiTimeCreateUser()
  {
	  int i=9/0;
	  System.out.println();
	  Reporter.log("Create user",true);
	  	  
  }
  
  @Test(dependsOnMethods = "actiTimeCreateUser" )
  public void actiTimeLogout()
  {
	  int i=9/0;
	  System.out.println();
	  Reporter.log("Logout sccessful",true);
	  	  
  }
}
