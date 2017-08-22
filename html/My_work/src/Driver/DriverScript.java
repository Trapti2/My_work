package Driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import config.ActionKeywords;
import utility.ExcelUtils;

public class DriverScript {
	private static WebDriver driver = null ;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver", "C:\\WorkSpace\\testdemo\\test data\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       try{
    	   driver.get("http://www.store.demoqa.com");
    	   
           driver.findElement(By.xpath(".//*[@id='account']/a")).click();
           //timeToLoad(5000);
           driver.findElement(By.id("log")).sendKeys("trapti");           
           driver.findElement(By.id("pwd")).sendKeys("abcde223");
           driver.findElement(By.id("login")).click();
           driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
           System.out.println("successful");
       } 
       catch (Exception e) {
			System.out.println("failed");
		}
        driver.quit();
	}
public static void timeToLoad(int msec){
	try {
		Thread.sleep(msec);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
		
		String sPath = "C://Users//tmittal//my project workspace//My_work//src//Driver//test2.xlsx";
		 System.out.println("Taking values");
    	// Here we are passing the Excel path and SheetName as arguments to connect with Excel file 
    	ExcelUtils.setExcelFile(sPath, "test2");
 
    	//Hard coded values are used for Excel row & columns for now
    	//In later chapters we will replace these hard coded values with varibales
    	//This is the loop for reading the values of the column 3 (Action Keyword) row by row
    	for (int iRow=1;iRow<=9;iRow++){
		    //Storing the value of excel cell in sActionKeyword string variable
    		String sActionKeyword = ExcelUtils.getCellData(iRow, 3);
 
    		//Comparing the value of Excel cell with all the project keywords
    		if(sActionKeyword.equals("openBrowser")){
                        //This will execute if the excel cell value is 'openBrowser'
    			//Action Keyword is called here to perform action
    			ActionKeywords.openBrowser();}
    		else if(sActionKeyword.equals("navigate")){
    			ActionKeywords.navigate();}
    		else if(sActionKeyword.equals("click_MyAccount")){
    			ActionKeywords.click_MyAccount();}
    		else if(sActionKeyword.equals("input_Username")){
    			ActionKeywords.input_Username();}
    		else if(sActionKeyword.equals("input_Password")){
    			ActionKeywords.input_Password();}
    		else if(sActionKeyword.equals("click_Login")){
    			ActionKeywords.click_Login();}
    		else if(sActionKeyword.equals("waitFor")){
    			ActionKeywords.waitFor();}
    		else if(sActionKeyword.equals("click_Logout")){
    			ActionKeywords.click_Logout();}
    		else if(sActionKeyword.equals("closeBrowser")){
    			ActionKeywords.closeBrowser();}
 
    		}
}

}
