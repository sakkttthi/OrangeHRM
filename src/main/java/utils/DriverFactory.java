package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;

public class DriverFactory {

    private static WebDriver driver;

    public WebDriver initiateDriver() throws IOException {
        if (driver == null) {
            PropertyReader configReader = new PropertyReader();
            configReader.loadProperties();
            String browser = configReader.getprop("browser");

            if (browser.equalsIgnoreCase("chrome")) {
            	WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("firefox")) {
            	WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
        }
        return driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null; // Ensure driver is reset for next test run
        }
    }
}
