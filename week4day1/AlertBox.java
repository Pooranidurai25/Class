package week4day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertBox {

	public static void main(String[] args) throws InterruptedException

	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		//find the element
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		// move to alert message box
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);
		// click ok of the simple alert
		alert.accept();
		// find the element
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		// click cancel 
		alert.dismiss();
		
		 String text = driver.findElement(By.id("result")).getText();
		 System.out.println(text);
	

		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		alert.sendKeys("done");
		Thread.sleep(2000);
		alert.accept();

	}
}
