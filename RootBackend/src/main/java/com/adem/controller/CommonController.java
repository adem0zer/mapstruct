package com.adem.controller;

import com.adem.dto.GnlTpLanguage;
import com.adem.dto.ILanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @PostMapping(value = "/deneme")
    public void deneme(@RequestBody ILanguage language) {
        language.language();
    }
}
