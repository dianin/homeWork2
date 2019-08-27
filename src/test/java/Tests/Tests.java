package Tests;

import Pages.AdminPanelPage;
import Pages.AuthorizationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests {

    private WebDriver driver;
    private AdminPanelPage adminPanelPage;
    AuthorizationPage authorizationPage;

    @BeforeMethod
    public void setUp (ITestContext iTestContext)
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        iTestContext.setAttribute("driver", driver);
        adminPanelPage = new AdminPanelPage(driver);
        authorizationPage = new AuthorizationPage(driver);
    }

    @Test
    public void scenario1 ()
    {
        authorizationPage.openPage();
        authorizationPage.authorization();
    }

}
