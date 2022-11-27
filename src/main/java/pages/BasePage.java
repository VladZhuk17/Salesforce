package pages;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public abstract class BasePage {

    protected WebDriver driver = DriverSingleton.getDriver();
    private static final int WAIT_ELEMENT = 15;

    protected BasePage() {
        PageFactory.initElements(driver, this);
    }

    protected WebElement waitElement(WebElement element) {
        return new WebDriverWait(driver, Duration.ofSeconds(WAIT_ELEMENT)).
                until(ExpectedConditions.elementToBeClickable(element));
    }

}
