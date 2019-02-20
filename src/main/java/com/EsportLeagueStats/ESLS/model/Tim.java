package com.EsportLeagueStats.ESLS.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "project", name = "tim")
public class Tim {
	@Id
    @Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name="ime")
	private String ime;

	@Column(name = "logo")
	private String logo;

	@OneToMany(mappedBy="tim")
	@JsonIgnore
	private List<MenuvaatTim> menuvaatTims;

    @JsonIgnore
	@OneToMany(mappedBy="tim")
	private List<StatistikaNaTim> statistikaNaTim;

	@ManyToOne
	@JoinColumn(name="liga_id")
	private Liga liga;

	@JsonIgnore
	@OneToMany(mappedBy = "tim")
	private List<Formiraat> formiraat;

	@OneToMany(mappedBy = "gubitnik")
	private List<Utakmica> izgubeniUtakmici;

    @OneToMany(mappedBy = "pobednik")
    private List<Utakmica> pobedeniUtakmici;

	public Tim() {
	}

    public Tim(String ime, String logo, Liga liga) {
		this.ime = ime;
		this.logo = logo;
		this.liga=liga;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public List<MenuvaatTim> getMenuvaatTims() {
        return menuvaatTims;
    }

    public void setMenuvaatTims(List<MenuvaatTim> menuvaatTims) {
        this.menuvaatTims = menuvaatTims;
    }

    public List<StatistikaNaTim> getStatistikaNaTim() {
        return statistikaNaTim;
    }

    public void setStatistikaNaTim(List<StatistikaNaTim> statistikaNaTim) {
        this.statistikaNaTim = statistikaNaTim;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public List<Formiraat> getFormiraat() {
        return formiraat;
    }

    public void setFormiraat(List<Formiraat> formiraat) {
        this.formiraat = formiraat;
    }

    public List<Utakmica> getIzgubeniUtakmici() {
        return izgubeniUtakmici;
    }

    public void setIzgubeniUtakmici(List<Utakmica> izgubeniUtakmici) {
        this.izgubeniUtakmici = izgubeniUtakmici;
    }

    public List<Utakmica> getPobedeniUtakmici() {
        return pobedeniUtakmici;
    }

    public void setPobedeniUtakmici(List<Utakmica> pobedeniUtakmici) {
        this.pobedeniUtakmici = pobedeniUtakmici;
    }
}