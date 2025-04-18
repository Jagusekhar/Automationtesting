/**
 * 
 */
package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author HP
 *
 */
public class Loginpage {

	WebDriver driver;
	//Locators
	By username = By.xpath("//input[@id='user-name']");
	By password = By.xpath("//input[@id='password']");
	By login = By.xpath("//input[@id='login-button']");

	//constructor - name should be class

	public Loginpage(WebDriver driver)
	{

		this.driver=driver;
	}

	//methods

	public void username()
	{

		driver.findElement(username).sendKeys("standard_user");

	}

	public void password()
	{
		driver.findElement(password).sendKeys("secret_sauce");
	}

	public void Login()
	{
		driver.findElement(login).click();
	}

}