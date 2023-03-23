import Components.HeaderMenu;
import Pages.AndroidNewsPage;
import Pages.HomePage;
import Pages.NewsPage;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewsTest implements IAbstractTest {

    @Test()
    public void testAndroidTagNewsPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        homePage.clickExpandHeaderMenu();
        HeaderMenu headerMenu = new HeaderMenu(getDriver());
        NewsPage newsPage = headerMenu.clickNewsButton();
        Assert.assertTrue(newsPage.isPageOpened(), "News page is not opened!");
        AndroidNewsPage androidNewsTag = newsPage.openAndroidTag();
        Assert.assertTrue(androidNewsTag.isPageOpened(), "Page is not opened!");
    }


}
