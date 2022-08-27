package actions;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import objects.ObjectClass2;


public class PersonalIdentifier {
	static WebDriver driver;
	public PersonalIdentifier(WebDriver driver1) {
		this.driver=driver1;
	}
	
	public static void addIdentifier() {
		PageFactory.initElements(driver, ObjectClass2.class);
		WebDriverWait wait=new WebDriverWait(driver,5000); 
		wait.until(ExpectedConditions.visibilityOf(ObjectClass2.addIdentifierbutton)).click();
	}
	
	public static void persId1(String PIone_Aadhar_CKYC_DL_NPR_NREGA_Pport_VotID, String VotIDIdentifierType, String VotIDNum, String PI2_Aadhar_CKYC_DL_NPR_NREGA_Pport_VotID) throws InterruptedException {
		PageFactory.initElements(driver, ObjectClass2.class);
		WebDriverWait wait=new WebDriverWait(driver,5000); 
		wait.until(ExpectedConditions.visibilityOf(ObjectClass2.selectIden));
		
		  Select PI=new Select(ObjectClass2.selectIden); 
		  Thread.sleep(1000);
		  PI.selectByVisibleText(PIone_Aadhar_CKYC_DL_NPR_NREGA_Pport_VotID);
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[contains(text(),'Add Additional Identifier')]")).click();
		 
		Select PIType=new Select(ObjectClass2.identifierType);
		Thread.sleep(500);
		PIType.selectByVisibleText(VotIDIdentifierType);
		Thread.sleep(500);
		ObjectClass2.passVotRefID.sendKeys(VotIDNum);
		ObjectClass2.addIdentifier.click();
	}
	
	public static void uploadDoc(String PIone_Aadhar_CKYC_DL_NPR_NREGA_Pport_VotID) throws InterruptedException, AWTException {
		PageFactory.initElements(driver, ObjectClass2.class);
		WebDriverWait wait=new WebDriverWait(driver,5000); 
		wait.until(ExpectedConditions.visibilityOf(ObjectClass2.uploadKYC)).click();
		wait.until(ExpectedConditions.visibilityOf(ObjectClass2.selectIdentifierTypeToUpload));
		Select selectIdentifierName = new Select(ObjectClass2.selectIdentifierTypeToUpload);
		Thread.sleep(1000);
		selectIdentifierName.selectByVisibleText(PIone_Aadhar_CKYC_DL_NPR_NREGA_Pport_VotID);
		Thread.sleep(3000);
		WebElement browseButton =driver.findElement(By.xpath("//*[@id='modal-content-id-1']/div/div[2]/lightning-file-upload/lightning-input/div/div/lightning-primitive-file-droppable-zone"));
		ObjectClass2.uploadDoc.click();
		Thread.sleep(1000);
		Thread.sleep(2000);
		uploadfile("PosidexIssueSS1.PNG");  // Uploading Identifier
		wait.until(ExpectedConditions.elementToBeClickable(ObjectClass2.uploadDone));
		Thread.sleep(500);
		wait.until(ExpectedConditions.visibilityOf(ObjectClass2.uploadDone)).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(ObjectClass2.uploadCancel)).click();
		Thread.sleep(1000);
		/*
		 * ObjectClass2.uploadPhoto.click(); // Uploading Applicant Photo
		 * Thread.sleep(1000); Thread.sleep(2000); uploadfile("PosidexIssueSS1.PNG");
		 */
	}
	public static void uploadPhoto() throws AWTException, InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver,5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Upload Files']"))).click();
		//ObjectClass2.uploadPhoto2.click();   // Uploading Applicant Photo
		Thread.sleep(3000);
		uploadfile("PosidexIssueSS1.PNG");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Done']")));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Done']"))).click();
		//wait.until(ExpectedConditions.visibilityOf(ObjectClass2.uploadDone));
		//wait.until(ExpectedConditions.elementToBeClickable(ObjectClass2.uploadDone));
		//wait.until(ExpectedConditions.visibilityOf(ObjectClass2.uploadDone)).click();
	}
	
	public static void getAadharRef() {
		PageFactory.initElements(driver, ObjectClass2.class);
		WebDriverWait wait=new WebDriverWait(driver,5000); 
		wait.until(ExpectedConditions.elementToBeClickable(ObjectClass2.uploadKYC));
		try {
		ObjectClass2.getRefenceId.click();
		} catch(Exception e) {}
	}
	public static void setClipBoard(String file) {
		StringSelection obj=new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj, null);
	}
	public static void uploadfile(String filepath) throws AWTException {
		setClipBoard(filepath);
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_V);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		}
	public static void moveToLoan() {
		PageFactory.initElements(driver, ObjectClass2.class);
		WebDriverWait wait=new WebDriverWait(driver,5000); 
		wait.until(ExpectedConditions.visibilityOf(ObjectClass2.NEXT)).click();
		}
}
