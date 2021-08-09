package week4day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framesalert {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		//implicitly wait is used to wait till the action performed so that
		//nosuch element exception can be avoided due to network issues
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// switch to frames
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		String text = driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
		
		System.out.println(text);
		

		
	
		
		
	}

}
