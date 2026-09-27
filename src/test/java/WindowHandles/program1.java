package WindowHandles;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.*;
import org.openqa.selenium.WebElement;

public class program1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Selenium (software)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Selenium disulfide']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Selenium in biology']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Selenium dioxide']")).click();
		Thread.sleep(2000);
		Set<String> windows_name=driver.getWindowHandles();
		List<String> al= new ArrayList(windows_name);
		for(String tst1: al)
		{
           String title_name=driver.switchTo().window(tst1).getTitle();
           System.out.println(title_name);
           if(title_name.equals("Selenium in biology - Wikipedia"))
           {
        	   driver.close();
           }
		}
	}

}
