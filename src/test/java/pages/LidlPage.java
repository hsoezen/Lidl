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

    @FindBy(xpath = "//ol[@class='n-header__main-navigation n-header__navigation-list n-header__subnavigation-list']")
    public WebElement startSeiteMenuKopfZeile;

    @FindBy(xpath = "//ol[@class='n-header__main-navigation n-header__navigation-list n-header__subnavigation-list']//span")
    public List<WebElement> menuOptions;

    @FindBy(xpath = "//ol[@class='n-header__user-navigation']//a")
    public List<WebElement> topMenu;
    @FindBy(id = "field_EmailOrPhone")
    public WebElement emailOderHandyNummerTextFeld;
    @FindBy(xpath = "//*[text()=' Weiter ']")
    public WebElement weiterButton;

    @FindBy(id = "button_submit")
    public WebElement weiterButtonPassword;

    @FindBy(xpath = "//*[text()=' Zurück ']")
    public WebElement passwortZurückButton;

    @FindBy(xpath = "//*[text()='Passwort vergessen?']")
    public WebElement passwortVergessenButton;

    @FindBy(className = "error_EmailOrPhone")
    public WebElement error_EmailOrPhoneMeldung;

    @FindBy(xpath = "//*[text()='Du wurdest erfolgreich angemeldet.']")
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

    @FindBy(xpath = "//*[text()='Weiter']")
    public WebElement weiterButtonRegistirierung;

    @FindBy(xpath = "//div[@class='password-creator']//p")
    public List<WebElement> paswortKreator;

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

    @FindBy(xpath = "//*[text()='Wir haben dir gerade eine E-Mail gesendet']")
    public WebElement gesendeteEmailMeldungRegistirierung;
    @FindBy(id = "field_EmailVerificationCode")
    public WebElement verificationCodeTextFeld;

//Erfolgreiches Passwort
    @FindBy(xpath = "(//div[@class='password-creator']//*[@width='60px'])[2]//*[@fill='#348553']")
    public WebElement mindestens_10_Zeichnen_erfolgreiches_Passwort;

    @FindBy(xpath = "(//div[@class='password-creator']//*[@width='60px'])[3]//*[@fill='#348553']")
    public WebElement mindestens_1_Kleinbuchstabe_erfolgreiches_Passwort;

    @FindBy(xpath = "(//div[@class='password-creator']//*[@width='60px'])[4]//*[@fill='#348553']")
    public WebElement mindestens_1_Grossbuchstabe_erfolgreiches_Passwort;

    @FindBy(xpath = "(//div[@class='password-creator']//*[@width='60px'])[5]//*[@fill='#348553']")
    public WebElement mindestens_1_Zahl_erfolgreiches_Passwort;

    @FindBy(xpath = "(//div[@class='password-creator']//*[@width='60px'])[6]//*[@fill='#348553']")
    public WebElement mindestens_1_Sonderzeichen_erfolgreiches_Passwort;

//Fehlendes Passwort
    @FindBy(xpath = "(//div[@class='password-creator']//*[@width='60px'])[2]//*[@fill='#e60a14']")
    public WebElement mindestens_10_Zeichnen_fehlendes_Passwort;

    @FindBy(xpath = "(//div[@class='password-creator']//*[@width='60px'])[3]//*[@fill='#e60a14']")
    public WebElement mindestens_1_Kleinbuchstabe_fehlendes_Passwort;

    @FindBy(xpath = "(//div[@class='password-creator']//*[@width='60px'])[4]//*[@fill='#e60a14']")
    public WebElement mindestens_1_Grossbuchstabe_fehlendes_Passwort;

    @FindBy(xpath = "(//div[@class='password-creator']//*[@width='60px'])[5]//*[@fill='#e60a14']")
    public WebElement mindestens_1_Zahl_fehlendes_Passwort;

    @FindBy(xpath = "(//div[@class='password-creator']//*[@width='60px'])[6]//*[@fill='#e60a14']")
    public WebElement mindestens_1_Sonderzeichen_fehlendes_Passwort;




}
