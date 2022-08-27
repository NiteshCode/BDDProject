package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import actions.CreateNewUser;
import actions.DemographicDetail;
import actions.LoanDetailsPage;
import actions.ManualDataEntry;
import actions.PassAadharNum;
import actions.PassMobileNum;
import actions.PersonalIdentifier;
import actions.SFLogin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDef {
	WebDriver driver;
	static String ID,otp;
@Given("^GRO logins into Salesforce \"([^\"]*)\"\"([^\"]*)\"$")
public void gro_logins_into_Salesforce(String Username, String Password) throws Throwable {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\JAR\\JAR\\chromedriver1.exe"); 
	  driver = new ChromeDriver(); 
	  driver.get("https://idfc--jlgqa.lightning.force.com/lightning/r/Contact/003720000009jsLAAQ/view"); //QA
	 //QA GRO- https://idfc--jlgqa.lightning.force.com/lightning/r/Contact/003720000097gzpAAA/view
	// JLG GRO-https://idfc--jlgqa.lightning.force.com/lightning/r/Contact/003720000009jsLAAQ/view
	  //driver.get("https://idfc--jlguat.lightning.force.com/lightning/r/Contact/00372000000BwgbAAC/view");  //UAT
	  		
	  driver.manage().window().maximize();
	  PageFactory.initElements(driver,SFLogin.class );
	  SFLogin.sendCred(Username,Password);
}

@Then("^GRO clicks on Create new application button$")
public void gro_clicks_on_Create_new_application_button() throws Throwable {
	PageFactory.initElements(driver,CreateNewUser.class);
	CreateNewUser.newUser();
}

@Then("^GRO provides Mobile phone number\"([^\"]*)\"$")
public void gro_provides_Mobile_phone_number(String MobileNumber) throws Throwable {
	PageFactory.initElements(driver,PassMobileNum.class);
	PassMobileNum.sendMob(MobileNumber);
	}

@Then("^GRO provides OTP and validates$")
public void gro_provides_OTP_and_validates() throws Throwable {
	PassMobileNum.sendOTP(ID,otp);
}

@Then("^GRO provides Aadhar number \"([^\"]*)\" and clicks on search$")
public void gro_provides_Aadhar_number_and_clicks_on_search(String AadharNum) throws Throwable {
	PageFactory.initElements(driver,PassAadharNum.class);
	PassAadharNum.sendAadhar(AadharNum);
}

@Then("^Aadhar validation takes place through via backend\"([^\"]*)\"\"([^\"]*)\"$")
public void aadhar_validation_takes_place_through_via_backend(String AadharNum, String AadharRef) throws Throwable {
	PassMobileNum.valAdhar(AadharNum,AadharRef);   
}

@Then("^Manual Data Entry option to be available post three failure attempt of EKYC$")
public void manual_Data_Entry_option_to_be_available_post_three_failure_attempt_of_EKYC() throws Throwable {
    PageFactory.initElements(driver, ManualDataEntry.class);
	ManualDataEntry.goManual();
}

@Then("^GRO Clicks all Edit Details for all the section$")
public void gro_Clicks_all_Edit_Details_for_all_the_section() throws Throwable {
	PageFactory.initElements(driver, DemographicDetail.class);
	DemographicDetail.editPersonalDetails();
}

@Then("^GRO Provides Personals Details \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
public void gro_Provides_Personals_Details(String Title, String FirstName, String LastName, String DOB, String MaritalStatus, String FathersFirstName, String FathersLastName) throws Throwable {
	PageFactory.initElements(driver, DemographicDetail.class);
	DemographicDetail.persDetails(Title,FirstName,LastName,DOB,MaritalStatus,FathersFirstName,FathersLastName);
	PageFactory.initElements(driver, PersonalIdentifier.class);
	PersonalIdentifier.uploadPhoto();
}

@Then("^GRO selects either \"([^\"]*)\" based on the requirement \"([^\"]*)\"$")
public void gro_selects_either_based_on_the_requirement(String PanOrForm60, String PanID) throws Throwable {
	PageFactory.initElements(driver, DemographicDetail.class);
	DemographicDetail.PanOrFormSixty(PanOrForm60,PanID);
}

@Then("^GRO provides Address \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
public void gro_provides_Address(String Addr1, String Addr2, String landmark, String PinCode) throws Throwable {
	PageFactory.initElements(driver, DemographicDetail.class);
	DemographicDetail.editAddress(Addr1,Addr2,landmark,PinCode);
	PageFactory.initElements(driver, PersonalIdentifier.class);
	//PersonalIdentifier.moveToLoan();
}


@Then("^GRO selects identifierOne and uploads the document \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
public void gro_selects_identifierOne_and_uploads_the_document(String PIone_Aadhar_CKYC_DL_NPR_NREGA_Pport_VotID, String VotIDIdentifierType, String VotIDNum, String PI2_Aadhar_CKYC_DL_NPR_NREGA_Pport_VotID) throws Throwable {
	PageFactory.initElements(driver, PersonalIdentifier.class);
	PersonalIdentifier.addIdentifier();
	PersonalIdentifier.persId1(PIone_Aadhar_CKYC_DL_NPR_NREGA_Pport_VotID,VotIDIdentifierType,VotIDNum,PI2_Aadhar_CKYC_DL_NPR_NREGA_Pport_VotID);
	PersonalIdentifier.uploadDoc(PIone_Aadhar_CKYC_DL_NPR_NREGA_Pport_VotID);
	PersonalIdentifier.getAadharRef();
}
@Then("^GRO selects the loan pack \"([^\"]*)\"$")
public void gro_selects_the_loan_pack(String LoanPackID) throws Throwable {
	PageFactory.initElements(driver, LoanDetailsPage.class);
	LoanDetailsPage.selectLoan(LoanPackID);
}

@Then("^GRO reads the Posidex Response and acts accordingly$")
public void gro_reads_the_Posidex_Response_and_acts_accordingly() throws Throwable {
    
}
}
