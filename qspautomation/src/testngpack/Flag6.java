package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
  @Test(groups = "FUNCTIONAL")
  public void ft1()
  {
	  Reporter.log("Function tast case 1",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void it1()
  {
	  Reporter.log("Integration tast case 1",true);
  }
  
  @Test(groups = "SMOKE")
  public void st1()
  {
	  Reporter.log("Smoke tast case 1",true);
  }
  
  //-----------------------------------------------------------------------------------
  
  @Test(groups = "FUNCTIONAL")
  public void ft2()
  {
	  Reporter.log("Function tast case 2",true);
  }
  
  @Test(groups = "FUNCTIONAL")
  public void it2()
  {
	  Reporter.log("Function tast case 2",true);
  }
  
  @Test(groups = "FUNCTIONAL")
  public void st2()
  {
	  Reporter.log("Function tast case 2",true);
  }
  
  //------------------------------------------------------------------------------------
  
  @Test(groups = "FUNCTIONAL")
  public void ft3()
  {
	  Reporter.log("Function tast case 3",true);
  }
  
  @Test(groups = "FUNCTIONAL")
  public void it3()
  {
	  Reporter.log("Function tast case 3",true);
  }
  
  @Test(groups = "FUNCTIONAL")
  public void st3()
  {
	  Reporter.log("Function tast case 3",true);
  }
  
  //-----------------------------------------------------------------------------------
  
  @Test(groups = "FUNCTIONAL")
  public void ft4()
  {
	  Reporter.log("Function tast case 4",true);
  }
  
  @Test(groups = "FUNCTIONAL")
  public void it4()
  {
	  Reporter.log("Function tast case 4",true);
  }
  
  @Test(groups = "FUNCTIONAL")
  public void st4()
  {
	  Reporter.log("Function tast case 4",true);
  }
  
  //------------------------------------------------------------------------------------
  
  @Test(groups = "FUNCTIONAL")
  public void ft5()
  {
	  Reporter.log("Function tast case 5",true);
  }
  
  @Test(groups = "FUNCTIONAL")
  public void it5()
  {
	  Reporter.log("Function tast case 5",true);
  }
  
  @Test(groups = "FUNCTIONAL")
  public void st5()
  {
	  Reporter.log("Function tast case 5",true);
  }
  
  //------------------------------------------------------------------------------------
 
  @Test(groups = "FUNCTIONAL")
  public void ft6()
  {
	  Reporter.log("Function tast case 6",true);
  }
  
  @Test(groups = "FUNCTIONAL")
  public void it6()
  {
	  Reporter.log("Function tast case 6",true);
  }
  
  @Test(groups = "FUNCTIONAL")
  public void st6()
  {
	  Reporter.log("Function tast case 6",true);
  }
}

