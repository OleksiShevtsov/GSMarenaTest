package Components;

import Pages.*;
import com.qaprosoft.carina.core.foundation.webdriver.WindowsHandler;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import enums.HeaderButtons;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import javax.swing.plaf.basic.BasicTabbedPaneUI;
import javax.swing.text.TabExpander;
import java.util.List;

public class HeaderMenu extends AbstractUIObject {

    @FindBy(xpath = "//ul[@id='menu']//a[@href]")
    private List<ExtendedWebElement> headerMenuButtons;

    @FindBy(xpath = "//li/a[@href='/']")
    private ExtendedWebElement homeButton;

    @FindBy(xpath = "//ul[@id='menu']//a[@href='news.php3']")
    private ExtendedWebElement newsButton;

    @FindBy(xpath = "//ul[@id='menu']//a[@href='reviews.php3']")
    private ExtendedWebElement reviewsButton;

    @FindBy(xpath = "//ul[@id='menu']//a[@href='videos.php3']")
    private ExtendedWebElement videosButton;

    public HeaderMenu(WebDriver driver) {
        super(driver);
    }

    public HeaderMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public HomePage clickHomeButton() {
        homeButton.click();
        return new HomePage(getDriver());
    }

    public NewsPage clickNewsButton() {
        newsButton.click();
        return new NewsPage(driver);
    }

    public ReviewsPage clickReviewsButton() {
        reviewsButton.click();
        return new ReviewsPage(driver);
    }

    public VideosPage clickVideosButton() {
        videosButton.click();
        return new VideosPage(driver);
    }

    public void clickHeaderButton(HeaderButtons headerButton) {
        headerMenuButtons.get(headerButton.getHeaderElement()).click();
    }


}
