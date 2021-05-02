package tests;

import core.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.FlightParamPage;

public class RenfeBuyingTest extends TestBase {


    FlightParamPage searhfield = null;

    private static String expectedMessage = "Seleccione una estación válida";

    @BeforeClass
    public void getRenfe(){
        getRenfe();
    }

    @Test
public void mandatoryFields(){
        searhfield.sendTextOrigin("a");
        searhfield.sendTextDestination("a");
        Assert.assertEquals(searhfield.getErrorMessage(), expectedMessage);

    }

@AfterClass
    public  void clean(){
       cleanUp();
    }
}
