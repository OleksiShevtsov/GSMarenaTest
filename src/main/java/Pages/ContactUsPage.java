package Pages;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class ContactUsPage extends AbstractPage {
    private final String contactPageUrl = "https://www.gsmarena.com/contact.php3";

    public ContactUsPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(contactPageUrl);
    }
}
