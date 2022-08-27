package actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import objects.ObjectClass1;

public class PassMobileNum {
	static String appId;
	static WebDriver driver;

	public PassMobileNum(WebDriver driver1) {
		this.driver = driver1;
	}

	public static void sendMob(String MobileNumber) throws InterruptedException {
		PageFactory.initElements(driver, ObjectClass1.class);
		WebDriverWait wait = new WebDriverWait(driver, 5000);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(ObjectClass1.enterMobnum)).sendKeys(MobileNumber);
		ObjectClass1.enterMobnum.clear();
		ObjectClass1.enterMobnum.sendKeys(MobileNumber);
		Thread.sleep(1000);
		ObjectClass1.searchMob.click(); 
		Thread.sleep(1000);  
		ObjectClass1.enterMobnum.clear();
		Thread.sleep(1000);
		ObjectClass1.enterMobnum.sendKeys(MobileNumber); ObjectClass1.searchMob.click(); ObjectClass1.searchMob.click();
		
		/*WebElement inputBox = ObjectClass1.enterMobnum;
		String textInsideInputBox = inputBox.getAttribute("value");
		try {
			if (ObjectClass1.errorMsg.isDisplayed()) {
				ObjectClass1.enterMobnum.sendKeys(MobileNumber);
				ObjectClass1.searchMob.click();
				ObjectClass1.searchMob.click();
			}
			else if(textInsideInputBox.isEmpty()) {
				System.out.println("Mobile Number field contains "+ObjectClass1.enterMobnum.getText());
				ObjectClass1.enterMobnum.sendKeys(MobileNumber);
				ObjectClass1.searchMob.click();
				ObjectClass1.searchMob.click();
			}
		} catch (Exception e) {
		}*/
	}

	public static void sendOTP(String ID, String otp) throws InterruptedException, AWTException {
		WebDriverWait wait = new WebDriverWait(driver, 5000);
		Thread.sleep(2000);
		String currentURL = driver.getCurrentUrl();
		ID = currentURL.substring(74, 92);
		wait.until(ExpectedConditions.visibilityOf(ObjectClass1.sendOTP)).click();
		Thread.sleep(4000); //reduced from 4 to 2 sec
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_T);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
		String MainWindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {
			String ChildWindow = i1.next();
			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				driver.get("https://idfc--jlgqa.my.salesforce.com/" + ID);
				Thread.sleep(5000);
				try {
					if (driver.findElement(By.xpath("//*[@id='oneHeader']/div[2]/span/div[2]/ul/li[8]/span/button/div/span[1]/div/span")).isDisplayed()) {
						driver.findElement(By.xpath("//*[@id='oneHeader']/div[2]/span/div[2]/ul/li[8]/span/button/div/span[1]/div/span")).click();
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Switch to Salesforce Classic']"))).click();
						Thread.sleep(2000);
						driver.get("https://idfc--jlgqa.my.salesforce.com/" + ID);
					}
				} catch (Exception e) {
				}
				appId = wait.until(ExpectedConditions.visibilityOf(ObjectClass1.getAppID)).getText();
				wait.until(ExpectedConditions.visibilityOf(ObjectClass1.getAppID)).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='" + appId + "_RelatedHistoryList_body']/table/tbody/tr[2]/th/a"))).click();
                Thread.sleep(2000);
				String msg = wait.until(ExpectedConditions.visibilityOf(ObjectClass1.getSMSMsg)).getText();
				otp = msg.substring(67, 73);
			}
		}
		driver.switchTo().window(MainWindow);
		wait.until(ExpectedConditions.visibilityOf(ObjectClass1.passOTP)).sendKeys(otp);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(ObjectClass1.validateOTP)).click();
	}

	public static void valAdhar(String AadharNum, String AadharRef) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 5000);
		String MainWindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {
			String ChildWindow = i1.next();
			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				driver.get("https://idfc--jlgqa.my.salesforce.com/" + appId);
				wait.until(ExpectedConditions.elementToBeClickable(ObjectClass1.edit)).click();
				wait.until(ExpectedConditions.elementToBeClickable(ObjectClass1.passRefAadhar));
				wait.until(ExpectedConditions.elementToBeClickable(ObjectClass1.passRefAadhar)).sendKeys(AadharRef);
				//wait.until(ExpectedConditions.elementToBeClickable(ObjectClass1.passRefAadhar)).sendKeys(AadharNum);
				ObjectClass1.ekycSuccessCheckbox.click();
				Select drp = new Select(ObjectClass1.ekycBiometricstatus);
				drp.selectByVisibleText("Success");
				ObjectClass1.ekycTimerCheckbox.click();
				Thread.sleep(1000);
				ObjectClass1.save.click();
			}
		}
		driver.switchTo().window(MainWindow);
		wait.until(ExpectedConditions.elementToBeClickable(ObjectClass1.nextSuccessResponse)).click();
	}

}
