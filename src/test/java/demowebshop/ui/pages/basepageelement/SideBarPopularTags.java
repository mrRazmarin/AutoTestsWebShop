package demowebshop.ui.pages.basepageelement;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.text.MessageFormat;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class SideBarPopularTags {
    public ElementsCollection listOfTagLinks(){
        return $$x("//div[@class = \"tags\"]//a")
                .as("Список ссылок-тегов");
    }
    public SelenideElement tagLink(String tagName){
        return $x(MessageFormat.format("//div[@class = \"tags\"]//a[contains(text(), \"{0}\")]", tagName))
                .as("Ссылка-тег");
    }
    public SelenideElement viewAllButton(){
        return $x("//div[@class = \"view-all\"]")
                .as("Кнопка \"View all\"");
    }
}
