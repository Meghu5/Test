package Com.FB.QA.Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dummy {
		public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver b=new ChromeDriver();
		b.get("https://www.facebook.com");
		WebElement a1=b.findElement(By.id("email"));
		a1.sendKeys("user");
		WebElement b1=b.findElement(By.id("pass"));
		b1.sendKeys("user1");
		
		
		try {
			FileInputStream fis=new FileInputStream("D:\\New folder (2)\\Test\\src\\main\\java\\Com\\FB\\QA\\Config\\Configuration.Properties");
				prop.load(fis);
		
			String a=prop.getProperty("browser");
				System.out.println(a);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}	
		

	
}
