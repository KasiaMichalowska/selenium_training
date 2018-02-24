package pageobject.tests;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import pageobject.pages.*;
import utils.driver.WebDriverCreators;
import utils.driver.WebDriverProvider;

public class RegistrationTest_Kasia {

    private static final String PAGE_URL = "http://demo.nopcommerce.com/";

    private WebDriver driver;

    private HomePage homePage;
    private LoginPage loginPage;
    private TabsOnPage tabsOnPage;
    private ShoppingCartPage shoppingCartPage;
    private SearchingOnPage searchingOnPage;

    @Before
    public void setUp() {
        driver = new WebDriverProvider(WebDriverCreators.FIREFOX_GECKO).getDriver();
        driver.manage().window().maximize();
    }

}
