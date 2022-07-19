package mypomscript;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HustelPom1 {
	
	WebDriver driver;

	@FindBy(xpath="//input[@placeholder='First Name']")
    WebElement FirstName;
	
    @FindBy(xpath="//input[@placeholder='Last Name']")
    WebElement  SecondName;

    @FindBy(xpath="//textarea[contains(@ng-model,'Adress')]")
    WebElement Adress;

    @FindBy(xpath="//input[@type='email']")
    WebElement Email;

    @FindBy(xpath="//input[@type='tel']")
    WebElement Phone;
    
    @FindBy(xpath="//input[@type='radio']")
    List<WebElement> Gender ;
    
    @FindBy(xpath="//input[@type='checkbox']")
    List<WebElement> Hobbies;
    
    @FindBy(xpath="//div[@id='msdd']")
    WebElement Language ;
    
    @FindBy(xpath="//select[@id='Skills']")
    WebElement SkillTab;  //use select class
    
    @FindBy(xpath="//select[@id='Skills']/option")		
    List <WebElement> allskill;
//    
//    @FindBy(xpath=)
//    WebElement ;
//    
//    @FindBy(xpath=)
//    WebElement ;
//    
//    @FindBy(xpath=)
//    WebElement ;
//    
//    @FindBy(xpath=)
//    WebElement ;
//    
//    @FindBy(xpath=)
//    WebElement ;
//    
//    @FindBy(xpath=)
//    WebElement ;
//    
//    @FindBy(xpath=)
//    WebElement ;
//    
//    @FindBy(xpath=)
//    WebElement ;
//    
//    @FindBy(xpath=)
//    WebElement ;
//    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    public HustelPom1(WebDriver driver) {
    
    PageFactory.initElements(driver,this);
    	
    }
    
    
    
    
    
    
    
    
}
    
    	
    
    
    
    
    
    
    
    
	



	

