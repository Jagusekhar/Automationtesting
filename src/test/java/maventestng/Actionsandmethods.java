package maventestng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsandmethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/");


		//mouse
		Actions actions = new Actions(driver);

		WebElement menublog = driver.findElement(By.id("blogsmenu"));
		actions.moveToElement(menublog).perform();
		WebElement submenu = driver.findElement(By.xpath("//span[normalize-space()='SeleniumByArun']"));
		actions.moveToElement(submenu).click().build().perform();


		//Keyboard

		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("amotooricap1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		actions.sendKeys(Keys.ENTER).perform();



	}



}
