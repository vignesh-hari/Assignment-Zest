package utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

public class Drivers {

    public WebDriver driver;

    public WebDriver getWebDriver(String browser) throws MalformedURLException {

        if (browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\geckodriver.exe");
            driver = new FirefoxDriver();
        }else if (browser.equals("chrome")) {

            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
            Map<String, Object> prefs = new HashMap<String, Object>();
            prefs.put("profile.default_content_setting_values.notifications", 2);
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("prefs", prefs);
             driver = new ChromeDriver(options);
        }

        return driver;
    }



}
