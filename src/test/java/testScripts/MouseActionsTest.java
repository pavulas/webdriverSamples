package testScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		driver.get("https://demo.opencart.com/");
	
//		WebElement srcbox = driver.findElement(By.id("search"));
//		actions.contextClick(srcbox).perform();
		
		WebElement menu = driver.findElement(By.xpath("//li[@class='nav-item dropdown']//a[text()='Components']"));
//		actions.moveToElement(menu).perform();
		
//		WebElement menu = driver.findElement(By.cssSelector("ul.nav.navbar-nav > li:nth-child(3)"));
//		actions.moveToElement(menu).perform();
		
		TakesScreenshot screen = (TakesScreenshot)driver;
		File srcImg = screen.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "/screenshots/" + System.currentTimeMillis() + ".png";
		FileUtils.copyFile(srcImg, new File(path));
		
		WebElement menuitem = driver.findElement(By.xpath("//ul[@class='list-unstyled']//a[text()='Mice and Trackballs (0)']"));
//		actions.click(menuitem).perform();
		
		actions.moveToElement(menu).click(menuitem).build().perform();
		
		

	}

}
