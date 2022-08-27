package objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ObjectClass1 {
	@FindBy(how=How.XPATH,using="//*[@id='username']")
	public static WebElement userName;
	
	@FindBy(how=How.XPATH,using="//*[@id='password']")
	public static WebElement passWord;
	
	@FindBy(how=How.XPATH,using="//*[@id='Login']")
	public static WebElement login;
	
	@FindBy(how=How.XPATH,using="//*[@class='menu-button-item slds-dropdown-trigger slds-dropdown-trigger_click']")
	public static WebElement moreButton;
	
	@FindBy(how=How.XPATH,using="//*[text()='Log in to Experience as User']")
	public static WebElement loginAsUser;
	
	@FindBy(how=How.XPATH,using="//*[text()='CREATE NEW APPLICATION']")
	public static WebElement createNew;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter Mobile No']")
	public static WebElement enterMobnum;
	
	@FindBy(how=How.XPATH,using="//*[text()='Search']")
	public static WebElement searchMob;
	
	@FindBy(how=How.XPATH,using="//*[text()='Mobile number is required']")
	public static WebElement errorMsg;
	
	@FindBy(how=How.XPATH,using="//*[text()='SEND OTP']")
	public static WebElement sendOTP;
	
	
	//@FindBy(how=How.XPATH,using="/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[4]/div[2]/div[2]/table/tbody/tr[2]/td[2]/div/a")
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[4]/div[2]/div[2]/table/tbody/tr[3]/td[2]/div/a")
	public static WebElement getAppID;
	
	@FindBy(how=How.XPATH,using="//*[@id='tsk6_ileinner']")
	public static WebElement getSMSMsg;
	
	@FindBy(how=How.XPATH,using="//*[@placeholder='Enter OTP']")
	public static WebElement passOTP;
	
	@FindBy(how=How.XPATH,using="//*[text()='VALIDATE']")
	public static WebElement validateOTP;
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div[2]/div/div[2]/div/div/div/div/div[2]/div/c-add-new-applicant/lightning-card/article/div[2]/slot/lightning-layout/slot/lightning-layout-item[1]/slot/lightning-input/div/input")
	public static WebElement passAadhar;
	
	@FindBy(how=How.XPATH,using="//*[text()='SEARCH']")
	public static WebElement searchAadhar;
	
	@FindBy(how=How.XPATH,using="//*[@id='topButtonRow']/input[3]")
	public static WebElement edit;
	
	@FindBy(how=How.XPATH,using="//*[@id='00N720000002FTy']")
	public static WebElement passRefAadhar;
	
	@FindBy(how=How.XPATH,using="//*[@id='00N720000002FUV']")
	public static WebElement ekycSuccessCheckbox;
	
	@FindBy(how=How.XPATH,using="//*[@id='00N720000002FUU']")
	public static WebElement ekycBiometricstatus;
	
	@FindBy(how=How.XPATH,using="//*[@id='00N720000002FUr']")
	public static WebElement ekycTimerCheckbox;
	
	@FindBy(how=How.XPATH,using="//*[@id='bottomButtonRow']/input[1]")
	public static WebElement save;
	
	@FindBy(how=How.XPATH,using="//*[text()='NEXT']")
	public static WebElement nextSuccessResponse;
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div[2]/div/div[2]/div/div/div/div/div[2]/div/c-add-new-applicant/div/div/div/lightning-button-icon")
	public static WebElement closePopup;
	
	@FindBy(how=How.XPATH,using="(//*[text()='Edit Details'])[1]")
	public static WebElement editDetailsPersonal;
	
	@FindBy(how=How.XPATH,using="(//*[text()='Edit Details'])[1]")
	public static WebElement editDetailAddress;
	
	@FindBy(how=How.XPATH,using="//*[@name='title']")
	public static WebElement titleSelect;
	
	@FindBy(how=How.XPATH,using="//*[@placeholder='Enter First Name']")
	public static WebElement enterFName;
	
	@FindBy(how=How.XPATH,using="//*[@placeholder='Enter Last Name']")
	public static WebElement enterlName;
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div[1]/div[6]/div/div/input")
	public static WebElement DOB;
	
	@FindBy(how=How.XPATH,using="//*[@name='Marital Status']")
	public static WebElement maritalStatus;
	
	@FindBy(how=How.XPATH,using="//*[@placeholder=\"Enter Father's First Name\"]")
	public static WebElement fatherFName;
	
	@FindBy(how=How.XPATH,using="//*[@placeholder=\"Enter Father's Last Name\"]")
	public static WebElement fatherLName;
	
	@FindBy(how=How.XPATH,using="//*[@id='personalIdentifier']/div[1]/div/div/lightning-radio-group/fieldset/div/span[1]/label/span[1]")
	public static WebElement selectPAN;
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div/div/div[3]/div/div/div/div/div[2]/div[1]/div/div/input")
	public static WebElement enterPANID;
	
	@FindBy(how=How.XPATH,using="//*[text()='VALIDATE']")
	public static WebElement validatePan;
	
	@FindBy(how=How.XPATH,using="//*[@id='personalIdentifier']/div[1]/div/div/lightning-radio-group/fieldset/div/span[2]/label/span[1]")
	public static WebElement selectForm60;
	
	@FindBy(how=How.XPATH,using="//*[text()='ADD IDENTIFIER']")
	public static WebElement addIdentifier;
	
	@FindBy(how=How.XPATH,using="//*[text()='UPLOAD KYC']")
	public static WebElement uploadKYC;
	
	@FindBy(how=How.XPATH,using="(//*[@placeholder='Enter Address'])[1]")
	public static WebElement address1;
	
	@FindBy(how=How.XPATH,using="(//*[@placeholder='Enter Address'])[2]")
	public static WebElement address2;
	
	@FindBy(how=How.XPATH,using="(//*[@placeholder='Enter Address'])[3]")
	public static WebElement address3;
	
	@FindBy(how=How.XPATH,using="(//*[@placeholder='Enter Landmark'])[1]")
	public static WebElement enterLandmark;
	
	@FindBy(how=How.XPATH,using="(//*[@placeholder='Enter Pincode'])[1]")
	public static WebElement enterPin;
	
	@FindBy(how=How.XPATH,using="(//*[@name='VTC'])[1]")
	public static WebElement vtc;
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/div[6]/div/div[3]/div/div/div/div/h3/button/span[1]/div/div[2]/div/lightning-input/div/span/label/span[1]")
	public static WebElement copyAddCheckbox;
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div[2]/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[3]/button[1]")
	public static WebElement NextbuttonToLoanpack;
	
	
	
	
	
	
	
}
