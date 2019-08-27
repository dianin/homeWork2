package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthorizationPage extends CommonMethods {

    private WebDriver driver;
    private String URL = "http://demo.litecart.net/admin/login.php?redirect_url=%2Fadmin%2F";
    private By loginButton = By.xpath("//*[type='submit' and name = 'login']");

    public AuthorizationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void openPage ()
    {
        driver.get(URL);
    }

    public void authorization ()
    {
        click(loginButton);
    }
}
