package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopupTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/Windows.php");
		
		String parentwin = driver.getWindowHandle();
		System.out.println("Parent Win: "  +parentwin);
		
		WebElement frstitem = driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]"));
		frstitem.click();
		System.out.println(driver.getWindowHandle());
		
		Set<String> tabs = driver.getWindowHandles();
		for (String child:tabs) {
			if(!child.equalsIgnoreCase(parentwin)) {
				driver.switchTo().window(child);
				System.out.println("ChildWin:" +child);
			}
		}
		
		System.out.println(driver.getWindowHandle());
		Thread.sleep(3000);
	    driver.close();
	    driver.switchTo().window(parentwin);
	    Thread.sleep(4000);
	    driver.switchTo().newWindow(WindowType.TAB);
	    driver.navigate().to("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
	    Thread.sleep(5000);
	    driver.quit();
		
		
		

	}

}
