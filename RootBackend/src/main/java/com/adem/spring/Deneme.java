package com.adem.spring;

import com.adem.common.base.type.GeneralEnumerationDefinition;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Deneme {
    @GetMapping(value = "/deneme")
    public String deneme(){
        return "Adem ÖZER 12";
    }
}
