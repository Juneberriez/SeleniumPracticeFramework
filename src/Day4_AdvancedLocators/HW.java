package Day4_AdvancedLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\juneb\\OneDrive\\Desktop\\Selenium Tools\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
			
		HW css = new HW();
		css.hw1();
		css.hw2();
	}
	
	public void hw1() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		String firstname = "June";
		String lastname = "Fisher";
		String email = "juneberriez@hotmail.com";
		String password = "88888888";
		String address = "222 Somewhere in Virginia";
		
		driver.get("http://practice.primetech-apps.com/practice/text-box");
		driver.findElement(By.cssSelector("input[id=firstName]")).sendKeys(firstname);
		driver.findElement(By.cssSelector("input[id=lastName]")).sendKeys(lastname);
		driver.findElement(By.cssSelector("input[id=email]")).sendKeys(email);
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Enable']")).click();
		Thread.sleep(500);
		driver.findElement(By.cssSelector("textarea[id=address]")).sendKeys(address);
		driver.findElement(By.cssSelector("button[type=submit]")).click();
		Thread.sleep(1000);

		
//		Find your inputs and get text of each and store them into variables.
		String firstNameActual = driver.findElement(By.xpath("//div[text()='"+firstname+"']")).getText();
		System.out.println("Actual first name is: " + firstNameActual);
		
		String lastNameActual = driver.findElement(By.xpath("//div[text()='"+lastname+"']")).getText();
		System.out.println("Actual last name is: " + lastNameActual);
		
		String emailActual = driver.findElement(By.xpath("//div[text()='"+email+"']")).getText();
		System.out.println("Actual email is: " + emailActual);
		
		String passwordActual = driver.findElement(By.xpath("//div[text()='"+password+"']")).getText();
		System.out.println("Actual password is: " + passwordActual);
		
		String addressActual = driver.findElement(By.xpath("//div[text()='"+address+"']")).getText();
		System.out.println("Actual address is: " + addressActual);
		
//		Then compare your input with the displayed user information if they match.
		
		if (firstNameActual.equals(firstname)) {
			System.out.println("Test Pass!");
		} else {
			System.out.println("Test Fail!");
		}
		if (lastNameActual.equals(lastname)) {
			System.out.println("Test Pass!");
		} else {
			System.out.println("Test Fail!");
		}
		if (emailActual.equals(email)) {
			System.out.println("Test Pass!");
		} else {
			System.out.println("Test Fail!");
		}
		if (passwordActual.equals(password)) {
			System.out.println("Test Pass!");
		} else {
			System.out.println("Test Fail!");
		}
		if (addressActual.equals(address)) {
			System.out.println("Test Pass!");
		} else {
			System.out.println("Test Fail!");
		}
		
	}
	
	public void hw2() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://practice.primetech-apps.com/practice/web-tables");
		
//		2.Verify that you see Web Tables text
		String webTablesText = driver.findElement(By.xpath("//h3[text()='Web Tables']")).getText();
		if(webTablesText.equals("Web Tables")) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Fail");
		}
		
//		3. Find id, firstname, lastname, salary fields and give a relevant input. (store the information into variables, then pass the variable to sendKeys() method) 
		String id = "888888";
		String firstname = "Kiki";
		String lastname = "Boonny";
		String salary = "10000";
		
		driver.findElement(By.cssSelector("input[id='Id']")).sendKeys(id);
		driver.findElement(By.cssSelector("input[id='First Name']")).sendKeys(firstname);
		driver.findElement(By.cssSelector("input[id='Last Name']")).sendKeys(lastname);
		driver.findElement(By.cssSelector("input[id='Salary']")).sendKeys(salary);
		
//		4. Click on Add button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(1000);
		
//		5. Then your inputs will display under the table. (use xpath text() contains() functions to locate those elements. get text and store them into variables)
	    String actualId = driver.findElement(By.xpath("//td[text()='" + id + "']")).getText();
		System.out.println(actualId);
		String actualFirstname = driver.findElement(By.xpath("//td[text()='" + firstname + "']")).getText();
		System.out.println(actualFirstname);
		String actualLastname = driver.findElement(By.xpath("//td[text()='" + lastname + "']")).getText();
		System.out.println(actualLastname);
		String actualSalary = driver.findElement(By.xpath("//td[text()='" + salary + "']")).getText();
		System.out.println(actualSalary);
		
//		6. Verify your input under the table match the input you added. 
		if ((actualId) == id) {
			System.out.println("ID is good, Test Pass!");
		} else {
			System.out.println("ID is not good.");
		}
		if (actualFirstname.equals(firstname)) {
			System.out.println("Firstname is good, Test Pass!");
		} else {
			System.out.println("Firstname is not good.");
		}
		if (actualLastname.equals(lastname)) {
			System.out.println("Lastname is good, Test Pass!");
		} else {
			System.out.println("Lastname is not good.");
		}
		if ((actualSalary) == salary) {
			System.out.println("Salary is good, Test Pass!");
		} else {
			System.out.println("Salary is not good.");
		}

	
	}
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


