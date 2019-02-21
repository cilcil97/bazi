package com.EsportLeagueStats.ESLS.model.dto;

import java.util.List;

public class SezonaSoLigi {

    private int year;
    private List<String> ligi;

    public SezonaSoLigi(int year, List<String> ligi) {
        this.year = year;
        this.ligi = ligi;
    }

    public int getYear() {
        return year;
    }

    public List<String> getLigi() {
        return ligi;
    }
}
