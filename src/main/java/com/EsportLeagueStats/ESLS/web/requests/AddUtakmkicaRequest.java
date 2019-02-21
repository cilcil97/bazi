package com.EsportLeagueStats.ESLS.web.requests;

public class AddUtakmkicaRequest {

    private int pobednik;
    private int gubitnik;
    private int year;
    private String liga;
    private boolean finale;

    public AddUtakmkicaRequest() {
    }

    public AddUtakmkicaRequest(int pobednik, int gubitnik, int year, boolean finale, String liga) {
        this.pobednik = pobednik;
        this.gubitnik = gubitnik;
        this.year = year;
        this.finale = finale;
        this.liga = liga;
    }

    public int getPobednik() {
        return pobednik;
    }

    public void setPobednik(int pobednik) {
        this.pobednik = pobednik;
    }

    public int getGubitnik() {
        return gubitnik;
    }

    public void setGubitnik(int gubitnik) {
        this.gubitnik = gubitnik;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public boolean isFinale() {
        return finale;
    }

    public void setFinale(boolean finale) {
        this.finale = finale;
    }
}
