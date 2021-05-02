package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightParamPage extends BasePage{

    public FlightParamPage(WebDriver browser){
        super(browser, 5);
    }

    @FindBy(id = "origin")
    private WebElement originField;

    @FindBy(id = "destination")
    private WebElement destinationField;

    @FindBy(id = "first-input")
    private WebElement departure;

    @FindBy(id = "trupType")
    private WebElement tripType;

    @FindBy(id = "passengers")
    private WebElement passengers;

    @FindBy(id = "promotions")
    private WebElement promotions;

    @FindBy(id = "hSeat")
    private WebElement seatCheckbox;

@FindBy(css = "button[type='submit']")
    private WebElement submitButton;


}
