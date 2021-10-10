package com.adem.common.entity;

import lombok.Data;

@Data
public class GnlTpLangEntity {
    private Long gnlTpLangId;
    private String name;
    private String descr;
    private GnlTpEntity parent;
}
