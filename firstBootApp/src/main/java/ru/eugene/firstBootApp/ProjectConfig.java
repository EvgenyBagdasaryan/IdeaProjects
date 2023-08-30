package ru.eugene.firstBootApp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot iAmParrot(){
        return new Parrot(87);
    }

    /*@Bean
    public Parrot iAmParrotSecond(){
        return new Parrot(98);
    }*/

    @Bean
    @ConfigurationProperties(prefix="straus")
    public StrausInfo getStraus(){
        return new StrausInfo();
    }
}