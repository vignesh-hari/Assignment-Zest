package utils;



import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;


import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;



public class WebTestBase {

    public WebDriver driver;


    @Parameters({"browser"})
    @BeforeClass
    public void invokeBrowser(String browser) throws MalformedURLException {

       driver=new Drivers().getWebDriver(browser);
       driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void closeBrowser(){

       driver.quit();

    }


}
