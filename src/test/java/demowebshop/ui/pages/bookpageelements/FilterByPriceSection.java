package demowebshop.ui.pages.bookpageelements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.text.MessageFormat;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class FilterByPriceSection {
    public SelenideElement titleFilterByPrice(){
        return $x("//div[@class = \"filter-title\"]/strong")
                .as("Заголовок фильтра по цене");
    }

    public ElementsCollection linksFilterByPrice(){
        return $$x("//ul[@class = \"price-range-selector\"]//a")
                .as("Список ссылок фильтра по цене");
    }

    public SelenideElement linkFilterByPrice(String price){
        return $x(MessageFormat.format("//a[contains(@href, \"{0}\")]", price))
                .as("Ссылка фильтра по цене");
    }
}
