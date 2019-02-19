package com.EsportLeagueStats.ESLS.model;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the finale database table.
 * 
 */
@Entity
public class Finale implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FinalePK id;

	@Column(name="f_mesto_na_odrzuvanje")
	private String fMestoNaOdrzuvanje;

	//bi-directional many-to-one association to Sezona
	@ManyToOne
	@JoinColumn(name="seid")
	private Sezona sezona;

	//bi-directional many-to-one association to Tim
	@ManyToOne
	@JoinColumn(name="tid")
	private Tim tim;

	//bi-directional many-to-one association to Utakmica
	@ManyToOne
	@JoinColumn(name="uid",insertable = false,updatable=false)
	private Utakmica utakmica;

	public Finale() {
	}

	public FinalePK getId() {
		return this.id;
	}

	public void setId(FinalePK id) {
		this.id = id;
	}

	public String getFMestoNaOdrzuvanje() {
		return this.fMestoNaOdrzuvanje;
	}

	public void setFMestoNaOdrzuvanje(String fMestoNaOdrzuvanje) {
		this.fMestoNaOdrzuvanje = fMestoNaOdrzuvanje;
	}

	public Sezona getSezona() {
		return this.sezona;
	}

	public void setSezona(Sezona sezona) {
		this.sezona = sezona;
	}

	public Tim getTim() {
		return this.tim;
	}

	public void setTim(Tim tim) {
		this.tim = tim;
	}

	public Utakmica getUtakmica() {
		return this.utakmica;
	}

	public void setUtakmica(Utakmica utakmica) {
		this.utakmica = utakmica;
	}

}