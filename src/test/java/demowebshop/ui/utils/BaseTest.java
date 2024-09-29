package demowebshop.ui.utils;


import com.codeborne.selenide.logevents.SelenideLogger;
import demowebshop.ui.utils.extension.RunnerExtension;
import demowebshop.ui.utils.extension.TestSuiteExtension;
import io.qameta.allure.selenide.AllureSelenide;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * <h3>Основной конфигурационный класс, от которого наследуются тесты</h3>
 */
@ExtendWith({RunnerExtension.class, TestSuiteExtension.class})
public class BaseTest {
    private static final Logger logger = LogManager.getLogger(BaseTest.class);

    @BeforeEach
    public void setUpEach(){
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true));
    }
}
