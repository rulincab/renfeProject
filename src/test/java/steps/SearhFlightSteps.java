package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import pageObjects.FlightParamPage;

import java.net.MalformedURLException;
import java.net.URL;

public class SearhFlightSteps {

    private WebDriver driver;
    FlightParamPage searhfield;

    @Before
    public void setUp() throws MalformedURLException {
        //System.setProperty("webdriver.gecko.driver", "D:\\CURSO\\Drivers\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "/Users/esalgue/Desktop/drivers/chromedriver");

        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
    }
    @Given("^The User is on the home page$")
    public void the_User_is_on_the_home_page() throws Throwable {
        driver.get("https://www.renfe.com/es/es");
        driver.manage().window().maximize();
    }

    @When("^The user types wrong words in the fields \"([^\"]*)\" and \"([^\"]*)\"$")
    public void the_user_types_wrong_words_in_the_fields_and(String arg1, String arg2) throws Throwable {
        searhfield = new FlightParamPage(driver);
        searhfield.sendTextOrigin(arg1);
        searhfield.sendTextDestination(arg2);
    }

    @Then("^it shows the error message \"([^\"]*)\" when the fields text are incorrect$")
    public void it_shows_the_error_message_when_the_fields_text_are_incorrect(String expectedMessage) throws Throwable {
        searhfield = new FlightParamPage(driver);
        Assert.assertEquals(searhfield.getErrorMessage(), expectedMessage);
    }
}
