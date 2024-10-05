package demowebshop.ui.tests;

import demowebshop.ui.allure.Layer;
import demowebshop.ui.utils.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;

@Layer(value = "UI")
@Epic("Домашняя страница")
@Feature("UI. Домашняя страница")
@Story("Блок домашней страницы")
@Tags({@Tag("UI"), @Tag("Домашняя_страница")})
@Owner("M.Salnikov")
@DisplayName("Домашняя страница")
public class HomePageTests extends BaseTest {
}
