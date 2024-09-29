package demowebshop.ui.pages.homepageelements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SideBarNewsletter {
    public SelenideElement newsletterInput(){
        return $x("//input[@id = \"newsletter-email\"]")
                .as("Поле ввода новостной рассылки");
    }
    public SelenideElement newsletterButton(){
        return $x("//input[@type = \"button\" and @value = \"Subscribe\"]")
                .as("Кнопка \"Subscribe\"");
    }
}
