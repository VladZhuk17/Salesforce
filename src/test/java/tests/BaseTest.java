package tests;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import until.TestListener;

@Listeners(TestListener.class)
public class BaseTest {

    @BeforeClass
    public void openSalesForce(){
        DriverSingleton.getDriver();

    }

 /*   @AfterClass(alwaysRun = true)
    public void stopBrowser(){
        DriverSingleton.closeDriver();
    }*/
}
