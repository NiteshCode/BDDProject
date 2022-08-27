package actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import objects.ObjectClass2;

import org.openqa.selenium.WebDriver;

public class LoanDetailsPage {
	static WebDriver driver;
	public LoanDetailsPage(WebDriver driver1) {
		this.driver=driver1;
	}
	
	public static void selectLoan(String LoanPackID) throws InterruptedException {
		PageFactory.initElements(driver, ObjectClass2.class);
		WebDriverWait wait=new WebDriverWait(driver,5000); 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		wait.until(ExpectedConditions.visibilityOf(ObjectClass2.selectLoan));
		Thread.sleep(2000);
		Select drpSelectLoanId = new Select(ObjectClass2.selectLoan);
		drpSelectLoanId.selectByVisibleText(LoanPackID); 
		Thread.sleep(1000);
		ObjectClass2.NEXT.click();
		
		wait.until(ExpectedConditions.visibilityOf(ObjectClass2.waitForPosidexSucc));
		wait.until(ExpectedConditions.elementToBeClickable(ObjectClass2.NEXT));
		Thread.sleep(1000);
		ObjectClass2.NEXT.click();
		
		wait.until(ExpectedConditions.visibilityOf(ObjectClass2.waitForHighmarkSucc));
		wait.until(ExpectedConditions.elementToBeClickable(ObjectClass2.NEXT));
		Thread.sleep(1000);
		ObjectClass2.NEXT.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectClass2.NEXT));
		Thread.sleep(1000);
		ObjectClass2.NEXT.click(); // Navigating to DDE
	}
		
}
