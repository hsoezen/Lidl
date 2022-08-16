package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.LidlPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class MyStepdefs {

    LidlPage lidlPage = new LidlPage();

    @Then("^Die Startseite_Menu wird angezeigt\\.$")
    public void dieStartseite_MenuWirdAngezeigt() {

    }

    @When("Der User open Lidl-StartSite {string} link")
    public void derUserOpenLidlStartSiteLink(String arg0) throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty(arg0));
        lidlPage.zustimmenButton.click();
/*
        for (WebElement option:lidlPage.menuOptions
             ) {
            if(option.getText().equals("Filial-Angebote")){
                option.click();
                break;
            }
        }

 */

        for (WebElement topMenuAuswahl: lidlPage.topMenu
             ) {
            if(topMenuAuswahl.getText().equals("Mein Konto")){
                topMenuAuswahl.click();
                break;
            }
        }

        lidlPage.registirierenButton.click();
        Thread.sleep(1000);
 }

    @Then("Der user schliesst Window.")
    public void derUserSchliesstWindow() {
        Driver.closeDriver();
    }
}
