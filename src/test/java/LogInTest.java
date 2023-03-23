import Components.LogIn;
import Pages.HomePage;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest implements IAbstractTest {

    @Test()
    public void testLogIn() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickLogInButton();
        LogIn logIn = new LogIn(getDriver());
        logIn.isUIObjectPresent(2000);
        logIn.loggingIn("shlex00987@gmail.com", "qazwsxedc");

        Assert.assertTrue(homePage.isPageOpened());
    }
}
