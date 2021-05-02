package tests;

import core.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
    private WebDriver driver;

    @BeforeClass
    public void initBrowser() {

        DriverFactory factory = new DriverFactory();
        driver = factory.getDriver("chrome");
    }

    public WebDriver getDriver() {
        return driver;
    }

    //@BeforeMethod
    public void getRenfe() {

        if(driver != null) {
            driver.get("https://www.renfe.com/es/es");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            //driver.findElement(By.xpath(".//input[@id='sp-cc-accept']")).click();
        }
    }


    // @AfterClass
    public void cleanUp() {

        if(driver != null)
            driver.quit();
    }
}
