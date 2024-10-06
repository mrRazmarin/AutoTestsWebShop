package demowebshop.ui.configuration;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;

import static demowebshop.ui.configuration.owner.ConfigSingle.config;

public class SelenideConfiguration {

    public static void setConfiguration() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--no-sandbox","--disable-dev-shm-usage");

        Configuration.browser = config.browser();
        Configuration.browserCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "0x0";
        Configuration.savePageSource = false;
        Configuration.screenshots = true;
        Configuration.timeout = config.getTimeout();
        Configuration.baseUrl = config.baseUrl();
    }
}
