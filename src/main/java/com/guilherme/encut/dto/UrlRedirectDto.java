package com.guilherme.encut.dto;

import com.guilherme.encut.model.UrlEncut;

public record UrlRedirectDto(
       String urlOrigin
) {
         public UrlRedirectDto(UrlEncut urlEncut) {
             this(
                     urlEncut.getUrlOrigin()
             );
         }
}

