package tests;

import java.lang.reflect.Method;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HomePageSignUp;
import pages.ReactSignIn;
import pages.ReactSignUp;
import utils.ExtentReports.ExtentTestManager;


public class ReactSignUpTest extends BaseTest {
	
	

    // Extra information:
    // 1) @BeforeClass we declared driver and wait variables
    // 2) We send these driver and wait variables to the page class with below declaration
    // 3) super () method in page class transfer the driver and wait variables values to the BasePage class.
	
	@Test (priority = 0, testName="Verify the error message displayed when user enter invalid full name, invalid email id and incorrect password")
	public void TC_Negative_Verify_ErrorDisplayed_whenuser_enter_invalid_fullname_emailid_password() throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify the error message displayed when user enter invalid full name, invalid email id and incorrect password");
        
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver,wait);
 
        ReactSignUp SignUpPage = new ReactSignUp(driver,wait);
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(4000);
        //Login to SkillGigs
        SignUpPage.SignupData("sam khan", "email@!abc.com", "qwerty");
     
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        //SignInPage.verifyloginerror("There was some error with your submission");
        SignUpPage.verifyInvalidData("You must enter valid email ID");
 
	    }
	
	
	@Test (priority = 1, testName="Verify the error message displayed by empty fullname, empty email and empty password")
	public void TC_Negative_Verify_the_Errormessage_displayedby_emptyfullname_emptyemail_emptypassword() throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify the error message displayed by empty fullname, empty email and empty password");
        
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver,wait);
 
        ReactSignUp SignUpPage = new ReactSignUp(driver,wait);
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(4000);
        //Login to SkillGigs
        SignUpPage.SignupData("", "", "");
     
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        //SignInPage.verifyloginerror("There was some error with your submission");
        
        SignUpPage.verifyInvalidFullname("You must enter valid name");
        SignUpPage.verifyInvalidEmail("You must enter valid email ID");
        SignUpPage.verifyInvalidPwd("Password cannot be empty");

 
	    }
	
	@Test (priority = 2, testName="Verify the error message displayed by empty fullname")
	public void TC_Negative_Verify_the_ErrorMessage_Displayedby_emptyfullname() throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify the error message displayed by empty fullname");
        
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver,wait);
 
        ReactSignUp SignUpPage = new ReactSignUp(driver,wait);
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        //Login to SkillGigs
        SignUpPage.SignupData("", "email1@abc.com", "qwerty");
     
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        //SignInPage.verifyloginerror("There was some error with your submission");
        
        SignUpPage.verifyFullnameOneinvalid("You must enter valid name");
 
	    }
	
	@Test (priority = 3, testName="Verify the error message displayed by empty password")
	public void TC_Negative_Verify_the_ErrorMessage_Displayedby_emptypassword() throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify the error message displayed by empty password");
        
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver,wait);
 
        ReactSignUp SignUpPage = new ReactSignUp(driver,wait);
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        //Login to SkillGigs
        SignUpPage.SignupData("sam khan", "email1@abc.com", "");
     
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        SignUpPage.verifyPwdOneinvalid("Password cannot be empty");
 
	    }
	
	
	@Test (priority = 4, testName="Verify that error message is displayed by empty email address")
	public void TC_Negative_Verify_the_ErrorMessage_Displayedby_emptyaddress() throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that error message is displayed by empty email address");
        
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver,wait);
 
        ReactSignUp SignUpPage = new ReactSignUp(driver,wait);
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        //Login to SkillGigs
        SignUpPage.SignupData("sam khan", "", "qwerty");
     
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        SignUpPage.verifyInvalidData("You must enter valid email ID");
	    }
	
	
	
	@Test (priority = 5, testName="Verify that error message is displayed when user enters invalid email address.")
	public void TC_Negative_Verify_the_ErrorMessage_Displayedby_Invalidaddress() throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that error message is displayed when user enters invalid email address.");
        
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver,wait);
 
        ReactSignUp SignUpPage = new ReactSignUp(driver,wait);
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        //Login to SkillGigs
        SignUpPage.SignupData("sam khan", "email@!abc.com", "qwerty");
     
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        SignUpPage.verifyInvalidData("You must enter valid email ID");
	    }
	
	
	@Test (priority = 6, testName="Verify that user is shown error message when user uses existing email id for SignUp")
	public void TC_Negative_Verify_the_ErrorMessage_usesExistingemail() throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that user is shown error message when user uses existing email id for SignUp");
        
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver,wait);
 
        ReactSignUp SignUpPage = new ReactSignUp(driver,wait);
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        //Login to SkillGigs
        SignUpPage.SignupData("sam khan", "email@domain.com", "qwerty");
     
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        SignUpPage.verifyInvalidData("The email address is already being used.");
	    }
	
	
	@Test (priority = 7, testName="Verify that new user is able to SignUp properly with valid data")
	public void TC_Negative_Verify_the_NewUser_IsableTo_SignUp_with_ValidData() throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that new user is able to SignUp properly with valid data");
        
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver,wait);
 
        ReactSignUp SignUpPage = new ReactSignUp(driver,wait);
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        //Login to SkillGigs
        SignUpPage.SignupData("sam khan", "email8@test.com", "qwerty");
     
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        SignUpPage.verifylogin("Thank you for signing up for SkillGigs");
	    }
	}