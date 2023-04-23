package com.guilherme.encut.repository;

import com.guilherme.encut.model.UrlEncut;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UrlEncutRepository extends JpaRepository<UrlEncut, Long> {

    @Query(value = "SELECT * FROM URL_ENCUT WHERE url_path = :path", nativeQuery = true)
    Optional<UrlEncut> findByUrlPath(@Param("path") String path);
}
