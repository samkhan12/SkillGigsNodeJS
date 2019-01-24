package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;

public class ReactSignUp extends BasePage{

    //*********Constructor*********
    public ReactSignUp(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Web Elements*********
    String usenamexpath = "//input[@data-auto='signInEmail']";
    String pwdxpath = "//input[@data-auto='signInPassword']";
    String Loginxpath = "//input[@data-auto='signInButton']";


  //React Sign In  
    String logoutButtonxpath = "/html/body/div[1]/div/div[1]/div[3]/div/div/div/div/a[4]";
    String logoutDrpdnid = "accountDesktop";
    String errorMessageUsernameXpath = "//*[@id=\"signinForm\"]/div/div/div/div/div[1]/span";
    String errorMessagePasswordXpath = "//*[@id=\"signinForm\"]/div/div/div/div/div[1]/span";
    String errorMessageEmptyUsernameXpath = "//*[@id=\"signinForm\"]/div/div/div/div/div[1]/span";
    String errorMessageEmptyPasswordXpath = "//*[@id=\"signinForm\"]/div/div/div/div/div[1]/span";
    String title = "SkillGigs - Gig Search";
    String startbtxpath = "/html/body/div[2]/div/div[3]/div/div/p/a/strong";
    String Editbtxpath = "/html/body/div[2]/div/div[3]/div[1]/div[2]/p/a";
    String preferrednameId = "preferredName";
    String TagLineId = "tagLine";
    String SavebtnId = "btnSubmit";
    String title1 = "SkillGigs - Talent - Resume";
    String EditPgTitle = "SkillGigs - Talent - Resume - About Me";
    String Alphalength = "/html/body/div[2]/div/div[3]/form/div[2]/div[2]/small[2]/span/span";
    String Dresumeclick = "/html/body/div[1]/div/div[1]/div[3]/div/div/div/div/a[2]";
    String ValidationSavebtn = "//*[@id=\"aboutForm\"]/div[2]/div[2]/small[1]/span/span";
    String ValidationSavebtnError = "/html/body/div[2]/div/div[3]/form/div[1]/span";
    String ErrorOnFieldEmpty = "//*[@id=\"aboutForm\"]/div[2]/div[2]/small[1]/span/span";
    String MainLogout = "drop1";
    String ErroronNumeric = "/html/body/div[2]/div/div[3]/form/div[2]/div[2]/small[1]/span/span";
    String invalidlgnPwdxpath = "//*[@id=\"signInError\"]/div/ul/li";
    String usernameid = "signInEmail";
    String passxpath = "//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div/div/div[2]/div/input";
    String Loginsxpath = "//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div/button";
    String loginerror = "//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div/div[2]";
    String Validuname = "//*[@id=\"signInError\"]/div/ul/li";
    String InvalidID = "//*[@id=\"signInError\"]/div/ul/li[1]";
    String PWdEmpty = "//*[@id=\"signInError\"]/div/ul/li[2]";
    String PWDEmpty2 = "//*[@id=\"signInError\"]/div/ul/li";
    String title2 = "SkillGigs | Talent Job Search Marketplace | Hire Top Talent";
    String Logout1 = "//*[@id=\"accountDesktop\"]/span";
    String Logout2 = "//*[@id=\"accountDesktop\"]/div/a[4]";   
    String fblogin = "//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div/p[1]/button";
    String linkedlogin = "//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div/p[2]/button";
    String title3 = "Facebook";
    String title4 = "Authorize | LinkedIn";

//React Sign Up
    
    String Fullname = "//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div/div[1]/div/input";
    String Signupemail = "//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div/div[2]/div/input";
    String Signuppass = "//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div/div[3]/div/input";
    String Signupbtn  = "/html/body/div[2]/div/div/div/div/div/div/div/div/form/div/button";
    String Emailinvalid = "//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div/div[4]/div/ul/li";
    String EmailOneinvalid = "//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div/div[4]/div/ul/li[2]";
    String Fullnameinvalid = "//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div/div[4]/div/ul/li[1]";
    String Passinvalid = "//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div/div[4]/div/ul/li[3]";
    String FullnameOneinvalid = "//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div/div[4]/div/ul/li";
    String PassOneinvalid = "//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div/div[4]/div/ul/li";
    String Emailexist = "//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div/div[4]/div/ul/li";
    String Validlogin = "//*[@id=\"site-content\"]/div/div/div/div/div[2]/div/h4";
    
    
    //******React Page Methods*******
    public void SignupData (String fullname, String email, String password ) throws InterruptedException{
      
        writeText(By.xpath(Fullname),fullname);
      
        writeText(By.xpath(Signupemail), email);
  
        writeText(By.xpath(Signuppass), password);
       
        Thread.sleep(1000);
        click(By.xpath(Signupbtn));
        
      driver.findElement(By.xpath(Fullname)).clear();
      driver.findElement(By.xpath(Signupemail)).clear();  
      driver.findElement(By.xpath(Signuppass)).clear();  

    }
    
    
    //****React Sign Up Verification Method******
    
    //Verify Email invalid Condition
    
    public void verifyInvalidData (String expectedText) {
        Assert.assertEquals(readText(By.xpath(Emailinvalid)), expectedText);
    }
    
    public void verifyInvalidEmail (String expectedText) {
        Assert.assertEquals(readText(By.xpath(EmailOneinvalid)), expectedText);
    }
    
    //Verify Fullname invalid Condition
    public void verifyInvalidFullname (String expectedText) {
        Assert.assertEquals(readText(By.xpath(Fullnameinvalid)), expectedText);
    }
    
    //Verify Password invalid Condition
    public void verifyInvalidPwd (String expectedText) {
        Assert.assertEquals(readText(By.xpath(Passinvalid)), expectedText);
    }
    
    //Verify FullnameOne invalid Condition
    public void verifyFullnameOneinvalid (String expectedText) {
        Assert.assertEquals(readText(By.xpath(FullnameOneinvalid)), expectedText);
    }
    
    //Verify PasswordOne invalid Condition
    public void verifyPwdOneinvalid (String expectedText) {
        Assert.assertEquals(readText(By.xpath(PassOneinvalid)), expectedText);
    }
    
    //Verify PasswordOne invalid Condition
    public void verifyEmailexist(String expectedText) {
        Assert.assertEquals(readText(By.xpath(Emailexist)), expectedText);
    }
    
    public void verifylogin(String expectedText) {
        Assert.assertEquals(readText(By.xpath(Validlogin)), expectedText);
    }
    
    //*********Page Methods*********
    
    public void loginToSkillGigs (String username, String password){
        //Enter Username
        writeText(By.id(usernameid),username);
        //Enter Password
        writeText(By.xpath(passxpath), password);
        //Click Login Button
        click(By.xpath(Loginsxpath));
        driver.findElement(By.id(usernameid)).clear();
        driver.findElement(By.xpath(passxpath)).clear();

 

    }
    
    public void loginclick (){
       
        click(By.xpath(Loginsxpath));

    }
    
    public void logoutToSkillGigs () throws InterruptedException {
     
        //Click Logout Button
    	Thread.sleep(5000);
        click(By.xpath(Logout1));
        click(By.xpath(Logout2));
    }
    
    
    public void fblogin () throws InterruptedException {
     
    	click(By.xpath(fblogin));
      
    }
    public void linkedInlogin () throws InterruptedException {
        
    	click(By.xpath(linkedlogin));
      
    }
    
    
    public void NavigateToResume () throws InterruptedException {
        
        //Click Logout Button
    	Thread.sleep(5000);
        click(By.id(logoutDrpdnid));
        click(By.xpath(Dresumeclick));

    }

    public void ResumeStart () throws InterruptedException {
        
       
    	Thread.sleep(1000);
        click(By.xpath(startbtxpath));
    }
    
    public void Editbtnclick () throws InterruptedException {
        
        
    	Thread.sleep(1000);
        click(By.xpath(Editbtxpath));
    }
    
 public void Preferredname (String preferredname) throws InterruptedException {

	 writeText(By.id(preferrednameId),preferredname);
	 
    }
 

public void Tagline (String Tagline) throws InterruptedException {
	 writeText(By.id(TagLineId),Tagline);
	 
    }
 
 public void SaveBtnClick () throws InterruptedException {
     
     click(By.id(SavebtnId));
}
 
 public void MainLogt () throws InterruptedException {
     Thread.sleep(5000);
     click(By.id(MainLogout));
}

    //Verify Username and Password Condition
 

//Verify Username Condition
   public void verifyloginerror (String expectedText) {
	    Assert.assertEquals(readText(By.xpath(loginerror)), expectedText);
	    
	    }
   

   
   public void verifyvalidUserNameInvalidPwd (String expectedText) {
	    Assert.assertEquals(readText(By.xpath(Validuname)), expectedText);
	    
	    }
    public void verifyInvalidUserNamePwd (String expectedText) {
    Assert.assertEquals(readText(By.xpath(invalidlgnPwdxpath)), expectedText);
    
    }
    public void verifyinvalidID (String expectedText) {
        Assert.assertEquals(readText(By.xpath(InvalidID)), expectedText);
    }
    
    
    public void verifyPwdEmpty (String expectedText) {
        Assert.assertEquals(readText(By.xpath(PWdEmpty)), expectedText);
    }
    public void verifyPwdEmpty2 (String expectedText) {
        Assert.assertEquals(readText(By.xpath(PWDEmpty2)), expectedText);
    }
 
    public void verifyvalidUsenamevalidpwd(String expectedText) {
    	AssertJUnit.assertEquals(title2, "SkillGigs | Talent Job Search Marketplace | Hire Top Talent");
    	
    	
    }
    public void verifyfblogin(String expectedText) {
    	AssertJUnit.assertEquals(title3, "Facebook");
    	
    	
    }
    public void verifyLinkedInlogin(String expectedText) {
    	AssertJUnit.assertEquals(title4, "Authorize | LinkedIn");
    	
    	
    }
    
    
    //Verify Username Condition
    public void verifyLoginUserName (String expectedText) {
        Assert.assertEquals(readText(By.xpath(errorMessageUsernameXpath)), expectedText);
    }

    //Verify Password Condition
    public void verifyLoginPassword (String expectedText) {
        Assert.assertEquals(readText(By.xpath(errorMessagePasswordXpath)), expectedText);
    }
    //Verify Empty Username Condition
    public void verifyEmptyUsername (String expectedText) {
        Assert.assertEquals(readText(By.xpath(errorMessageEmptyUsernameXpath)), expectedText);
    }   
   //Verify Empty Password Condition
    public void verifyEmptyPassword (String expectedText) {
        Assert.assertEquals(readText(By.xpath(errorMessageEmptyPasswordXpath)), expectedText);
        
    }
  //Verify Empty Password Condition
    public void verifyEditResumePage (String expectedText) {
    	AssertJUnit.assertEquals(title1, "SkillGigs - Talent - Resume");
		
	
		
    }
    public void verify3DEditResumePage (String expectedText) {
    	AssertJUnit.assertEquals(EditPgTitle, "SkillGigs - Talent - Resume - About Me");
    	
    }
    
    public void verifyPreferredAlpha (String expectedText) {
        Assert.assertEquals(readText(By.id(preferrednameId)), expectedText);
    }
    
    public void verifyPreferredNum (String expectedText) {
        Assert.assertEquals(readText(By.id(preferrednameId)), expectedText);
    }
    
    public void verifyAlphaLength (String expectedText) {
        Assert.assertEquals(readText(By.xpath(Alphalength)), expectedText);
    }  
    


public void verifySavebtnValidation (String expectedText) {
        Assert.assertEquals(readText(By.xpath(ValidationSavebtn)), expectedText);
}  

public void VerifyValidationSavebtnError (String expectedText) {
        Assert.assertEquals(readText(By.xpath(ValidationSavebtnError)), expectedText);
        
}
public void VerifyErrorOnFieldEmpty (String expectedText) {
    Assert.assertEquals(readText(By.xpath(ErrorOnFieldEmpty)), expectedText);
    
    
 
}
public void VerifyErroronNumeric (String expectedText) {
    Assert.assertEquals(readText(By.xpath(ErroronNumeric)), expectedText);  
}
}    
        

