package actions;

import org.openqa.selenium.WebDriver;
import pageobjects.FbLoginPageObjects;
import pageobjects.FbPostPageObjects;

public class FbPostActions {
    WebDriver driver;
    FbLoginPageObjects login;
    FbPostPageObjects  post;




    public FbPostActions(WebDriver driver){
        this.driver=driver;
        login =new FbLoginPageObjects(driver);
        post =new FbPostPageObjects(driver);
    }
public void postStatusMessage(){
        login.navigateToFb();
        login.enterUserName();
        login.enterPassWord();
        login.clickLogin();
        post.creatPost();
        post.clickPost();
        post.verifyStatus();

}


}
