package demowebshop.pages.homepageelements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.text.MessageFormat;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class SideBarCommunityPoll {
    public ElementsCollection rowWithRadioPoints(){
        return $$x("//ul[@class = \"poll-options\"]//label")
                .as("Список для выбора");
    }
    public SelenideElement rowWithRadioPoint(String label){
        return $x(MessageFormat.format("//ul[@class = \"poll-options\"]//label[contains(text(), \"{0}\")]", label))
                .as("Вариант для выбора");
    }
}
