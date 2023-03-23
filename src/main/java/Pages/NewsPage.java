package Pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class NewsPage extends AbstractPage {
    private final String newsPageUrl = "https://www.gsmarena.com/news.php3";

    @FindBy(xpath = "//a[@href='?sTag=Android']")
    private ExtendedWebElement androidTag;

    public NewsPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(newsPageUrl);
    }

    public AndroidNewsPage openAndroidTag() {
        androidTag.click();
        return new AndroidNewsPage(getDriver());
    }
}
