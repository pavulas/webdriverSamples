package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://accounts.lambdatest.com/register");
		
//		driver.findElement(By.xpath("//div[@class='error__border w-full custom__border xls:mt-20 mt-10']//input[@id='email']")).sendKeys("avulapranitha555@gmail.com");
//    	driver.findElement(By.xpath("//div[@class='w-full custom__border xls:mt-20 mt-10']//input[@id='userpassword']")).sendKeys("Pranitha@26");
		
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("avulapranitha555@gmail.com");
		driver.findElement(By.xpath("//input[@id='userpassword']")).sendKeys("Pranitha@26");
		driver.findElement(By.xpath("//button[contains(text(),'SIGN UP')]")).click();
	}

}
