 package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {



    //*********Constructor*********
    public HomePage (WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Page Variables*********
    String baseURL = "http://ec2-100-26-56-195.compute-1.amazonaws.com/SignIn";

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


