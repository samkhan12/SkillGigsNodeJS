package tests;

import java.lang.reflect.Method;

import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ReactSignIn;
import utils.ExtentReports.ExtentTestManager;


public class ReactSignInTest extends BaseTest {
	
	

    // Extra information:
    // 1) @BeforeClass we declared driver and wait variables
    // 2) We send these driver and wait variables to the page class with below declaration
    // 3) super () method in page class transfer the driver and wait variables values to the BasePage class.
	
	@Test (priority = 0, testName="Verify the error message displayed when user enter invalid  username and invalid password")
	public void TC_Negative_Verify_InvalidUserName_InvalidPassword () throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify the error message displayed when user enter invalid  username and invalid password");
        
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver,wait);
 
        ReactSignIn SignInPage = new ReactSignIn(driver,wait);
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        //Login to SkillGigs
        SignInPage.loginToSkillGigs("email@@domain.web", "q");
     
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        //SignInPage.verifyloginerror("There was some error with your submission");

        SignInPage.verifyInvalidUserNamePwd("You must enter valid email ID");
       
	 }
		@Test (priority = 1, description="Verify the error message displayed when user enter invalid  username and valid password")
	    public void TC_Negative_Verify_InvalidUserName_validPassword () throws InterruptedException {
		    BasicConfigurator.configure();
	        //ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Verify the error message displayed when user enter invalid  username and valid password");
	        
	        //*************PAGE INSTANTIATIONS*************
	        HomePage homePage = new HomePage(driver,wait);
	 
	        ReactSignIn SignInPage = new ReactSignIn(driver,wait);
	        //*************PAGE METHODS********************
	   
	       // homePage.goToSkillGigs();
	        Thread.sleep(2000);

	        //Login to SkillGigs
	        SignInPage.loginToSkillGigs("email@@domain.web", "qwerty");
	     
	        //*************ASSERTIONS***********************
	        Thread.sleep(2000);
	        //SignInPage.verifyloginerror("There was some error with your submission");

	        SignInPage.verifyInvalidUserNamePwd("You must enter valid email ID");
	    }
		
		@Test (priority = 2, description="Verify the error message displayed when user enter valid  username and invalid password")
	    public void TC_Negative_Verify_validUserName_InvalidPassword () throws InterruptedException {
		    BasicConfigurator.configure();
	        //ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Verify the error message displayed when user enter valid  username and invalid password");
	        
	        //*************PAGE INSTANTIATIONS*************
	        HomePage homePage = new HomePage(driver,wait);
	 
	        ReactSignIn SignInPage = new ReactSignIn(driver,wait);
	        //*************PAGE METHODS********************
	        Thread.sleep(2000);

	       // homePage.goToSkillGigs();
	        
	        //Login to SkillGigs
	        SignInPage.loginToSkillGigs("sroye@iqtechpros.com", "q");
	     
	        //*************ASSERTIONS***********************
	        Thread.sleep(2000);
	        //SignInPage.verifyloginerror("There was some error with your submission");

	        SignInPage.verifyvalidUserNameInvalidPwd("Incorrect username/password.");
    }
		
		@Test (priority = 3, description="Verify the error message displayed when user enter incorrect  username and incorrect password")
	    public void TC_Negative_Verify_IncorrectUserName_IncorrectPassword () throws InterruptedException {
		    BasicConfigurator.configure();
	        //ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Verify the error message displayed when user enter incorrect  username and incorrect password");
	        
	        //*************PAGE INSTANTIATIONS*************
	        HomePage homePage = new HomePage(driver,wait);
	 
	        ReactSignIn SignInPage = new ReactSignIn(driver,wait);
	        //*************PAGE METHODS********************
	        Thread.sleep(2000);

	       // homePage.goToSkillGigs();
	        
	        //Login to SkillGigs
	        SignInPage.loginToSkillGigs("sroye@iqtechpro.com", "q");
	     
	        //*************ASSERTIONS***********************
	        Thread.sleep(2000);
	        //SignInPage.verifyloginerror("There was some error with your submission");

	        SignInPage.verifyvalidUserNameInvalidPwd("Incorrect username/password.");
    }
		
		@Test (priority = 4, description="Verify the error message displayed by incorrect username and correct password")
	    public void TC_Negative_Verify_IncorrectUserName_correctPassword () throws InterruptedException {
		    BasicConfigurator.configure();
	        //ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Verify the error message displayed by incorrect username and correct password");
	        
	        //*************PAGE INSTANTIATIONS*************
	        HomePage homePage = new HomePage(driver,wait);
	 
	        ReactSignIn SignInPage = new ReactSignIn(driver,wait);
	        //*************PAGE METHODS********************
	        Thread.sleep(2000);

	       // homePage.goToSkillGigs();
	        
	        //Login to SkillGigs
	        SignInPage.loginToSkillGigs("sroye@iqtechpro.com", "qwerty");
	     
	        //*************ASSERTIONS***********************
	        Thread.sleep(2000);
	        //SignInPage.verifyloginerror("There was some error with your submission");

	        SignInPage.verifyvalidUserNameInvalidPwd("Incorrect username/password.");
    }
		
		@Test (priority = 5, description="Verify the error message displayed by correct username and incorrect password")
	    public void TC_Negative_Verify_correctUserName_IncorrectPassword () throws InterruptedException {
		    BasicConfigurator.configure();
	        //ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Verify the error message displayed by correct username and incorrect password");
	        
	        //*************PAGE INSTANTIATIONS*************
	        HomePage homePage = new HomePage(driver,wait);
	 
	        ReactSignIn SignInPage = new ReactSignIn(driver,wait);
	        //*************PAGE METHODS********************
	        Thread.sleep(2000);

	       // homePage.goToSkillGigs();
	        
	        //Login to SkillGigs
	        SignInPage.loginToSkillGigs("sroye@iqtechpros.com", "q");
	     
	        //*************ASSERTIONS***********************
	        Thread.sleep(2000);
	        //SignInPage.verifyloginerror("There was some error with your submission");

	        SignInPage.verifyvalidUserNameInvalidPwd("Incorrect username/password.");
    }
		
		@Test (priority = 6, description="Verify the error message displayed by empty username and empty password")
	    public void TC_Negative_Verify_EmptyUserName_EmpltyPassword () throws InterruptedException {
		    BasicConfigurator.configure();
	        //ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Verify the error message displayed by empty username and empty password");
	        
	        //*************PAGE INSTANTIATIONS*************
	        HomePage homePage = new HomePage(driver,wait);
	 
	        ReactSignIn SignInPage = new ReactSignIn(driver,wait);
	        //*************PAGE METHODS********************

	       // homePage.goToSkillGigs();
	        
	        //Login to SkillGigs
	        driver.navigate().refresh();
	        Thread.sleep(2000);

	        SignInPage.loginclick();
	     
	        //*************ASSERTIONS***********************
	        Thread.sleep(2000);
	        //SignInPage.verifyloginerror("There was some error with your submission");

	        SignInPage.verifyinvalidID("You must enter valid email ID");
	        SignInPage.verifyPwdEmpty("Password cannot be empty");

    }
		
		@Test (priority = 7, description="Verify the error message displayed by empty username and valid password")
	    public void TC_Negative_Verify_EmptyUserName_ValidPassword () throws InterruptedException {
		    BasicConfigurator.configure();
	        //ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Verify the error message displayed by empty username and valid password");
	        
	        //*************PAGE INSTANTIATIONS*************
	        HomePage homePage = new HomePage(driver,wait);
	 
	        ReactSignIn SignInPage = new ReactSignIn(driver,wait);
	        //*************PAGE METHODS********************

	       // homePage.goToSkillGigs();
	        	        //Login to SkillGigs
	 
	        Thread.sleep(2000);

	        SignInPage.loginToSkillGigs("", "qwerty");
	     
	        //*************ASSERTIONS***********************
	        Thread.sleep(2000);
	        //SignInPage.verifyloginerror("There was some error with your submission");

	        SignInPage.verifyinvalidID("You must enter valid email ID");
	     

    }
		
		@Test (priority = 8, description="Verify the error message displayed by valid username and empty password")
	    public void TC_Negative_Verify_UserName_ValidPassword () throws InterruptedException {
		    BasicConfigurator.configure();
	        //ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Verify the error message displayed by valid username and empty password");
	        
	        //*************PAGE INSTANTIATIONS*************
	        HomePage homePage = new HomePage(driver,wait);
	 
	        ReactSignIn SignInPage = new ReactSignIn(driver,wait);
	        //*************PAGE METHODS********************

	       // homePage.goToSkillGigs();
	        
	        //Login to SkillGigs
	 
	        Thread.sleep(2000);

	        SignInPage.loginToSkillGigs("sroye@iqtechpros.com", "");
	     
	        //*************ASSERTIONS***********************
	        Thread.sleep(2000);
	        //SignInPage.verifyloginerror("There was some error with your submission");

	        SignInPage.verifyPwdEmpty2("Password cannot be empty");
	     

    }
		
		
		
		@Test (priority = 9, description="Verify the new user by valid  username and valid password")
	    public void TC_Positive_Verify_ValidUserName_ValidPassword () throws InterruptedException {
		    BasicConfigurator.configure();
	        //ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Verify the new user by valid  username and valid password");
	        
	        //*************PAGE INSTANTIATIONS*************
	        HomePage homePage = new HomePage(driver,wait);
	 
	        ReactSignIn SignInPage = new ReactSignIn(driver,wait);
	        //*************PAGE METHODS********************

	       // homePage.goToSkillGigs();
	        
	        //Login to SkillGigs
	 
	        Thread.sleep(2000);

	        SignInPage.loginToSkillGigs("sroye@iqtechpros.com", "test");
	     
	        //*************ASSERTIONS***********************
	        Thread.sleep(2000);
	        //SignInPage.verifyloginerror("There was some error with your submission");

	        SignInPage.verifyvalidUsenamevalidpwd("SkillGigs | Talent Job Search Marketplace | Hire Top Talent");
	        SignInPage.logoutToSkillGigs();

    }

		@Test (priority =10, description="Verify the new user login by facebook")
	    public void TC_Positive_Verify_the_NewUser_login_ByFacebook () throws InterruptedException {
		    BasicConfigurator.configure();
	        //ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Verify the new user login by facebook");
	        
	        //*************PAGE INSTANTIATIONS*************
	        HomePage homePage = new HomePage(driver,wait);
	 
	        ReactSignIn SignInPage = new ReactSignIn(driver,wait);
	        //*************PAGE METHODS********************

	       // homePage.goToSkillGigs();
	        
	        //Login to SkillGigs
	 
	        Thread.sleep(2000);

	        SignInPage.fblogin();
	     
	        //*************ASSERTIONS***********************
	        Thread.sleep(2000);
	        //SignInPage.verifyloginerror("There was some error with your submission");

	        SignInPage.verifyfblogin("Facebook");
	      

    }
		@Test (priority =10, description="Verify the new user login by LinkedIn")
	    public void TC_Positive_Verify_the_NewUser_login_ByLinkedIn () throws InterruptedException {
		    BasicConfigurator.configure();
	        //ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Verify the new user login by LinkedIn");
	        
	        //*************PAGE INSTANTIATIONS*************
	        HomePage homePage = new HomePage(driver,wait);
	 
	        ReactSignIn SignInPage = new ReactSignIn(driver,wait);
	        //*************PAGE METHODS********************

	       // homePage.goToSkillGigs();
	        
	        //Login to SkillGigs
	 
	        Thread.sleep(2000);

	        SignInPage.fblogin();
	     
	        //*************ASSERTIONS***********************
	        Thread.sleep(2000);
	        //SignInPage.verifyloginerror("There was some error with your submission");

	        SignInPage.verifyLinkedInlogin("Authorize | LinkedIn");
	      

    }
		
		
}