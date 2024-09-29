package demowebshop.ui.pages.homepageelements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class FeaturedProductsSection {
    public SelenideElement titleFeaturedProductsSection() {
        return $x("//div[@class = \"page-body\"]//div[@class = \"title\"]/strong")
                .as("Заглавие категории \"Featured Products\"");
    }
    public ElementsCollection listProductsBlocks(){
        return $$x("//div[@class = \"product-item\"]")
                .as("Список блоков рекомендуемых товаров");
    }
    public ElementsCollection listProductsImages(){
        return $$x("//div[@class = \"product-item\"]/div[@class = \"picture\"]//img")
                .as("Список изображений рекомендуемых товаров");
    }
    public ElementsCollection listProductsTitleLinks(){
        return $$x("//div[@class = \"product-item\"]/div[@class = \"details\"]/h2/a")
                .as("Ссылки на название продукта в списке");
    }
    public ElementsCollection listRatingsFullness(){
        return $$x("//div[@class = \"product-item\"]//div[@class = \"rating\"]/div")
                .as("Список рейтингов продуктов");
    }
}
