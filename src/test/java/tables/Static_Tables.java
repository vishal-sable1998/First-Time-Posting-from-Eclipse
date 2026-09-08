package tables;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Static_Tables {

	public static void main(String[] args) {

     WebDriver driver = new ChromeDriver();
     driver.get("https://testautomationpractice.blogspot.com/");
     driver.manage().window().maximize();
     int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
     int cols= driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();
     System.out.println(rows);
     System.out.println(cols);
     
     System.out.println(driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[3]")));
     
		/*
		 * for(int i=2; i<=rows; i++) { for(int j=1; j<=cols; j++) { String
		 * tst=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+
		 * j+"]")).getText(); System.out.println(tst);
		 * 
		 * } }
		 */
     for(int i=2; i<=rows; i++)
     {
    	String name= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]")).getText();
    	if(name.equals("Mukesh"))
    	{
    		String book_name=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText();
    		System.out.println(book_name);
    	}
     }
     

	}

}
