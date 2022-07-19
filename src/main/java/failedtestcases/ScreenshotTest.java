package failedtestcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenshotTest  extends BASE{
	
	
  @BeforeMethod
  public void SetUp() {

	  ScreenshotTest.initialisation();
  }
  
  
  @AfterMethod

  public void teardown() {

	  driver.quit();
	  
  }
  
  @Test
  public void AssertTest() {
	  
	  Assert.assertEquals(true, false);
	 
  }
  
  
}
