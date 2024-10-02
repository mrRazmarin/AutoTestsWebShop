package demowebshop.ui.configuration.owner;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"system:properties", "file:../ConfigOwner.properties"})
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
    @Key("base.url")
    @DefaultValue("https://demowebshop.tricentis.com/")
    String baseUrl();

    @Key("logo.url")
    @DefaultValue("https://demowebshop.tricentis.com/Themes/DefaultClean/Content/images/logo.png")
    String logoUrl();

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
    @DefaultValue("demowebshop123")
    String getUserPassword();

    @Key("user.password.incorrect")
    @DefaultValue("shop123")
    String getUserPasswordIncorrect();

    @Key("user.password.recovery")
    @DefaultValue("recoveryPassword123")
    String getUserPasswordRecovery();

    @Key("user.new.email")
    String getNewUserEmail();

    @Key("user.new.password")
    String getNewUserPassword();

    @Key("user.new.firstname")
    String getNewUserFirstName();

    @Key("user.new.lastname")
    String getNewUserLastName();

    @Key("user.new.gender")
    String getNewUserGender();
}
