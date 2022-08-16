package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

import java.util.List;

public class LidlPage {


    public LidlPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (className = "cookie-alert-extended-button")
    public WebElement zustimmenButton;

    @FindBy(xpath = "//ol[@class='n-header__main-navigation n-header__navigation-list n-header__subnavigation-list']//span")
    public List<WebElement> menuOptions;

    @FindBy(xpath = "//ol[@class='n-header__user-navigation']//a")
    public List<WebElement> topMenu;

    @FindBy(id = "field_EmailOrPhone")
    public WebElement emailOderHandyNummerTextFeld;

    @FindBy(id = "button_btn_submit_email")
    public WebElement einloggenWeiterButton;

    @FindBy(className = "error_EmailOrPhone")
    public WebElement error_EmailOrPhoneMeldung;

    @FindBy(xpath = "//div[@class='Du wurdest erfolgreich angemeldet.']")
    public WebElement erfolgreichMessage;

    @FindBy(className = "error_Password")
    public WebElement errorPaswortMessage;

    @FindBy(xpath = "//a[text()='Registrieren']")
    public WebElement registirierenButton;

    @FindBy(id ="field_Email")
    public WebElement registirierungKontoEmailTextFeld;

    @FindBy(id = "field_ConfirmEmail")
    public WebElement confirmEmailTextFeld;

    @FindBy(id = "field_Password")
    public WebElement registirierungPaswortTextFeld;

    @FindBy(xpath = "//div[@class='password-creator']//p")
    public List<WebElement> paswortKreator;

    @FindBy(xpath = "//*[text()='Weiter']")
    public WebElement registirierungWeiterButton;

    @FindBy(className = "eye-icon")
    public WebElement eyeIcon;

    @FindBy(xpath = "//*[text()=' E-Mail senden ']")
    public WebElement bestaetigungEmailSendungButton;

    @FindBy(xpath = "//*[text()=' Zurück ']")
    public WebElement bestaetigungEmailZurueckButton;

    @FindBy(id = "EmailVerificationCode")
    public WebElement emailVerificationCodeTextFeld;

    @FindBy(className = "error_EmailVerificationCode")
    public WebElement errorEmailVerificationMessage;




}
