package com.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Test1 {
	public WebDriver driver;
	
	
	@BeforeMethod
	public void launchAPP(){
		
		System.setProperty("webdriver.gecko.driver", "./Driver1/geckodriver.exe");
		driver = new FirefoxDriver();
	
		driver.get("https://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	@AfterMethod
	public void closeAPP(){
		driver.quit();
	}
}
