package com.EsportLeagueStats.ESLS.model.dto;

public class LigaSezonaSimple {

    private int year;
    private String ligaIme;

    public LigaSezonaSimple(int year, String ligaIme) {
        this.year = year;
        this.ligaIme = ligaIme;
    }

    public int getYear() {
        return year;
    }

    public String getLigaIme() {
        return ligaIme;
    }
}
