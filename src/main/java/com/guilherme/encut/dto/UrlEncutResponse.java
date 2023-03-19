package com.guilherme.encut.dto;

public class UrlEncutResponse {
    private String newUrl;

    public UrlEncutResponse(String baseUrl, String urlPath) {
        this.newUrl = baseUrl + "/" + urlPath;
    }
    
    public String getNewUrl() {
        return newUrl;
    }
}
