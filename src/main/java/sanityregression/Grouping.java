package sanityregression;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Grouping {

	@Test(groups = {"sanity"} , invocationCount = 3)
	public void test1() {
		System.out.println("this is a sanity test");
		
		
	}
	
	@Test(groups ={"regression"}, priority =-1)
	public void test2() {
		System.out.println("this is a regression test");
		
		
	}
	
	@Test(groups = {"sanity ,regression"})
	public void test3() {
		
		System.out.println("this is both sanity and regresion");
		
	}
	

	
	
}
