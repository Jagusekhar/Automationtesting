package maventestng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Javascriptexecuter {
	@Test
	public void testLaunchBrowser() {

		
		WebDriver driver= new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		
		
		WebElement inbox=driver.findElement(By.id("name"));

		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// send keys method
		js.executeScript("arguments[0].setAttribute('value','Jagu')",inbox);
		// arguemnets is elements, executeScript is method.
		
		//clicking button
		WebElement button = driver.findElement(By.xpath("//input[@id='sunday']"));
		js.executeScript("arguments[0].click()",button);
		
		WebElement select =  driver.findElement(By.xpath("(//input[@type='checkbox'])[8]"));
		js.executeScript("arguments[0].click()", select);
		System.out.println("Javascript Passed");
		driver.quit();
		
}
}