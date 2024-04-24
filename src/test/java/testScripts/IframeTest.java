package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		//Switch from main page to frame1
		driver.switchTo().frame(0);
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		textbox.sendKeys("Pranitha Avula");
		
//		Switch from frame1 to frame3
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
//		Switch from frame3 to frame1
		driver.switchTo().parentFrame();
		textbox.clear();
		textbox.sendKeys("Suzaad Ahamed");
		
//		Switch from frame1 to mainpage
		driver.switchTo().defaultContent();
		WebElement text = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
		System.out.println(text.getText());
		
//		Switch from mainpage to frame2
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//select[@id='animals']//option[text()='Big Baby Cat']")).click();
		
		
		

	}

}
