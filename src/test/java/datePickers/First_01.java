package datePickers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.*;

public class First_01 {

	public static void main(String[] args) {
		ChromeOptions opt= new ChromeOptions();
		
		opt.addArguments("--headless=new");
		
		
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://jqueryui.com/datepicker/");
		String date= "16";
		String month="April";
		String year= "2025";
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		
		monthAndYear(driver,month, year);
		dateSelect(driver, date);
		driver.close();
		
}
	public static void dateSelect(WebDriver driver, String date)
	{
		List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement dat: dates)
		{
			if(dat.getText().equals(date))
			{
				dat.click();
				break;
			}
		}
	}
	public static void monthAndYear(WebDriver driver,String month, String year)
	{
		while(true)   // Select year and month from the date picker
		{
		String month_UI=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
//		System.out.println(month_UI);
		String year_UI=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
//		System.out.println(year_UI);
		
		if(month_UI.equals(month) && year_UI.equals(year))
		  {
			break;
		  }
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}

}
}
