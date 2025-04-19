package maventestng;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Elementpresent {

	@Test
	public void present() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/");
		
		try {
			boolean button = driver.findElement(By.id("bu11t2")).isDisplayed();
			
			if (button) {
				System.out.println("button present");
			}
			
			
		} catch (NoSuchElementException e) {
		
			System.out.println("button not present");
		}
		
		System.out.println("elementpresent Passed");
		driver.quit();
		
	}

}
