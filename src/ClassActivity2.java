import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassActivity2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\juneb\\OneDrive\\Desktop\\Selenium Tools\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("automation");
		driver.findElement(By.name("lastname")).sendKeys("automation");
		driver.findElement(By.name("reg_email__")).sendKeys("automation");
		driver.findElement(By.name("reg_passwd__")).sendKeys("automation");
		driver.findElement(By.name("websubmit")).click();
		driver.close();
	}

}
