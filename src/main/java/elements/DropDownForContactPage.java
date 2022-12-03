package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class DropDownForContactPage {

    private final static int WAIT_ELEMENT = 15;
    private static final String DROP_DOWN_XPATH_FOR_CONTACT = "//lightning-combobox[@class='slds-form-element']/descendant::button";
    private static final String SELECT_OPTION_XPATH_FOR_CONTACT = "//span[contains(text(),'%s')]";

    private static final String DROP_DOWN_XPATH_FOR_CONTACT_SEARCH_ACCOUNTS = "//input[@id='combobox-input-194']";

    private WebDriver driver;
    private String label;

    public DropDownForContactPage(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectOptionForAccount(String option) {
        new WebDriverWait(driver, Duration.ofSeconds(WAIT_ELEMENT))
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.xpath(String.format(DROP_DOWN_XPATH_FOR_CONTACT, label)))).click();
        driver.findElement(By.xpath(String.format(SELECT_OPTION_XPATH_FOR_CONTACT, option))).click();

    }
}
