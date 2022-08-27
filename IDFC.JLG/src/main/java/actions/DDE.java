package actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import objects.ObjectClass2;

public class DDE {
	static WebDriver driver;
	public DDE(WebDriver driver1) {
		this.driver=driver1;
	}
	
	public static void selectLoan(String LoanPackID) throws InterruptedException {
		PageFactory.initElements(driver, ObjectClass2.class);
		WebDriverWait wait=new WebDriverWait(driver,5000); 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		wait.until(ExpectedConditions.visibilityOf(ObjectClass2.selectLoan));
		Thread.sleep(2000);
}
}