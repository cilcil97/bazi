package com.EsportLeagueStats.ESLS.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the tim database table.
 * 
 */
@Entity
public class Tim implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer tid;

	@Column(name="t_ime")
	private String tIme;

	private String tlogo;

	//bi-directional many-to-one association to Finale
	@OneToMany(mappedBy="tim")
	@JsonIgnore
	private List<Finale> finales;

	//bi-directional many-to-many association to Igrachi
	@ManyToMany
	@JoinTable(
		name="formiraat"
		, joinColumns={
			@JoinColumn(name="tid")
			}
		, inverseJoinColumns={
			@JoinColumn(name="iid")
			}
		)
	@JsonIgnore
	private List<Igrachi> igrachis;

	//bi-directional many-to-one association to Igraat
	@JsonIgnore
	@OneToMany(mappedBy="tim1")
	private List<Igraat> igraats1;

	//bi-directional many-to-one association to Igraat
	@OneToMany(mappedBy="tim2")
	@JsonIgnore
	private List<Igraat> igraats2;

	//bi-directional many-to-one association to Menuvaattim
	@OneToMany(mappedBy="tim")
	@JsonIgnore
	private List<Menuvaattim> menuvaattims;

	//bi-directional one-to-one association to StatistikaNaTim
	@OneToOne(mappedBy="tim")
	private StatistikaNaTim statistikaNaTim;

	//bi-directional many-to-one association to Liga
	@ManyToOne
	@JoinColumn(name="lid")
	private Liga liga;

	public Tim() {
	}

    public Tim(String tIme, String tlogo, Liga liga) {
		this.tIme=tIme;
		this.tlogo=tlogo;
		this.liga=liga;
    }

    public Integer getTid() {
		return this.tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getTIme() {
		return this.tIme;
	}

	public void setTIme(String tIme) {
		this.tIme = tIme;
	}

	public String getTlogo() {
		return this.tlogo;
	}

	public void setTlogo(String tlogo) {
		this.tlogo = tlogo;
	}

	public List<Finale> getFinales() {
		return this.finales;
	}

	public void setFinales(List<Finale> finales) {
		this.finales = finales;
	}

	public Finale addFinale(Finale finale) {
		getFinales().add(finale);
		finale.setTim(this);

		return finale;
	}

	public Finale removeFinale(Finale finale) {
		getFinales().remove(finale);
		finale.setTim(null);

		return finale;
	}

	public List<Igrachi> getIgrachis() {
		return this.igrachis;
	}

	public void setIgrachis(List<Igrachi> igrachis) {
		this.igrachis = igrachis;
	}

	public List<Igraat> getIgraats1() {
		return this.igraats1;
	}

	public void setIgraats1(List<Igraat> igraats1) {
		this.igraats1 = igraats1;
	}

	public Igraat addIgraats1(Igraat igraats1) {
		getIgraats1().add(igraats1);
		igraats1.setTim1(this);

		return igraats1;
	}

	public Igraat removeIgraats1(Igraat igraats1) {
		getIgraats1().remove(igraats1);
		igraats1.setTim1(null);

		return igraats1;
	}

	public List<Igraat> getIgraats2() {
		return this.igraats2;
	}

	public void setIgraats2(List<Igraat> igraats2) {
		this.igraats2 = igraats2;
	}

	public Igraat addIgraats2(Igraat igraats2) {
		getIgraats2().add(igraats2);
		igraats2.setTim2(this);

		return igraats2;
	}

	public Igraat removeIgraats2(Igraat igraats2) {
		getIgraats2().remove(igraats2);
		igraats2.setTim2(null);

		return igraats2;
	}

	public List<Menuvaattim> getMenuvaattims() {
		return this.menuvaattims;
	}

	public void setMenuvaattims(List<Menuvaattim> menuvaattims) {
		this.menuvaattims = menuvaattims;
	}

	public Menuvaattim addMenuvaattim(Menuvaattim menuvaattim) {
		getMenuvaattims().add(menuvaattim);
		menuvaattim.setTim(this);

		return menuvaattim;
	}

	public Menuvaattim removeMenuvaattim(Menuvaattim menuvaattim) {
		getMenuvaattims().remove(menuvaattim);
		menuvaattim.setTim(null);

		return menuvaattim;
	}

	public StatistikaNaTim getStatistikaNaTim() {
		return this.statistikaNaTim;
	}

	public void setStatistikaNaTim(StatistikaNaTim statistikaNaTim) {
		this.statistikaNaTim = statistikaNaTim;
	}

	public Liga getLiga() {
		return this.liga;
	}

	public void setLiga(Liga liga) {
		this.liga = liga;
	}

}