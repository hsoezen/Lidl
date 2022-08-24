package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import pages.LidlKategorienPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;
import java.awt.dnd.DragGestureEvent;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class US_007_Filiale_AngeboteStepDefinitions {
    LidlKategorienPage KategorienPage = new LidlKategorienPage();
    Actions actions = new Actions(Driver.getDriver());

    int indexHerunterladenIkone = 0;

    @And("Der User klickt auf {string} QuerKategorien.")
    public void derUserKlicktAufQuerKategorien(String arg0) {
        for (WebElement kategorie : KategorienPage.querKategorien
        ) {
            if (kategorie.getText().equals(arg0)) {
                kategorie.click();
            }
        }
    }

    @Then("Der User sieht, dass Produkt {string}")
    public void derUserSiehtDassProdukt(String arg0) {

        for (WebElement produkt : KategorienPage.ProdukteInUnserTestErgebnisse
        ) {

            if (produkt.getText().equals(arg0)) {
                System.out.println(produkt.getText());
                Assert.assertEquals(arg0, produkt.getText());
                break;
            } else {
                System.out.println("Dieses Produkt steht in ");
            }
        }
    }

    @And("Der User klickt auf {string} Unterkategorie von Filiale-Angebote.")
    public void derUserKlicktAufUnterkategorieVonFilialeAngebote(String arg0) {

        for (WebElement kategorie : KategorienPage.UnterkategorieFilialAngebote
        ) {

            if (kategorie.getText().equals(arg0)) {
                kategorie.click();
                break;
            }
        }
    }

    @Then("Der User sieht in {string}, dass Produkt {string} steht.")
    public void derUserSiehtInDassProdukt(String arg0, String arg1) {
        boolean produktVorhanden = false;
        for (WebElement produkt : KategorienPage.ProdukteInUnserTestErgebnisse
        ) {

            if (produkt.getText().equals(arg1)) {
                Assert.assertEquals(arg1, produkt.getText());
                produktVorhanden = true;
                System.out.println("Produkt '" + arg1 + "' steht in '" + arg0 + "' Seite.");
                break;
            }
        }
        if (produktVorhanden == false) {
            System.out.println("Produkt " + arg1 + " steht nicht in " + arg0 + " Seite!");
        }


    }

    @Then("Der User sieht, dass der Prospekt {string} mit Datum oder Titel {string} auf der {string} Seite steht.")
    public void derUserSiehtDassDerProspektMitDatumOderTitelAufDerSeiteSteht(String arg0, String arg1, String arg2) {

        for (WebElement Prospekt : KategorienPage.NamenDerProspekte) {
            indexHerunterladenIkone = indexHerunterladenIkone + 1;
            System.out.println(indexHerunterladenIkone);

            if (Prospekt.getText().equals(arg0)) {
                for (WebElement DatumOderTitel : KategorienPage.TitelOderDatumDerProspekte
                ) {
                    System.out.println(DatumOderTitel.getText());
                    if (DatumOderTitel.getText().contains(arg1)) {
                        System.out.println("Der Prospekt '" + arg0 + "' mit Datum/Titel'" + arg1 + "' steht auf der '" + arg2 + "' Seite.");
                        break;
                    }
                }
                break;
            }
        }
    }

    @And("Der User klickt auf Herunterladenikone von Prospekt {string}.")
    public void derUserKlicktAufHerunterladenikoneVonProspekt(String arg0) throws InterruptedException {
/*
        Thread.sleep(3000);
        WebElement element = Driver.getDriver().findElement(By.xpath("(//a[@class='Flyer_flyer__download_icon__2XwnZ'])[7]"));
        //actions.moveToElement(element).perform();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        actions.moveToElement(KategorienPage.herunterladenIkone.get(0)).perform();
        KategorienPage.herunterladenIkone.get(0).click();
        Thread.sleep(8000);

        KategorienPage.herunterladenIkone.get(3).click();



        Thread.sleep(6000);
        for (int i = 0; i < KategorienPage.herunterladenIkone.size(); i++) {
            System.out.println("IKONE");
            if (i == indexHerunterladenIkone) {

                actions.moveToElement(KategorienPage.herunterladenIkone.get(7)).perform();
                Thread.sleep(2000);
                KategorienPage.herunterladenIkone.get(6).click();
                break;

            }
        }

        //Thread.sleep(1000);
        for (int i = 0; i < KategorienPage.herunterladenIkone.size(); i++) {
            System.out.println("IKONE");
            if (i == indexHerunterladenIkone - 1) {
                System.out.println("i1"+i);
                for (int j = 1; j <= i; j++) {
                    System.out.println(j);
                    actions.sendKeys(Keys.PAGE_DOWN).perform();
                }
                System.out.println("i2"+i);

                Thread.sleep(1000);
                KategorienPage.herunterladenIkone.get(i).click();
                break;

            }
        }

 */
        for (int i = 0; i < KategorienPage.herunterladenIkone.size(); i++) {

            System.out.println("IKONE");
            if (i == indexHerunterladenIkone) {

                actions.sendKeys(Keys.chord(Keys.CONTROL), "-").perform();
                Thread.sleep(2000);
                //KategorienPage.herunterladenIkone.get(i).click();
                break;

            }
        }


    }

    @Then("Der User sieht, dass dieser Prospekt auf seinem Computer heruntergeladen wurde.")
    public void derUserSiehtDassDieserProspektAufSeinemComputerHeruntergeladenWurde() {
/*
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));
        String homepath = System.getProperty("user.home");
        String path = homepath +"\\Downloads\\Aktionsprospekt-22-08-2022-27-08-2022-04.pdf";

        boolean fileExist= Files.exists(Paths.get(path));
        System.out.println(fileExist);
 */
    }
}
