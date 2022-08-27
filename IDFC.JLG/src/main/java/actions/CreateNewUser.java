package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import objects.ObjectClass1;

public class CreateNewUser {
		static WebDriver driver;
		
		public CreateNewUser(WebDriver driver1) {
			this.driver=driver1;
		}
		
		public static void newUser() throws InterruptedException {
			
			PageFactory.initElements(driver, ObjectClass1.class);
			WebDriverWait wait=new WebDriverWait(driver,5000);
			wait.until(ExpectedConditions.elementToBeClickable(ObjectClass1.createNew));
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(ObjectClass1.createNew)).click();
		}
		
		
}
