package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	WebDriver ldriver;
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement txt_uname;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement txt_pass;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement btn_login;
	
	@FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title' and text()='Login']")
	WebElement confirm_login;
	
	public Login(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(5));
	
	public void enterUname(String str) {
		txt_uname.sendKeys(str);
	}
	
	public void enterPass(String str) {
		txt_pass.sendKeys(str);
	}
	public void clickLogin() {
		btn_login.click();

	}
	
	public void login(String uname,String pass) {
		enterUname(uname);
		enterPass(pass);
		clickLogin();
	}
	
	public void isOnLoginScreen() {
		wait.until(ExpectedConditions.visibilityOf(confirm_login));
		confirm_login.isDisplayed();
	}

}
