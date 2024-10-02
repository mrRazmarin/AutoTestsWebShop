package demowebshop.ui.pages.loginelements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ReturningCustomerBlock {
    public SelenideElement returningCustomerHeader(){
        return $x("//div[@class = \"returning-wrapper\"]/div[@class = \"title\"]/strong")
                .as("Заголовок \"Returning Customer\"");
    }

    public SelenideElement emailInput(){
        return $x("//input[@id = \"Email\"]")
                .as("Поле \"Email\"");
    }

    public SelenideElement passwordInput(){
        return $x("//input[@id = \"Password\"]")
                .as("Поле \"Password\"");
    }

    public SelenideElement checkBoxRememberMe(){
        return $x("//input[@id = \"RememberMe\" and @type = \"checkbox\"]")
                .as("Чек-бокс \"Remember Me\"");
    }

    public SelenideElement linkForgotPassword(){
        return $x("//span[@class = \"forgot-password\"]/a")
                .as("Ссылка \"Forgot Password\"");
    }

    public SelenideElement buttonLogIn(){
        return $x("//input[@value = \"Log in\"]")
                .as("Кнопка \"Log in\"");
    }

    public SelenideElement loginErrorMessage(){
        return $x("//div[@class = \"validation-summary-errors\"]/span")
                .as("Строка с ошибкой в логине");
    }

    public SelenideElement credentialsErrorMessage(){
        return $x("//div[@class = \"validation-summary-errors\"]//li")
                .as("Строка с ошибкой в учетных данных");
    }
}
