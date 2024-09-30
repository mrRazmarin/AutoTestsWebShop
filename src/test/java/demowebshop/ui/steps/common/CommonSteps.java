package demowebshop.ui.steps.common;


import com.codeborne.selenide.Selenide;
import demowebshop.ui.pages.BasePageElements;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.not;
import static demowebshop.ui.configuration.owner.ConfigSingle.config;

/**
 * <h3>Общие шаги тестов<h3>
 */

public class CommonSteps {
    private final BasePageElements basePageElements = new BasePageElements();

    private void awaitPageLoad(){
        if(basePageElements.headerSection.headerMenuBlock().is(not(appear))) {
            Selenide.refresh();
        }
        basePageElements.headerSection.headerMenuBlock().should(appear, Duration.ofMillis(config.getTimeoutLong()));
    }

    @Step("Переход на страницу")
    public void goToPage(String pageUrl) {
        Selenide.open(pageUrl);
        awaitPageLoad();
    }
}
