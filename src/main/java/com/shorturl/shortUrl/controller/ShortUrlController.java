package com.shorturl.shortUrl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShortUrlController {

    @PostMapping("/shorten")
    public void createShortUrl(@RequestBody String url){
        
    }
    @GetMapping("/{shortUrl}")
    public void getShortUrl(@RequestBody String shortUrl){

    }
}
