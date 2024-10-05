package demowebshop.ui.pages.basepageelement;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.text.MessageFormat;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class SideBarCategories {
    public ElementsCollection listLinksCategories(){
        return $$x("//div[@class = \"block block-category-navigation\"]//ul[@class = \"list\"]/li/a")
                .as("Список ссылок в боковом меню 'Categories'");
    }
    public SelenideElement linkCategory(String category){
        return $x(MessageFormat.format("//div[@class = \"block block-category-navigation\"]//ul[@class = \"list\"]/li/a[contains(text(), \"{0}\")]",category))
                .as("Ссылка в боковом меню 'Categories'");
    }
}
