package testScripts;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableSortSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		
		//To fetch the details of an employee
		
		List <WebElement> items = driver.findElements(By.xpath("//td[text()='A. Cox']//following-sibling::td"));
		System.out.println("Number of items:"   +items.size());
		for (WebElement cell : items) {
			System.out.println(cell.getText());
		}
		
		//To fetch the salary of an employee
	     WebElement salary = driver.findElement(By.xpath("//td[text()='A. Ramos']//following-sibling::td[5]"));
	     System.out.println(salary.getText());
	}
}

