package Day3_AdvancedLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\juneb\\OneDrive\\Desktop\\Selenium Tools\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		Homework hw = new Homework();
			hw.fb1();
			hw.fb2();
			hw.indeed();
		}
	
		public void fb1() {
			WebDriver driver = new ChromeDriver();
			driver.get("https://facebook.com");
			driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("Automation");
			driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("Automation");
			driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
			driver.close();
		}
		public void fb2() {
			WebDriver driver = new ChromeDriver();
			driver.get("https://facebook.com");
			driver.findElement(By.xpath("//a [@class ='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
			driver.findElement(By.xpath("//input [@name ='firstname']")).sendKeys("automation");
			driver.findElement(By.xpath("//input [@name ='lastname']")).sendKeys("automation");
			driver.findElement(By.xpath("//input [@name ='reg_email__']")).sendKeys("automation");
			driver.findElement(By.xpath("//input [@name ='reg_passwd__']")).sendKeys("automation");
			driver.findElement(By.xpath("//button [@name ='websubmit']")).click();
			driver.close();
		}
		
		public void indeed() {
			WebDriver driver = new ChromeDriver();
			String searchCriteria = "SDET";
			driver.get("http://indeed.com");
			String homeURL = driver.getCurrentUrl();
			String homeTitle = driver.getTitle();
			driver.findElement(By.xpath("//input [@name ='q']")).sendKeys("SDET");
			WebElement whereField = driver.findElement(
					By.xpath("//input[@id='text-input-where']"));
			whereField.sendKeys(Keys.CONTROL + "a");
			whereField.sendKeys(Keys.DELETE);
			driver.findElement(By.xpath("//input [@name ='l']")).sendKeys("Washington DC");
			driver.findElement(By.xpath("//button [@type ='submit']")).click();
			String searchURL= driver.getCurrentUrl();
			String searchTitle = driver.getTitle();
			
			if (!searchURL.equals(homeURL) && searchURL.contains(searchCriteria)) {
				System.out.println("Search URL doesn't match and contains the search criteria. Test Pass!");
			} else {
				System.out.println("Search URL matches or doesn't contain the search Criteria. Test Fail!");
			}
			
			if (!searchTitle.equals(homeTitle) && searchTitle.contains(searchCriteria)) {
				System.out.println("Search Title doesn't match and contains the search criteria. Test Pass!");
			} else {
				System.out.println("Search Title matches or doesn't contain the search Criteria. Test Fail!");
			}
			 
	        String jobsInLocationText = driver.findElement(By.className("jobsearch-SerpTitle")).getText();
	        System.out.println("Jobs in the Location text: " + jobsInLocationText);
	        
	        if (jobsInLocationText.contains(searchCriteria)) {
				System.out.println("Jobs in Location Text Contains the Search Criteria. Test Pass!");
			} else {
				System.out.println("Jobs in Location Text Does not Contain the Search Criteria. Test Fail!");
			}
	        
	        String searchCriteriaSubText = jobsInLocationText.substring(0, searchCriteria.length());
	        
	        System.out.println(searchCriteriaSubText + " " + searchCriteria.length());
	        
	        if (searchCriteriaSubText.equals(searchCriteria)) {
				System.out.println("Jobs in Location Text Equals the Search Criteria. Test Pass!");
			} else {
				System.out.println("Jobs in Location Text Does not Contain the Search Criteria. Test Fail!");
			}
	        
		
		
			
	}

}
