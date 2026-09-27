package WindowHandles;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class first {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		WebElement elm=driver.findElement(By.xpath("//button[@id='tabButton']"));
		System.out.println(elm.getText());
		elm.click();
		Set<String> allWindow=driver.getWindowHandles();
		for(String str:allWindow)
		{
			if(!str.equals(parentWindow))
			{
				driver.switchTo().window(str);
				WebElement elm2=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
				System.out.println(elm2.getText());
			}
		}
		driver.switchTo().window(parentWindow);
	}
}
