package demowebshop.ui.pages.basepageelement;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.text.MessageFormat;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class HeaderSection {
    public SelenideElement logo(){
        return $x("//img[@alt = \"Tricentis Demo Web Shop\"]")
                .as("Лого");
    }
    public SelenideElement linkHeader(String nameLink){
        return $x(MessageFormat.format("//div[@class = \"headerSection-links\"]//li/a[contains(text(), \"{0}\")]", nameLink))
                .as("Ссылки в шапке");
    }
    public SelenideElement rowSearch(){
        return $x("//input[@id = \"small-searchterms\"]")
                .as("Строка поиска");
    }
    public SelenideElement searchButton(){
        return $x("//input[@class = \"button-1 search-box-button\"]")
                .as("Кнопка поиска");
    }
    public SelenideElement headerMenuWithParam(String headerName){
        return $x(MessageFormat.format("//ul[@class = \"top-menu\"]/li/a[contains(text(), \"{0}\")]", headerName))
                .as("Кнопка в шапке");
    }
    public ElementsCollection headerMenuList(){
        return $$x("//ul[@class = \"top-menu\"]/li/a")
                .as("Кнопки в шапке");
    }
    public SelenideElement headerMenuBlock(){
        return $x("//div[@class = \"header-menu\"]")
                .as("Блок шапки");
    }
}
