package Day4_AdvancedLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Day3_AdvancedLocators.Homework;

public class ClassActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\juneb\\OneDrive\\Desktop\\Selenium Tools\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		ClassActivity demo = new ClassActivity();
			demo.act1();
		}
	
		public void act1() {
			WebDriver driver = new ChromeDriver();
			driver.get("https://etsy.com");
			driver.findElement(By.cssSelector("input[name=first_name]")).sendKeys("June");
			driver.findElement(By.cssSelector("input[name=last_name]")).sendKeys("Doe");
			driver.findElement(By.cssSelector("input[value=register]")).click();
			driver.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


