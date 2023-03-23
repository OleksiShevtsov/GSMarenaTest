package Components;/*
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

import Pages.CompareSpecsPage;
import Pages.ReviewsPage;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import enums.FooterButtons;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FooterMenu extends AbstractUIObject {

    @FindBy(xpath = "//p//a[@href='/']")
    private ExtendedWebElement homeButton;

    @FindBy(xpath = "//div[@id='footer']//p//a[@href='news.php3']")
    private ExtendedWebElement newsButton;

    @FindBy(xpath = "(//p//a[text()='Reviews'])[2]")
    private ExtendedWebElement reviewsButton;

    @FindBy(xpath = "(//a[text()='Compare'])[2]")
    private ExtendedWebElement compareButton;

    @FindBy(xpath = "(//a[text()='Coverage'])[3]")
    private ExtendedWebElement networkCoverageButton;

    @FindBy(xpath = "//div[@id='footer']//p//a[@href='glossary.php3']")
    private ExtendedWebElement glossaryButton;

    @FindBy(xpath = "//div[@id='footer']//p//a[@href='faq.php3']")
    private ExtendedWebElement faqButton;

    public FooterMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public FooterMenu(WebDriver driver) {
        super(driver);
    }

    public void clickHomeButton() {
        homeButton.click();
    }

    public void clickNewsButton() {
        newsButton.click();
    }

    public void clickReviewsButton() {
        reviewsButton.click();
    }

    public void clickCompareButton() {
        compareButton.click();
    }

    public void clickNetworkCoverageButton() {
        networkCoverageButton.click();
    }

    public void clickGlossaryButton() {
        glossaryButton.click();
    }

    public void clickFAQButton() {
        faqButton.click();
    }
}
