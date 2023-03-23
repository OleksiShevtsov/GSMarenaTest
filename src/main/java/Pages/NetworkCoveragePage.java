package Pages;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class NetworkCoveragePage extends AbstractPage {
    private final String coveragePageUrl = "https://www.gsmarena.com/network-bands.php3";

    public NetworkCoveragePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(coveragePageUrl);
    }
}
