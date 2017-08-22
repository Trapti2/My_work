package script_1;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script_1_1 {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\WorkSpace\\testdemo\\test data\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.com/");
		System.out.println("site opened successfully");
		//}
		
		//public void script2() throws InterruptedException {
		
		WebElement element = driver.findElement(By.linkText("DEMO SITES"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		WebElement element1 = driver.findElement(By.linkText("E-Commerce Demo Site"));
		element1.click();
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e2) {
			
			e2.printStackTrace();
		}
		
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e1) {
			
			e1.printStackTrace();
		}
		System.out.println("pass");
		
		WebElement element2 = driver.findElement(By.xpath("//input[@name='s']"));
		element2.sendKeys("Magic Mouse");
		System.out.println("pass");
		
		//WebElement Search_fields  = driver.findElement(By.className("search"));	
		element2.sendKeys(Keys.ENTER);
	    WebElement element3 = driver.findElement(By.name("Buy"));
	    element3.click();
	    
	    //clickon popup button
	    WebElement element4 = driver.findElement(By.className("go_to_checkout"));
	    element4.click();
	    try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	    System.out.println("step1 executed successfully");
	    
	    //click on continue button
	    WebElement element5 = driver.findElement(By.linkText("Continue"));
	    element5.click();
	    System.out.println("continued");
	    
	    
		}

	
	}

