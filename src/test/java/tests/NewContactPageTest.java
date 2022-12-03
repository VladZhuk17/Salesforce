package tests;

import model.Contact;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import services.NewContactPageService;
import services.LoginPageService;

public class NewContactPageTest {
    @BeforeClass
    public void loginSalesForce() {
        LoginPageService loginPageService = new LoginPageService();
        loginPageService.loginSalesForce();
    }

   @Test
    public void verifyCreatingContact() {
        Contact contact = new Contact("Mr.", "Vlad", "Zhuk", "88005553535", "123456");
        NewContactPageService contactPageService = new NewContactPageService();
        contactPageService.createContact(contact);
    }
}
