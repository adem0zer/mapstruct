package com.adem.common.entity;

import lombok.Data;


public class AddrTpEntity {
    private Long addrTpId;
    private String name;
    private String descr;
    private Integer isActv;
    private String shrtCode;
    private String rsrcKey;

    public Long getAddrTpId() {
        return addrTpId;
    }

    public void setAddrTpId(Long addrTpId) {
        this.addrTpId = addrTpId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Integer getIsActv() {
        return isActv;
    }

    public void setIsActv(Integer isActv) {
        this.isActv = isActv;
    }

    public String getShrtCode() {
        return shrtCode;
    }

    public void setShrtCode(String shrtCode) {
        this.shrtCode = shrtCode;
    }

    public String getRsrcKey() {
        return rsrcKey;
    }

    public void setRsrcKey(String rsrcKey) {
        this.rsrcKey = rsrcKey;
    }
}
