package mavenpom.Mvnwithpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class CheckValidUserTest {
	
	@Test
	public void verifyvaliduser() throws InterruptedException {
		
		WebDriver driver=BrowserFactory.startBrowser("chrome","https://www.facebook.com/");
		
		System.out.println("browser executed successfully...");
		//WebDriver driver=BrowserFactory.startBrowser("firefox","https://www.facebook.com/");
		
		//WebDriver driver=BrowserFactory.startBrowser("ie","https://www.facebook.com/");
		
		
		LoginPage loginpage=PageFactory.initElements(driver,LoginPage.class);
		System.out.println("loginpage executed successfully...");
		
		
		loginpage.Loignvalid("9393607606","Chaitanya.1432001@");
		Thread.sleep(1000);
		
		driver.close();
		System.out.println("succesfully logout....");
	}

}
