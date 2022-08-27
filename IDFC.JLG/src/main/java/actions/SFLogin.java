package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import objects.ObjectClass1;



public class SFLogin {
	static WebDriver driver;
	public SFLogin(WebDriver driver1) {
		this.driver=driver1;
	}

	public static void sendCred(String Username, String Password) throws InterruptedException {
		PageFactory.initElements(driver, ObjectClass1.class);
		WebDriverWait wait=new WebDriverWait(driver,5000); 
		wait.until(ExpectedConditions.visibilityOf(ObjectClass1.userName)).sendKeys(Username);
		ObjectClass1.passWord.sendKeys(Password);
		ObjectClass1.login.click();
		Thread.sleep(5000);
		
		/*if (driver.findElement(By.xpath("//*[@id='oneHeader']/div[2]/span/div[2]/ul/li[8]/span/button/div/span[1]/div/span")).isDisplayed()) {
			driver.findElement(By.xpath("//*[@id='oneHeader']/div[2]/span/div[2]/ul/li[8]/span/button/div/span[1]/div/span")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Switch to Salesforce Classic']"))).click();
			Thread.sleep(2000);
		}
		*/
		
		wait.until(ExpectedConditions.visibilityOf(ObjectClass1.moreButton)).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(ObjectClass1.loginAsUser)).click();
		
		
	}


}
