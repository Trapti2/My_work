package script_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class taskTest_1 {
private static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//open Browser
		System.setProperty("webdriver.chrome.driver", "C:\\WorkSpace\\testdemo\\test data\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//*[@id="WCMenuItem_1_links_1_10001_9604"]/b
		driver.get("http://172.25.20.30/9980store/home");
		System.out.println("site opened successfully");
		
		
		WebElement header_Menu_Label = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='HeaderMenu_DropDown_Books_label']/h2/a")));
		header_Menu_Label.click();
		header_Menu_Label.getAttribute("value");
		System.out.println(" text " + header_Menu_Label + "   print " );
		
		//ddcs details
		//Program selection
				Select dropdown = new Select(driver.findElement(By.id("programIdSelect")));
				dropdown.selectByVisibleText("Auto_eFollett");
				System.out.println("Program picked");

				//Term selection
				Select dropdown1 = new Select(driver.findElement(By.id("termIdSelect")));
				dropdown1.selectByVisibleText("auto_9980_Future");
				System.out.println("Term picked");

				try {
					Thread.sleep(20000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				//Submit_button
				driver.findElement(By.id("submitButton")).click();
				System.out.println("button clicked");
				
				
				//open all
				WebElement openAll_Required = driver.findElement(By.id("REQUIRED_1_1_Open"));
				openAll_Required.click();
				
				String authorName = driver.findElement(By.id("materialAuthor")).getText().trim();
				System.out.println("authorName= "  +authorName );
	}

}
