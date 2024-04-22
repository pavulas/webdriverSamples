package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HYRTutorialBasicControls {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		
		driver.findElement(By.id("firstName")).sendKeys("Pranitha");
		driver.findElement(By.id("lastName")).sendKeys("Avula");
		driver.findElement(By.xpath("//input[@id='femalerb']")).click();
		
		WebElement checkbx = driver.findElement(By.xpath("//input[@id='chinesechbx']")); 
		checkbx.click();
		WebElement checkbx1 = driver.findElement(By.xpath("//input[@id='spanishchbx']"));
		checkbx1.click();
		
		if(checkbx.isSelected()) {
			driver.findElement(By.xpath("//input[@id='chinesechbx']")).click();
		}
		driver.findElement(By.id("registerbtn")).click();
		
		driver.findElement(By.xpath("//label[@id='msg']")).click();
		
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();
	}

}
