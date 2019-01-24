package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageSignUp extends BasePage {



    //*********Constructor*********
    public HomePageSignUp (WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Page Variables*********
    String baseURL = "http://52.3.245.139/SignUp/Talent";

    //*********Web Elements*********
    // String signInButtonClass = "//*[@id=\"nav1\"]/ul[2]/li[1]/a";
    
    //*********Page Methods*********

    //Go to Homepage
        public void goToSkillGigs (){
        driver.get(baseURL);
     

        //driver.navigate().to(baseURL)
    }

    //Go to LoginPage
  //   public void goToLoginPage (){
  //  click(By.xpath(signInButtonClass));
    }


