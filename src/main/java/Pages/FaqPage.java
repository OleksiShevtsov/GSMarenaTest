package Pages;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class FaqPage extends AbstractPage {
    private final String faqPageUrl = "https://www.gsmarena.com/faq.php3";

    public FaqPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(faqPageUrl);
    }

}
