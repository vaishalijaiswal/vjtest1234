package com.Test.group.NewTest;

import java.net.MalformedURLException;
import org.openqa.selenium.chrome.ChromeDriver;
import Common.DriverUtil;

public class TestBase extends DriverUtil
{

	

	public static void createNewSession() throws MalformedURLException {

		

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com");
		
	
	}
	

	

}


