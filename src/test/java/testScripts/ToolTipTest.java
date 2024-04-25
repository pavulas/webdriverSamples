package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		driver.get("https://jqueryui.com/tooltip/");
		
		//Switch from mainpage to frame
		driver.switchTo().frame(0);
		
		WebElement txtbox = driver.findElement(By.id("age"));
		txtbox.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		actions.moveToElement(txtbox).perform();
		String strtext = driver.findElement(By.xpath("//div[@class='ui-tooltip-content']")).getText();
		System.out.println(strtext);
		
		txtbox.sendKeys("20");
		
		

	}

}
