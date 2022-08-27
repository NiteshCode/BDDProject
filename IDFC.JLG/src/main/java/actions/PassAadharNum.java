package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import objects.ObjectClass1;

public class PassAadharNum {
	static WebDriver driver;
	public PassAadharNum(WebDriver driver1) {
		this.driver=driver1;
	}
	
	public static void sendAadhar(String AadharNum) throws InterruptedException {
		PageFactory.initElements(driver, ObjectClass1.class);
		WebDriverWait wait=new WebDriverWait(driver,5000); 
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(ObjectClass1.passAadhar)).sendKeys(AadharNum);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement scrollToSearch= driver.findElement(By.xpath("//*[text()='SEARCH']"));
		js.executeScript("arguments[0].scrollIntoView();", scrollToSearch);
		ObjectClass1.searchAadhar.click();
		Thread.sleep(1000);
		}
	}
