package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class DropDownForAccountPage {
    private static final int WAIT_ELEMENT = 15;
    private static final String DROP_DOWN_XPATH_FOR_ACCOUNT = "//*[contains(text(),'%s')]/ancestor::div[contains(@class,'uiInput')]//a";
    private static final String SELECT_OPTION_XPATH_FOR_ACCOUNT = "//*[@class='select-options']/descendant::a[contains(text(),'%s')]";

    private WebDriver driver;
    private String label;

    public DropDownForAccountPage(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }


    public void selectOptionForAccount(String option) {
        new WebDriverWait(driver, Duration.ofSeconds(WAIT_ELEMENT))
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.xpath(String.format(DROP_DOWN_XPATH_FOR_ACCOUNT, label)))).click();
        driver.findElement(By.xpath(String.format(SELECT_OPTION_XPATH_FOR_ACCOUNT, option))).click();
    }
}
