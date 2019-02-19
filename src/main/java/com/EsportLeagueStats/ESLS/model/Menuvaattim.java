package com.EsportLeagueStats.ESLS.model;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the menuvaattim database table.
 * 
 */
@Entity
public class Menuvaattim implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MenuvaattimPK id;

	private Integer cena;

	@Column(name="datum_na_smena")
	private String datumNaSmena;

	//bi-directional many-to-one association to Igrachi
	@ManyToOne
	@JoinColumn(name="iid",insertable = false,updatable = false)
	private Igrachi igrachi;

	//bi-directional many-to-one association to Tim
	@ManyToOne
	@JoinColumn(name="tid",insertable = false,updatable = false)
	private Tim tim;

	public Menuvaattim() {
	}

	public MenuvaattimPK getId() {
		return this.id;
	}

	public void setId(MenuvaattimPK id) {
		this.id = id;
	}

	public Integer getCena() {
		return this.cena;
	}

	public void setCena(Integer cena) {
		this.cena = cena;
	}

	public String getDatumNaSmena() {
		return this.datumNaSmena;
	}

	public void setDatumNaSmena(String datumNaSmena) {
		this.datumNaSmena = datumNaSmena;
	}

	public Igrachi getIgrachi() {
		return this.igrachi;
	}

	public void setIgrachi(Igrachi igrachi) {
		this.igrachi = igrachi;
	}

	public Tim getTim() {
		return this.tim;
	}

	public void setTim(Tim tim) {
		this.tim = tim;
	}

}