package demowebshop.ui.tests;

import demowebshop.ui.allure.Layer;
import demowebshop.ui.pages.HomePage;
import demowebshop.ui.steps.AuthSteps;
import demowebshop.ui.steps.common.CommonSteps;
import demowebshop.ui.utils.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static demowebshop.ui.configuration.owner.ConfigSingle.config;

@Layer(value = "UI")
@Epic("Авторизация")
@Feature("UI. Авторизация")
@Story("Блок авторизации")
@Tags({@Tag("UI"), @Tag("Авторизация")})
@Owner("M.Salnikov")
public class AuthTests extends BaseTest {
    private final AuthSteps authSteps = new AuthSteps();
    private final CommonSteps commonSteps = new CommonSteps();

    @Test
    @DisplayName("Авторизация под пользователем, без ошибок")
    void test(){
        commonSteps.goToPage(config.getUrlRegister());
        authSteps.inputEmail(config.getUserEmail());
        authSteps.inputPassword(config.getUserPassword());
        authSteps.clickOnLogInButton();
    }

}
