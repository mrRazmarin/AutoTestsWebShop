package demowebshop.ui.tests;

import demowebshop.ui.allure.Layer;
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
    @DisplayName("")
    void test(){

    }

}
