package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LidlPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class US_002_LoginStepDefinition {

    LidlPage lidlPage = new LidlPage();
    @When("Der User klickt auf Mein Konto-Button.")
    public void der_user_klickt_auf_mein_konto_button() {
        for (WebElement meinKonto: lidlPage.topMenu
             ) {
            if (meinKonto.getText().equals("Mein Konto")){
                meinKonto.click();
                break;
            }
        }
    }

    @When("Der User gibt eine gueltige {string} in das Email-Handynummer-Textfeld ein.")
    public void der_user_gibt_eine_gueltige_in_das_email_handynummer_textfeld_ein(String string) {
        lidlPage.emailOderHandyNummerTextFeld.sendKeys(ConfigReader.getProperty(string));
    }

    @When("Der User klickt auf Weiter-Button.")
    public void der_user_klickt_auf_weiter_button() {
        lidlPage.weiterButton.click();

    }

    @When("Der User gibt ein gueltiges {string} in das Paswort-Textfeld ein.")
    public void der_user_gibt_ein_gueltiges_in_das_paswort_textfeld_ein(String string) {
    lidlPage.registirierungPaswortTextFeld.sendKeys(ConfigReader.getProperty(string));
    }
    @And("Der User klickt auf Weiter\\(Passwort)-Button.")
    public void derUserKlicktAufWeiterPasswortButton() throws InterruptedException {
        lidlPage.weiterButtonPassword.click();
    }
    @Then("Der User sieht {string} Erfolg-Meldung.")
    public void der_user_sieht_meldung(String string) {
        Assert.assertEquals(ConfigReader.getProperty(string), lidlPage.erfolgreichMessage.getText());
    }

    @And("Der User gibt eine ungueltige {string} in das Email-Handynummer-Textfeld.")
    public void derUserGibtEineUngueltigeInDasEmailHandynummerTextfeld(String arg0) {
        lidlPage.emailOderHandyNummerTextFeld.sendKeys(ConfigReader.getProperty(arg0));
    }

    @And("Der User gibt ein ungueltiges {string} in das Paswort-Textfeld ein.")
    public void derUserGibtEinUngueltigesInDasPaswortTextfeldEin(String arg0) {
        lidlPage.registirierungPaswortTextFeld.sendKeys(ConfigReader.getProperty(arg0));
    }

    @Then("Der User sieht {string} EmailFehler-Meldung.")
    public void derUserSiehtEmailFehlerMeldung(String arg0) {
        Assert.assertEquals(ConfigReader.getProperty(arg0), lidlPage.error_EmailOrPhoneMeldung.getText());
    }

    @Then("Der User sieht {string} PaswortFehler-Meldung.")
    public void derUserSiehtPaswortFehlerMeldung(String arg0) {
        Assert.assertEquals(ConfigReader.getProperty(arg0), lidlPage.errorPaswortMessage.getText());
    }

    @And("Der User gibt ungueltiges {string} drei Mal in das Paswort-Textfeld  ein.")
    public void derUserGibtUngueltigesDreiMalInDasPaswortTextfeldEin(String arg0) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(1));

        for(int i=1;i<=3; i++
        ){
            lidlPage.registirierungPaswortTextFeld.sendKeys(ConfigReader.getProperty(arg0));
            lidlPage.weiterButtonPassword.click();
            wait.until(ExpectedConditions.visibilityOf(lidlPage.errorPaswortMessage));
            System.out.println("Hallo");
        }
    }

    @Then("Der User sieht eine {string} Sicherheitsmeldung.")
    public void derUserSiehtEineSicherheitsmeldung(String arg0) {
        Assert.assertTrue(lidlPage.errorPaswortMessage.isDisplayed());
        System.out.println(lidlPage.errorPaswortMessage.getText());
    }
}
