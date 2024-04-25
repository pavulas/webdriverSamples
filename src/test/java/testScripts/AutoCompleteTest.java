package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteTest {
	
    public static final String expValue = "BASIC";
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/autocomplete/");
		
		//Switch from main page to frame
		driver.switchTo().frame(0);
		WebElement tagbox = driver.findElement(By.id("tags"));
		tagbox.sendKeys("a");
		Thread.sleep(3000);
		
		List <WebElement> items = driver.findElements(By.xpath("//li[@class='ui-menu-item']//following-sibling::li"));
		System.out.println("Number of items:" +items.size());
		
		for (WebElement item : items) {
			//To get the text of each item
			
			System.out.println(item.getText());
			// TO select expected value
			if(item.getText().equalsIgnoreCase(expValue)) {
				item.click();
				break;
			}
		}
	}

}
