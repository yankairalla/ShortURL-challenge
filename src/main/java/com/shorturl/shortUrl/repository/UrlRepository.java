package com.shorturl.shortUrl.repository;

import com.shorturl.shortUrl.model.ShortenURL;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlRepository extends JpaRepository<ShortenURL, Long> {
}
