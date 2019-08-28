package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdminPanelPage extends CommonMethods {

    private WebDriver driver;
    private By shortcuts = By.id("shortcuts");

    private By appearance = By.id("app-appearance");
    private By template = By.id("doc-template");
    private By logotype = By.id("doc-logotype");

    private By catalog = By.id("app-catalog");
    private By doccatalog = By.id("doc-catalog");
    private By productgroups = By.id("doc-product_groups");
    private By optiongroups = By.id("doc-option_groups");
    private By manufacturers = By.id("doc-manufacturers");
    private By deliverystatuses = By.id("doc-delivery_statuses");
    private By soldOutStatuses = By.id("doc-sold_out_statuses");
    private By docQxuantityUnits = By.id("doc-sold_out_statuses");
    private By docCsv = By.id("doc-csv");

    private By countries = By.id("app-countries");
    private By currencies = By.id("app-currencies");
    private By customers = By.id("app-customers");
    private By zones = By.id("app-geo_zones");
    private By languages = By.id("app-languages");
    private By storageEncoding = By.id("doc-storage_encoding");

    private By modules = By.id("app-modules");
    private By orders = By.id("app-orders");
    private By pages = By.id("app-pages");
    private By reports = By.id("app-reports");
    private By settings = By.id("app-settings");
    private By slides = By.id("app-slides");
    private By tax = By.id("app-tax");
    private By translations = By.id("app-translations");
    private By users = By.id("app-users");
    private By vqmods = By.id("app-vqmods");


    public AdminPanelPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void verifyPlacedOnPage ()
    {
        visabilitySelector(shortcuts);
    }












}
