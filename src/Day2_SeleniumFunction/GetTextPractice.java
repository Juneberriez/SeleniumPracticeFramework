package Day2_SeleniumFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\juneb\\OneDrive\\Desktop\\Selenium Tools\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		String loginText = driver.findElement(By.name("login")).getText();
		System.out.println("Log in button text is:" + loginText);
		if (loginText.equals("Log In")) {
			System.out.println("Test pass");
		}else {
			System.out.println("Test fail! Text doesn't match");
		}
		
		
		
		
	}

}
