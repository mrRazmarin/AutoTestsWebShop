package demowebshop.ui.pages.loginelements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class NewCustomerBlock {
    public SelenideElement newCustomerTitle() {
        return $x("//div[@class = \"new-wrapper register-block\"]/div[@class = \"title\"]/strong")
                .as("Заголовок \"New Customer\"");
    }
    public SelenideElement newCustomerDescription() {
        return $x("")
                .as("Описание блока \"New Customer\"");
    }
    public SelenideElement newCustomerText() {
        return $x("//div[@class = \"new-wrapper register-block\"]/div[@class = \"text\"]")
                .as("Текст блока \"New Customer\"");
    }
    public SelenideElement buttonRegister() {
        return $x("//input[@value = \"Register\"]")
                .as("Кнопка \"Register\"");
    }
}
