package Components;

import Pages.HomePage;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn extends AbstractUIObject {
    private final WebDriver driver;

    @FindBy(id = "email")
    private ExtendedWebElement emailField;

    @FindBy(id = "upass")
    private ExtendedWebElement yourPasswordField;

    @FindBy(id = "nick-submit")
    private ExtendedWebElement logInButton;

    @FindBy(xpath = "//a[@class='forgot']")
    private ExtendedWebElement forgotPasswordButton;

    public LogIn(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public HomePage loggingIn(String email, String password) {
        emailField.type(email);
        yourPasswordField.type(password);
        logInButton.click();
        return new HomePage(driver);
    }

}
