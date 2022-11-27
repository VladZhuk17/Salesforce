package pages;

import elements.DropDownForAccountPage;
import elements.InputFieldForAccountPage;
import model.Account;
import org.openqa.selenium.By;

public class NewAccountPage extends BasePage {

    private static final String SAVE_BUTTON_XPATH = "//button[@title='Save']";
    private static final String URL = "https://techmeskills.lightning.force.com/lightning/o/Account/new?count";

    public NewAccountPage openPage() {
        driver.get(URL);
        return this;
    }

    public NewAccountPage fillFieldAccountName(Account account) {
        new InputFieldForAccountPage(driver, "Account Name").writeTextForAccount(account.getAccountName());
        return this;
    }

    public NewAccountPage fillFieldWebSite(Account account) {
        new InputFieldForAccountPage(driver, "Website").writeTextForAccount(account.getWebSite());
        return this;
    }

    public NewAccountPage selectOption(Account account) {
        new DropDownForAccountPage(driver, "Industry").selectOptionForAccount(account.getIndustry());
        return this;
    }

    public void clickButtonSaveAccount() {
        driver.findElement(By.xpath(SAVE_BUTTON_XPATH)).click();
    }

    public String getActualAccountNameText() {
        return driver.findElement(By.xpath("//input[@role = 'combobox']")).getText();
    }
}

