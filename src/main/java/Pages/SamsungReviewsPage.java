package Pages;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class SamsungReviewsPage extends AbstractPage {
    private final String samsungReviewsPageUrl = "https://www.gsmarena.com/reviews.php3?sTag=Samsung";

    public SamsungReviewsPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(samsungReviewsPageUrl);
    }
}
