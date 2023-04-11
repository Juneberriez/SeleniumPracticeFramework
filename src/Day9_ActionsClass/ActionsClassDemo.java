package Day9_ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsClassDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\juneb\\OneDrive\\Desktop\\Selenium Tools\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		ActionsClassDemo task = new ActionsClassDemo();
//		task.actions();
		task.dragAndDrop();
	}



	public static void actions() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		Actions letsdo = new Actions(driver);
		//go to Etsy.com
		driver.get("https://etsy.com");
		//Hover Over on Jewelry & Accessories
		WebElement jewelaryTab = 
				driver.findElement(By.xpath("//span[contains(text(), 'Jewelry & Accessories')]"));
		letsdo.moveToElement(jewelaryTab).build().perform();
		Thread.sleep(1000);
		//Mouseover on Bags & Purses
		WebElement bagsPurses = 
				driver.findElement(By.xpath("(//span[contains(text(), 'Bags & Purses')])[1]"));
		letsdo.moveToElement(bagsPurses).build().perform();
		Thread.sleep(1000);
		//Mouseover to Shoulder Bags
		WebElement shoulderBags = 
				driver.findElement(By.xpath("//a[contains(text(), 'Shoulder Bags')]"));
		letsdo.moveToElement(shoulderBags).build().perform();
		//Click on the shoulder bags
		shoulderBags.click();
		//Verify you are on the Shoulder bags page
		if (driver.findElement(By.xpath("//h1[text()='Shoulder Bags']")).isDisplayed()) {
			System.out.println("We are on the Bag page.");
		}else {
			System.out.println("We are NOT on the Bag page");
		}
		}

	
	
	
	public static void dragAndDrop() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		Actions letsdo = new Actions(driver);
		
		// go to "http://practice.primetech-apps.com/practice/drag-and-drop"
				driver.get("http://practice.primetech-apps.com/practice/drag-and-drop");
				//  drag the Text element to next window
				WebElement sourceElement = driver.findElement(By.id("text"));
				WebElement targetElement = driver.findElement(By.id("dropzone"));
				letsdo.dragAndDrop(sourceElement, targetElement).build().perform();
				
				
			}

	
	
	
	
	
	
	
	
	
	}
