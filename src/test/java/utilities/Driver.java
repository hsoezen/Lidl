package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.time.Duration;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver() {

    }

    private static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            switch (ConfigReader.getProperty("browser")) {
                case "chrome":
/*
Zum Herunterladen ein Datei:
                    ChromeOptions options = new ChromeOptions();
                    HashMap<String, Object> hMap = new HashMap<>();
                    hMap.put("download.default_directory", "C:\\Users\\hsoezen");
                    hMap.put("download.prompt_for_download", false);
                    hMap.put("plugins.always_open_pdf_externally", true);
                    options.setExperimentalOption("prefs", hMap);

                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(options);
 */
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "opera":
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

            }
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            //driver.quit();
        }
        driver = null;
    }
}
