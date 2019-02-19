package com.EsportLeagueStats.ESLS.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the utakmica database table.
 * 
 */
@Entity
public class Utakmica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uid;

	private String pobednik;

	@Column(name="vreme_traenje")
	private String vremeTraenje;

	//bi-directional many-to-one association to Finale
	@JsonIgnore
	@OneToMany(mappedBy="utakmica")
	private List<Finale> finales;

	//bi-directional many-to-one association to Igraat

	@OneToMany(mappedBy="utakmica")
	private List<Igraat> igraats;

	//bi-directional many-to-one association to Sezona
	@ManyToOne
	@JoinColumn(name="seid")
	private Sezona sezona;

	public Utakmica() {
	}

	public Utakmica(String pobednik, String vremeTraenje, Sezona sezona) {
		this.pobednik = pobednik;
		this.vremeTraenje = vremeTraenje;
		this.sezona = sezona;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getPobednik() {
		return this.pobednik;
	}

	public void setPobednik(String pobednik) {
		this.pobednik = pobednik;
	}

	public String getVremeTraenje() {
		return this.vremeTraenje;
	}

	public void setVremeTraenje(String vremeTraenje) {
		this.vremeTraenje = vremeTraenje;
	}


	public List<Finale> getFinales() {
		return this.finales;
	}

	public void setFinales(List<Finale> finales) {
		this.finales = finales;
	}

	public Finale addFinale(Finale finale) {
		getFinales().add(finale);
		finale.setUtakmica(this);

		return finale;
	}

	public Finale removeFinale(Finale finale) {
		getFinales().remove(finale);
		finale.setUtakmica(null);

		return finale;
	}

	public List<Igraat> getIgraats() {
		return this.igraats;
	}

	public void setIgraats(List<Igraat> igraats) {
		this.igraats = igraats;
	}

	public Igraat addIgraat(Igraat igraat) {
		getIgraats().add(igraat);
		igraat.setUtakmica(this);

		return igraat;
	}

	public Igraat removeIgraat(Igraat igraat) {
		getIgraats().remove(igraat);
		igraat.setUtakmica(null);

		return igraat;
	}

	public Sezona getSezona() {
		return this.sezona;
	}

	public void setSezona(Sezona sezona) {
		this.sezona = sezona;
	}

}