package Com.FB.QA.TestCases;


import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.FB.QA.Base.TestBase;
import Com.FB.QA.Pages.FBLoginPage;
import Com.FB.QA.Pages.FBloggedin;


public class FBPageLogout extends TestBase {

		FBLoginPage loginpage;
		FBloggedin loggedin;
	
	public FBPageLogout() throws IOException{
		super();
		}
	
	@BeforeMethod
	public void setup(){
		initialisation();
		loginpage=new FBLoginPage();
		loggedin=new FBloggedin();
		String un=prop.getProperty("un1");
		String pass=prop.getProperty("pass1");
		loginpage.verifylogin(un,pass);
		loggedin=loginpage.verifyclickingonsubmit();
		
			}
	
	//vinayaka srimatha
	
	
	@Test(priority=1)
public void fblogging(){
		try {
			Thread.sleep(10500);
			//loggedin.login();
			loggedin.clickonbut();
			loggedin.logout1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	
	
	
	
	
	
	
	
}
