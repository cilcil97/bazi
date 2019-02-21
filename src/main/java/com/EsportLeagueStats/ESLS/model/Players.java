package com.EsportLeagueStats.ESLS.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(schema = "project", name = "igrachi")
public class Players {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String akronim;

    private String drzava;

    private String ime;

    private String pozicija;

    @OneToMany(mappedBy = "igrach")
    @JsonIgnore
    private List<StatistikaNaIgrach> statistikaNaIgrachi;

    @OneToMany(mappedBy = "igrach")
    @JsonIgnore
    private List<Formiraat> formiraat;

    @OneToMany(mappedBy = "igrach")
    @JsonIgnore
    private List<MenuvaatTim> menuvaatTims;

    public Players() {
    }

    public Players(String akronim, String drzava, String ime, String pozicija) {
        this.akronim = akronim;
        this.drzava = drzava;
        this.ime = ime;
        this.pozicija = pozicija;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAkronim() {
        return akronim;
    }

    public void setAkronim(String akronim) {
        this.akronim = akronim;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public List<StatistikaNaIgrach> getStatistikaNaIgrachi() {
        return statistikaNaIgrachi;
    }

    public List<Formiraat> getFormiraat() {
        return formiraat;
    }

    public List<MenuvaatTim> getMenuvaatTims() {
        return menuvaatTims;
    }



}