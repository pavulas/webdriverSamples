package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationBookStorePageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationbookstore.dev/");
		
		driver.findElement(By.cssSelector("input[id='searchBar']")).sendKeys("Pranitha Avula");
		String strPlaceholder = driver.findElement(By.id("searchBar")).getAttribute("placeholder");
		System.out.println(strPlaceholder);
		
//		driver.findElement(By.id("searchBar")).clear();
		
		WebElement closeicon = driver.findElement(By.cssSelector("a[title='Clear text']"));
		
		System.out.println(closeicon.isDisplayed());
		
		
		if(closeicon.isDisplayed()) {
			closeicon.click();
		}
		

	}

}
