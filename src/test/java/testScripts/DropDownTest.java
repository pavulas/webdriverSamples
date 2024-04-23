package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		
		Select singSel = new Select(driver.findElement(By.id("select-demo")));
		singSel.selectByValue("Monday");
		
		Select multiSel = new Select(driver.findElement(By.id("multi-select")));
		if(multiSel.isMultiple()) {
			multiSel.selectByIndex(1);
			multiSel.selectByValue("Texas");
			multiSel.selectByVisibleText("Washington");
		}
		List <WebElement> items = multiSel.getAllSelectedOptions();
		System.out.println("Number of items:"   +items.size());
		multiSel.deselectByIndex(1);
		WebElement option = multiSel.getFirstSelectedOption();
		System.out.println(option.getSize());

	}

}
