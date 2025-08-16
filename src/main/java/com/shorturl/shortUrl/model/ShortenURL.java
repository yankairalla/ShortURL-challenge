package com.shorturl.shortUrl.model;

import jakarta.persistence.*;

@Entity
public class ShortenURL {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "source_url")
    private String sourceUrl;
    @Column(name = "code_url")
    private String codeUrl;

    public ShortenURL(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public ShortenURL() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getCodeUrl() {
        return codeUrl;
    }

    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }
}
