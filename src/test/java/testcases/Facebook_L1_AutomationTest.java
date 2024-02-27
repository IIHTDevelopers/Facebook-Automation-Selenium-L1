

package testcases;

import java.util.Map;
import static testutils.TestUtils.businessTestFile;
import static testutils.TestUtils.currentTest;
import static testutils.TestUtils.yakshaAssert;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import coreUtilities.testutils.ApiHelper;
import coreUtilities.utils.FileOperations;
import pages.FaceBookPage;
import pages.StartupPage;
import testBase.AppTestBase;

public class Facebook_L1_AutomationTest extends AppTestBase {
	
	Map<String, String> configData;
	Map<String, String> loginCredentials;
	String expectedDataFilePath = testDataFilePath+"expected_data.json";
	StartupPage startupPage;
	FaceBookPage FaceBookPageInstance;
	
	
	@Parameters({"browser", "environment"})
	@BeforeClass(alwaysRun = true)
	public void initBrowser(String browser, String environment) throws Exception {
		configData = new FileOperations().readJson(config_filePath, environment);
		configData.put("url", configData.get("url").replaceAll("[\\\\]", ""));
		configData.put("browser", browser);
		
		boolean isValidUrl = new ApiHelper().isValidUrl(configData.get("url"));
		//Assert.assertTrue(isValidUrl, configData.get("url")+" might be Server down at this moment. Please try after sometime.");
		yakshaAssert(currentTest(), isValidUrl, businessTestFile);

		initialize(configData);
		startupPage = new StartupPage(driver);
	}
	
	@Test(priority = 1, groups = {"sanity"}, description="Validate the login Page")
	public void validateFacebookLoginPage() throws Exception {
		
		try{
		softAssert = new SoftAssert();		
		FaceBookPageInstance = new FaceBookPage(driver);
		
		FaceBookPageInstance.validateTheLoginPage();
		//softAssert.assertEquals("todo", FaceBookPageInstance.validateTheLoginPage());
		yakshaAssert(currentTest(), false, businessTestFile);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}
		
	}
	@Test(priority = 2, groups = {"sanity"}, description="Validate other fields login Page")
	public void validatePresenceOfOtherFieldsInLoginPage() throws Exception {
		try{
		softAssert = new SoftAssert();		
		FaceBookPageInstance = new FaceBookPage(driver);
		FaceBookPageInstance.validatePresenceOfAllFieldInTheLoginPage();
		yakshaAssert(currentTest(), false, businessTestFile);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}
	}
	@Test(priority = 3, groups = {"sanity"}, description="Validate incorrect username")
	public void validateIncorrectUsernameDuringLogin() throws Exception {
		try{
		softAssert = new SoftAssert();		
		FaceBookPageInstance = new FaceBookPage(driver);
		FaceBookPageInstance.Validate_Incorrect_username();
		yakshaAssert(currentTest(), false, businessTestFile);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}
	}
	
	@Test(priority = 4, groups = {"sanity"}, description="Validate incorrect password")
	public void Validate_incorrect_password() throws Exception {
		try{
		softAssert = new SoftAssert();		
		FaceBookPageInstance = new FaceBookPage(driver);
		FaceBookPageInstance.Validate_Incorrect_Password();
		yakshaAssert(currentTest(), false, businessTestFile);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}
	}
	
	@Test(priority = 5, groups = {"sanity"}, description="Provide valid username and password")
	public void Login() throws Exception {
		try{
		FaceBookPageInstance = new FaceBookPage(driver);
		//Note the below todo and method username_password() has to be implemented by the implementor
		FaceBookPageInstance.username_password();
		yakshaAssert(currentTest(), false, businessTestFile);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}
	}
	@Test(priority = 6, groups = {"sanity"}, description="Validate that the login button is present and clickable")
	public void login_button_is_Clickable() throws Exception {
		try{
		softAssert = new SoftAssert();		
		FaceBookPageInstance = new FaceBookPage(driver);
		FaceBookPageInstance.loginbutton_is_present_clickable();
		yakshaAssert(currentTest(), false, businessTestFile);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}
	}
	
	@Test(priority = 7, groups = {"sanity"}, description="Validate title of the login page")
	public void Validate_title_of_the_login_page() throws Exception {
		try{
		softAssert = new SoftAssert();		
		FaceBookPageInstance = new FaceBookPage(driver);
		FaceBookPageInstance.titleoftheloginpage();
		yakshaAssert(currentTest(), false, businessTestFile);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}
	}
	
	@Test(priority = 8, groups = {"sanity"}, description="verify Forgot Password? link redirects to the password recovery page")
	public void forgot_password() throws Exception {
		try{
		softAssert = new SoftAssert();		
		FaceBookPageInstance = new FaceBookPage(driver);
		FaceBookPageInstance.Click_on_forgot_password();
		yakshaAssert(currentTest(), false, businessTestFile);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}
	}
	
	@Test(priority = 9, groups = {"sanity"}, description="Verify that clicking on the Create New Account button")
	public void Create_New_Account() throws Exception {
		try{
		softAssert = new SoftAssert();		
		FaceBookPageInstance = new FaceBookPage(driver);
		FaceBookPageInstance.Click_on_Create_new_account();
		yakshaAssert(currentTest(), false, businessTestFile);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}
	}
	@Test(priority = 10, groups = {"sanity"}, description="Verify that user navigates to the signup page")
	public void CreateNewAccount() throws Exception {
		try{
		softAssert = new SoftAssert();		
		FaceBookPageInstance = new FaceBookPage(driver);
		FaceBookPageInstance.navigate_to_the_signUp_page();
		yakshaAssert(currentTest(), false, businessTestFile);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}
	}
	
