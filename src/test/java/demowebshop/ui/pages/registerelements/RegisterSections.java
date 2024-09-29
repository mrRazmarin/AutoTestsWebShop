package demowebshop.ui.pages.registerelements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class RegisterSections {
    public SelenideElement genderMaleLabel(){
        return $x("//div[@class = \"gender\"]/label[contains(text(), \"Male\")]")
                .as("Ярлык \"Male\"");
    }
    public SelenideElement genderMaleRadioInput(){
        return $x("//div[@class = \"gender\"]/input[@id = \"gender-male\"]")
                .as("Точка \"Male\"");
    }

    public SelenideElement genderFemaleLabel(){
        return $x("//div[@class = \"gender\"]/label[contains(text(), \"Female\")]")
                .as("Ярлык \"Female\"");
    }
    public SelenideElement genderFemaleRadioInput(){
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
}
