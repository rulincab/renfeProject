package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightParamPage{

    private WebDriver driver;
    private WebDriverWait wait;

    public FlightParamPage(WebDriver browser){
        this.driver = browser;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    @FindBy(css = "input[id='origin']")
    private WebElement originField;

    @FindBy(css = "input[id='destination']")
    private WebElement destinationField;

    @FindBy(id = "first-input")
    private WebElement departure;

    @FindBy(css = "rf-select[id='tripType'] > div:nth-of-type(1)")
    private WebElement tripTypeSeleted;

    @FindBy(css = "rf-select[id='tripType")
    private WebElement tripTypeText;


    @FindBy(id = "passengers")
    private WebElement passengers;

    @FindBy(id = "promotions")
    private WebElement promotions;

    @FindBy(id = "hSeat")
    private WebElement seatCheckbox;

@FindBy(css = "button[type='submit']")
    private WebElement submitButton;

@FindBy(css = "rf-awesomplete#origin .rf-input-autocomplete__txt-error")
private WebElement errorMessage;

@FindBy(css = "input[aria-label='Fecha vuelta']")
private WebElement returnDate;

@FindBy(css = "button[class='rf-select__list-text']")
private WebElement firstTripType;


public boolean lauchRenfe(String url){
    driver.get(url);
    return tripTypeSeleted.isDisplayed();
}

public void sendTextOrigin(String text){
    originField.clear();
    wait.until(ExpectedConditions.elementToBeClickable(originField)).sendKeys(text);
}

    public void selectFirstValueOrigin(){
    selectValue(originField);
    }

    public void selectFirstValueDestination(){
        selectValue(destinationField);

    }
    public void sendTextDestination(String text){
    destinationField.clear();
    wait.until(ExpectedConditions.elementToBeClickable(destinationField)).sendKeys(text);
    }

    public String getErrorMessage(){
    return wait.until(ExpectedConditions.visibilityOf(errorMessage)).getText();
    }

    public boolean disabledButton(){
        return submitButton.isEnabled();
    }

    public void selectValue(WebElement value){
        wait.until(ExpectedConditions.elementToBeClickable(value)).sendKeys(Keys.DOWN);
        value.sendKeys(Keys.ENTER);
    }

    public boolean clickButton(){
        boolean value = submitButton.isEnabled();
        wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
        return value;

    }

    public String returnDateField(){

    return wait.until(ExpectedConditions.elementToBeClickable(tripTypeSeleted)).getText();
    }

    public void tryTypeOnlyGo(){
        wait.until(ExpectedConditions.elementToBeClickable(tripTypeSeleted)).click();
        wait.until(ExpectedConditions.elementToBeClickable(firstTripType)).click();
    }



}
