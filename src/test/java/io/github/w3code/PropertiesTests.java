package io.github.w3code;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

public class PropertiesTests extends TestBase {

    @Test
    @Disabled
    void apiTests() {
        assertThat(apiConfig.apiUri()).isEqualTo("https://reqres.in/");
        assertThat(apiConfig.token()).isEqualTo("QpwL5tke4Pnpja7X4");
    }

    @Test
    void webTests() {
        open("http://www.github.com");
        $("h1").shouldHave(text("Where the world builds software"));
    }
}
