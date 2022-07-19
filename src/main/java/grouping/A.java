package grouping;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;

public class A {
  @Test
  public void f() {
  }
  @AfterMethod(groups = {"regression"})
  public void afterMethod() {
  }

  @BeforeClass(groups = { "sanity"})
  public void beforeClass() {
	  System.out.println("In between");
  }

  @AfterClass(groups = {"regression", })
  public void afterClass() {
	  System.out.println("middle");
  }

  @AfterSuite(groups = {"regression", "sanity"})
  public void afterSuite() {
	  
	  System.out.println("Last");
  }

}
