package demowebshop.ui.steps;

import demowebshop.ui.pages.ForgotPasswordPage;
import demowebshop.ui.pages.LogInPage;

import io.qameta.allure.Param;
import io.qameta.allure.Step;
import io.qameta.allure.model.Parameter;

import static com.codeborne.selenide.Condition.*;
import static demowebshop.ui.pages.loginelements.TextErrorsMessages.*;
import static com.codeborne.selenide.SetValueOptions.*;

public class AuthSteps {
    private final LogInPage logInPage = new LogInPage();
    private final ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

    @Step("Ввод адреса электронной почты")
    public void inputEmail(@Param(mode = Parameter.Mode.MASKED) String email) {
        logInPage.returningCustomerBlock.emailInput()
                .setValue(withText(email).sensitive());
    }

    @Step("Ввод пароля")
    public void inputPassword(@Param(mode = Parameter.Mode.MASKED) String password) {
        logInPage.returningCustomerBlock.passwordInput()
                .setValue(withText(password).sensitive());
    }

    @Step("Клик по кнопке 'Log in'")
    public void clickOnLogInButton(){
        logInPage.returningCustomerBlock.buttonLogIn()
                .click();
    }

    @Step("Клик по чек-боксу 'Remember me?'")
    public void clickOnCheckboxRememberMe(){
        logInPage.returningCustomerBlock.checkBoxRememberMe()
                .click();
    }

    @Step("Клик по ссылке 'Forgot password?'")
    public void clickOnForgotPasswordLink(){
        logInPage.returningCustomerBlock.linkForgotPassword()
                .click();
    }

    @Step("Ввод email-адреса")
    public void inputEmailInRecoverField(@Param(mode = Parameter.Mode.MASKED) String email) {
        forgotPasswordPage.forgotPasswordSection.emailInputField()
                .setValue(withText(email).sensitive());
    }

    @Step("Клик по кнопке 'Recover'")
    public void clickOnRecoverPasswordLink() {
        forgotPasswordPage.forgotPasswordSection.buttonRecover()
                .click();
    }

    @Step("Клик по кнопке 'Log out'")
    public void clickOnLogOutButton() {
        logInPage.headerSection.linkHeader("Log out")
                .click();
    }

    @Step("Наличие ссылки редиректа в личный кабинет")
    public void checkLinkEmailAccount(@Param(mode = Parameter.Mode.MASKED) String emailAddress){
        logInPage.headerSection.linkHeader(emailAddress)
                .should(appear);
    }

    @Step("Отображения ошибок и наличие указанного текста, при некорректной авторизации")
    public void checkAppearErrorsMessageAndHaveText(){
        logInPage.returningCustomerBlock.loginErrorMessage()
                .should(appear)
                .shouldHave(text(getLoginErrorMessage()));
        logInPage.returningCustomerBlock.credentialsErrorMessage()
                .should(appear)
                .shouldHave(text(getCredentialsErrorMessage()));
    }

    @Step("Проверка отсутствия ссылки на аккаунт")
    public void checkNotHaveLinkOnAccountInHeader(@Param(mode = Parameter.Mode.MASKED) String emailAddress){
        logInPage.headerSection.linkHeader(emailAddress)
                .should(disappear);
    }
}
