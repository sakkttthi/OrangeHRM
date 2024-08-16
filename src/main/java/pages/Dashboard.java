package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboard {
	
	WebDriver ldriver;
	
	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module' and text()='Dashboard']")
	WebElement header_Dashboard;
	
	@FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
	WebElement myprofile;
	
	@FindBy(xpath = "//a[@role='menuitem' and text()='Logout']")
	WebElement logout;	
	
	
	public Dashboard(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(5));
	
	public boolean screenIsDashoard() {
		wait.until(ExpectedConditions.visibilityOf(header_Dashboard));
		return header_Dashboard.isDisplayed();
	}
	
	public void clickMyProfile() {
		wait.until(ExpectedConditions.visibilityOf(myprofile));
		myprofile.click();
	}
	
	public void clickLogout() {
		wait.until(ExpectedConditions.visibilityOf(logout));
		logout.click();
	}
	
	public void logout() {
		clickMyProfile();
		clickLogout();
	}

}
