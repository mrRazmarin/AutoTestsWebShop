package demowebshop.ui.pages.loginelements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class PageTitle {
    public SelenideElement pageTitle() {
        return $x("//div[@class = \"page-title\"]/h1")
                .as("Приветственный заголовок");
    }
}
