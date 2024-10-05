package demowebshop.ui.tests;

import demowebshop.ui.allure.JiraIssue;
import demowebshop.ui.allure.Layer;
import demowebshop.ui.utils.BaseTest;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

@Layer(value = "UI")
@Epic("Домашняя страница")
@Feature("UI. Домашняя страница")
@Story("Блок домашней страницы")
@Tags({@Tag("UI"), @Tag("Домашняя_страница")})
@Owner("M.Salnikov")
@DisplayName("Домашняя страница")
public class HomePageTests extends BaseTest {

    @Test
    @JiraIssue("HOME-01")
    @AllureId("9")
    @DisplayName("")
    void checkingRedirectToLinkCategories(){
        
    }
}
