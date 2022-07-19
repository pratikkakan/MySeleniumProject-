package asserts;

import org.apache.hc.core5.util.Asserts;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;

public class Assertion {
	
	//hardassert
  @Test
  public void first() {
	  
	  String expected = "YO";
	  String actual = "YOO";
	  
	  System.out.println("First Print");
	  
	  Assert.assertEquals(expected,actual);
	  
	  System.out.println("Final print");
			  
	  
	
	  
	  //soft assert
	
//	  SoftAssert obj = new SoftAssert();
//	  
//	  obj.assertEquals(actual, expected, "failed");
//	  
//	  System.out.println("Final print");
	  
  }
  
  
  
}
