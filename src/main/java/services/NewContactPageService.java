package services;

import model.Contact;
import pages.ContactPage;

public class NewContactPageService {

    public void createContact(Contact contact) {
        ContactPage contactPage = new ContactPage();
        contactPage.openContactPage()
                .chooseSalutation(contact)
                .fillFirstName(contact)
                .fillLastName(contact)
                .fillPhone(contact)
                .fillMobile(contact)
                .clickOnButtonSave();
    }
}
