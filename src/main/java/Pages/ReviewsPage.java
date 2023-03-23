package Pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ReviewsPage extends AbstractPage {
    private final String reviewsPageUrl = "https://www.gsmarena.com/reviews.php3";

    @FindBy(xpath = "//li[@class='popular-tags-list-item']//a[@href='?sTag=Samsung']")
    private ExtendedWebElement samsungTag;

//    @FindBy(xpath = "//div[@class='floating-title']")
//    private List<ExtendedWebElement> samsungTag;

    public ReviewsPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(reviewsPageUrl);
    }

    public SamsungReviewsPage openSamsungTag() {
        samsungTag.click();
        return new SamsungReviewsPage(getDriver());
    }

        //div[@id='reviews']//h3//a[@href='samsung_galaxy_a14_5g-review-2534.php']
}
