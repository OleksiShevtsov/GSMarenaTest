package Pages;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class CompareSpecsPage extends AbstractPage {
    private final String comparePageUrl = "https://www.gsmarena.com/compare.php3";

    public CompareSpecsPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(comparePageUrl);
    }
}
