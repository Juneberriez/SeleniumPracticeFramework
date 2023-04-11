package Day6_WebElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyEventPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\juneb\\OneDrive\\Desktop\\Selenium Tools\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		KeyEventPractice pt = new KeyEventPractice();
		
//		pt.task1();
//		pt.task2();
		pt.task3();
	}
	
	public void task1(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://amazon.com");
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Coffee mug");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Pretty coffee mug");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();	
	}
	
	public static void task2() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		List<WebElement> items = driver.findElements(By.cssSelector(".inventory_item"));
		int listSize = items.size();
		System.out.println(listSize);
		
		
		List<WebElement> itemPrices = driver.findElements(By.cssSelector(".inventory_item_price"));
		for(int i = 0; i < itemPrices.size(); i++) {
			System.out.println(itemPrices.get(i).getText());
		}
	}
	
	public static void task3() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://indeed.com");
		WebElement whatField = driver.findElement(By.id("text-input-what"));
		WebElement whereField = driver.findElement(By.id("text-input-where"));
		
		if(whatField.isEnabled() && whatField.isDisplayed()) {
			System.out.println("what field is enabled & displayed!");
		}else {
			System.out.println("what field is not enabled or displayed!");
		}
		if(whereField.isEnabled() && whereField.isDisplayed()) {
			System.out.println("where field is enabled & displayed!");
		}else {
			System.out.println("where field is not enabled or displayed!");
		}
		
	}

}
