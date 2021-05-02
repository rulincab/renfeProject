package pageObjects;

import core.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderPage extends BasePage {

    public HeaderPage(WebDriver browser){
      super(browser, 5);
    }

    //locators
    @FindBy(css = ".rf-header__principal > li:nth-of-type(1)")
    private WebElement travelMenu;

    @FindBy(css = ".rf-header__principal > li:nth-of-type(2)")
    private WebElement ExperienceMenu;

    @FindBy(css = ".rf-header__principal > li:nth-of-type(3)")
    private WebElement surroundingsMenu;

    @FindBy(css = ".rf-header__tools > li:nth-of-type(1)")
    private WebElement helpOption;

    @FindBy(css = ".rf-header__tools > li:nth-of-type(2)")
    private WebElement renfeGroupMenu;

    @FindBy(css = ".rf-header__tools > li:nth-of-type(3)")
    private WebElement searchOption;

    @FindBy(css = ".rf-header__tools > li:nth-of-type(4)")
    private WebElement lenguangeMenu;

    @FindBy(css = ".rf-header__tools > li:nth-of-type(5)")
    private WebElement profileOption;



}
