package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebBasePage;

public class FbPostPageObjects  extends WebBasePage {
    WebDriver driver;
    public FbPostPageObjects(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }
    public void creatPost(){
        clickElementVisible(By.xpath("//div[@class='_m_1 _1gr3']"),"Status",10);
        staticWait(4000);
        WebElement text = driver.findElement(By.xpath("//div[@class='_1mf _1mj']"));
        text.click();
        text.sendKeys("Hello World");
    }
    public void clickPost(){
        clickElementVisible(By.xpath("//span[contains(text(),'Post')]"),"Post",10);
    }

    public void verifyStatus(){
        getPageSourceAndVerify("Hello World");
    }
}
