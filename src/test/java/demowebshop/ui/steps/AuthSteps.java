package demowebshop.ui.steps;

import demowebshop.ui.pages.LogInPage;
import io.qameta.allure.Step;

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
}
