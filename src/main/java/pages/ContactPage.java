package pages;

import elements.DropDownForContactPage;
import elements.InputFieldForContactPage;
import model.Contact;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends BasePage {

    private static final String urlContactPage = "https://techmeskills.lightning.force.com/lightning/o/Contact/new?count";

    @FindBy(xpath = "//button[@name='SaveEdit']")
    private WebElement buttonSaveEdit;

    public ContactPage openContactPage() {
        driver.get(urlContactPage);
        return this;
    }

    public ContactPage chooseSalutation(Contact contact){
        new DropDownForContactPage(driver,"Mr.").selectOptionForAccount(contact.getSalutation());
        return this;
    }

    public ContactPage fillFirstName(Contact contact) {
        new InputFieldForContactPage(driver, "firstName").writeTextForContact(contact.getFirstName());
        return this;
    }

    public ContactPage fillLastName(Contact contact) {
        new InputFieldForContactPage(driver, "lastName").writeTextForContact(contact.getLastName());
        return this;
    }

    public ContactPage fillPhone(Contact contact) {
        new InputFieldForContactPage(driver, "Phone").writeTextForContact(contact.getPhone());
        return this;
    }

    public ContactPage fillMobile(Contact contact) {
        new InputFieldForContactPage(driver, "MobilePhone").writeTextForContact(contact.getMobile());
        return this;
    }

    public void clickOnButtonSave(){
        buttonSaveEdit.click();
    }
}
