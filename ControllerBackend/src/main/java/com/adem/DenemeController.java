package com.adem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DenemeController {
    @GetMapping(value = "/deneme")
    public String deneme(){
        return "Adem OZER";
    }
}
