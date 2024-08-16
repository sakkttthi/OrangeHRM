package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	private static WebDriver driver;
	PropertyReader props = new PropertyReader();
	String browser = props.getprop("browser");

	public WebDriver initiateDriver() throws IOException {
		if (driver == null) {
			PropertyReader.loadProperties();
			System.out.println(browser);
			if (browser != null) {
				if (browser.equalsIgnoreCase("chrome")) {
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();

				} else if (browser.equalsIgnoreCase("firefox")) {
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
				} else {
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
				}

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
		}

	}
	

}
