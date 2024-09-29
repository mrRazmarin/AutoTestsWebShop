package demowebshop.ui.utils.extension;


import com.codeborne.selenide.WebDriverRunner;
import demowebshop.ui.configuration.SelenideConfiguration;

public class TestSuiteExtension implements SuiteExtension{
    @Override
    public void beforeSuite() {
        SelenideConfiguration.setConfiguration();
    }

    @Override
    public void afterSuite() {
        WebDriverRunner.closeWebDriver();
    }
}
