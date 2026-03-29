package self_pro;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		

		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        
		        // Open website
		        driver.get("https://www.saucedemo.com");
		        
		        // Login
		        driver.findElement(By.id("user-name")).sendKeys("standard_user");
		        driver.findElement(By.id("password")).sendKeys("secret_sauce");
		        driver.findElement(By.id("login-button")).click();
		        
		        Thread.sleep(2000);
		        
		        // Verify login
		        System.out.println("Page Title: " + driver.getTitle());
		        System.out.println("Login Successful!");
		        
		        // Screenshot
		        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		        FileUtils.copyFile(screenshot, new File("C:\\Users\\Hp\\eclipse-workspace\\Selenium_java\\Screenshot\\login_screenshot.png"));
		        System.out.println("Screenshot Saved!");
		        
		        driver.quit();
		    }
		

	

}
