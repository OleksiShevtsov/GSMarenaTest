import Components.FooterMenu;
import Components.HeaderMenu;
import Pages.*;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import enums.FooterButtons;
import enums.HeaderButtons;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FooterMenuTest implements IAbstractTest {

    @Test()
    public void testFooterMenuHomePage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        homePage.scrollDown();
        pause(3);

        FooterMenu footerMenu = new FooterMenu(getDriver());
        footerMenu.clickHomeButton();
        TabsHandler tabsHandler = new TabsHandler(getDriver());
        tabsHandler.windowHandler();

        HomePage home = new HomePage(getDriver());
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
    }

    @Test()
    public void testFooterMenuNewsPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        homePage.scrollDown();
        pause(3);

        FooterMenu footerMenu = new FooterMenu(getDriver());
        footerMenu.clickNewsButton();
        TabsHandler tabsHandler = new TabsHandler(getDriver());
        tabsHandler.windowHandler();

        NewsPage newsPage = new NewsPage(getDriver());
        Assert.assertTrue(newsPage.isPageOpened(), "News page is not opened!");
    }

    @Test()
    public void testFooterMenuReviewsPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        homePage.scrollDown();
        pause(3);
        FooterMenu footerMenu = new FooterMenu(getDriver());

        footerMenu.clickReviewsButton();
        TabsHandler tabsHandler = new TabsHandler(getDriver());
        tabsHandler.windowHandler();

        ReviewsPage reviewsPage = new ReviewsPage(getDriver());
        Assert.assertTrue(reviewsPage.isPageOpened(), "Reviews page is not opened!");
    }

    @Test()
    public void testFooterMenuComparePage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        homePage.scrollDown();
        pause(3);
        FooterMenu footerMenu = new FooterMenu(getDriver());

        footerMenu.clickCompareButton();
        TabsHandler tabsHandler = new TabsHandler(getDriver());
        tabsHandler.windowHandler();

        CompareSpecsPage compareSpecsPage = new CompareSpecsPage(getDriver());
        Assert.assertTrue(compareSpecsPage.isPageOpened(), "Compare page is not opened!");
    }

    @Test()
    public void testFooterMenuNetworkCoveragePage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        homePage.scrollDown();
        pause(3);
        FooterMenu footerMenu = new FooterMenu(getDriver());

        footerMenu.clickNetworkCoverageButton();
        TabsHandler tabsHandler = new TabsHandler(getDriver());
        tabsHandler.windowHandler();

        NetworkCoveragePage networkCoveragePage = new NetworkCoveragePage(getDriver());
        Assert.assertTrue(networkCoveragePage.isPageOpened(), "Compare page is not opened!");
    }

    @Test()
    public void testFooterMenuGlossaryPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        homePage.scrollDown();
        pause(3);
        FooterMenu footerMenu = new FooterMenu(getDriver());

        footerMenu.clickGlossaryButton();
        TabsHandler tabsHandler = new TabsHandler(getDriver());
        tabsHandler.windowHandler();

        GlossaryPage glossaryPage = new GlossaryPage(getDriver());
        Assert.assertTrue(glossaryPage.isPageOpened(), "Glossary page is not opened!");
    }

    @Test()
    public void testFooterMenuFaqPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        homePage.scrollDown();
        pause(3);
        FooterMenu footerMenu = new FooterMenu(getDriver());

        footerMenu.clickFAQButton();
        TabsHandler tabsHandler = new TabsHandler(getDriver());
        tabsHandler.windowHandler();

        FaqPage faqPage = new FaqPage(getDriver());
        Assert.assertTrue(faqPage.isPageOpened(), "FAQ page is not opened!");
    }
}
