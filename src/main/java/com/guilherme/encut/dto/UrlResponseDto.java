package com.guilherme.encut.dto;

public record UrlResponseDto(
        String newUrl
) {
    public UrlResponseDto(String baseUrl, String urlPath) {
        this(
                baseUrl + "/" + urlPath
        );
    }
}
