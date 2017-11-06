package com.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Test11 {
	public WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void launchAPP(String browser){
		if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "./Driver1/geckodriver.exe");
			driver = new FirefoxDriver();
	}

	else if(browser.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "./Driver1/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
		driver.get("https://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	@AfterMethod
	public void closeAPP(){
		driver.quit();
	}
}
