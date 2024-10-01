package demowebshop.ui.steps;

import demowebshop.ui.pages.LogInPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.appear;

public class AuthSteps {
    private final LogInPage logInPage = new LogInPage();

    @Step("Ввод адреса электронной почты")
    public void inputEmail(String email) {
        logInPage.returningCustomerBlock.emailInput().setValue(email);
    }

    @Step("Ввод пароля")
    public void inputPassword(String password) {
        logInPage.returningCustomerBlock.passwordInput().setValue(password);
    }

    @Step("Клик по кнопке \"Log in\"")
    public void clickOnLogInButton(){
        logInPage.returningCustomerBlock.buttonLogIn().click();
    }

    @Step("Проверка ссылки на редирект")
    public void checkLinkEmailAccount(String emailAddress){
        logInPage.headerSection.linkHeader(emailAddress).should(appear);
    }
}
