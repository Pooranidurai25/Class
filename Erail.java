package week4day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args)
	
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://erail.in/");

		driver.findElement(By.id("chkSelectDateOnly")).click();
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MAS", Keys.ENTER);
		
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("sikkim", Keys.ENTER);

	}

}
