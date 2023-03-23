import Components.HeaderMenu;
import Pages.HomePage;
import Pages.VideosPage;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VideosTest implements IAbstractTest {

    @Test()
    public void testAndroidTagNewsPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        homePage.clickExpandHeaderMenu();
        HeaderMenu headerMenu = new HeaderMenu(getDriver());
        VideosPage videosPage = headerMenu.clickVideosButton();
        Assert.assertTrue(videosPage.isPageOpened(), "News page is not opened!");
    }
}
