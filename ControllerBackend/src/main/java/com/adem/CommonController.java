package com.adem;

import com.adem.dto.ILanguage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @PostMapping(value = "/deneme")
    public void deneme(ILanguage language) {
        language.language();
    }
}
