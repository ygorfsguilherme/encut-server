package com.guilherme.encut.service;

import com.guilherme.encut.dto.UrlEncutDto;
import com.guilherme.encut.model.UrlEncut;
import com.guilherme.encut.repository.UrlEncutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UrlService {
    @Autowired
    UrlEncutRepository urlEncutRepository;

    public UrlEncut save(UrlEncutDto urlEncutDto){
        Optional<UrlEncut> PathUrlIsExist = this.urlEncutRepository.findByUrlPath(urlEncutDto.getUrlPath());

        if (PathUrlIsExist.isEmpty()){
            UrlEncut urlEncut = new UrlEncut(urlEncutDto);
            this.urlEncutRepository.save(urlEncut);
            return urlEncut;
        }

        throw new RuntimeException("Path is exist");
    }
    public Optional<UrlEncut> findByUrlPath(String path){
        return this.urlEncutRepository.findByUrlPath(path);
    }

}
