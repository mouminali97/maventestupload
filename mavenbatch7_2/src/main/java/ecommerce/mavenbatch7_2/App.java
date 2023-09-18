package ecommerce.mavenbatch7_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class App 
{
	public static WebDriver driver;
	public static void main( String[] args )
    {
    	browserSelect("Chrome");
		driver.get("https://www.homedepot.com");
	    driver.manage().window().maximize();
    }
	
	public static void browserSelect(String browser) {
		if(browser.contains("Chrome")) {
			//Chrome driver
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Moumin\\eclipse-workspace\\mavenbatch7\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
	  }
	  
		else if(browser.contains("Firefox")) {
			//Firefox driver
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Moumin\\eclipse-workspace\\mavenbatch7\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
	  }
	  
		else {
			//Edge driver
			System.setProperty("webdriver.edge.driver","C:\\Users\\Moumin\\eclipse-workspace\\mavenbatch7\\drivers\\msedgedriver.exe");
		    driver = new EdgeDriver();
		      }
	  }
}
