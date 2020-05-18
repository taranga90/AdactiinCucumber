package adactin.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseMain {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseMain() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\taranga\\eclipse-workspace\\adactincucumber\\src\\test\\java\\adactin\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void initialization() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\taranga\\eclipse-workspace\\adactincucumber\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	public static void tearDown() {
		driver.quit();
	}
	
	public static void writeText(WebElement element, String str) {
		element.sendKeys(str);
	}
	
	public static void clickbtn(WebElement element) {
		element.click();
	}
	
}
