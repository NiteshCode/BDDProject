package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import objects.ObjectClass1;

public class ManualDataEntry {
	static WebDriver driver;
	public ManualDataEntry(WebDriver driver1) {
	this.driver=driver1;
	}
	
	public static void goManual() throws InterruptedException {
		PageFactory.initElements(driver, ObjectClass1.class);
		WebDriverWait wait=new WebDriverWait(driver,5000); 
		for(int i=1;i<=3;i++) {
    	Thread.sleep(2000);
    	ObjectClass1.closePopup.click();
    	System.out.println("Attempt "+i);
    	wait.until(ExpectedConditions.visibilityOf(ObjectClass1.searchAadhar)).click();
    		}
	}
}
