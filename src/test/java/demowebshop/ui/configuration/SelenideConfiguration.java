package demowebshop.ui.configuration;

import com.codeborne.selenide.Configuration;

import static demowebshop.ui.configuration.owner.ConfigSingle.config;

public class SelenideConfiguration {

    public static void setConfiguration() {
        Configuration.browser = config.browser();
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "0x0";
        Configuration.savePageSource = false;
        Configuration.screenshots = true;
        Configuration.timeout = config.getTimeout();
        Configuration.baseUrl = config.baseUrl();
    }
}
