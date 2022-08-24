package utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.LidlLoginPage;

import java.lang.reflect.Constructor;

public class ReusableMethods {

    public static int addieren(int a, int b){
        int c=0;
        c= a+b;

        return c;
    }
    public static void TextfeldLöschen(WebElement element){
        element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        element.sendKeys(Keys.DELETE);
    }
    public static void anmeldung(){
        LidlLoginPage loginPage = new LidlLoginPage();

        Driver.getDriver().get(ConfigReader.getProperty("Lidl_Startseite"));

        for (WebElement meinKonto:loginPage.topMenu
             ) {
            if (meinKonto.getText().equals("Mein Konto")){
                meinKonto.click();
                break;
            }
        }
        loginPage.emailOderHandyNummerTextFeld.sendKeys(ConfigReader.getProperty("Email_Adresse"));
        loginPage.weiterButton.click();
        loginPage.registirierungPaswortTextFeld.sendKeys(ConfigReader.getProperty("Passwort"));
        loginPage.weiterButtonPassword.click();
    }
}
