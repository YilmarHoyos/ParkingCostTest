package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumWebDriver {

    public static WebDriver driver;

    public static SeleniumWebDriver ChromeWebDriver() {

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("incognito");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-infobars");


        driver = new ChromeDriver(options);
        try {
            driver.manage().deleteAllCookies();
        } catch (Exception e) {
        }

        return new SeleniumWebDriver();
    }

    public static WebDriver on(String url) {
        driver.get(url);
        return driver;
    }
}
