package demowebshop.ui.pages.bookpageelements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.text.MessageFormat;

import static com.codeborne.selenide.Selenide.*;

public class HeaderBooksPage {
    public SelenideElement comebackHomePageUrl(){
        return $x("//li/a[@title = \"Home\"]")
                .as("Ссылка для перехода на домашнюю страницу");
    }

    public SelenideElement titleBooks(){
        return $x("//div[@class = \"page-title\"]/h1")
                .as("Заголовок страницы 'Books'");
    }

    public SelenideElement selectedSortBy(){
        return $x("//select[@id = \"products-orderby\"]/option[@selected = \"selected\"]")
                .as("Выбранная на данный момент сортировка поля 'Sort By'");
    }

    public SelenideElement selectSortBy(){
        return $x("//select[@id = \"products-orderby\"]")
                .as("Выпадающий список 'Sort by'");
    }

    public SelenideElement selectSortByOption(){
        return $x("//select[@id = \"products-orderby\"]/option[@value and not(@selected)]")
                .as("Элементы в выпадающем списке 'Sort by'");
    }

    public SelenideElement selectedDisplay(){
        return $x("//select[@id = \"products-pagesize\"]/option[@selected = \"selected\"]")
                .as("Выбранная на данный момент сортировка поля 'Display'");
    }

    public SelenideElement selectDisplay(){
        return $x("//select[@id = \"products-pagesize\"]")
                .as("Выпадающий список 'Display'");
    }

    public SelenideElement selectDisplayOption(){
        return $x("//select[@id = \"products-pagesize\"]/option[@value and not(@selected)]")
                .as("Элементы в выпадающем списке 'Display'");
    }

    public SelenideElement selectedViewAs(){
        return $x("//select[@id = \"products-viewmode\"]/option[@selected = \"selected\"]")
                .as("Выбранная на данный момент сортировка поля 'View as'");
    }

    public SelenideElement selectViewAs(){
        return $x("//select[@id = \"products-viewmode\"]")
                .as("Выпадающий список 'View as'");
    }

    public SelenideElement selectViewAsOption(){
        return $x("//select[@id = \"products-viewmode\"]/option[@value and not(@selected)]")
                .as("Элементы в выпадающем списке 'View as'");
    }
}
