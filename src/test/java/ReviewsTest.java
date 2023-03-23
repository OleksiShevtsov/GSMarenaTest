import Components.HeaderMenu;
import Pages.HomePage;
import Pages.ReviewsPage;
import Pages.SamsungReviewsPage;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReviewsTest implements IAbstractTest {

    @Test
    public void testAndroidTagNewsPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        homePage.clickExpandHeaderMenu();
        HeaderMenu headerMenu = new HeaderMenu(getDriver());
        ReviewsPage reviewsPage = headerMenu.clickReviewsButton();
        Assert.assertTrue(reviewsPage.isPageOpened(), "Reviews page is not opened!");
        SamsungReviewsPage samsungReviewsTag = reviewsPage.openSamsungTag();
        Assert.assertTrue(samsungReviewsTag.isPageOpened(), "Page is not opened!");
    }
}
