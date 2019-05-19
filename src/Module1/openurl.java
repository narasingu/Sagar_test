package Module1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openurl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exepath = "F:\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exepath);
		 
		  WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().setScriptTimeout(50,TimeUnit.SECONDS);
		  //launch chrome and direct it to the URL
		  driver.get("http://www.testingtreasure.com");
		  
		  //maximize window
		  driver.manage().window().maximize();
		  
		  //close browser
		  driver.close();
	}

}
