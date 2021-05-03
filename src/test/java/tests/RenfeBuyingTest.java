package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.FlightParamPage;

public class RenfeBuyingTest {

    private WebDriver driver;
    FlightParamPage searhfield;

    private static String expectedMessage = "Seleccione una estación válida";
    private static String expectedListTitle = "Renfe - Lista de Trenes";
    @BeforeMethod
    public void setUp(){
        //System.setProperty("webdriver.gecko.driver", "D:\\CURSO\\Drivers\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "/Users/esalgue/Desktop/drivers/chromedriver");

        driver = new ChromeDriver();
        //driver = new FirefoxDriver();

        driver.get("https://www.renfe.com/es/es");
        driver.manage().window().maximize();

    }

    @Test
public void mandatoryFields(){
        searhfield = new FlightParamPage(driver);
        searhfield.sendTextOrigin("a");
        searhfield.sendTextDestination("a");
        Assert.assertEquals(searhfield.getErrorMessage(), expectedMessage);
    }
    @Test
    public void disabledButtons(){
        searhfield = new FlightParamPage(driver);
       Assert.assertEquals(searhfield.disabledButton(), false);
    }
    @Test
    public void searcTicket(){
        searhfield = new FlightParamPage(driver);
        searhfield.sendTextOrigin("madrid");
        searhfield.selectFirstValueOrigin();
        searhfield.sendTextDestination("barcelona");
        searhfield.selectFirstValueDestination();
        Assert.assertEquals(searhfield.disabledButton(), true);
        searhfield.clickButton();
        Assert.assertEquals(driver.getTitle(), expectedListTitle);

    }

@AfterClass
    public  void clean(){
    }
}
