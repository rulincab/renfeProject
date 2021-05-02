package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    private WebDriver driver = null;

    public WebDriver getDriver(String browser) {
        switch(browser.toLowerCase()) {
            case "chrome"  :
                System.setProperty("webdriver.chrome.driver", "/Users/esalgue/Desktop/drivers/chromedriver");
                driver = new ChromeDriver();
                break;
            case "firefox" :
                System.setProperty("webdriver.chrome.driver", "/Users/esalgue/Desktop/drivers/geckodriver");
                driver = new FirefoxDriver();
            default :
                System.out.println("Incorrect browser name provided "+ browser);
                System.out.println("Hence running in Chrome ");
                driver = new ChromeDriver();
                break;
        }
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);  // One time config done for the whole project
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // One time config
        return driver;
    }

    public void quitDriver() {
        if(driver!=null) {
            driver.quit();
        }
    }
}
