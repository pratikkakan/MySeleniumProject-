package mypomscript;

import java.util.List;

import org.apache.hc.client5.http.impl.classic.MainClientExec;
import org.apache.log4j.chainsaw.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HustlePom2 extends HustelPom1 {
	
	 WebDriver driver;

	public HustlePom2(WebDriver driver) {
		super(driver);

	}

	public void SendData() {

		FirstName.sendKeys("Pratik");
		SecondName.sendKeys("Kakan");
		Adress.sendKeys("Yashvin Society By Vilas Javadekar, A - 1103, Sus Baner, Pune");
		Email.sendKeys("pratikkakan123@gmail.com");
		Phone.sendKeys("8805888292");
	}

	public void GenderData() {

		List<WebElement> gd1 = Gender;
		for (WebElement gd2 : gd1) {

//			if (gd2.getAccessibleName().equals("Male")) {
//
//				gd2.click();
//				continue;
//			}

		}

	}

	public void HobbiesData() {

		List<WebElement> list = Hobbies;

		for (WebElement Rlist : list) {

			if (Rlist.getAttribute("value").equals("Cricket") || Rlist.getAttribute("value").equals("Hockey")) {

				Rlist.click();
				continue;

			}

		}

	}

//	public void LanguageData() {
//
//		Language.click();
//		
//		List<WebElement> LangList = driver.findElements(By.xpath("//li[@class=\"ng-scope\"]"));
//		
//		Actions act = new Actions(driver);
//		 
//		for(WebElement RLang : LangList ) {
//			
//			if(RLang.getText().equals("English")){	
//			
//			act.doubleClick(RLang).perform();
//							
//			}
//			
//		}
//		
//	}
	
	
		public void skilldata() {
			
			SkillTab.click();
			
			for(WebElement Rskils : allskill) {
				
				if(Rskils.getText().equals("SQL")) {
					
					Rskils.click();
					continue;
				}
				
			}
			
			
		}
	
	
	
	
	
	

}
