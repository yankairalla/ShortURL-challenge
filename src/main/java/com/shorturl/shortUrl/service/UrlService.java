package com.shorturl.shortUrl.service;

import com.shorturl.shortUrl.model.ShortenURL;
import com.shorturl.shortUrl.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.Optional;

@Service
public class UrlService {

    @Autowired
    private UrlRepository urlRepository;

    public static boolean isValidURL(String url) {
        try {
            URI uri = URI.create(url);
            return uri.getScheme() != null && uri.getHost() != null;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public String getShortUrl(String url){

        if(isValidURL(url)){
            Optional<ShortenURL> sourceUrl = urlRepository.findBySourceUrl(url);

            if(sourceUrl.isPresent()) {
                return "http://localhost:8080/" + sourceUrl.get().getCodeUrl();
            } else {
              ShortenURL urlCreated = createShortUrl(url);

              return "oi";
            }
        }else {
            return "Invalid URL";
        }
    }

    public ShortenURL createShortUrl(String url){
        ShortenURL shortenURL = new ShortenURL(url);
        return urlRepository.save(shortenURL);
    }
}
