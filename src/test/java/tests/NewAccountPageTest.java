package tests;

import model.Account;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.NewAccountPage;
import services.LoginPageService;
import services.NewAccountPageService;

public class NewAccountPageTest {

    @BeforeClass
    public void loginSalesForce() {
        LoginPageService loginPageService = new LoginPageService();
        loginPageService.loginSalesForce();
    }

    @Test
    public void verifyCreatingOfAccount(){
        Account account = new Account("Vlad", "https://teachmeskills.by/", "Energy");
        NewAccountPageService newAccountPageService = new NewAccountPageService();
        NewAccountPage newAccountPage = new NewAccountPage();
        newAccountPageService.createAccount(account);
        String expectedNameCreatedAccount = account.getAccountName();
        String actualNameCreatedAccount = newAccountPage.getActualAccountNameText();
        Assert.assertEquals(actualNameCreatedAccount,expectedNameCreatedAccount);
    }
}
