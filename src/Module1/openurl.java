package Module1;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class openurl {
//test 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exepath = "F:\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exepath);
		 
		  WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
		  //launch chrome and direct it to the URL
		  driver.manage().window().maximize();
		  driver.get("https://www.google.com/");
		  //open the page
		  
		  driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("flipkart");
		  
		

		 
	
		
		
		
	
	}

}
