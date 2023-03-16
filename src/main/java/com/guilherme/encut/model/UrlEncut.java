package com.guilherme.encut.model;

import com.guilherme.encut.dto.UrlEncutDto;
import com.guilherme.encut.utils.RandomGeneratedPathUrl;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import org.jetbrains.annotations.NotNull;

@Entity(name = "url_encut")
public class UrlEncut {
    @Id
    private String urlPath;
    private String urlOrigin;

    public UrlEncut() {
    }

    public UrlEncut(UrlEncutDto urlEncutDto) {
        UrlPathIsEmpty(urlEncutDto.getUrlPath());
        UrlHTTPIsExist(urlEncutDto.getUrlOrigin());
    }

    public String getUrlPath() {
        return urlPath;
    }

    public String getUrlOrigin() {
        return urlOrigin;
    }

    private void UrlPathIsEmpty(@NotNull String pathIsEmpty){
        if(pathIsEmpty.isEmpty()){
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
