package demowebshop.ui.configuration.owner;

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
     * Ссылки на страницы
     */
    @Key("homepage.url")
    @DefaultValue("https://demowebshop.tricentis.com/")
    String homePageUrl();

    @Key("register.url")
    @DefaultValue("https://demowebshop.tricentis.com/register")
    String getUrlRegister();

    /**
     * Тайм-ауты (в миллисекундах)
     */
    @Key("timeout")
    @DefaultValue("4000")
    Long getTimeout();

    @Key("timeout.middle")
    @DefaultValue("4000")
    Long getTimeoutMiddle();

    @Key("timeout.long")
    @DefaultValue("15000")
    Long getTimeoutLong();

    /**
     * Данные для учетной записи
     */
    @Key("user.email")
    @DefaultValue("salnikovmishanew2@gmail.com")
    String getUserEmail();

    @Key("user.password")
    @DefaultValue("")
    String getUserPassword();
}
