package com.adem.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.stereotype.Component;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "tp")
@JsonSubTypes({@JsonSubTypes.Type(value = GnlStLangauge.class, name = "A"),
        @JsonSubTypes.Type(value = GnlTpLanguage.class, name = "B")})
public interface ILanguage {
    void language();
}
