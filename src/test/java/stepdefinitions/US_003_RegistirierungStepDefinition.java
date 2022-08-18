package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LidlPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_003_RegistirierungStepDefinition {

    LidlPage lidlPage = new LidlPage();

    @When("Der User open Lidl-StartSite {string} link")
    public void derUserOpenLidlStartSiteLink(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty(arg0));
    }

    @And("Der User klickt auf Registirieren_button.")
    public void derUserKlicktAufRegistirieren_button() {
        lidlPage.registirierenButton.click();

    }

    @And("Der User gibt eine gueltige {string} Email-Adresse in das Email-Textfeld ein.")
    public void derUserGibtEineGueltigeEmailAdresseInDasEmailTextfeldEin(String arg0) {
        lidlPage.registirierungKontoEmailTextFeld.sendKeys(ConfigReader.getProperty(arg0));
    }

    @And("Der User gibt gleiche {string} Email-Adresse\" in das Email-Bestaetigung-Textfeld ein.")
    public void derUserGibtGleicheEmailAdresseInDasEmailBestaetigungTextfeldEin(String arg0) {
        lidlPage.confirmEmailTextFeld.sendKeys(ConfigReader.getProperty(arg0));

    }

    @And("Der User erstellt ein {string} passwort gemaess der Anleitung.")
    public void derUserErstelltEinPasswortGemaessDerAnleitung(String arg0) {
        lidlPage.registirierungPaswortTextFeld.sendKeys(ConfigReader.getProperty(arg0));
    }

    @And("Der User klickt auf Registirierung-Weiter-Button.")
    public void derUserKlicktAufRegistirierungWeiterButton() {
        lidlPage.weiterButtonRegistirierung.click();
    }

    @And("Der User klickt auf EmailSenden-Button.")
    public void derUserKlicktAufEmailSendenButton() {
        lidlPage.bestaetigungEmailSendungButton.click();
    }

    @And("Der User gibt den {string} in das Email-Verifikationtextfeld.")
    public void derUserGibtDenInDasEmailVerifikationtextfeld(String arg0) {
        lidlPage.verificationCodeTextFeld.sendKeys(ConfigReader.getProperty(arg0));
    }

    @Then("Der User sieht die Registirierunsgmeldung.")
    public void derUserSiehtDieRegistirierunsgmeldung() {
        System.out.println("Alles Gute...");
    }
}