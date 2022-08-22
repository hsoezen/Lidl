package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LidlLoginPage;

public class US_001_StartSeiteStepDefinition {

    LidlLoginPage lidlPage = new LidlLoginPage();

    @And("Die Startseite_Menu wird angezeigt.")
    public void dieStartseite_MenuWirdAngezeigt() {
        Assert.assertTrue(lidlPage.startSeiteMenuKopfZeile.isDisplayed());
    }

    @Then("Der user schliesst Window.")
    public void derUserSchliesstWindow() {
        //Driver.closeDriver();
    }

    @And("Der User klickt auf Zustimmen-Button.")
    public void derUserKlicktAufZustimmenButton() {
        lidlPage.zustimmenButton.click();
    }
}