package com.shorturl.shortUrl.controller;

import com.shorturl.shortUrl.model.ShortenURL;
import com.shorturl.shortUrl.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShortUrlController {

    @Autowired
    private UrlService urlService;


    @PostMapping("/shorten")
    public ResponseEntity<ShortenURL> createShortUrl(@RequestBody String url){
        ShortenURL shortenURL = urlService.createShortUrl(url);
        return ResponseEntity.ok(shortenURL);
    }
    @GetMapping("/{shortUrl}")
    public void getShortUrl(@RequestBody String shortUrl){

    }
}
