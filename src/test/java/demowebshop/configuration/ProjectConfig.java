package demowebshop.configuration;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:ConfigOwner.properties")
public interface ProjectConfig extends Config {
    /**
     * Браузер
     */
    @Key("browser.name")
    @DefaultValue("chrome")
    String browser();

    /**
     * Стартовая страница магазина
     */
    @Key("homepage.url")
    @DefaultValue("https://demowebshop.tricentis.com/")
    String homePageUrl();
}
