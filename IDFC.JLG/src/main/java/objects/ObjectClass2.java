package objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class ObjectClass2 {
	
	@FindBy(how=How.XPATH,using="//*[text()='ADD IDENTIFIER']")
	public static WebElement addIdentifierbutton;
	
	@FindBy(how=How.XPATH,using="//*[@name='addIdentifier']")
	public static WebElement selectIden;
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div/div/div[3]/div/div/div/div[1]/section/div/div/div/div[3]/input")
	public static WebElement passCKYCrefID ;
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div/div/div[3]/div/div/div/div[1]/section/div/div/div/div[3]/input")
	public static WebElement passVotRefID;
	
	@FindBy(how=How.XPATH,using="//*[@name='identifierTypeVal']")
	public static WebElement identifierType;
	
	@FindBy(how=How.XPATH,using="//*[text()='ADD']")
	public static WebElement addIdentifier;
	
	@FindBy(how=How.XPATH,using="//*[text()='UPLOAD KYC']")
	public static WebElement uploadKYC ;
	
	@FindBy(how=How.XPATH,using="//*[@name='identifierNames']")
	public static WebElement selectIdentifierTypeToUpload;
	
	@FindBy(how=How.XPATH,using="//*[@id='modal-content-id-1']/div/div[2]/lightning-file-upload/lightning-input/div/div/lightning-primitive-file-droppable-zone")
	public static WebElement uploadDoc ;
	
	@FindBy(how=How.XPATH,using="/html/body/div[7]/div/div[2]/div/div[3]/div/span[2]/div/button/span")
	public static WebElement uploadDone;
	
	@FindBy(how=How.XPATH,using="//*[text()='Cancel']")
	public static WebElement uploadCancel;
	
	//@FindBy(how=How.XPATH,using="//*[@class=\"slds-file-selector__button slds-button slds-button_neutral\"]")
	@FindBy(how=How.XPATH,using="//*[text()='Upload Files']")
	public static WebElement uploadPhoto2; 	
	
	 @FindBy(how=How.XPATH,using="//*[text()='Get Reference Id']") 
	 public static WebElement getRefenceId;
	
	 @FindBy(how=How.XPATH,using="//*[@name='PackName']") 
	 public static WebElement selectLoan;
	  
	 @FindBy(how=How.XPATH,using="(//*[text()='Loan Details'])[3]") 
	 public static WebElement scrollToLoan;
	 
	 @FindBy(how=How.XPATH,using="//*[@class='slds-button slds-button_neutral slds-button slds-button slds-button_brand slds-float--right next-button']") 
	 public static WebElement NEXT;
	 
	 @FindBy(how=How.XPATH,using="//*[text()='Posidex Success']") 
	 public static WebElement waitForPosidexSucc;
	
	 @FindBy(how=How.XPATH,using="//*[text()='Highmark Success']") 
	 public static WebElement waitForHighmarkSucc;
	 
	
	
	  
	
	
	
}
