package Pages;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class AndroidNewsPage extends AbstractPage {
    private final String androidNewsPageUrl = "https://www.gsmarena.com/news.php3?sTag=Android";

    public AndroidNewsPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(androidNewsPageUrl);
    }


}
