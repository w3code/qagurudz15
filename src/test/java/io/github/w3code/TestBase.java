package io.github.w3code;

import com.codeborne.selenide.Configuration;
import io.github.w3code.config.ApiConfig;
import io.github.w3code.config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Objects;

public class TestBase {
    ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());
    public static WebConfig webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());

    @BeforeAll
    static void setUp() {
        Configuration.browser = webConfig.browser();
        Configuration.browserVersion = webConfig.browserVersion();
        Configuration.browserSize = webConfig.browserSize();

        DesiredCapabilities capabilities = new DesiredCapabilities();

        if (!Objects.isNull(System.getProperty("environment")) && System.getProperty("environment").equals("selenoid")) {
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.remote = webConfig.remoteDriverUrl();
        }

        Configuration.browserCapabilities = capabilities;
    }
}
