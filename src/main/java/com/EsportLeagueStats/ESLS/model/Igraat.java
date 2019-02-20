package com.EsportLeagueStats.ESLS.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the igraat database table.
 * 
 */
@Entity
public class Igraat implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private IgraatPK id;

	//bi-directional many-to-one association to Tim
	@ManyToOne

	@JoinColumn(name="tid1",updatable = false,insertable = false)
	private Tim tim1;

	//bi-directional many-to-one association to Tim
	@ManyToOne

	@JoinColumn(name="tid2",updatable = false,insertable = false)
	private Tim tim2;

	//bi-directional many-to-one association to Utakmica
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="uid",updatable = false,insertable = false)
	private Utakmica utakmica;

	public Igraat() {
	}

	public IgraatPK getId() {
		return this.id;
	}

	public void setId(IgraatPK id) {
		this.id = id;
	}

	public Tim getTim1() {
		return this.tim1;
	}

	public void setTim1(Tim tim1) {
		this.tim1 = tim1;
	}

	public Tim getTim2() {
		return this.tim2;
	}

	public void setTim2(Tim tim2) {
		this.tim2 = tim2;
	}

	public Utakmica getUtakmica() {
		return this.utakmica;
	}

	public void setUtakmica(Utakmica utakmica) {
		this.utakmica = utakmica;
	}

}