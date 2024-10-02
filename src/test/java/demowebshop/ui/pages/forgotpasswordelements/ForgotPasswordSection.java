package demowebshop.ui.pages.forgotpasswordelements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ForgotPasswordSection {
    public SelenideElement passwordRecoveryTitle(){
        return $x("//div[@class = \"page-title\"]/h1")
                .as("Заголовок 'Password recovery'");
    }

    public SelenideElement passwordRecoveryDescription(){
        return $x("//p[@class = \"tooltip\"]")
                .as("Описание сброса пароля");
    }

    public SelenideElement emailInputField(){
        return $x("//input[@class = \"email\" and @id = \"Email\"]")
                .as("Поле для email-адреса");
    }

    public SelenideElement buttonRecover(){
        return $x("//input[@name = \"send-email\" and @value = \"Recover\"]")
                .as("Кнопка 'Recover'");
    }
}