	@Test(priority = 11, groups = {"sanity"}, description="Enter values in the First name and Surname")
	public void Enter_data_in_First_name_Surname() throws Exception {
		try{	
		FaceBookPageInstance = new FaceBookPage(driver);
		//Note the below todo and method Click_on_Create_new_account() has to be implemented by the implementor
		FaceBookPageInstance.enter_firstName_surname();
		yakshaAssert(currentTest(), false, businessTestFile);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}
	}
	
	@Test(priority = 12, groups = {"sanity"}, description="Enter values in the Mobile number ")
	public void Enter_data_in_Mobile_number_password() throws Exception {
		try{	
		FaceBookPageInstance = new FaceBookPage(driver);
		//Note the below todo and method Click_on_Create_new_account() has to be implemented by the implementor
		FaceBookPageInstance.enter_MobileNumber();
		yakshaAssert(currentTest(), false, businessTestFile);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}
	}
	
	@Test(priority = 13, groups = {"sanity"}, description="Select different dates from the Date Of Birth fields")
	public void Date_Of_Birth_fields() throws Exception {
		try{	
		FaceBookPageInstance = new FaceBookPage(driver);
		//Note the below todo and method select_different_DOB_fields() has to be implemented by the implementor
		FaceBookPageInstance.select_different_DOB_fields();
		yakshaAssert(currentTest(), false, businessTestFile);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}
	}
	@Test(priority = 14, groups = {"sanity"}, description="Validate that date,year and months are selectable")
	public void dates_are_selectable() throws Exception {
		try{	
		softAssert = new SoftAssert();		
		FaceBookPageInstance = new FaceBookPage(driver);
		FaceBookPageInstance.verify_dates_are_selectable();
		yakshaAssert(currentTest(), false, businessTestFile);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}
	}
	
	@Test(priority = 15, groups = {"sanity"}, description="Verify selected DOB values should be captured accurately")
	public void DOB_values_captured_accurately() throws Exception {
		try{	
		softAssert = new SoftAssert();		
		FaceBookPageInstance = new FaceBookPage(driver);
		FaceBookPageInstance.verify_captured_DOB_values();
		yakshaAssert(currentTest(), false, businessTestFile);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}
	}
	@Test(priority = 16, groups = {"sanity"}, description="Select each radio button option for gender")
	public void Select_each_radio_button() throws Exception {
		try{	
		FaceBookPageInstance = new FaceBookPage(driver);
		//Note the below todo and method verify_captured_DOB_values() has to be implemented by the implementor
		 FaceBookPageInstance.select_radio_buttons();
		 yakshaAssert(currentTest(), false, businessTestFile);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}
	}
	
	@Test(priority = 17, groups = {"sanity"}, description="Validate that only one radio button option should be selectable at a time")
	public void select_one_radio_button() throws Exception {
		try{	
		softAssert = new SoftAssert();		
		FaceBookPageInstance = new FaceBookPage(driver);
		FaceBookPageInstance.Validate_only_one_radio_button_should_be_selectable();
		yakshaAssert(currentTest(), false, businessTestFile);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}
	}
	
	@Test(priority = 18, groups = {"sanity"}, description="Verify that clicking on the Terms link redirects to the Facebook Terms of Service page")
	public void clicking_on_the_Terms() throws Exception {
		try{	
		softAssert = new SoftAssert();		
		FaceBookPageInstance = new FaceBookPage(driver);
		FaceBookPageInstance.navigate_to_Terms_page();
		yakshaAssert(currentTest(), false, businessTestFile);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}
	}
	
	@Test(priority = 19, groups = {"sanity"}, description="Ensure that clicking on the Data Policy link redirects to the Facebook Data Policy page")
	public void clicking_on_the_Data_Policy_link() throws Exception {	
		try{
		softAssert = new SoftAssert();		
		FaceBookPageInstance = new FaceBookPage(driver);
		FaceBookPageInstance.navigate_to_Data_Policy();
		yakshaAssert(currentTest(), false, businessTestFile);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}
	}
	
	@Test(priority = 20, groups = {"sanity"}, description="Click on the sign up button,leave the new password as empty")
	public void click_on_sign_up() throws Exception {	
		try{
		FaceBookPageInstance = new FaceBookPage(driver);
		//Note the below todo and method navigate_to_Data_Policy() has to be implemented by the implementor
		 FaceBookPageInstance.clicking_on_sign_up();
		 yakshaAssert(currentTest(), false, businessTestFile);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}
	}
	
	@Test(priority = 21, groups = {"sanity"}, description="Verify that error messages for incomplete field displayed as appropriate")
	public void verify_error_message() throws Exception {	
		try{
		softAssert = new SoftAssert();		
		FaceBookPageInstance = new FaceBookPage(driver);
		FaceBookPageInstance.validate_the_error_message();
		yakshaAssert(currentTest(), false, businessTestFile);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}
	}
	
	
	
	@AfterClass(alwaysRun = true)
	public void tearDown() {
		System.out.println("before closing the browser");
		browserTearDown();
	}
	
	@AfterMethod
	public void retryIfTestFails() throws Exception {
		startupPage.navigateToUrl(configData.get("url"));
	}


}
