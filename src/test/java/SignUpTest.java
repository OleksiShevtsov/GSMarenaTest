import Components.HeaderMenu;
import Pages.HomePage;
import Pages.SignUpPage;
import Pages.TabsHandler;
import Pages.VideosPage;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import enums.HeaderButtons;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SignUpTest implements IAbstractTest {

    @FindBy(xpath = "//h1[@class='article-info-name']")
    private ExtendedWebElement signUpTitle;

    @FindBy(xpath = "//input[@id='uname']")
    private ExtendedWebElement nickNameField;

    @FindBy(xpath = "//input[@id='nick-reason']")
    private ExtendedWebElement nickNameReservedField;

    @FindBy(xpath = "(//input[@id='email'])[2]")
    private ExtendedWebElement emailField;

    @FindBy(xpath = "(//input[@id='upass'])[2]")
    private ExtendedWebElement passwordField;

    @FindBy(xpath = "//*[@id=\"frmOpin\"]/fieldset[2]/div[1]/label")
    private ExtendedWebElement toggle1;

    @FindBy(xpath = "//*[@id=\"frmOpin\"]/fieldset[2]/div[2]/label")
    private ExtendedWebElement toggle2;

    @FindBy(xpath = "(//input[@id='nick-submit'])[2]")
    private ExtendedWebElement submitButton;

    @Test()
    public void testSignUpUser(String nickName, String email, String password) {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");

        homePage.clickSignUpButton();
        SignUpPage signUpPage = new SignUpPage(getDriver());
        Assert.assertTrue(signUpPage.isPageOpened(), "SignUp page is not opened");

        TabsHandler tabsHandler = new TabsHandler(getDriver());
        tabsHandler.windowHandler();

        signUpPage.signUpUserRandomValues();
        Assert.assertTrue(signUpPage.isPageOpened());
    }

}
