package com.adem.common.entity;

import lombok.Data;

import java.util.List;

@Data
public class GnlTpEntity {
    private Long gnlTpId;
    private Long gnlTpCodeId;
    //private String name;
    //private String descr;
    private String rsrcKey;
    private String shrtCode;
    private String entCodeName;
    private String entName;
    private Integer isActv;
    private String discriminator;
    private List<GnlTpLangEntity> multiLanguageData;
    private Long sortId;
    private String extShrtCode;

}
