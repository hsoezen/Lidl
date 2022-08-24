package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.LidlLoginPage;
import utilities.Driver;

import javax.swing.*;

public class US_001_StartSeiteStepDefinition {

    LidlLoginPage lidlPage = new LidlLoginPage();
    Actions actions = new Actions(Driver.getDriver());

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

    @And("Der User sieht, dass der Anmelde-Menu angezeigt wird.")
    public void derUserSiehtDassDerAnmeldeMenuAngezeigtWird() {
        System.out.println(lidlPage.howerOverMenu.getText());
    }

    @And("Der User bewegt den Mausepfeil über die {string} Option.")
    public void derUserBewegtDenMausepfeilÜberDieOption(String arg0) throws InterruptedException {

        for (WebElement option: lidlPage.topMenu
        ) {
            if(option.getText().equals(arg0))
                actions.moveToElement(option).perform();

        }
    }

    @And("Der User klick auf den Anmelde-Button.")
    public void derUserKlickAufDenAnmeldeButton() throws InterruptedException {

        lidlPage.AnmeldeButton.click();

    }

    @And("Der User klickt auf Abmelde_Button.")
    public void derUserKlicktAufAbmelde_Button() throws InterruptedException {

        Thread.sleep(6000);
        WebElement abmelden = Driver.getDriver().findElement(By.xpath("//span[text()='Mein Konto']"));
        actions.moveToElement(abmelden).perform();
        lidlPage.AbmeldeButton.click();
    }

    @Then("Der User sieht die grüne Haken auf Mein Konto nict mehr.")
    public void derUserSiehtDieGrüneHakenAufMeinKontoNictMehr() {

        Assert.assertFalse(lidlPage.MeinKontoHaken.isDisplayed());
        System.out.println(Driver.getDriver().getTitle());
    }
}