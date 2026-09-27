package WindowHandles;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class second {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement elm=driver.findElement(By.xpath("//button[@id='windowButton']"));
		elm.click();
		String parentWindow=driver.getWindowHandle();
		Set<String> allWindow= driver.getWindowHandles();
		for(String str: allWindow)
		{
			if(!parentWindow.equals(str))
			{
				driver.switchTo().window(str);
				System.out.println("From child");
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.close();
				System.out.println("Child ENds");
			}
		}
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());//switch back to parent window

	}

}
