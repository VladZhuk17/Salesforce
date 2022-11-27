package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class InputFieldForAccountPage {

    private static final int WAIT_ELEMENT = 15;
    private static final String INPUT_XPATH_FOR_ACCOUNT = "//*[contains(text(),'%s')]/ancestor::div[contains(@class,'uiInput')]//input";


    private WebDriver driver;
    private String label;

    public InputFieldForAccountPage(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void writeTextForAccount(String text) {
        new WebDriverWait(driver, Duration.ofSeconds(WAIT_ELEMENT))
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.xpath(String.format(INPUT_XPATH_FOR_ACCOUNT, label))))
                .sendKeys(text);
    }


}
