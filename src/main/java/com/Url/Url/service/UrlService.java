package com.Url.Url.service;

import com.Url.Url.model.Url;
import com.Url.Url.model.UrlDto;
import org.springframework.stereotype.Service;

@Service
public interface UrlService {

    public Url generateShortLink(UrlDto urlDto);
    public Url persistShortLink(Url url);
    public Url getEncoderUrl(String url);
    public void deleteShortLink(Url url);

}
