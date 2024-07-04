package Homework2;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	static WebDriver driver;
	
	
	@Test
	public void loginPostive() {
		setup();
		login("demo@codefios.com", "abc123");
		teardown();
		
	}
	
	
	//method to enter username, password, and click login button
	public static void login(String user, String pass) {
		driver.findElement(By.id("user_name")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("login_submit")).click();
		driver
	}
	
	@Before
	public void setup() {
		//Set Chrome as default browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//Open Chrome Browser
		driver = new ChromeDriver();
		//Go to ebilling website
		//maximize window and delete all cookies
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://codefios.com/ebilling/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	
	@After 
	public void teardown() {
		driver.close();
	}

}

