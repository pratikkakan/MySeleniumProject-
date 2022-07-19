package grouping;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class B {
  @Test(groups = {"regression", "sanity"})
  public void f() {
	  
	  System.out.println("cwjicw");
  }
  @BeforeMethod 
  
  public void beforeMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @BeforeTest(groups = {"regression"})
  public void beforeTest() {
	  System.out.println("XYZ");
  }
  

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite(groups= {"sanity"})
  public void beforeSuite() {
  System.out.println("1");
  }

}
