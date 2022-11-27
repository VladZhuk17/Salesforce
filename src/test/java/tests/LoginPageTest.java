package tests;

import org.testng.annotations.Test;
import services.LoginPageService;

public class LoginPageTest extends BaseTest {

    @Test
    public void verifyLoginSalesForce() {
        LoginPageService loginPageService = new LoginPageService();
        loginPageService.loginSalesForce();

    }
}