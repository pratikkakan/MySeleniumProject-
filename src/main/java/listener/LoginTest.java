package listener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
  @Test
  public void firstmethod() {
	  
	  System.out.println("First Method Login O/P");
	  
	  Assert.assertEquals("Abc","Abc");
  }
  
  @Test
  public void secondmethod() {
	  
	  System.out.println("Second Method Login O/p");
	  
	  Assert.assertEquals("Abc", "Abcd", "Not match");
	
  }

  
  
  
}
