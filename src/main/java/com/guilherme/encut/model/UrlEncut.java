package com.guilherme.encut.model;

import com.guilherme.encut.dto.UrlDto;
import com.guilherme.encut.utils.RandomGeneratedPathUrl;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.jetbrains.annotations.NotNull;

@Entity(name = "url_encut")
public class UrlEncut {
    @Id
    private String urlPath;

    private String urlOrigin;

    public UrlEncut() {

    }

    public UrlEncut(UrlDto urlDto) {
        UrlPathIsEmpty(urlDto.urlPath());
        UrlHTTPIsExist(urlDto.urlOrigin());
    }

    public String getUrlPath() {
        return urlPath;
    }

    public String getUrlOrigin() {
        return urlOrigin;
    }

    private void UrlPathIsEmpty(String pathIsEmpty){
        if(pathIsEmpty == null || pathIsEmpty.isEmpty()){
            RandomGeneratedPathUrl randomGeneratedPathUrl = new RandomGeneratedPathUrl(5);
            this.urlPath = randomGeneratedPathUrl.GeneratedString();
        } else {
            this.urlPath = pathIsEmpty;
        }
    }

    private void UrlHTTPIsExist(String urlOriginIsHttp){
        if(!urlOriginIsHttp.contains("http")){
            this.urlOrigin = "http://" + urlOriginIsHttp;
        } else {
            this.urlOrigin = urlOriginIsHttp;
        }
    }

}
