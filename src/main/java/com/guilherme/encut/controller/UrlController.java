package com.guilherme.encut.controller;

import com.guilherme.encut.dto.UrlEncutDto;
import com.guilherme.encut.dto.UrlEncutResponse;
import com.guilherme.encut.model.UrlEncut;
import com.guilherme.encut.service.UrlService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;

@RestController("/")
public class UrlController {

    @Autowired
    UrlService urlService;

    @PostMapping("/register")
    public ResponseEntity<?> RegisterUrl(
            @RequestBody UrlEncutDto urlEncutDto
    ){
        try {
            UrlEncut url = urlService.save(urlEncutDto);
            return ResponseEntity.ok().body(getNewUrlPath(url.getUrlPath()));
        } catch (Exception e) {
            return ResponseEntity.status(409).body(e.getMessage());
        }
    }

    @GetMapping("/{path}")
    public void Redirect(
            @PathVariable String path,
            HttpServletResponse httpServletResponse
    ) throws IOException {
        UrlEncut urlEncut = urlService.findByUrlPath(path).get();
        httpServletResponse.sendRedirect(urlEncut.getUrlOrigin());
    }

    private UrlEncutResponse getNewUrlPath(String urlPath){
        String baseUrl = ServletUriComponentsBuilder.fromCurrentContextPath().build().toUriString();
        UrlEncutResponse newUrl = new UrlEncutResponse(baseUrl, urlPath);
        return newUrl;
    }
}
