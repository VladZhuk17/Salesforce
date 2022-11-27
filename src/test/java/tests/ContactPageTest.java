package tests;

import model.Contact;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import services.ContactPageService;
import services.LoginPageService;

public class ContactPageTest {
    @BeforeClass
    public void loginSalesForce() {
        LoginPageService loginPageService = new LoginPageService();
        loginPageService.loginSalesForce();
    }

   @Test
    public void verifyCreatingContact() {
        Contact contact = new Contact("Mr.", "Vlad", "Zhuk", "88005553535", "123456");
        ContactPageService contactPageService = new ContactPageService();
        contactPageService.createContact(contact);
    }
}
