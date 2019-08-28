package Tests;

import Pages.AdminPanelPage;
import Pages.AuthorizationPage;
import Utils.ScreenshotListener;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ScreenshotListener.class)
public class Tests {

    private WebDriver driver;
    private AdminPanelPage adminPanelPage;
    AuthorizationPage authorizationPage;

    @BeforeMethod
    public void setUp (ITestContext iTestContext)
    {
        WebDriverManager.chromedriver().setup();
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
        adminPanelPage.verifyPlacedOnPage();
    }

    @Test(dataProvider = "Authentication")
    public void verifyH1 (String id, String h1) {

        driver.findElement(By.id(id)).click();
        visabilitySelector(By.xpath("//*" + h1));

    }



    @DataProvider(name = "Menu")
    public static Object[][] credentials() {
        return new Object[][]{
                {"shortcuts", "h1"},
                {"app-appearance", "h1"},
                {"doc-template", "h1"},
                {}
        };

}
