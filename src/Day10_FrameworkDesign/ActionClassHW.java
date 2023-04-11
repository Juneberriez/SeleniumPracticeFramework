package Day10_FrameworkDesign;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Day9_ActionsClass.ActionsClassDemo;

public class ActionClassHW {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\juneb\\OneDrive\\Desktop\\Selenium Tools\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		ActionClassHW task = new ActionClassHW();
		task.dragdrop();
	}

	public static void dragdrop() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		Actions letsdo = new Actions(driver);
	
		// go to "http://practice.primetech-apps.com/practice/drag-and-drop"
		driver.get("http://practice.primetech-apps.com/practice/drag-and-drop");
		
		// Verify Drag And Drop text displays
		boolean dd = driver.findElement(By.xpath("//h3[text()='Drag And Drop']")).isDisplayed();
		System.out.println("Is text shown? " + dd);
		
		// drag the Text element to target window
		WebElement text = driver.findElement(By.id("text"));
		WebElement targetZone =driver.findElement(By.id("dropzone"));
		letsdo.dragAndDrop(text, targetZone).build().perform();
		
		// drag the Textarea element to target window
		WebElement textArea = driver.findElement(By.id("textarea"));
		letsdo.dragAndDrop(textArea, targetZone).build().perform();
		
		// drag the Number element to target window
		WebElement number = driver.findElement(By.id("Number"));
		letsdo.dragAndDrop(number, targetZone).build().perform();
		
		// delete all those dragged items from target window
		
		List<WebElement> romoveButtons = driver.findElements(By.cssSelector(".remove"));
		for (WebElement webElement : romoveButtons) {
			webElement.click();
			Thread.sleep(1000);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
