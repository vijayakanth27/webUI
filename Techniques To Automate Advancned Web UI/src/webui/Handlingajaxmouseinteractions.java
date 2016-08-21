package webui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handlingajaxmouseinteractions {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssce\\Downloads\\SELENIUM FILES\\chromedriver.exe");
		
		
		WebDriver c=new ChromeDriver();
		
		
		c.manage().window().maximize();
		
		c.get("https://www.flipkart.com/");
		Actions f=new Actions(c);
		WebElement w=c.findElement(By.xpath("//*[@id='container']/div/header/div[2]/div/ul/li[1]/a/span"));
		f.moveToElement(w).build().perform();
		WebElement r=c.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[1]/div/input"));
		f.keyDown(Keys.SHIFT).moveToElement(r).sendKeys("motog").build().perform();
         f.moveToElement(w).build().perform();
         f.contextClick(r).build().perform();
	}

}
