package Day2_SeleniumFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\juneb\\OneDrive\\Desktop\\Selenium Tools\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		Homework hw = new Homework();
			hw.etsy();
			hw.indeed();
		}
	
		public void etsy() {
			WebDriver driver = new ChromeDriver();
			driver.get("https://etsy.com");
			driver.findElement(By.className("select-signin")).click();
			driver.findElement(By.name("email")).sendKeys("automation");
			driver.findElement(By.name("password")).sendKeys("automation");
			driver.findElement(By.name("submit-attemp")).click();
		}
		
		public void indeed() {
			WebDriver driver = new ChromeDriver();
			driver.get("http://indeed.com");
			String homeURL = driver.getCurrentUrl();
			String homeTitle = driver.getTitle();
			driver.findElement(By.name("q")).sendKeys("SDET");
			driver.findElement(By.className("yosegi-InlineWhatWhere-primaryButton")).click();
			String searchURL= driver.getCurrentUrl();
			String searchTitle = driver.getTitle();
			
			if (searchURL != homeURL) {
				System.out.println("Test pass");
			}else {
				System.out.println("Test fail!");
			}
			
			if (searchTitle != homeTitle) {
				System.out.println("Test pass");
			}else {
				System.out.println("Test fail!");
			}
			
			String job = driver.findElement(By.id("filter-radius")).getText();
			if (job.contains("SDET")) {
				System.out.println("Test pass");
			}else {
				System.out.println("Test fail!");
			}
			
					
			
		
	
		
		}
}
