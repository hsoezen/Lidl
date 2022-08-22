package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class LidlKategorienPage {

    public LidlKategorienPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='category']//a[@class='s-anchor s-anchor--interactive']")
    public List<WebElement> Unterkategorien;

    @FindBy(xpath = "//ol[@class='n-header__main-navigation n-header__navigation-list n-header__subnavigation-list']//span[@class='n-header__main-navigation-link-text']")
    public List<WebElement> option;

    @FindBy(xpath = "(//ol[@class='n-header__main-navigation n-header__main-navigation--sub'])[1]//a[@class='n-header__main-navigation-link n-header__main-navigation-link--sub']")
    public List<WebElement> KategorienList;

    @FindBy(xpath = "(//a[@class='s-facet__collapse-link'])[1]")
    public WebElement allesAnzeigenKategorien;

    @FindBy(xpath = "//li[@class='s-facet__item s-facet__item--parent s-facet__item--child-with-kids']//li")
    public List<WebElement> UnterUnterkategorien;

    @FindBy(xpath = "//ol[@class='s-grid']//h2")
    public List<WebElement> produkte;

    @FindBy(xpath = "(//img[@data-qa-label='select-image-thumbnail'])[1]")
    public WebElement farbeAuswahl;

    @FindBy(id = "product-stockAvailability")
    public WebElement stueckAuswahl;

    @FindBy(id = "addToCart")
    public WebElement inDEnWArenKorbButton;

    @FindBy(xpath = "//button[@class='otc-cart-flyout__button otc-cart-flyout__button--to-checkout']")
    public WebElement zurKasseButton;

    @FindBy(id = "guest-account-email-wrapper-input")
    public WebElement EmailAdresseTextfeldAlsGastBestellen;

    @FindBy(xpath = "//span[@data-ee='login-guest-repeat-email']")
    public WebElement EmailWiederholenTextfeld;

    @FindBy(id = "guest-account-submit")
    public WebElement alsGatBestellenButton;

    @FindBy(xpath = "(//p[@class='otc-cart-flyout__cart-item-name'])[2]")
    public WebElement ProduktimWarenkorb;

    @FindBy(id = "Preis-filter-input-min")
    public WebElement minPreisFilterTextBox;

    @FindBy(id = "Preis-filter-input-max")
    public WebElement maxPreisFilterTextBox;

    @FindBy(xpath = "//div[@class='m-price__price m-price__price--small']")
    public List<WebElement> Preise;

    @FindBy(xpath = "//a[@class='s-load-more__button']")
    public WebElement weitereProdukteLaden;

    @FindBy(xpath = "//div[@class='n-footer']//span[@class='n-footer__bottom-banner-close-button']")
    public WebElement Werbungschliessen;

    @FindBy(xpath = "(//ul[@class='s-facet__list'])[4]//li")
    public List<WebElement> MarkenList;
}
