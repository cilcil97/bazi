package com.EsportLeagueStats.ESLS.model;

import javax.persistence.*;

@Entity
@Table(schema = "project", name = "liga_sezona")
public class LigaSezona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "liga_id")
    private Liga liga;

    @ManyToOne
    @JoinColumn(name = "year")
    private Sezona sezona;

    public LigaSezona() {
    }

    public LigaSezona(Liga liga, Sezona sezona) {
        this.liga = liga;
        this.sezona = sezona;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public Sezona getSezona() {
        return sezona;
    }

    public void setSezona(Sezona sezona) {
        this.sezona = sezona;
    }

    @Override
    public String toString() {
        return "LigaSezona{" +
                "id=" + id +
                ", liga=" + liga +
                ", sezona=" + sezona +
                '}';
    }
}
