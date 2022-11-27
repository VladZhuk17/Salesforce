package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class InputFieldForContactPage {
    private static final int WAIT_ELEMENT = 15;
    private static final String INPUT_XPATH_FOR_CONTACT = "//input[@name='%s']";

    private WebDriver driver;
    private String label;

    public InputFieldForContactPage(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void writeTextForContact(String text){
        new WebDriverWait(driver, Duration.ofSeconds(WAIT_ELEMENT))
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.xpath(String.format(INPUT_XPATH_FOR_CONTACT, label))))
                .sendKeys(text);
    }
}
