package Day7_ElementStatus;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW_review {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\juneb\\OneDrive\\Desktop\\Selenium Tools\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		HW_review answer = new HW_review();
//		answer.radioButton();
//		answer.checkbox();
		answer.amazon();
	}

	public static void radioButton() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://practice.primetech-apps.com/practice/radio-button");
		List<WebElement> radioButtons = driver.findElements(By.cssSelector(".form-check-input"));
		for (WebElement singleRadio : radioButtons) {
			if(singleRadio.isDisplayed() && singleRadio.isEnabled()) {
				if(singleRadio.isSelected()) {
					System.out.println("Radio button is selected");
				}else {
					System.out.println("Radio button is not selected");
					Thread.sleep(1000);
					singleRadio.click();
				}
				
			}else {
				System.out.println("Something is wrong! Radio button is neither displayed nor enabled.");
			}
			System.out.println("Is radio button selected?" + singleRadio.isSelected());
		}
	}


	public static void checkbox() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://practice.primetech-apps.com/practice/check-box");
		List<WebElement> checkboxes = driver.findElements(By.cssSelector(".form-check-input"));
		for (WebElement singleCheckbox : checkboxes) {
			if (singleCheckbox.isDisplayed()) {
				System.out.println("Its displayed");
				if (singleCheckbox.isEnabled()) {
					System.out.println("Its enabled");
					if(singleCheckbox.isSelected()) {
						System.out.println("Its selected");
					}else {
						System.out.println("Its not selected so I am clicking");
						singleCheckbox.click();
					}
				}else {
					System.out.println("Its not enabled");
				}
			}else {
				System.out.println("Its not displayed");
			}
				System.out.println("Is checkbox now selected?" + singleCheckbox.isSelected());
		}
	}
	
	
	public static void amazon() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://amazon.com");
		driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		if (driver.findElement(By.id("ap_email")).isDisplayed()) {
			System.out.println("I am on sign in page");
		}else {
			System.out.println("Im not in sign in page");
		}
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		
		if (driver.findElement(By.id("ap_email")).isDisplayed()) {
			System.out.println("I am on sign in page 2nd time");
		}else {
			System.out.println("Im not on sign in page 2nd time");
		}
		
		driver.findElement(By.id("createAccountSubmit")).click();
		WebElement createAccount = driver.findElement(By.xpath("//h1[contains(text(), \"Create account\")]"));
		if (createAccount.isDisplayed()) {
			System.out.println("Im on sign up page");
		}else {
			System.out.println("Im not on sign up page");
		}
		driver.navigate().back();
		
		if (driver.findElement(By.id("ap_email")).isDisplayed()) {
			System.out.println("I am on sign in page 3rd time");
		}else {
			System.out.println("Im not on sign in page 3rd time");
		}
		driver.navigate().forward();
		if (driver.findElement(By.xpath("//h1[contains(text(), \"Create account\")]")).isDisplayed()) {
			System.out.println("Im on sign up page 2nd time");
		}else {
			System.out.println("Im not on sign up page 2nd time");
		}
		driver.findElement(By.id("continue")).click();
		Thread.sleep(1000);
		WebElement nameError = driver.findElement(By.xpath("//div[contains(text(),'Enter your name')]"));
		if(nameError.isDisplayed()) {
			if(nameError.getText().equals("Enter your name")) {
			System.out.println("Name error message displays and it matches");
		}else {
			System.out.println("Neither name error message displays nor matches");
		}
		}
		WebElement emailError = driver.findElement(By.xpath("//div[contains(text(),'Enter your email')]"));
		if(emailError.isDisplayed()) {
			if(emailError.getText().equals("Enter your email or mobile phone number")) {
			System.out.println("Email error message displays and it matches");
		}else {
			System.out.println("Neither email error message nor displays matches");
		}
	}
		
		WebElement passwordError = driver.findElement(By.xpath("//div[contains(text(),'Minimum 6 characters required')]"));
		if(passwordError.isDisplayed()) {
			if(passwordError.getText().equals("Minimum 6 characters required")) {
			System.out.println("password error message displays and it matches");
		}else {
			System.out.println("Neither password error message displays matches");
		}
}
}
}
	
	
	
	
	
	
	
	
	

