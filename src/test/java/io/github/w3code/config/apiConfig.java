package io.github.w3code.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:/tmp/api.properties",
        "classpath:config/api.properties"
})

public interface apiConfig extends Config{

    @Key("apiUri")
    String apiUri();

    @Key("token")
    String token();

}
