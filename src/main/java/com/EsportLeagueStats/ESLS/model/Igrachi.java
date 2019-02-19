package com.EsportLeagueStats.ESLS.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the igrachi database table.
 * 
 */
@Entity
public class Igrachi	 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iid;

	private String akronim;

	private String drzava;

	private String ime;

	private String pozicija;

	//bi-directional many-to-many association to Tim
	@ManyToMany(mappedBy="igrachis")
	@JsonIgnore
	private List<Tim> tims;

	//bi-directional many-to-one association to Menuvaattim
	@OneToMany(mappedBy="igrachi")
	@JsonIgnore
	private List<Menuvaattim> menuvaattims;

	public Igrachi() {
	}

	public Igrachi(String akronim, String drzava, String ime, String pozicija) {
		this.akronim=akronim;
		this.drzava=drzava;
		this.ime=ime;
		this.pozicija=pozicija;
	}

	public Integer getIid() {
		return this.iid;
	}

	public void setIid(Integer iid) {
		this.iid = iid;
	}

	public String getAkronim() {
		return this.akronim;
	}

	public void setAkronim(String akronim) {
		this.akronim = akronim;
	}

	public String getDrzava() {
		return this.drzava;
	}

	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}

	public String getIme() {
		return this.ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPozicija() {
		return this.pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public List<Tim> getTims() {
		return this.tims;
	}

	public void setTims(List<Tim> tims) {
		this.tims = tims;
	}

	public List<Menuvaattim> getMenuvaattims() {
		return this.menuvaattims;
	}

	public void setMenuvaattims(List<Menuvaattim> menuvaattims) {
		this.menuvaattims = menuvaattims;
	}

	public Menuvaattim addMenuvaattim(Menuvaattim menuvaattim) {
		getMenuvaattims().add(menuvaattim);
		menuvaattim.setIgrachi(this);

		return menuvaattim;
	}

	public Menuvaattim removeMenuvaattim(Menuvaattim menuvaattim) {
		getMenuvaattims().remove(menuvaattim);
		menuvaattim.setIgrachi(null);

		return menuvaattim;
	}

}