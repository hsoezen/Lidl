package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.LidlPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class MyStepdefs {

    LidlPage lidlPage = new LidlPage();
    @When("Der User open Lidl-StartSite {string} link")
    public void derUserOpenLidlStartSiteLink(String arg0) throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty(arg0));
        lidlPage.zustimmenButton.click();
    }

    @And("Die Startseite_Menu wird angezeigt.")
    public void dieStartseite_MenuWirdAngezeigt() {
        Assert.assertTrue(lidlPage.startSeiteMenuKopfZeile.isDisplayed());
    }

    @Then("Der user schliesst Window.")
    public void derUserSchliesstWindow() {
        //Driver.closeDriver();
    }
}
