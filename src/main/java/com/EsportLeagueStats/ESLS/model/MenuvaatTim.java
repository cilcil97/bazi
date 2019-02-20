package com.EsportLeagueStats.ESLS.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(schema = "project", name = "menuvaat_tim")
public class MenuvaatTim  {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "cena")
	private Integer cena;

	@Column(name="datum_na_smena")
	private LocalDate datumNaSmena;

	//bi-directional many-to-one association to Players
	@ManyToOne
	@JoinColumn(name="igrach_id")
	private Players igrach;

	//bi-directional many-to-one association to Tim
	@ManyToOne
	@JoinColumn(name="tim_id")
	private Tim tim;

	public MenuvaatTim() {
	}

	public MenuvaatTim(Integer cena, LocalDate datumNaSmena, Players igrach, Tim tim) {
		this.cena = cena;
		this.datumNaSmena = datumNaSmena;
		this.igrach = igrach;
		this.tim = tim;
	}

	public Integer getCena() {
		return this.cena;
	}

	public void setCena(Integer cena) {
		this.cena = cena;
	}


	public Players getIgrachi() {
		return this.igrach;
	}

	public void setIgrachi(Players igrachi) {
		this.igrach = igrachi;
	}

	public Tim getTim() {
		return this.tim;
	}

	public void setTim(Tim tim) {
		this.tim = tim;
	}

	public Integer getId() {
		return id;
	}

	public LocalDate getDatumNaSmena() {
		return datumNaSmena;
	}

	public void setDatumNaSmena(LocalDate datumNaSmena) {
		this.datumNaSmena = datumNaSmena;
	}

	public Players getIgrach() {
		return igrach;
	}

	public void setIgrach(Players igrach) {
		this.igrach = igrach;
	}
}