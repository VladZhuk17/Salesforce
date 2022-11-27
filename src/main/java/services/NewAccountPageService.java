package services;

import model.Account;
import pages.NewAccountPage;

public class NewAccountPageService {

    public void createAccount(Account account) {
        NewAccountPage newAccountPage = new NewAccountPage();
               newAccountPage.openPage()
                .fillFieldAccountName(account)
                .fillFieldWebSite(account)
                .selectOption(account)
                .clickButtonSaveAccount();
    }
}
