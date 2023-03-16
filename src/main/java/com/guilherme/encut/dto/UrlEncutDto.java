package com.guilherme.encut.dto;

public class UrlEncutDto {
    private final String urlPath;
    private final String urlOrigin;

    public UrlEncutDto(String urlPath, String urlOrigin) {
        this.urlPath = urlPath;
        this.urlOrigin = urlOrigin;
    }

    public String getUrlPath() {
        return urlPath;
    }

    public String getUrlOrigin() {
        return urlOrigin;
    }
}
