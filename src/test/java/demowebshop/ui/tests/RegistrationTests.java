package demowebshop.ui.tests;

import demowebshop.ui.allure.JiraIssue;
import demowebshop.ui.allure.Layer;
import demowebshop.ui.configuration.PagePath;
import demowebshop.ui.pages.RegisterPage;
import demowebshop.ui.steps.RegistrationSteps;
import demowebshop.ui.steps.common.CommonSteps;
import demowebshop.ui.utils.BaseTest;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;

import static demowebshop.ui.configuration.owner.ConfigSingle.config;

@Layer(value = "UI")
@Epic("Регистрация")
@Feature("UI. Регистрация")
@Story("Блок регистрации")
@Tags({@Tag("UI"), @Tag("Регистрация")})
@Owner("M.Salnikov")
@DisplayName("Регистрация")
public class RegistrationTests extends BaseTest {
    private final CommonSteps commonSteps = new CommonSteps();
    private final RegistrationSteps registrationSteps = new RegistrationSteps();

    @Test
    @JiraIssue("REG-01")
    @AllureId("5")
    @DisplayName("Регистрация нового пользователя")
    @Disabled("Отключен, по причине отсутствия множества регистрационных данных, которые можно переиспользовать")
    void registrationNewUser(){
        commonSteps.goToPage(config.baseUrl() + PagePath.REGISTER);
        registrationSteps.setFirstName(config.getNewUserFirstName());
        registrationSteps.setLastName(config.getNewUserLastName());
        registrationSteps.setEmail(config.getNewUserEmail());
        registrationSteps.setPassword(config.getNewUserPassword());
        registrationSteps.setConfirmPassword(config.getNewUserPassword());
        registrationSteps.clickOnRegisterButton();
    }
}
