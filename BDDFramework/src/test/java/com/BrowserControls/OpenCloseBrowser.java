package com.BrowserControls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class OpenCloseBrowser extends BaseClass{
	
	@Before
	public void openBrowser() {
		if(browserType.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "../BDDFramework/src/test/java/com/Resources/chromedriver.exe");
			browser = new ChromeDriver();
			
		}else if(browserType.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "../BDDFramework/src/test/java/com/Resources/geckodriver.exe");
		}
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@After
	public void closeBrowser() {
		browser.quit();
		
	}

}
