package Com.FB.QA.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.FB.QA.Base.TestBase;

public class FBloggedin extends TestBase {

	@FindBy(xpath="//div[text()='Messenger']")
	WebElement mess;
	
	@FindBy(id="userNavigationLabel")
	WebElement buticon;
	
	@FindBy(xpath="//span[text()='Log Out']")
	WebElement logout;
	
	public FBloggedin(){
		PageFactory.initElements(driver,this);
		}
	
	
	public void login() throws InterruptedException{
		
		mess.click();
		Thread.sleep(2000);
	}
	
	public void clickonbut(){
		buticon.click();
			}
	
	public void logout1(){
		logout.click();
			}
	
	
}
