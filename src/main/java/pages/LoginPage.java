package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage extends BasePage {
    private static final int WAIT_ELEMENT = 15;
    private String url = "https://techmeskills.my.salesforce.com/";

    @FindBy(xpath = "//input[@id='username']")
    private WebElement fieldUsername;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement fieldPassword;

    @FindBy(xpath = "//input[@id='Login']")
    private WebElement buttonLogin;

    public LoginPage openLoginPage() {
        driver.get(url);
        return this;
    }

    public LoginPage fillFieldUsername(String userName) {
        new WebDriverWait(driver, Duration.ofSeconds(WAIT_ELEMENT)).until(ExpectedConditions.visibilityOf(fieldUsername)).clear();
        fieldUsername.sendKeys(userName);
        return this;
    }

    public LoginPage fillFieldPassword(String userPassword) {
        fieldPassword.sendKeys(userPassword);
        return this;
    }

    public void clickOnLogin() {
        buttonLogin.click();
    }


}
