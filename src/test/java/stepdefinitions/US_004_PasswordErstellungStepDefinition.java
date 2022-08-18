package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LidlPage;
import utilities.Driver;

public class US_004_PasswordErstellungStepDefinition {

    LidlPage lidlPage = new LidlPage();
    @When("Der User gibt ein Paswort {string} ein.")
    public void der_user_gibt_ein_paswort_ein(String string) {
        lidlPage.registirierungPaswortTextFeld.sendKeys(string);

    }

    @Then("Der User sieht, dass die {int} wird.")
    public void der_user_sieht_dass_die_wird(Integer index) {

        if (index == 7) {
            for (int i = 2; i < index; i++) {
                WebElement element = Driver.getDriver().findElement(By.xpath("(//div[@class='password-creator']//*[@width='60px'])[" + i + "]//*[@fill='#348553']"));
                Assert.assertTrue(element.isDisplayed());
                System.out.println("Gueltiges Passwort");
            }
        } else {
            WebElement element = Driver.getDriver().findElement(By.xpath("(//div[@class='password-creator']//*[@width='60px'])[" + index + "]//*[@fill='#348553']"));
            Assert.assertTrue(element.isDisplayed());
            System.out.println("Gueltiges Passwort- GRUEN");
        }
    }
    @Then("Der User sieht, dass die {int} rot wird.")
    public void der_user_sieht_dass_die_rot_wird(Integer int1) {

        WebElement element = Driver.getDriver().findElement(By.xpath("(//div[@class='password-creator']//*[@width='60px'])[" + int1 + "]//*[@fill='#e60a14']"));
        Assert.assertTrue(element.isDisplayed());
        System.out.println("Ungueltiges Passwort- ROT");


    }

}
