package script_1;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class University_store {
	public static WebDriver driver;

	@Test
	public void f(){
		uRl("http://172.25.20.30/9980store/home");
		//driver.getCurrentUrl();
		firstPageNavs();
		dDCSDetails();
		//driver.findElement(By.xpath("//a[contains(@href,'http://172.25.20.30/9980store/shop/textbooks-and-course-materials')]"));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebElement element1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='HeaderMenu_DropDown_Books_label']/h2/a")));
		// element1.click();
		//driver.findElement(By.id("WCMenuItem_1_10001_9604_text")).click();
		//timeToLoad(1);


		//click on OPEN_ALL links
		/*List <WebElement>  Open_All_Links =driver.findElement(By.xpath("//a[contains(text(),'Open All')]"));
				int a=Open_All_Links.size();
				System.out.println(a);
				//Open_All_Links.click();
				//Open_All_Links.click();
				System.out.println("OPEN_ALL links");*/

		//driver.findElement(By.xpath("//a[contains(text(),'Open All')]"));
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//for(int g=0;g<4;g++){
		//System.out.println("loop "+g+ " completed");
		List<WebElement> Open_All_Links =driver.findElements(By.xpath("//a[contains(text(),'Open All')]"));
		List<WebElement> Close_All_Links =driver.findElements(By.xpath("//a[contains(text(),'Close All')]"));
		int a= Open_All_Links.size();
		int c= Close_All_Links.size();
		System.out.println("size = " + a);
		for(int i=0;i<a;i++){
			Open_All_Links.get(i).click();	
			System.out.println("At index "+ i + ", Open All clicked");
			/*if (Open_All_Links.get(i).isSelected()){
				Open_All_Links.get(i).click();
			}*/
		}

		List<WebElement> CHECK_BOXES = driver.findElements(By.xpath("//input[contains(@id,'catentryId')]"));
		int b = CHECK_BOXES.size();
		System.out.println("size " + "= " + b);
		for(int f=0;f<b;f++){
			//CHECK_BOXES.get(f).click();	

			if (CHECK_BOXES.get(f).isSelected()){
				CHECK_BOXES.get(f).click();
			}
		}
		System.out.println("CHECK_BOXES clicked");
		for(int d=0;d<c-1;d++){
			Close_All_Links.get(d).click();	
			System.out.println("At index "+ d + ", Close All clicked");
		}
		suggestedOpen();
		/*WebElement Suggested_Open =  driver.findElement(By.id("SUGGESTED_1_1_Open"));
		if(Suggested_Open.isDisplayed()){
			System.out.println("selected bookstore section displayed");
			Suggested_Open.click();*/

	}  
	//}

	public static void uRl ( String url){
		System.setProperty("webdriver.chrome.driver", "C:\\WorkSpace\\testdemo\\test data\\chromedriver.exe");
		driver = new ChromeDriver();
		//url = "http://172.25.20.30/9980store/home";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//*[@id="WCMenuItem_1_links_1_10001_9604"]/b
		driver.get("http://172.25.20.30/9980store/home");
		System.out.println("site opened successfully");
	}
	public static void timeToLoad (int sec){
		try {
			Thread.sleep(sec);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void firstPageNavs(){
		//WebElement header_Menu_Label = driver.findElement(By.xpath(".//*[@id='HeaderMenu_DropDown_Books_label']/h2/a"));
		WebElement header_Menu_Label = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='HeaderMenu_DropDown_Books_label']/h2/a")));
		header_Menu_Label.click();
		header_Menu_Label.getAttribute("value");
		System.out.println(" text " + header_Menu_Label + " print " );
	}
	public static void dDCSDetails(){
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

	}

	public static void suggestedOpen (){
		try {
			WebElement Suggested_Open =  driver.findElement(By.id("SUGGESTED_1_1_Open"));
			if(Suggested_Open != null){
				System.out.println("selected bookstore section displayed");
				Suggested_Open.click();
				WebElement Pprbck_Type = driver.findElement(By.xpath("material-group-item_SUGGESTED//form[contains(@id,'OrderItemAdd')]/div[2]/table/tbody/tr[2]/td[2]"));
				Pprbck_Type.isDisplayed();
				System.out.println("pprback item type is present");
				if(Pprbck_Type != null){
					WebElement AddToCart = driver.findElement(By.xpath(".//*[@id='addtocart_18']"));
					AddToCart.click();
				}

			}

		} catch (Exception e) {
			// TODO Auto-generated catch 
			System.out.println("selected bookstore section clicked");
			e.printStackTrace();
		}

	}
	@Test
	public void tearDown() {
		driver.quit();
	}
}
