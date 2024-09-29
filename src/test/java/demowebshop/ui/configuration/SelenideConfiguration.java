package demowebshop.ui.configuration;

import com.codeborne.selenide.Configuration;
import demowebshop.ui.configuration.owner.ConfigSingle;

public class SelenideConfiguration {

    public static void setConfiguration() {
        Configuration.browser = ConfigSingle.config.browser();
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "0x0";
        Configuration.savePageSource = false;
        Configuration.screenshots = false;
        Configuration.timeout = ConfigSingle.config.getTimeout();
        Configuration.baseUrl = ConfigSingle.config.homePageUrl();
    }
}
