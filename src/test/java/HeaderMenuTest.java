import Components.HeaderMenu;
import Pages.*;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import enums.HeaderButtons;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderMenuTest implements IAbstractTest {

    @Test()
    public void testHeaderMenuHomePage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");

        homePage.clickExpandHeaderMenu();
        HeaderMenu headerMenu = new HeaderMenu(getDriver());
        headerMenu.clickHeaderButton(HeaderButtons.HOME);
        TabsHandler tabsHandler = new TabsHandler(getDriver());
        tabsHandler.windowHandler();

        HomePage home = new HomePage(getDriver());
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
    }

    @Test()
    public void testHeaderMenuNewsPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");

        homePage.clickExpandHeaderMenu();
        HeaderMenu headerMenu = new HeaderMenu(getDriver());
        headerMenu.clickHeaderButton(HeaderButtons.NEWS);
        TabsHandler tabsHandler = new TabsHandler(getDriver());
        tabsHandler.windowHandler();

        NewsPage newsPage = new NewsPage(getDriver());
        Assert.assertTrue(newsPage.isPageOpened(), "News page is not opened!");
    }

    @Test()
    public void testHeaderMenuReviewsPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");

        homePage.clickExpandHeaderMenu();
        HeaderMenu headerMenu = new HeaderMenu(getDriver());
        headerMenu.clickHeaderButton(HeaderButtons.REVIEWS);
        TabsHandler tabsHandler = new TabsHandler(getDriver());
        tabsHandler.windowHandler();

        ReviewsPage reviewsPage = new ReviewsPage(getDriver());
        Assert.assertTrue(reviewsPage.isPageOpened(), "Reviews page is not opened!");
    }

    @Test()
    public void testHeaderMenuVideosPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");

        homePage.clickExpandHeaderMenu();
        HeaderMenu headerMenu = new HeaderMenu(getDriver());
        headerMenu.clickHeaderButton(HeaderButtons.VIDEOS);
        TabsHandler tabsHandler = new TabsHandler(getDriver());
        tabsHandler.windowHandler();

        VideosPage videosPage = new VideosPage(getDriver());
        Assert.assertTrue(videosPage.isPageOpened(), "Videos page is not opened!");
    }

    @Test()
    public void testHeaderMenuFeaturedPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");

        homePage.clickExpandHeaderMenu();
        HeaderMenu headerMenu = new HeaderMenu(getDriver());
        headerMenu.clickHeaderButton(HeaderButtons.FEATURED);
        TabsHandler tabsHandler = new TabsHandler(getDriver());
        tabsHandler.windowHandler();

        FeaturedPage featuredPage = new FeaturedPage(getDriver());
        Assert.assertTrue(featuredPage.isPageOpened(), "Featured page is not opened!");
    }

    @Test()
    public void testHeaderMenuPhoneFinderPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");

        homePage.clickExpandHeaderMenu();
        HeaderMenu headerMenu = new HeaderMenu(getDriver());
        headerMenu.clickHeaderButton(HeaderButtons.PHONE_FINDER);
        TabsHandler tabsHandler = new TabsHandler(getDriver());
        tabsHandler.windowHandler();

        PhoneFinderPage phoneFinderPage = new PhoneFinderPage(getDriver());
        Assert.assertTrue(phoneFinderPage.isPageOpened(), "Phone finder page is not opened!");
    }

    @Test()
    public void testHeaderMenuDealsPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");

        homePage.clickExpandHeaderMenu();
        HeaderMenu headerMenu = new HeaderMenu(getDriver());
        headerMenu.clickHeaderButton(HeaderButtons.DEALS);
        TabsHandler tabsHandler = new TabsHandler(getDriver());
        tabsHandler.windowHandler();

        DealsPage dealsPage = new DealsPage(getDriver());
        Assert.assertTrue(dealsPage.isPageOpened(), "Deals page is not opened!");
    }

    @Test()
    public void testHeaderMenuMerchPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");

        homePage.clickExpandHeaderMenu();
        HeaderMenu headerMenu = new HeaderMenu(getDriver());
        headerMenu.clickHeaderButton(HeaderButtons.MERCH);
        TabsHandler tabsHandler = new TabsHandler(getDriver());
        tabsHandler.windowHandler();

        MerchPage merchPage = new MerchPage(getDriver());
        Assert.assertTrue(merchPage.isPageOpened(), "Merch page is not opened!");
    }

    @Test()
    public void testHeaderMenuCoveragePage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");

        homePage.clickExpandHeaderMenu();
        HeaderMenu headerMenu = new HeaderMenu(getDriver());
        headerMenu.clickHeaderButton(HeaderButtons.COVERAGE);
        TabsHandler tabsHandler = new TabsHandler(getDriver());
        tabsHandler.windowHandler();

        NetworkCoveragePage networkCoveragePage = new NetworkCoveragePage(getDriver());
        Assert.assertTrue(networkCoveragePage.isPageOpened(), "Coverage page is not opened!");
    }

    @Test()
    public void testHeaderMenuContactPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");

        homePage.clickExpandHeaderMenu();
        HeaderMenu headerMenu = new HeaderMenu(getDriver());
        headerMenu.clickHeaderButton(HeaderButtons.CONTACT);
        TabsHandler tabsHandler = new TabsHandler(getDriver());
        tabsHandler.windowHandler();

        ContactUsPage contactUsPage = new ContactUsPage(getDriver());
        Assert.assertTrue(contactUsPage.isPageOpened(), "Contact page is not opened!");
    }
}
