package com.EsportLeagueStats.ESLS.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Entity
@Table(schema = "project", name = "sezona")
public class Sezona {
    @Id
    @Column(name = "year")
    private Integer year;

    @Column(name = "kraen_datum")
    private LocalDate kraenDatum;

    @Column(name = "poceten_datum")
    private LocalDate pocetenDatum;

    @OneToMany(mappedBy = "sezona")
    @JsonIgnore
    private List<StatistikaNaIgrach> statistikaNaIgrachi;

    @OneToMany(mappedBy = "sezona")
    @JsonIgnore
    private List<StatistikaNaTim> statistikaNaTimovi;

    @OneToMany(mappedBy = "sezona")
    @JsonIgnore
    private List<LigaSezona> ligaSoSezoni;

    @OneToMany(mappedBy = "sezona")
    @JsonIgnore
    private List<Formiraat> formiraat;

    public Sezona() {
    }

    public Sezona(int year, LocalDate kraenDatum, LocalDate pocetenDatum) {
        this.year = year;
        this.kraenDatum = kraenDatum;
        this.pocetenDatum = pocetenDatum;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public LocalDate getKraenDatum() {
        return kraenDatum;
    }

    public void setKraenDatum(LocalDate kraenDatum) {
        this.kraenDatum = kraenDatum;
    }

    public LocalDate getPocetenDatum() {
        return pocetenDatum;
    }

    public void setPocetenDatum(LocalDate pocetenDatum) {
        this.pocetenDatum = pocetenDatum;
    }

    public List<LigaSezona> getLigaSoSezoni() {
        return ligaSoSezoni;
    }

    public List<StatistikaNaIgrach> getStatistikaNaIgrachi() {
        return statistikaNaIgrachi;
    }

    public List<StatistikaNaTim> getStatistikaNaTimovi() {
        return statistikaNaTimovi;
    }

}