package demowebshop.ui.pages.registerelements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class RegisterSections {
    public SelenideElement genderMaleLabel(){
        return $x("//div[@class = \"gender\"]/label[contains(text(), \"Male\")]")
                .as("Ярлык \"Male\"");
    }

    public SelenideElement genderMaleRadioButton(){
        return $x("//div[@class = \"gender\"]/input[@id = \"gender-male\"]")
                .as("Точка \"Male\"");
    }

    public SelenideElement genderFemaleLabel(){
        return $x("//div[@class = \"gender\"]/label[contains(text(), \"Female\")]")
                .as("Ярлык \"Female\"");
    }

    public SelenideElement genderFemaleRadioButton(){
        return $x("//div[@class = \"gender\"]/input[@id = \"gender-female\"]")
                .as("Точка \"Female\"");
    }

    public SelenideElement inputPassword(){
        return $x("//input[@id = \"Password\"]")
                .as("Поле \"Password\"");
    }

    public SelenideElement inputConfirmPassword(){
        return $x("//input[@id = \"ConfirmPassword\"]")
                .as("Поле \"ConfirmPassword\"");
    }

    public SelenideElement buttonRegister(){
        return $x("//input[@id = \"register-button\"]")
                .as("Кнопка \"Register\"");
    }

    public SelenideElement firstNameInputField(){
        return $x("//input[@id = \"FirstName\"]")
                .as("Поле ввода 'First Name'");
    }

    public SelenideElement lastNameInputField(){
        return $x("//input[@id = \"LastName\"]")
                .as("Поле ввода 'Last Name'");
    }

    public SelenideElement emailInputField(){
        return $x("//input[@id = \"Email\"]")
                .as("Поле ввода 'Email'");
    }

    public ElementsCollection validationErrorsList(){
        return $$x("//span[@class = \"field-validation-error\"]/span")
                .as("Список валидационных ошибок у полей");
    }

    /*
      <h3>Элементы ошибок, по каждому из полей</h3>
     */

    public SelenideElement validationErrorFirstNameField(){
       return $x("//span[@class = \"field-validation-error\"]/span[@for = \"FirstName\"]")
                .as("Текст ошибки у поля 'First name'");
    }

    public SelenideElement validationErrorLastNameField(){
        return $x("//span[@class = \"field-validation-error\"]/span[@for = \"LastName\"]")
                .as("Текст ошибки у поля 'Last Name'");
    }

    public SelenideElement validationErrorEmailField(){
        return $x("//span[@class = \"field-validation-error\"]/span[@for = \"Email\"]")
                .as("Текст ошибки у поля 'Email'");
    }

    public SelenideElement validationErrorPasswordField(){
        return $x("//span[@class = \"field-validation-error\"]/span[@for = \"Password\"]")
                .as("Текст ошибки у поля 'Password'");
    }

    public SelenideElement validationErrorConfirmPasswordField(){
        return $x("//span[@class = \"field-validation-error\"]/span[@for = \"ConfirmPassword\"]")
                .as("Текст ошибки у поля 'Confirm Password'");
    }
}
