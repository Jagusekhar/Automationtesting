package maventestng;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Capturescreenshot {
	
	
	
	@Test
	public void screenshot() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		//Cast the WebDriver instance to TakesScreenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		// Get the screenshot as a file
		File source = ts.getScreenshotAs(OutputType.FILE);		
		
		//Copy the screenshot to the destination file
		FileUtils.copyFile(source, new File("C:\\Users\\pc\\Downloads\\screenshots\\test3.png"));
		
		System.out.println("Take screenshot");
		driver.quit();
		
	
	}

}
