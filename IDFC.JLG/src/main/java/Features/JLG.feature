Feature: GRO creating a new application
@AadharAuto
Scenario Outline: GRO creating a new application
Given GRO logins into Salesforce "<Username>""<Password>" 
Then GRO clicks on Create new application button
Then GRO provides Mobile phone number"<MobileNumber>" 
Then GRO provides OTP and validates
Then GRO provides Aadhar number "<AadharNum>" and clicks on search
Then Aadhar validation takes place through via backend"<AadharNum>""<AadharRef>"
Then GRO Clicks all Edit Details for all the section
Then GRO Provides Personals Details "<Title>""<FirstName>""<LastName>""<DOB>""<MaritalStatus>""<FathersFirstName>""<FathersLastName>"    
Then GRO selects either "<PanOrForm60>" based on the requirement "<PanID>"
#Then GRO selects identifierOne and uploads the document "<PIone_Aadhar_CKYC_DL_NPR_NREGA_Pport_VotID>""<VotIDIdentifierType>""<VotIDNum>""<PI2_Aadhar_CKYC_DL_NPR_NREGA_Pport_VotID>"
Then GRO provides Address "<Addr1>""<Addr2>""<landmark>""<PinCode>"
#Then GRO selects the loan pack "<LoanPackID>"
#Then GRO reads the Posidex Response and acts accordingly
Examples:
|          Username                       | Password |MobileNumber|  AadharNum |AadharRef|Title|  FirstName      |LastName|   DOB       |MaritalStatus|FathersFirstName|FathersLastName|PanOrForm60   |   PanID  |  Addr1   |   Addr2  |landmark |PinCode |PIone_Aadhar_CKYC_DL_NPR_NREGA_Pport_VotID|VotIDIdentifierType|VotIDNum   |PI2_Aadhar_CKYC_DL_NPR_NREGA_Pport_VotID|  LoanPackID |           
|username| xyz@1234 | 9387776123 |123412341234| 954065981234|Mrs |  Seven   |kumar|08/09/1978 |  Single    |      Mitcheel   |   Seeehnpy    |   Form60     |AATPS8757M|KormangIn|KormanegBlr|Test Test|625102    |              Voter ID                  |    POI & POA      |BDH0832365 |                Aadhar                  |  SS28K24M   |

	  
#@AadharManual
#Scenario Outline: GRO creating a new application by providing aadhar details manually
#Given GRO logins into Salesforce "<Username>""<Password>" 
#Then GRO clicks on Create new application button
#Then GRO provides Mobile phone number"<MobileNumber>" 
#Then GRO provides Aadhar number "<AadharNum>" and clicks on search
#Then Manual Data Entry option to be available post three failure attempt of EKYC 

#Examples:
#|          Username                       |Password  |MobileNumber|  AadharNum |
#|nitesh.sharma@veneratesolutions.com.jlgqa|March@2020|6940000000  |123412341234|