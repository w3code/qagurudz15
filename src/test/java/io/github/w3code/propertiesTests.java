package io.github.w3code;

import io.github.w3code.config.apiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class propertiesTests {

    @Test
    void apiTests() {
        apiConfig config = ConfigFactory.create(apiConfig.class, System.getProperties());
        assertThat(config.apiUri()).isEqualTo("https://reqres.in/");
        assertThat(config.token()).isEqualTo("QpwL5tke4Pnpja7X4");
    }
}
