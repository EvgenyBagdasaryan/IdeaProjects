package ru.eugene.firstBootApp;

import org.springframework.boot.context.properties.ConfigurationProperties;

class StrausInfo {
    private String strausName;

    public void setStrausName(String strausName) {
        this.strausName = strausName;
    }

    public String getStrausName() {
        return strausName;
    }
}
