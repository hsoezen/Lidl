package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.LidlKategorienPage;
import pages.LidlLoginPage;

import java.text.Format;

public class US_005_KategorienStepDefinition {

    LidlKategorienPage kategorienPage = new LidlKategorienPage();

    /*
        @When("Der User klickt auf {string} Kategorie.")
        public void der_user_klickt_auf_kategorie(String string) {
            LidlLoginPage loginPage = new LidlLoginPage();
            loginPage.zustimmenButton.click();

            for (WebElement option : kategorienPage.menuOptions
            ) {
                System.out.println(option.getText());
                if (option.getText().equals(string)) {
                    option.click();
                    break;
                }
            }

        }

        @When("Der User klickt auf {string} Unterkategorie.")
        public void der_user_klickt_auf_unterkategorie(String string) {
            for (WebElement unterKategorie: kategorienPage.KategorienList
                 ) {
                if (unterKategorie.getText()==string){
                    unterKategorie.click();
                }
            }
        }
        @Then("Der User sieht,dass es {int} Unterkategorien gibt.")
        public void derUserSiehtDassEsUnterkategorienGibt(int anzahl) {
            int anzahlUnterkategorie= kategorienPage.KategorienList.size();

            System.out.println(anzahlUnterkategorie);
            System.out.println(anzahl);
            Assert.assertEquals(anzahl, anzahlUnterkategorie);
        }

     */
    @When("Der User klickt auf {string} Kategorie.")
    public void der_user_klickt_auf_kategorie(String string) throws InterruptedException {
        for (WebElement options : kategorienPage.option
        ) {
            if (options.getText().equals(string)) {
                //options.click();
                break;
            }
        }
    }

    @And("Der User klickt auf {string} Unterkategorie.")
    public void derUserKlicktAufUnterkategorie(String arg0) {
        for (WebElement kategorie : kategorienPage.KategorienList
        ) {
            if (kategorie.getText().equals(arg0)) {
                kategorie.click();
                break;
            }
        }
    }

    @Then("Der User sieht,dass es {int} Unterkategorien gibt.")
    public void derUserSiehtDassEsUnterkategorienGibt(int arg0) {

        System.out.println(kategorienPage.Unterkategorien.size());
        Assert.assertEquals((arg0), kategorienPage.Unterkategorien.size());
    }

    @And("Der User klickt auf Alles anzeigen-Button.")
    public void derUserKlicktAufAllesAnzeigenButton() {

        if (kategorienPage.allesAnzeigenKategorien.isDisplayed()) {
            kategorienPage.allesAnzeigenKategorien.click();

        }
    }

    @And("Der User klickt auf {string} UnterUnterkategorie.")
    public void derUserKlicktAufUnterUnterkategorie(String arg0) {
        for (WebElement unterkategorie:kategorienPage.Unterkategorien
             ) {
            if(unterkategorie.getText().equals(arg0)){
                unterkategorie.click();
                break;
            }
        }
    }

    @Then("Der User sieht,dass es {int} Unterunterkategorien gibt.")
    public void derUserSiehtDassEsUnterunterkategorienGibt(int arg0) {
        Assert.assertEquals(arg0, kategorienPage.UnterUnterkategorien.size());
    }
}