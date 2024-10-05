package demowebshop.ui.steps;

import demowebshop.ui.pages.HomePage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class HomePageSteps {
    private final HomePage homePage = new HomePage();

    @Step("Клик на ссылку '{0}' в side-bar 'Categories'")
    public void clickOnLinkFromCategories(final String categoryName) {
        homePage.sideBarCategories.linkCategory(categoryName)
                .click();
    }

    @Step("Проверка редиректа на страницу {0}")
    public void checkingUrlAfterRedirect(final String url) {
        webdriver().shouldHave(url(url));
    }
}
