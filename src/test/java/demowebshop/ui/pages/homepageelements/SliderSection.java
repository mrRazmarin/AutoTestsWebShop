package demowebshop.ui.pages.homepageelements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class SliderSection {
    public ElementsCollection buttonsSlider(){
        return $$x("//div[@class = \"nivo-controlNav\"]/a")
                .as("Кнопки слайдера");
    }
    public ElementsCollection linksSlider(){
        return $$x("//div[@class = \"nivoSlider\"]/a")
                .as("Ссылки слайдера");
    }
    public ElementsCollection imagesSlider(){
        return $$x("//div[@class = \"nivoSlider\"]/a/img")
                .as("Изображения слайдера");
    }
    public SelenideElement mainImage(){
        return $x("//img[@class = \"nivo-main-image\"]")
                .as("Главное изображение на слайдере");// в текущий момент
    }
    public SelenideElement sliderCaption(){
        return $x("//div[@class = \"nivo-caption\"]")
                .as("Подпись слайдера");
    }
    public ElementsCollection buttonsChangeImageSlider(){
        return $$x("//div[@class = \"nivo-directionNav\"]/a")
                .as("Кнопки переключения слайдов");
    }
}
