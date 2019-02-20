package com.EsportLeagueStats.ESLS.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(schema = "project", name = "liga")
public class Liga {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name="kontinent")
	private String kontinent;

	@Column(name = "ime")
	private String ime;

	@Column(name="mesto_na_odrzuvanje")
	private String mestoNaOdrzuvanje;

	//bi-directional many-to-one association to Sezona
	@OneToMany(mappedBy="liga")
	@JsonIgnore
	private List<LigaSezona> sezonas;

	@JsonIgnore
	@OneToMany(mappedBy="liga")
	private List<Tim> tims;

	public Liga() {}

    public Liga(String lKontinent, String lIme, String mestoNaOdrzuvanje) {
		this.kontinent =lKontinent;
		this.ime =lIme;
		this.mestoNaOdrzuvanje=mestoNaOdrzuvanje;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKontinent() {
		return kontinent;
	}

	public void setKontinent(String kontinent) {
		this.kontinent = kontinent;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getMestoNaOdrzuvanje() {
		return mestoNaOdrzuvanje;
	}

	public void setMestoNaOdrzuvanje(String mestoNaOdrzuvanje) {
		this.mestoNaOdrzuvanje = mestoNaOdrzuvanje;
	}

	public List<LigaSezona> getSezonas() {
		return sezonas;
	}

	public void setSezonas(List<LigaSezona> sezonas) {
		this.sezonas = sezonas;
	}

	public List<Tim> getTims() {
		return tims;
	}

	public void setTims(List<Tim> tims) {
		this.tims = tims;
	}
}