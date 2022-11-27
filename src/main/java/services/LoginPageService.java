package services;

import model.User;
import pages.LoginPage;

public class LoginPageService {

    public void loginSalesForce() {
        LoginPage loginPage = new LoginPage();
        User user = new User();
        loginPage.openLoginPage().fillFieldUsername(user.getUsername())
                .fillFieldPassword(user.getPassword())
                .clickOnLogin();
    }
}
