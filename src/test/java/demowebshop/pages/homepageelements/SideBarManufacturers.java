package demowebshop.pages.homepageelements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.text.MessageFormat;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class SideBarManufacturers {
    public ElementsCollection listLinksManufacturers() {
        return $$x("//div[@class = \"block block-manufacturer-navigation\"]//ul[@class = \"list\"]/li/a")
                .as("Список ссылок в боковом меню \"Производители\"");
    }
    public SelenideElement linkManufacturer(String manufacturer) {
        return $x(MessageFormat.format("//div[@class = \"block block-manufacturer-navigation\"]//ul[@class = \"list\"]/li/a[contains(text(), \"{0}\")]", manufacturer))
                .as("Ссылка в боковом меню \"Производители\"");
    }
}
