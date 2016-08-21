package webui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowtohandleFrames {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssce\\Downloads\\SELENIUM FILES\\chromedriver.exe");
		
		
		WebDriver c=new ChromeDriver();
		
		
		c.manage().window().maximize();
		
		c.get("https://netbanking.hdfcbank.com/netbanking/");

		System.out.println(c.getPageSource());
		
		c.switchTo().frame(1);
		
		c.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td[2]/span")).sendKeys("vijay");
	
		
	
	}

}
