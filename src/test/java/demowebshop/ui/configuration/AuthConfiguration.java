package demowebshop.ui.configuration;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import demowebshop.ui.configuration.owner.ConfigSingle;
import org.junit.jupiter.api.extension.*;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static com.codeborne.selenide.Configuration.baseUrl;

@Execution(ExecutionMode.CONCURRENT)
public class AuthConfiguration implements BeforeAllCallback, BeforeEachCallback, AfterEachCallback {

    @Override
    public void afterEach(ExtensionContext context) {
        WebDriverRunner.closeWebDriver();
    }

    @Override
    public void beforeAll(ExtensionContext context) {
        Configuration.browser = ConfigSingle.config.browser();
        baseUrl = ConfigSingle.config.homePageUrl() + "/register";
        Configuration.reportsFolder = "src/test/resources/screenshots";
        Configuration.screenshots = true;
    }

    @Override
    public void beforeEach(ExtensionContext context) {
        Selenide.open(baseUrl);
        //Cookie cookie = new Cookie();
        //WebDriverRunner.getWebDriver().manage().addCookie(cookie);
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }
}
