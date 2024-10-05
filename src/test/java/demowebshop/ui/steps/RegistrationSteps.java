package demowebshop.ui.steps;

import demowebshop.ui.pages.RegisterPage;
import io.qameta.allure.Param;
import io.qameta.allure.Step;
import io.qameta.allure.model.Parameter;
import org.junit.jupiter.api.Assertions;

import java.util.List;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.SetValueOptions.withText;
import static demowebshop.ui.pages.registerelements.TextValidationErrorsMessages.*;

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
    public void setEmail(@Param(mode = Parameter.Mode.MASKED) String email) {
        registerPage.registerSections.emailInputField()
                .setValue(withText(email).sensitive());
    }

    @Step("Ввод пароля")
    public void setPassword(@Param(mode = Parameter.Mode.MASKED) String password) {
        registerPage.registerSections.inputPassword()
                .setValue(withText(password).sensitive());
    }

    @Step("Ввод подтверждения пароля")
    public void setConfirmPassword(@Param(mode = Parameter.Mode.MASKED) String confirmPassword) {
        registerPage.registerSections.inputConfirmPassword()
                .setValue(withText(confirmPassword).sensitive());
    }

    @Step("Клик на кнопку 'Register'")
    public void clickOnRegisterButton() {
        registerPage.registerSections.buttonRegister()
                .click();
    }

    @Step("Наличие ошибок при регистрации с пустой формой")
    public void checkHaveErrorsWithEmptyForm(){
        List<String> expectedList = List.of(getValidationErrorFirstNameText(),
                getValidationErrorLastNameText(),
                getValidationErrorRequiredEmailText(),
                getValidationErrorPasswordText(),
                getValidationErrorConfirmPasswordText());
        registerPage.registerSections.validationErrorsList()
                .shouldHave(texts(expectedList));
        checkHaveTwoErrorsPasswordWithEmptyForm();
    }

    @Step("Проверка наличия 2-х ошибок пароля, при регистрации пустой формы")
    private void checkHaveTwoErrorsPasswordWithEmptyForm(){
        long countErrors = registerPage.registerSections.validationErrorsList()
                .texts()
                .stream()
                .filter(str->str.equals(getValidationErrorPasswordText()))
                .count();
        Assertions.assertEquals(2, countErrors);
    }

    @Step("Проверка ошибки 'Wrong email'")
    public void verifyTheEmailWrongError(){
        registerPage.registerSections.validationErrorEmailField()
                .shouldHave(text(getValidationErrorWrongEmailText()));
    }

    @Step("Проверка ошибки 'Password do not match'")
    public void verifyThePasswordDoNotMatchError(){
        registerPage.registerSections.validationErrorConfirmPasswordField()
                .shouldHave(text(getValidationErrorDoNotMatchConfirmPasswordText()));
    }

    @Step("Проверка ошибки 'Small password'")
    public void verifyTheSmallPasswordError(){
        registerPage.registerSections.validationErrorPasswordField()
                .shouldHave(text(getValidationErrorSmallPasswordText()));
    }
}
