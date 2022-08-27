package actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import objects.ObjectClass1;

public class DemographicDetail {
	static WebDriver driver;
	public DemographicDetail(WebDriver driver1) {
		this.driver=driver1;
	}
	
	public static void editPersonalDetails() throws InterruptedException {
		PageFactory.initElements(driver, ObjectClass1.class);
		WebDriverWait wait=new WebDriverWait(driver,5000); 
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element =ObjectClass1.editDetailsPersonal;
		js.executeScript("arguments[0].scrollIntoView();", Element);*/
		try {
			wait.until(ExpectedConditions.visibilityOf(ObjectClass1.editDetailsPersonal)).click();
		}
		catch (Exception e) {  }
		}
	
	public static void persDetails(String Title, String FirstName, String LastName, String DOB, String MaritalStatus, String FathersFirstName, String FathersLastName) throws InterruptedException {
		PageFactory.initElements(driver, ObjectClass1.class);
		WebDriverWait wait=new WebDriverWait(driver,5000); 
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(ObjectClass1.enterFName)).sendKeys(FirstName);
		Thread.sleep(1000);
		ObjectClass1.enterlName.sendKeys(LastName);
		Select drpTitle=new Select(ObjectClass1.titleSelect);
		Thread.sleep(2000);
		drpTitle.selectByVisibleText(Title);
		ObjectClass1.DOB.sendKeys(DOB);
		ObjectClass1.maritalStatus.sendKeys(MaritalStatus);
		ObjectClass1.fatherFName.sendKeys(FathersFirstName);
		ObjectClass1.fatherLName.sendKeys(FathersLastName);
		driver.findElement(By.xpath("//*[@for='applicantMobileNumber']")).click();
		Thread.sleep(1000);
		}
	
	public static void PanOrFormSixty(String PanOrForm60, String PanID) throws InterruptedException {
		PageFactory.initElements(driver, ObjectClass1.class);
		WebDriverWait wait=new WebDriverWait(driver,5000);		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element =ObjectClass1.fatherFName;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		if(PanOrForm60.equals("Form60")) {
			ObjectClass1.selectForm60.click();
		}
		else {
			ObjectClass1.selectPAN.click();
			wait.until(ExpectedConditions.visibilityOf(ObjectClass1.enterPANID)).sendKeys(PanID);
			ObjectClass1.validatePan.click();	
			}
		}
	
	public static void editAddress(String Addr1, String Addr2, String landmark, String PinCode) throws InterruptedException {
		PageFactory.initElements(driver, ObjectClass1.class);
		WebDriverWait wait=new WebDriverWait(driver,5000); 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//used Form60 to scroll as otherwise it was scrolling more down due to which Edit Address button was not visible
		WebElement Element =ObjectClass1.selectForm60;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(8000); //Waiting for GetReference ID to be fetched
		try{if(driver.findElement(By.xpath("(//*[text()='Edit Details'])[1]")).isDisplayed()) {
			wait.until(ExpectedConditions.visibilityOf(ObjectClass1.editDetailAddress)).click();
		}}
		catch(Exception e){
			
		}
		
		ObjectClass1.address1.sendKeys(Addr1);
		ObjectClass1.address2.sendKeys(Addr2);
		ObjectClass1.enterLandmark.sendKeys(landmark);
		ObjectClass1.enterPin.sendKeys(PinCode);
	    driver.findElement(By.xpath("//*[@id='addressDetails']/div/div/div/div[6]/label")).click();
		Thread.sleep(1000);
		
		//js.executeScript("arguments[0].scrollIntoView();",ObjectClass1.copyAddCheckbox );
		ObjectClass1.copyAddCheckbox.click();
		Thread.sleep(1000);
		Select selecVTC=new Select(ObjectClass1.vtc);
		selecVTC.selectByIndex(1);
		
		}
	
}
