package ru.eugene.firstBootApp;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix= "birds")
class BirdInfo {
    private String birdName;

    public void setBirdName(String birdName) {
        this.birdName = birdName;
    }

    public String getBirdName() {
        return birdName;
    }
}
