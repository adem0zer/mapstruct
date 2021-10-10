package com.adem.dto;


public class GnlTpLanguage implements ILanguage{
    public Long id;
    public String name;
    GnlTpLanguage(){

    }
    @Override
    public void language() {
        System.out.println("Bu GnlTpLanguage'dir : " + id + " isim : " + name);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
