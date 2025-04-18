package maventestng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelementandelements {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/");
		
		/*
		 * //Find element WebElement field = driver.findElement(By.id("ta1"));
		 * field.sendKeys("Jagu Sekhar");
		 */
		
		
		//Find elements
		
	List<WebElement> table = driver.findElements(By.xpath("//table[@id='table1']//tr"));
	
		System.out.println(table.size());
	}

}

