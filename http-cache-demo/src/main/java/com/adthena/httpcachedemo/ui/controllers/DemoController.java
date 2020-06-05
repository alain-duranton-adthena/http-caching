package com.adthena.httpcachedemo.ui.controllers;

import static com.adthena.httpcachedemo.ui.vo.MessageVO.builder;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.springframework.http.CacheControl.maxAge;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.ResponseEntity.ok;

import com.adthena.httpcachedemo.ui.vo.MessageVO;
import java.util.UUID;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @CrossOrigin(origins = {"*"})
    @GetMapping(value = "/message", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<MessageVO> getNewMessage() {
        return ok()
            .cacheControl(maxAge(60, SECONDS))
            .body(builder().message(UUID.randomUUID().toString()).build());
    }
}
