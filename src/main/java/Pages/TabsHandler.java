package Pages;

import com.qaprosoft.carina.core.foundation.webdriver.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TabsHandler extends DriverHelper {
    public String parentWindow = driver.getWindowHandle();

    public TabsHandler(WebDriver driver) {
        super(driver);
    }

    public void windowHandler() {

        for (String windowHandle : driver.getWindowHandles()) {
            if (!parentWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }
}
