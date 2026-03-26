package self_pro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

	public class Google_search {
	    public static void main(String[] args) throws InterruptedException {
	    	WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com");
	        driver.manage().window().maximize();
	        
	        // Search 
	        WebElement searchBox = driver.findElement(By.name("q"));
	        searchBox.sendKeys("Selenium Testing");
	        searchBox.submit();
	        
	        Thread.sleep(2000);
	        
	        // Title print 
	        System.out.println("Page Title: " + driver.getTitle());
	        System.out.println("Test Passed Successfully!");
	        
	        driver.quit();
	    }
	}


