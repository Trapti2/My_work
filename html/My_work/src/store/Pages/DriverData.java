package store.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DriverData {

	/*public static WebElement getTxtBillingInfo(WebDriver driver) {
		element = driver.findElement(By.xpath("//h2[contains(.,'Billing Address')]/../../..//tr[2]/td[1]/div"));
		return element;*/
	@FindBy(xpath="//h2[contains(.,'Billing Address')]/../../..//tr[2]/td[1]/div")
	public WebElement text_billingInfo;
	}

