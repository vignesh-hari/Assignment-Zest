package utils;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class WebBasePage extends WaitStatement {

    WebDriver driver;

    public WebBasePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    public void open(String url) {

        driver.get(url);

    }

    public void enterElementVisible(By by, String value, String name, int time) {
        WebElement element = findElementVisibility(by, time);
        if (element != null) {
            element.clear();
            element.sendKeys(value);

        } else {

            Assert.fail(name + " -  element not present");
        }
    }


    public void clickElementVisible(By by, String name, int time) {
        WebElement element = findElementVisibility(by, time);
        if (element != null) {
            element.click();

        } else {

            Assert.fail(name + " - element not present");
        }
    }


    public void getPageSourceAndVerify(String value) {
        if (driver.getPageSource().contains(value)) {

        } else {
            Assert.fail(value + " not present");
        }
    }


    public void staticWait(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }


}
