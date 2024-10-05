package demowebshop.ui.tests;

import demowebshop.ui.allure.JiraIssue;
import demowebshop.ui.allure.Layer;
import demowebshop.ui.steps.HomePageSteps;
import demowebshop.ui.steps.common.CommonSteps;
import demowebshop.ui.utils.BaseTest;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static demowebshop.ui.configuration.owner.ConfigSingle.config;

@Layer(value = "UI")
@Epic("Домашняя страница")
@Feature("UI. Домашняя страница")
@Story("Блок домашней страницы")
@Tags({@Tag("UI"), @Tag("Домашняя_страница")})
@Owner("M.Salnikov")
@DisplayName("Домашняя страница")
public class HomePageTests extends BaseTest {

    private final CommonSteps commonSteps = new CommonSteps();
    private final HomePageSteps homePageSteps = new HomePageSteps();

    @ParameterizedTest(name = "\"{1}\" в side-баре 'Categories'")
    @MethodSource(value = "demowebshop.ui.configuration.ConfigurationData#sideBarCategoriesList")
    @JiraIssue("HOME-01")
    @AllureId("9")
    @DisplayName(value = "Редирект по ссылке ")
    void checkingRedirectsFromCategoriesSide(String endpoint, String nameCategory){
        commonSteps.goToPage(config.baseUrl() + endpoint);
        homePageSteps.clickOnLinkFromCategories(nameCategory);
        homePageSteps.checkingUrlAfterRedirect(config.baseUrl() + endpoint);
    }
}
