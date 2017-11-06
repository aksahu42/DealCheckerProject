package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Test2 extends Test1 {
  
	@Test
  	public void run() throws Exception {
  
	driver.findElement(By.name("q")).sendKeys("Selenium");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
	
	Thread.sleep(5000);
	}
}
