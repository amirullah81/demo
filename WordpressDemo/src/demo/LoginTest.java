package demo;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import reader.ReadData;
import util.BrowserFactory;

public class LoginTest {

	ReadData readExcelData = new ReadData();
	
	@Test
	public void loginTest() throws IOException{
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://demosite.center/wordpress/wp-login.php?loggedout=true");
				
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		String logIndata[][] = readExcelData.getLogInDataFromExcelFile();

		/*
		String userName = null,pass = null;
		 for (int j = 1; j < logIndata.length; j++) {
	            for (int k = 0; k < logIndata[j].length; k++) {
	                userName = logIndata[j][0];
	                pass = logIndata[j][k];
	            }
		
		loginPage.login_demo(userName, pass);
	}*/
	
		loginPage.login_demo("admin", "demo123");
		
	}
}
