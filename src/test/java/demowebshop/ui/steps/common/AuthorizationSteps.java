package demowebshop.ui.steps.common;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import demowebshop.api.authorization.Authorization;
import demowebshop.ui.configuration.PagePath;
import io.qameta.allure.Step;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class AuthorizationSteps {
    @Step("Авторизоваться под пользователем")
    public void authorizedAsUserWithApi(){
        Selenide.open(PagePath.LOGIN);
        WebDriverRunner.getWebDriver().manage().addCookie(Authorization.getCookieAuth());
    }
}
