package com.guilherme.encut.dto;
import jakarta.validation.constraints.NotBlank;

public record UrlDto(

        String urlPath,

        @NotBlank(message = "Url origin is required")
        String urlOrigin
) {

}

