package com.shorturl.shortUrl.repository;

import com.shorturl.shortUrl.model.ShortenURL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UrlRepository extends JpaRepository<ShortenURL, Long> {
   Optional<ShortenURL> findBySourceUrl(String url);
}
