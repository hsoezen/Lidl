package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_old.Ac;
import io.cucumber.java.eo.Do;
import io.cucumber.java.lv.Un;
import io.netty.handler.codec.compression.ZlibDecoder;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.MouseAction;
import org.openqa.selenium.support.ui.Select;
import pages.LidlKategorienPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;
import java.security.Key;
import java.util.stream.StreamSupport;

import static java.lang.Integer.*;

public class US_006_EinkaufenStepDefinition {

    Actions actions = new Actions(Driver.getDriver());
    LidlKategorienPage kategorienPage = new LidlKategorienPage();
    String ausgewaehltesProduktName;
    Double hoechtesrPreis;
    Double mindestPreis;

    @And("Der User waehlt {string} aus UnterUnterkategorie aus.")
    public void derUserWaehltAusUnterUnterkategorieAus(String arg0) {
        for (WebElement Unterunterkategorie : kategorienPage.UnterUnterkategorien
        ) {
            if (Unterunterkategorie.getText().equals(arg0)) {
                Unterunterkategorie.click();
                break;
            }
        }
    }

    @And("Der User waehlt {string} produkt")
    public void derUserWaehltProdukt(String arg0) {
        for (WebElement produkt : kategorienPage.produkte
        ) {
            if (produkt.getText().contains(arg0)) {
                ausgewaehltesProduktName = produkt.getText();
                produkt.click();
                break;
            }
        }
    }

    @And("Der User waehlt eine Farbe, wenn Auswahlmöglichkeit gibt.")
    public void derUserWaehltEineFarbeWennAuswahlmöglichkeitGibt() throws InterruptedException {
        try {
            kategorienPage.farbeAuswahl.click();
        } catch (Exception e) {
            System.out.println("Es gibt keine Farbeauswahlmöglichkeit.");

        }


    }

    @And("Der User waehlt Stueckzahl aus der Stueck-Dropdownmenu als {int} aus.")
    public void derUserWaehltStueckzahlAusDerStueckDropdownmenuAlsAus(int arg0) {
        Select select = new Select(kategorienPage.stueckAuswahl);
        select.selectByIndex(--arg0);
    }

    @And("Der User klickt auf In Den Warenkorb-Button.")
    public void derUserKlicktAufInDenWarenkorbButton() {
        kategorienPage.inDEnWArenKorbButton.click();
    }

    @Then("Der User sieht ausgewaehltes Produkt im Warenkorb.")
    public void derUserSiehtAusgewaehltesProduktImWarenkorb() {
        System.out.println(ausgewaehltesProduktName);
        System.out.println(kategorienPage.ProduktimWarenkorb.getText());
        Assert.assertTrue(kategorienPage.ProduktimWarenkorb.getText().contains(ausgewaehltesProduktName));

    }

    @Then("Alle Produktpreise sollen in gewuenschte Spanne sein.")
    public void alleProduktpreiseSollenInGewuenschteSpanneSein() throws InterruptedException {

        int count = 0;

        for (int i = 0; i < kategorienPage.Preise.size(); i++) {

            count++;

            double preis = Double.parseDouble(kategorienPage.Preise.get(i).getText());
            System.out.println(count);

            if (preis >= mindestPreis && preis <= hoechtesrPreis) {
                System.out.println(preis);
            } else {
                System.out.println("Kein gewuenschter Preis");
                System.out.println("Der Preis ist " + preis + "€ und ist ausser Preisspanne");
            }


            if (i == kategorienPage.Preise.size() - 1) {

                try {
                    kategorienPage.Werbungschliessen.click();
                } catch (Exception e) {
                    System.out.println("Es gibt keine Werbung");

                }
                try {
                    actions.moveToElement(kategorienPage.weitereProdukteLaden).perform();
                    kategorienPage.weitereProdukteLaden.click();
                    Thread.sleep(1000);
                    System.out.println("rictige Index");


                } catch (Exception e) {
                    System.out.println("Es gibt kein ladeButton");
                }

            }
        }
    }

    @And("Der User gibt {string} als Mindestpreis und {string} als Hoechtspreis in Preisfiltertextfeld ein.")
    public void derUserGibtAlsMindestpreisUndAlsHoechtspreisInPreisfiltertextfeldEin(String arg0, String arg1) throws InterruptedException {

        ReusableMethods.TextfeldLöschen(kategorienPage.minPreisFilterTextBox);
        kategorienPage.minPreisFilterTextBox.sendKeys(arg0, Keys.ENTER);

        mindestPreis = Double.parseDouble(arg0);
        Thread.sleep(2000);

        ReusableMethods.TextfeldLöschen(kategorienPage.maxPreisFilterTextBox);
        kategorienPage.maxPreisFilterTextBox.sendKeys(arg1, Keys.ENTER);
        hoechtesrPreis = Double.parseDouble(arg1);
        Thread.sleep(2000);


/*
        actions.moveToElement(kategorienPage.weitereProdukteLaden).perform();
        //Thread.sleep(3000);
        //actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
       kategorienPage.weitereProdukteLaden.click();
        System.out.println("Was ist passiert");


 */

    }

    @And("Der User waehlt Marke {string} aus der Markenliste aus.")
    public void derUserWaehltMarkeAusDerMarkenlisteAus(String arg0) {
        for (WebElement marke:kategorienPage.MarkenList
             ) {
            if(marke.getText().contains(arg0)){
                marke.click();
                break;
            }
        }
    }

    @Then("Der User sieht, dass alle Marken {string} sind.")
    public void derUserSiehtDassAlleMarkenSind(String arg0) {
        for (WebElement produkt:kategorienPage.produkte
        ) {
            if(produkt.getText().contains(arg0)){
                System.out.println("Das Produkt ist eine Marke von "+arg0+".");
            }else{
                System.out.println("Das Produkt ist andere Marke.");
            }
        }
    }
}
