package com.EsportLeagueStats.ESLS.model;

import javax.persistence.*;

@Entity
@Table(schema = "project", name = "utakmica")
public class Utakmica {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "finale")
    private boolean finale;

    @ManyToOne
    @JoinColumn(name = "pobednik")
    private Tim pobednik;

    @ManyToOne
    @JoinColumn(name = "gubitnik")
    private Tim gubitnik;

    @ManyToOne
    @JoinColumn(name = "liga_sezona")
    private LigaSezona sezona;

    public Utakmica() {
    }

    public Utakmica(Tim pobednik, Tim gubitnik, LigaSezona sezona, boolean finale) {
        this.pobednik = pobednik;
        this.gubitnik = gubitnik;
        this.sezona = sezona;
        this.finale = finale;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isFinale() {
        return finale;
    }

    public void setFinale(boolean finale) {
        this.finale = finale;
    }

    public Tim getPobednik() {
        return pobednik;
    }

    public void setPobednik(Tim pobednik) {
        this.pobednik = pobednik;
    }

    public Tim getGubitnik() {
        return gubitnik;
    }

    public void setGubitnik(Tim gubitnik) {
        this.gubitnik = gubitnik;
    }

    public LigaSezona getSezona() {
        return sezona;
    }

    public void setSezona(LigaSezona sezona) {
        this.sezona = sezona;
    }
}