package demowebshop.ui.steps;

import demowebshop.ui.pages.RegisterPage;
import io.qameta.allure.Step;

public class RegistrationSteps {
    private final RegisterPage registerPage = new RegisterPage();

    @Step("Кликл по кнопке 'Male'")
    public void clickOnRadioButtonGenderMale() {
        registerPage.registerSections.genderMaleRadioButton()
                .click();
    }

    @Step("Кликл по кнопке 'Female'")
    public void clickOnRadioButtonGenderFemale() {
        registerPage.registerSections.genderFemaleRadioButton()
                .click();
    }

    @Step("Ввод имени пользователя")
    public void setFirstName(String firstName) {
        registerPage.registerSections.firstNameInputField()
                .setValue(firstName);
    }

    @Step("Ввод фамилии пользователя")
    public void setLastName(String lastName) {
        registerPage.registerSections.lastNameInputField()
                .setValue(lastName);
    }

    @Step("Ввод email-адреса")
    public void setEmail(String email) {
        registerPage.registerSections.emailInputField()
                .setValue(email);
    }

    @Step("Ввод пароля")
    public void setPassword(String password) {
        registerPage.registerSections.inputPassword()
                .setValue(password);
    }

    @Step("Ввод подтверждения пароля")
    public void setConfirmPassword(String confirmPassword) {
        registerPage.registerSections.inputConfirmPassword()
                .setValue(confirmPassword);
    }

    @Step("Клик на кнопку 'Register'")
    public void clickOnRegisterButton() {
        registerPage.registerSections.buttonRegister()
                .click();
    }
}
