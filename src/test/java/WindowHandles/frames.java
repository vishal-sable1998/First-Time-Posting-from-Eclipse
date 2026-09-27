package WindowHandles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement frame1=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(0); ////by using index number and xpath
		System.out.println(driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
		driver.switchTo().defaultContent();
		WebElement frame2=driver.findElement(By.id("frame2"));
		driver.switchTo().frame(1); //by using index number and xpath
		System.out.println(driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());

	}

}
