package demowebshop.ui.tests;

import demowebshop.ui.allure.JiraIssue;
import demowebshop.ui.allure.Layer;
import demowebshop.ui.configuration.PagePath;
import demowebshop.ui.steps.AuthSteps;
import demowebshop.ui.steps.common.CommonSteps;
import demowebshop.ui.utils.BaseTest;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.SuiteDisplayName;

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
    @JiraIssue("AUTH-01")
    @AllureId("1")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Авторизация под пользователем, без ошибок")
    void test(){
        commonSteps.goToPage(config.baseUrl() + PagePath.LOG_IN);
        authSteps.inputEmail(config.getUserEmail());
        authSteps.inputPassword(config.getUserPassword());
        authSteps.clickOnLogInButton();
        authSteps.checkLinkEmailAccount(config.getUserEmail());
    }

}
