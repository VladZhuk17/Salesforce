package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class DropDownForContactPage {

    private final static int WAIT_ELEMENT = 15;
    private static final String DROP_DOWN_XPATH_FOR_CONTACT = "//button[@id='combobox-button-142']";
    private static final String SELECT_OPTION_XPATH_FOR_CONTACT = "//div[@id='dropdown-element-793']/lightning-base-combobox-item[@data-value='%s']";
    private WebDriver driver;
    private String label;

    public DropDownForContactPage (WebDriver driver, String label) {
        this.driver=driver;
        this.label = label;
    }

    public void selectOptionForAccount(String option) {
        new WebDriverWait(driver, Duration.ofSeconds(WAIT_ELEMENT))
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.xpath(String.format(DROP_DOWN_XPATH_FOR_CONTACT, label)))).click();
        driver.findElement(By.xpath(String.format(SELECT_OPTION_XPATH_FOR_CONTACT, option))).click();
    }
}
