package org.wproject.encrypt.starter.prop;


import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "spring.encrypt")
public class EncryptProperties {

    private final static String DEFAULT_KEY = "joe2022";
    private String key = DEFAULT_KEY;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
