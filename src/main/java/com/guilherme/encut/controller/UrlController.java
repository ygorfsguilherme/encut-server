package com.guilherme.encut.controller;

import com.guilherme.encut.dto.UrlEncutDto;
import com.guilherme.encut.model.UrlEncut;
import com.guilherme.encut.service.UrlService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;
import java.util.Optional;

@RestController("/")
public class UrlController {

    @Autowired
    UrlService urlService;

    @PostMapping("/register")
    public ResponseEntity<String> RegisterUrl(
            @RequestBody UrlEncutDto urlEncutDto
    ){
        try {
            UrlEncut url = urlService.save(urlEncutDto);
            String baseUrl = ServletUriComponentsBuilder.fromCurrentContextPath().build().toUriString();
            return ResponseEntity.ok().body(baseUrl + "/" + url.getUrlPath());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
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
}
