package com.gehlot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.NotEmpty;

@Configuration
@ConfigurationProperties (prefix = "msg")
@PropertySource("classpath:app-config.properties")
@Validated
public class AppConfigPop {

    @NotEmpty
    private String hello;

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
