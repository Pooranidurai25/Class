package week4day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/table.html");
		// locate the table
		driver.findElement(By.xpath("//table[@id='table_id']"));
		
		// count of the columns
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='table_id']//tr[1]//th"));
		
		System.out.println("col count "+ cols.size());
		
		//count the rows
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table_id']//tr"));
		System.out.println("rowcount " + rows.size());
		
		// get the text wth relationxpath
		
		WebElement checkbox = driver.findElement(By.xpath("//td[text()='Learn to interact with Elements']/following-sibling::td"));
		System.out.println(checkbox.getText());
		
		// to select a check box by fnding it collecting column details with relation based xpath
		
		List<Integer> tasklist=new ArrayList<Integer>();
		
		List<WebElement> vital = driver.findElements(By.xpath("table[@id='table_id']//tr//td[2]")); 
		
		for (int i = 0; i < vital.size(); i++) 
		{
			String text = vital.get(i).getText();
//			System.out.println(text);
					String replaceAll = text.replaceAll("%", "");
				//	System.out.println(replaceAll);
					int parseInt = Integer.parseInt(replaceAll);
				//	System.out.println(parseInt);
					// add to the list
					tasklist.add(parseInt);
				}
		Integer min = Collections.min(tasklist);
		System.out.println(" Minimum value :" + min);
		
		driver.findElement(By.xpath("//td[contains(text(),"+min+")]/following-sibling::td/input")).click();
		}
		
		
		
	}


