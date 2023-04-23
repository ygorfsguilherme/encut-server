package com.guilherme.encut.service;

import com.guilherme.encut.dto.UrlDto;
import com.guilherme.encut.model.UrlEncut;
import com.guilherme.encut.repository.UrlEncutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UrlService {
    @Autowired
    UrlEncutRepository urlEncutRepository;

    public UrlEncut save(UrlDto urlDto){
        Optional<UrlEncut> PathUrlIsExist = this.urlEncutRepository.findByUrlPath(urlDto.urlPath());

        if (PathUrlIsExist.isEmpty() || PathUrlIsExist.get().getUrlPath() == null){
            UrlEncut urlEncut = new UrlEncut(urlDto);
            this.urlEncutRepository.save(urlEncut);
            return urlEncut;
        }

        throw new RuntimeException("Path is exist");
    }
    public Optional<UrlEncut> findByUrlPath(String path){
        return this.urlEncutRepository.findByUrlPath(path);
    }

}
