package Day5_Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class HW {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\juneb\\OneDrive\\Desktop\\Selenium Tools\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
			
		HW pt = new HW();
		pt.checkbox();
		pt.radio();
		pt.buttons();
		pt.links();
		
	}
	
	public void checkbox() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://practice.primetech-apps.com/practice/check-box");
		driver.findElement(By.xpath("//input[@id='Java']")).click();
		driver.findElement(By.xpath("//input[@id='JavaScript']")).click();
		driver.findElement(By.xpath("//input[@id='C#']")).click();
		driver.findElement(By.xpath("//input[@id='Python']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary mt-3']")).click();
	
		
		WebElement java = driver.findElement(By.xpath("//input[@id='Java']"));
		WebElement javaScript = driver.findElement(By.xpath("//input[@id='JavaScript']"));
		WebElement cc = driver.findElement(By.xpath("//input[@id='C#']"));
		WebElement python = driver.findElement(By.xpath("//input[@id='Python']"));
		WebElement submit = driver.findElement(By.xpath("//button[@class='btn btn-primary mt-3']"));
		
	}
	
	public void radio() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("http://practice.primetech-apps.com/practice/radio-button");
		driver.findElement(By.xpath("//input[@id='USA']")).click();
		driver.findElement(By.xpath("//input[@id='Canada']")).click();
		driver.findElement(By.xpath("//input[@id='England']")).click();
		driver.findElement(By.xpath("//input[@id='Japan']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary mt-3']")).click();
	
		
		WebElement usa = driver.findElement(By.xpath("//input[@id='USA']"));
		WebElement canada = driver.findElement(By.xpath("//input[@id='Canada']"));
		WebElement england = driver.findElement(By.xpath("//input[@id='England']"));
		WebElement japan = driver.findElement(By.xpath("//input[@id='Japan']"));
		WebElement submit = driver.findElement(By.xpath("//button[@class='btn btn-primary mt-3']"));

	}
	
	public void buttons() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.get("http://practice.primetech-apps.com/practice/buttons");
		Thread.sleep(1000);
		WebElement doubleClick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		act.doubleClick(doubleClick).perform();
		Thread.sleep(1000);
		driver.get("http://practice.primetech-apps.com/practice/buttons");
		Thread.sleep(1000);
		WebElement rightClick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		act.contextClick(rightClick).perform();
		driver.get("http://practice.primetech-apps.com/practice/buttons");
		Thread.sleep(1000);
		WebElement clickMe = driver.findElement(By.xpath("//button[@id='dynamic-6']"));
		act.click(clickMe).perform();
		driver.close();
		
	}
	
	public void links() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("http://practice.primetech-apps.com/practice/links");
		String amazon = Keys.chord(Keys.CONTROL,Keys.ENTER);
		driver.findElement(By.xpath("//a[@id='amazon'")). sendKeys(amazon);
		
		driver.get("http://practice.primetech-apps.com/practice/links");
		String facebook = Keys.chord(Keys.CONTROL,Keys.ENTER);
		driver.findElement(By.xpath("//a[@id='facebook'")). sendKeys(facebook);
		
		
	}
		
		
	}


