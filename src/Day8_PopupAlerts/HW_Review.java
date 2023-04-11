package Day8_PopupAlerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HW_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\juneb\\OneDrive\\Desktop\\Selenium Tools\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
	
		HW_Review hw = new HW_Review();
//		hw.amazonSelect();
		hw.alertTestcase3();
	}
	
	public static void amazonSelect() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
//		 go to amazon.com
		driver.get("https://amazon.com");
//	     verify that you are on the amazon home page. (verify with title). 
		String title = "Amazon.com. Spend less. Smile more.";
			if(driver.getTitle().equals(title)) {
				System.out.println("We're at the home page!");
			}else {
				System.out.println("We're not on home page!");
			}
//	     verify dropdown value is by default "All Departments"
		String defaultDropdown = "All Departments";
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select letSelect = new Select(dropdown);
		String actualSelectedOption = letSelect.getFirstSelectedOption().getText();
			if(actualSelectedOption.equals(defaultDropdown)) {
				System.out.println("Default dropdown value matches");
			}else {
				System.out.println("Default dropdown value doesn't match.");
			}
			
//	     select department Home & Kitchen, and search coffee mug.
		letSelect.selectByVisibleText("Home & Kitchen");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("coffee mug");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
//	     verify you are on coffee mug search results page (use title).
		String mugTitle = "Amazon.com : coffee mug";
		if(driver.getTitle().equals(mugTitle)) {
			System.out.println("We are on coffee mug search results page");
		}else {
			System.out.println("We ain't on coffee mug search results page");
		}
//	     verify you are in Home & Kitchen department.
		WebElement dropdown2 = driver.findElement(By.id("searchDropdownBox"));
		Select letSelect2 = new Select(dropdown2);
		String actualSelectedOption2 = letSelect2.getFirstSelectedOption().getText();
		if(actualSelectedOption2.equals("Home & Kitchen")) {
			System.out.println("Test passed!");
		}else {
			System.out.println("Test failed!");
		}
		
	}
	
	
	public static void alertTestcase3() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
//			go to http://practice.primetech-apps.com/practice/alerts 
		driver.get("http://practice.primetech-apps.com/practice/alerts");
		
//			Click on the 'Prompt Alert' button and type PrimeTech
		String text = "PrimeTech";
		driver.findElement(By.id("prompt")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert handle = driver.switchTo().alert();
		handle.sendKeys(text);
		
//			Then accept the Alert. 
		handle.accept();
//			Verify that a greeting message displays as
//			"Hello <your input>! How are you today?".
		WebElement greetingTextElement = driver.findElement(By.id("demo"));
		wait.until(ExpectedConditions.visibilityOf(greetingTextElement));
		String greetingText = greetingTextElement.getText();
		if(greetingText.equals("Hello " + text + "! How are you today?")) {
			System.out.println("Test passed!");
		}else {
			System.out.println("Test failed!");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
