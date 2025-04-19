/**
 * 
 */
package com.wordpress.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.Loginpage;

/**
 * @author HP
 *
 */
public class Testcases {
	
	@Test
	public void verifylogin()
	
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		Loginpage loginwebsite = new Loginpage(driver);
		
		loginwebsite.username();
		loginwebsite.password();
		loginwebsite.Login();
		
		
	System.out.println("Pom Passed");
	driver.quit();
	
	}

}
