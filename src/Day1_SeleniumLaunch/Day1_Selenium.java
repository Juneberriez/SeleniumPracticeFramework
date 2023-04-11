package Day1_SeleniumLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_Selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\juneb\\OneDrive\\Desktop\\Selenium Tools\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		
		System.out.println("Home page title is: " + driver.getTitle());
		System.out.println("Home page ");
		
		Thread.sleep(1000); //It stops the jvm for the given number of seconds.
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("coffee mug");
		// if a function return something, 
		// we can either store that returned data in a variable, or we can do a chain action
		// if the return type is void we can't do any action after because there's no data return
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		// find by name
//		driver.findElement(By.name("q")).sendKeys("Software test engineer");
		
		// find by linktext
		driver.findElement(By.linkText("Customer Service")).click();
		
		
		
		// chain action
		String str = "Hello World";
		str.substring(3).trim().concat("Love Java");
		
		
		
		
		
		
		
	}

}
