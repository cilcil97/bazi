package com.EsportLeagueStats.ESLS.web.requests;public class AddTimRequest {    private String ime;    private String logo;    private String liga;    public AddTimRequest(){}    public AddTimRequest(String ime, String logo, String liga) {        this.ime = ime;        this.logo = logo;        this.liga = liga;    }    public String getIme() {        return ime;    }    public String getLogo() {        return logo;    }    public String getLiga() {        return liga;    }}