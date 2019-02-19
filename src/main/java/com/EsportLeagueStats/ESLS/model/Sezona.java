package com.EsportLeagueStats.ESLS.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the sezona database table.
 * 
 */
@Entity
public class Sezona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer seid;

	@Column(name="kraen_datum")
	private String kraenDatum;

	@Column(name="poceten_datum")
	private String pocetenDatum;

	//bi-directional many-to-one association to Finale
	@OneToMany(mappedBy="sezona")
	@JsonIgnore
	private List<Finale> finales;

	//bi-directional many-to-one association to Liga
	@ManyToOne
	@JoinColumn(name="lid",insertable = false,updatable = false)
	private Liga liga1;

	//bi-directional many-to-one association to Liga
	@ManyToOne
	@JoinColumn(name="lid")
	private Liga liga2;

	//bi-directional many-to-one association to Utakmica
	@OneToMany(mappedBy="sezona")
	@JsonIgnore
	private List<Utakmica> utakmicas;

	public Sezona() {
	}

	public Sezona(String kraenDatum, String pocetenDatum) {
		this.kraenDatum=kraenDatum;
		this.pocetenDatum=pocetenDatum;
	}

	public Integer getSeid() {
		return this.seid;
	}

	public void setSeid(Integer seid) {
		this.seid = seid;
	}

	public String getKraenDatum() {
		return this.kraenDatum;
	}

	public void setKraenDatum(String kraenDatum) {
		this.kraenDatum = kraenDatum;
	}

	public String getPocetenDatum() {
		return this.pocetenDatum;
	}

	public void setPocetenDatum(String pocetenDatum) {
		this.pocetenDatum = pocetenDatum;
	}

	public List<Finale> getFinales() {
		return this.finales;
	}

	public void setFinales(List<Finale> finales) {
		this.finales = finales;
	}

	public Finale addFinale(Finale finale) {
		getFinales().add(finale);
		finale.setSezona(this);

		return finale;
	}

	public Finale removeFinale(Finale finale) {
		getFinales().remove(finale);
		finale.setSezona(null);

		return finale;
	}

	public Liga getLiga1() {
		return this.liga1;
	}

	public void setLiga1(Liga liga1) {
		this.liga1 = liga1;
	}

	public Liga getLiga2() {
		return this.liga2;
	}

	public void setLiga2(Liga liga2) {
		this.liga2 = liga2;
	}

	public List<Utakmica> getUtakmicas() {
		return this.utakmicas;
	}

	public void setUtakmicas(List<Utakmica> utakmicas) {
		this.utakmicas = utakmicas;
	}

	public Utakmica addUtakmica(Utakmica utakmica) {
		getUtakmicas().add(utakmica);
		utakmica.setSezona(this);

		return utakmica;
	}

	public Utakmica removeUtakmica(Utakmica utakmica) {
		getUtakmicas().remove(utakmica);
		utakmica.setSezona(null);

		return utakmica;
	}

}