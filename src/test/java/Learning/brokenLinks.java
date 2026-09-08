package Learning;

import org.openqa.selenium.chrome.ChromeDriver;
import java.net.URL;
import java.net.HttpURLConnection;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class brokenLinks {

	public static void main(String[] args)  {
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		int validLink=0;
		int invalidLink=0;
		for(WebElement ele: li)
		{
			String hrefattValue=ele.getAttribute("href");
			if(hrefattValue == null || hrefattValue.isEmpty())
			{
				System.out.println("Given link are not complted");
				continue;
			}
			try {
			@SuppressWarnings("deprecation")
			URL linkURL=new URL(hrefattValue); 
			HttpURLConnection connection=(HttpURLConnection) linkURL.openConnection();
			connection.connect();
			
			if(connection.getResponseCode() >= 400)
			{
				System.out.println("Broken Links");
				validLink++;
			}
			else
			{
				System.out.println("Not a broken link");
				invalidLink++;
			}
			}
			catch(Exception e)
			{
				
			}
		}
		System.out.println(validLink);
		System.out.println(invalidLink);

	}

}
