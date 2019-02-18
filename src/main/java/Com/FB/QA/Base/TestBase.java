package Com.FB.QA.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Com.FB.QA.Util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
		
		prop=new Properties();
				
		try {
			FileInputStream fis=new FileInputStream("D:\\New folder (2)\\Test\\src\\main\\java\\Com\\FB\\QA\\Config\\Configuration.Properties");
				try {
					prop.load(fis);
				} catch (IOException e) {
				e.printStackTrace();
				}
		String a=prop.getProperty("Url");
				System.out.println(a);
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		}	
	
	public static void initialisation(){
		String BrowserName=prop.getProperty("browser");
					
		if(BrowserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
				driver=new ChromeDriver();
		}
		if(BrowserName.equals("ff")){
			driver=new FirefoxDriver();
				}
		
		driver.get(prop.getProperty("Url"));
		//	driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_load_Timeout,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.implictwait,TimeUnit.SECONDS);

			
		 
		
	}
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


