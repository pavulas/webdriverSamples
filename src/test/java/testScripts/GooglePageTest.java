package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GooglePageTest {

	public static void main(String[] args) {
		//ChromeOptions options = new ChromeOptions();
		//options.setBrowserVersion("115");
		//WebDriver driver = new ChromeDriver(options);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Page title :  " + driver.getTitle());
		WebElement searchbox = driver.findElement(By.id("APjFqb"));
		searchbox.sendKeys("Pranitha Avula");
		searchbox.sendKeys(Keys.ENTER);
		//WebElement namepage = driver.findElement(By.className("LC20lb MBeuO DKV0Md"));
		//searchbox.sendKeys(Keys.ENTER);
		System.out.println("Page title :  " + driver.getTitle());

	}

}
