package webui;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingmultiplewindows {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssce\\Downloads\\SELENIUM FILES\\chromedriver.exe");
		
		
		WebDriver c=new ChromeDriver();
		
		
		c.manage().window().maximize();
		
		//c.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&ltmpl=default");
		c.get("http://www.indeed.com/");
		
		c.findElement(By.xpath("//*[@id='what']")).sendKeys("selenium tester");
		
		//c.findElement(By.linkText("Learn more")).click();
		
		c.findElement(By.id("fj")).click();
		
		System.out.println(c.getTitle());
		
		c.findElement(By.xpath("//*[@id='sja1']")).click();
		
		Set<String>Ids= c.getWindowHandles();
		
	Iterator<String> i=Ids.iterator();
	
	String parentid=i.next();
	String childid=i.next();
	
	c.switchTo().window(childid);
	
	System.out.println(c.getTitle());
		
	c.switchTo().window(parentid);
	
	System.out.println(c.getTitle());
	
	}

}
