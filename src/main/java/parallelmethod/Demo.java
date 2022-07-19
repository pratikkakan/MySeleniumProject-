package parallelmethod;

import org.testng.annotations.Test;

public class Demo {
	
	
  @Test
  public void first() {
	  
	  Long id =Thread.currentThread().getId();
		
		System.out.println("Test is successful using" +"thread id" +id);
	}
  
  
  @Test
  public void second() {
	  
	  Long id =Thread.currentThread().getId();
		
		System.out.println("Test is successful using" +"thread id" +id);
	}
  
  
  @Test
  public void third() {
	  
	  Long id =Thread.currentThread().getId();
		
		System.out.println("Test is successful using" +"thread id" +id);
	}
  
  
  @Test
  public void fourth() {
	  
	  Long id =Thread.currentThread().getId();
		
		System.out.println("Test is successful using" +"thread id" +id);
	}
  
  
  
  
  
  
  
  }
