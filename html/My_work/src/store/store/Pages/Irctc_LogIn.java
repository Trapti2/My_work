package store.store.Pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Irctc_LogIn {
	static WebDriver driver ;
	public static void main(String[] args) {
		irctcLogIn();
		logINDetails();
	}

	public static void irctcLogIn (){
		System.setProperty("webdriver.chrome.driver", "C:\\WorkSpace\\testdemo\\test data\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in");
		System.out.println("site opened successfully");
TimeToLoad(5);
	}

	public static void logINDetails () {
		WebElement element = driver.findElement(By.id("usernameId"));
		WebElement element1 = driver.findElement(By.xpath(".//*[@id='loginFormId']/div[1]/div[2]/table[1]/tbody/tr[2]/td[2]/input"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		//WebElement element = driver.findElement(By.id("usernameId"));
		element.sendKeys("traps222");
		action.moveToElement(element1).build().perform();
		element1.sendKeys("Password321");
	}
	
public static void TimeToLoad(int sec) {
	try {
		Thread.sleep(sec*10);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
