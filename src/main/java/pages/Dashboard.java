package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	
	public boolean screenIsDashoard() {
		return header_Dashboard.isDisplayed();
	}
	
	public void clickMyProfile() {
		myprofile.click();
	}
	
	public void clickLogout() {
		logout.click();
	}
	
	public void logout() {
		clickMyProfile();
		clickLogout();
	}

}
