package script_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import store.store.Pages.Irctc_LogIn;

public class Selenium_easy_demo extends Irctc_LogIn {

	static WebDriver driver ;


	@BeforeTest
	//Browser launch details
	public void browser(){
		System.setProperty("webdriver.chrome.driver", "C:/WorkSpace/testdemo/test data/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.seleniumeasy.com/test/");
		System.out.println("site opened successfully");
	}

	@Test
	public  void sel () {
		// TODO Auto-generated method stub
		mouseHover();
	}


	public void mouseHover(){

		driver.findElement(By.xpath(".//*[@id='basic_example']/span/i")).click();
		System.out.println("selected successfully");
		WebElement Simple_From = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.linkText("Simple Form Demo")));
		Simple_From.click();//*[@id="navbar-brand-centered"]/ul[1]/li[1]/ul/li[1]/a
		//Simple_From.getText();
		WebElement Enter_Msg = driver.findElement(By.id("user-message"));
		Enter_Msg.clear();
		Enter_Msg.sendKeys("testing step");
		System.out.println("text msg = " + Enter_Msg );
		TimeToLoad(5);
		WebElement Show_Message = driver.findElement(By.xpath("//*[@id='get-input']/button"));
		Show_Message.click();
		System.out.println("Show msg = " + Show_Message.getText());
		TimeToLoad(5);
		WebElement Sum_1 = driver.findElement(By.id("sum1"));
		Sum_1.clear();
		Sum_1.sendKeys("22");
		System.out.println("Sum1 = " + Sum_1.getText());
		TimeToLoad(5);
		WebElement Sum_2 = driver.findElement(By.id("sum2"));
		Sum_2.clear();
		Sum_2.sendKeys("22");
		System.out.println("Sum2 = " + Sum_2.getText());
		TimeToLoad(5);
		WebElement Total_button = driver.findElement(By.xpath("//*[@id='gettotal']/button"));
		Total_button.click();
		System.out.println("Total sum");
	}

	/*@AfterTest
	public void inputForms(){
		driver.findElement(By.linkText("Input Forms")).click();	
		driver.findElement(By.linkText("Checkbox Demo")).click();	
	}*/
	
	/*@AfterClass
	public void close(){
		driver.quit();
	}*/
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}
