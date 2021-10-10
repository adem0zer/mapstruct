package com.adem.dto;

public class GnlStLangauge implements ILanguage{
    public int id;
    public String name;

    GnlStLangauge(){

    }
    @Override
    public void language() {
        System.out.println("Bu GnlSt Language'dir : " + id + " isim : " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
