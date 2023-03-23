package Pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class SignUpPage extends AbstractPage {
    private final String signUpPageUrl = "https://www.gsmarena.com/register.php3";
    String randomNickName = RandomStringValues.setGeneratedString(20, true, false);
    String randomEmail = RandomStringValues.setGeneratedString(40, true, true) + "@gmail.com";
    String randomShortPassword = RandomStringValues.setGeneratedString(6, true, true);
    String randomLongPassword = RandomStringValues.setGeneratedString(20, true, true);

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



    public SignUpPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(signUpPageUrl);
    }

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 250)");
        pause(2);
    }

    public void signUpUserRandomValues() {
        nickNameField.type(randomNickName);
        if (nickNameReservedField.isElementPresent()) {
            randomNickName = RandomStringValues.setGeneratedString(20, true, false);
            nickNameField.type(randomNickName);
        }
        emailField.type(randomEmail);
        passwordField.type(randomLongPassword);
        toggle1.click();
        toggle2.click();
        pause(3);
        submitButton.click();
    }

}
