package demowebshop.ui.configuration.owner;

import org.aeonbits.owner.ConfigFactory;

public class ConfigSingle {
    public static final ProjectConfig config;

    static {
        config = ConfigFactory.create(ProjectConfig.class);
    }
}
