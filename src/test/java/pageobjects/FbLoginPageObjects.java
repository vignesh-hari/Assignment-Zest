package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebBasePage;

public class FbLoginPageObjects extends WebBasePage {


    String userName ="blackjelly185@gmail.com";
    String passWord="Next@next1";
    public FbLoginPageObjects(WebDriver driver)
    {
        super(driver);
    }

    public void navigateToFb(){
        open("https://www.facebook.com/");
    }
    public void enterUserName()
    {
          enterElementVisible(By.id("email"),userName,"UserName",10);

    }
    public void enterPassWord()
    {
        enterElementVisible(By.id("pass"),passWord,"Password",10);

    }
    public void clickLogin()
    {
         clickElementVisible(By.id("u_0_b"),"Login",10);
    }

}
