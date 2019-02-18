package Com.FB.QA.TestCases;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Com.FB.QA.Base.TestBase;
import Com.FB.QA.Pages.FBLoginPage;
import Com.FB.QA.Pages.FBloggedin;

public class LoginPageTest extends TestBase {

		FBLoginPage loginpage;
		FBloggedin loggedin;
	
	public LoginPageTest() throws IOException{
		super();
		}
	
	@BeforeMethod
	public void setup(){
		initialisation();
		loginpage=new FBLoginPage();
		loggedin=new FBloggedin();
			}
	
	@Test(priority=1, alwaysRun=true)
	public void LoginPageTitleTest(){
		String title=loginpage.verifyloginpageTitle();
		String Exp="Facebook – log in or sign up";
		Assert.assertEquals(title,Exp,"title not matched");
		}
	
		@Test(priority=2, alwaysRun=true)
	public void logintest(){
		String un=prop.getProperty("un1");
		String pass=prop.getProperty("pass1");
		loginpage.verifylogin(un,pass);
			}
	
	@Test(priority=5, alwaysRun=true)
	 public void clickTest(){
		loginpage.verifyclickingonsubmit();
				}
	//vinayaka srimatha
	
	@Test(priority=0)
	
	public FBloggedin fblogin(){
		
		String un=prop.getProperty("un1");
		String pass=prop.getProperty("pass1");
		loginpage.verifylogin(un,pass);
		loginpage.verifyclickingonsubmit();
		return new FBloggedin();
		
	}	
public void fblogging(){
		try {
			loggedin.login();
			loggedin.clickonbut();
			loggedin.logout1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	
	
	
	
	
	
	
	
}
