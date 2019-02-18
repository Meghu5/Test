package Com.FB.QA.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.FB.QA.Base.TestBase;

public class FBLoginPage extends TestBase {

	
			
	//PagefACTORY-Object Repo
	
	//WebElement a=driver.findElement(By.id("email"));
	//WebElement b=driver.findElement(By.id("pass"));
	
	
	@FindBy(id="email")
	WebElement userid;
	
	@FindBy(id="pass")
	WebElement pwd;
	
	@FindBy(xpath="//input[@value='Log In']")
	WebElement submit;
	
	
	//initialise pagefactory elements
	
	/*public FBLoginPage(WebDriver driver){
		this.driver=driver;
	}*/
	
	public FBLoginPage(){
	PageFactory.initElements(driver,this);		
	}
	
		//Actions on web elements
	
	public String verifyloginpageTitle(){
		return driver.getTitle();
		        }
	
	public void verifylogin(String un,String pass){
		userid.sendKeys(un);
		pwd.sendKeys(pass);
		
				}
	public FBloggedin verifyclickingonsubmit(){
		 submit.click();
		 return new FBloggedin();
		 }
//should return the value of next nav page it should match the page in qa.pages
				
}
	
	

	
	
	
	
	
	

