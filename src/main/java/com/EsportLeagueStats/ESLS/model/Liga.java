package com.EsportLeagueStats.ESLS.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the liga database table.
 * 
 */
@Entity
public class Liga implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer lid;

	@Column(name="l_kontinent")
	private String lKontinent;

	private String lime;

	@Column(name="mesto_na_odrzuvanje")
	private String mestoNaOdrzuvanje;

	//bi-directional many-to-one association to Sezona
	@OneToMany(mappedBy="liga1")
	@JsonIgnore
	private List<Sezona> sezonas1;

	//bi-directional many-to-one association to Sezona
	@OneToMany(mappedBy="liga2")
	@JsonIgnore
	private List<Sezona> sezonas2;

	//bi-directional many-to-one association to Tim
	@OneToMany(mappedBy="liga")
	@JsonIgnore
	private List<Tim> tims;

	public Liga() {}

    public Liga(String lKontinent, String lIme, String mestoNaOdrzuvanje) {
		this.lKontinent=lKontinent;
		this.lime=lIme;
		this.mestoNaOdrzuvanje=mestoNaOdrzuvanje;
    }

    public Integer getLid() {
		return this.lid;
	}

	public void setLid(Integer lid) {
		this.lid = lid;
	}

	public String getLKontinent() {
		return this.lKontinent;
	}

	public void setLKontinent(String lKontinent) {
		this.lKontinent = lKontinent;
	}

	public String getLime() {
		return this.lime;
	}

	public void setLime(String lime) {
		this.lime = lime;
	}

	public String getMestoNaOdrzuvanje() {
		return this.mestoNaOdrzuvanje;
	}

	public void setMestoNaOdrzuvanje(String mestoNaOdrzuvanje) {
		this.mestoNaOdrzuvanje = mestoNaOdrzuvanje;
	}

	public List<Sezona> getSezonas1() {
		return this.sezonas1;
	}

	public void setSezonas1(List<Sezona> sezonas1) {
		this.sezonas1 = sezonas1;
	}

	public Sezona addSezonas1(Sezona sezonas1) {
		getSezonas1().add(sezonas1);
		sezonas1.setLiga1(this);

		return sezonas1;
	}

	public Sezona removeSezonas1(Sezona sezonas1) {
		getSezonas1().remove(sezonas1);
		sezonas1.setLiga1(null);

		return sezonas1;
	}

	public List<Sezona> getSezonas2() {
		return this.sezonas2;
	}

	public void setSezonas2(List<Sezona> sezonas2) {
		this.sezonas2 = sezonas2;
	}

	public Sezona addSezonas2(Sezona sezonas2) {
		getSezonas2().add(sezonas2);
		sezonas2.setLiga2(this);

		return sezonas2;
	}

	public Sezona removeSezonas2(Sezona sezonas2) {
		getSezonas2().remove(sezonas2);
		sezonas2.setLiga2(null);

		return sezonas2;
	}

	public List<Tim> getTims() {
		return this.tims;
	}

	public void setTims(List<Tim> tims) {
		this.tims = tims;
	}

	public Tim addTim(Tim tim) {
		getTims().add(tim);
		tim.setLiga(this);

		return tim;
	}

	public Tim removeTim(Tim tim) {
		getTims().remove(tim);
		tim.setLiga(null);

		return tim;
	}

}