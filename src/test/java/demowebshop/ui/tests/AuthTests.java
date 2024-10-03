package demowebshop.ui.tests;

import demowebshop.ui.allure.JiraIssue;
import demowebshop.ui.allure.Layer;
import demowebshop.ui.configuration.PagePath;
import demowebshop.ui.steps.AuthSteps;
import demowebshop.ui.steps.common.CommonSteps;
import demowebshop.ui.utils.BaseTest;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;

import static demowebshop.ui.configuration.owner.ConfigSingle.config;

@Layer(value = "UI")
@Epic("Авторизация")
@Feature("UI. Авторизация")
@Story("Блок авторизации")
@Tags({@Tag("UI"), @Tag("Авторизация")})
@Owner("M.Salnikov")
@DisplayName("Авторизация")
public class AuthTests extends BaseTest {
    private final AuthSteps authSteps = new AuthSteps();
    private final CommonSteps commonSteps = new CommonSteps();

    @Test
    @JiraIssue("AUTH-01")
    @AllureId("1")
    @DisplayName("Авторизация под пользователем, без ошибок")
    void authorizationWithoutError(){
        commonSteps.goToPage(config.baseUrl() + PagePath.LOG_IN);
        authSteps.inputEmail(config.getUserEmail());
        authSteps.inputPassword(config.getUserPassword());
        authSteps.clickOnLogInButton();
        authSteps.checkLinkEmailAccount(config.getUserEmail());
    }

    @Test
    @JiraIssue("AUTH-02")
    @AllureId("2")
    @DisplayName("Авторизация с неправильным паролем")
    void authorizationWithIncorrectPassword(){
        commonSteps.goToPage(config.baseUrl() + PagePath.LOG_IN);
        authSteps.inputEmail(config.getUserEmail());
        authSteps.inputPassword(config.getUserPasswordIncorrect());
        authSteps.clickOnLogInButton();
        authSteps.checkAppearErrorsMessageAndHaveText();
    }

    @Test
    @JiraIssue("AUTH-03")
    @AllureId("3")
    @DisplayName("Авторизация с чек-боксом 'Remember me?'")
    void authorizationWithCheckboxRememberMe(){
        commonSteps.goToPage(config.baseUrl() + PagePath.LOG_IN);
        authSteps.inputEmail(config.getUserEmail());
        authSteps.inputPassword(config.getUserPassword());
        authSteps.clickOnCheckboxRememberMe();
        authSteps.clickOnLogInButton();
        authSteps.checkLinkEmailAccount(config.getUserEmail());
    }

    @Test
    @JiraIssue("AUTH-04")
    @AllureId("4")
    @DisplayName("Сброс пароля и авторизация с новым паролем")
    @Disabled("Отключен, по причине невозможности извлечь пароль из письма отправленного на email-адрес")
    void dropPasswordAndAuthorizationWithNewPassword(){
        commonSteps.goToPage(config.baseUrl() + PagePath.LOG_IN);
        authSteps.clickOnForgotPasswordLink();
        authSteps.inputEmailInRecoverField(config.getUserEmail());
        authSteps.clickOnRecoverPasswordLink();
        commonSteps.goToPage(config.baseUrl() + PagePath.LOGIN);
        authSteps.inputEmail(config.getUserEmail());
        authSteps.inputPassword(config.getUserPasswordRecovery());
        authSteps.checkLinkEmailAccount(config.getUserEmail());
    }

    @Test
    @JiraIssue("AUTH-05")
    @AllureId("6")
    @DisplayName("Проверка корректного выхода из аккаунта")
    void reAuthorizedFromAccount(){
        commonSteps.goToPage(config.baseUrl() + PagePath.LOG_IN);
        authSteps.inputEmail(config.getUserEmail());
        authSteps.inputPassword(config.getUserPassword());
        authSteps.clickOnLogInButton();
        authSteps.checkLinkEmailAccount(config.getUserEmail());
        authSteps.clickOnLogOutButton();
        authSteps.checkNotHaveLinkOnAccountInHeader(config.getUserEmail());
    }
}
