package week4day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectMyntra {

	public static void main(String[] args) throws IOException, InterruptedException

	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		// to perform actions using action methods
		Actions builder = new Actions(driver);

		WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));

		/*
		 * ChromeOptions options =new ChromeOptions();
		 * options.addArguments("---disable-notifications"); ChromeDriver driver1 = new
		 * ChromeDriver(options);
		 */
		builder.moveToElement(men).perform();

		driver.findElement(By.xpath("//ul[@class='desktop-navBlock']/li[7]/a")).click();

		String jacketscount = driver.findElement(By.xpath("//span[@class='title-count']")).getText();

		System.out.println("Totalcount " + jacketscount);

		// taking only the count

		String substring = jacketscount.substring(3, 7);
		// convert string to int
		int parseInt = Integer.parseInt(substring);

		System.out.println("Converted to Int " + parseInt);

		String text = driver.findElement(By.xpath("//span[@class='categories-num']")).getText();
		String substring2 = text.substring(1, 5);
		int parseInt2 = Integer.parseInt(substring2);
		System.out.println("Jackets " + parseInt2);

		String text2 = driver.findElement(By.xpath("(//span[@class='categories-num'])[2]")).getText();
		String substring3 = text2.substring(1, 3);
		int parseInt3 = Integer.parseInt(substring3);
		System.out.println("Rain Jackets " + parseInt3);

		// Total jackets
		int total = parseInt2 + parseInt3;
		System.out.println("Total " + total);

		if (total == parseInt) {
			System.out.println("matched");
		}
		else
		{System.out.println("not matched");}
		
		
		driver.findElement(By.xpath("(//div[@class=\"common-checkboxIndicator\"])[1]")).click();

		driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		
		driver.findElement(By.className("FilterDirectory-searchInput")).sendKeys("Duke");
		
		driver.findElement(By.xpath("(//label[@class=' common-customCheckbox']//div)")).click();
		
		//Close the popup
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
		
		
		List<WebElement> brand = driver.findElements(By.xpath("//h3[text()='Duke']"));
		for (WebElement duke : brand) 
		{
			System.out.println(duke.getText());
			
		}
		
		//sort by mousehover
		Actions build =new Actions(driver);
		
		WebElement drpdwn = driver.findElement(By.xpath("//div[@class='sort-sortBy']"));
		build.moveToElement(drpdwn).perform();
		//drpdwn.wait(1000);
		driver.findElement(By.xpath("//label[@class='sort-label ']")).click();
		
		//find first displayed item
		
		WebElement price = driver.findElement(By.xpath("//span[@class='product-discountedPrice']"));
		System.out.println(price.getText());
		
		driver.findElement(By.xpath("(//h4[text()='Men Solid Bomber Jacket'])")).click();
		
		// switch to new window
		
		Set<String> newwin= driver.getWindowHandles();
		System.out.println(newwin.size());
		for (String string : newwin) 
		{
			System.out.println(string);
		}
		
		List<String> list= new ArrayList<String>(newwin);
		
		driver.switchTo().window(list.get(1));
		
		//screeenshot
		
		File s1 = driver.getScreenshotAs(OutputType.FILE);
		File dest =new File("./snaps/1.png");
		FileUtils.copyFile(s1, dest);
		
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-notWishlistedIcon sprites-notWishlisted pdp-flex pdp-center ']")).click();
		
		driver.quit();
		
		
		
		
		
		

	}

}
