package utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

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
}
