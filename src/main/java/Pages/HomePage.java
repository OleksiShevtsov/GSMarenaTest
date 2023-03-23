package Pages;/*
 * Copyright 2013-2021 QAPROSOFT (http://qaprosoft.com/).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import Components.FooterMenu;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.zebrunner.carina.utils.Configuration;
import com.zebrunner.carina.utils.R;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;
import java.util.List;

public class HomePage extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(xpath = "//*[@id='footmenu']")
    private ExtendedWebElement footerMenu;

    @FindBy(xpath = "//div[contains(@class, 'brandmenu-v2')]//a")
    private List<ExtendedWebElement> brandLinks;

    @FindBys({@FindBy(xpath = "//p[contains(@class, 'pad')]"), @FindBy(xpath = ".//*[contains(@class, 'pad-single')]")})
    private ExtendedWebElement phoneFinderButton;

    @FindBy(className = "news-column-index")
    private ExtendedWebElement newsColumn;

    @FindBy(xpath = "//a[@href='register.php3']")
    private ExtendedWebElement signUpButton;

    @FindBy(id = "header")
    private ExtendedWebElement header;

    @FindBy(xpath = "//button[@role='button']")
    private ExtendedWebElement expandHeaderMenu;

    @FindBy(xpath = "//i[@class='head-icon icon-login']")
    private ExtendedWebElement logInButton;

    public HomePage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(newsColumn);
        setPageAbsoluteURL(R.CONFIG.get(Configuration.Parameter.URL.getKey()));
    }

//    public Components.FooterMenu getFooterMenu() {
//        return footerMenu;
//    }
//
//        public BrandModelsPage selectBrand(String brand) {
//        LOGGER.info("selecting '" + brand + "' brand...");
//        for (ExtendedWebElement brandLink : brandLinks) {
//            String currentBrand = brandLink.getText();
//            LOGGER.info("currentBrand: " + currentBrand);
//            if (brand.equalsIgnoreCase(currentBrand)) {
//                brandLink.click();
//                return new BrandModelsPage(driver);
//            }
//        }
//        throw new RuntimeException("Unable to open brand: " + brand);
//    }

//    public WeValuePrivacyAd getWeValuePrivacyAd() {
//        return new WeValuePrivacyAd(driver);
//    }

    public ExtendedWebElement getPhoneFinderButton() {
        return phoneFinderButton;
    }

    public void clickSignUpButton() {
        signUpButton.click();
    }

    public ExtendedWebElement clickLogInButton() {
        logInButton.click();
        return logInButton;
    }

    public ExtendedWebElement clickExpandHeaderMenu() {
        expandHeaderMenu.click();
        return header;
    }

    public ExtendedWebElement getFooterMenu() {
        return footerMenu;
    }

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        for (int i = 0; i < 6; i++) {
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
            pause(2);
        }
    }
}
