package Learning;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class First_2007 {

	public static void main(String[] args) {
		
		ChromeOptions opt= new ChromeOptions();
		opt.addExtensions(new File("tyeyr"));
		opt.addArguments("--Incognito");
		opt.addArguments("--disable-notifications");
		opt.addArguments("--headless=new");
		opt.addArguments("--load-extension=path");
		opt.addArguments("--start-maximized");
		opt.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.sbilife.co.in/");  
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		WebElement elem=driver.findElement(By.xpath("//input[@class='form-control search-bar-keywords-input']"));
		elem.sendKeys("Hi");
		Actions a = new Actions(driver);
		/*
		 * a.keyDown(Keys.CONTROL).sendKeys("A").perform();
		 * driver.switchTo().newWindow(WindowType.WINDOW); // new window will means new browser instance open of same browser
		 * driver.switchTo().newWindow(WindowType.TAB); // new tab is open in current browser
		 */
		
		a.moveToElement(elem).perform();
		a.doubleClick(driver.findElement(By.xpath("//button[@class='search-bar-submit-button']"))).perform();
		a.contextClick(elem).perform();
		

	}

}
