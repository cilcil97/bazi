package com.EsportLeagueStats.ESLS.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="statistika_na_igrach")
public class StatistikaNaIgrach implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iid;

	private Integer kda;

	private Integer nadigruvanja;

	@Column(name="napravena_steta")
	private Integer napravenaSteta;

	@Column(name="poeni_vo_10_min")
	private Integer poeniVo10Min;

	@Column(name="primena_steta")
	private Integer primenaSteta;

	@Column(name="prinudeni_greski")
	private Integer prinudeniGreski;

	@Column(name="prisustvo_na_soigrachi")
	private Integer prisustvoNaSoigrachi;

	@Column(name="prisustvo_na_vardovi")
	private Integer prisustvoNaVardovi;


	@OneToOne
	@JsonIgnore
	@JoinColumn(name="iid")
	private StatistikaNaIgrach statistikaNaIgrach1;

	//bi-directional one-to-one association to StatistikaNaIgrach
	@JsonIgnore
	@OneToOne(mappedBy="statistikaNaIgrach1")
	private StatistikaNaIgrach statistikaNaIgrach2;

	public StatistikaNaIgrach() {
	}

	public Integer getIid() {
		return this.iid;
	}

	public void setIid(Integer iid) {
		this.iid = iid;
	}

	public Integer getKda() {
		return this.kda;
	}

	public void setKda(Integer kda) {
		this.kda = kda;
	}

	public Integer getNadigruvanja() {
		return this.nadigruvanja;
	}

	public void setNadigruvanja(Integer nadigruvanja) {
		this.nadigruvanja = nadigruvanja;
	}

	public Integer getNapravenaSteta() {
		return this.napravenaSteta;
	}

	public void setNapravenaSteta(Integer napravenaSteta) {
		this.napravenaSteta = napravenaSteta;
	}

	public Integer getPoeniVo10Min() {
		return this.poeniVo10Min;
	}

	public void setPoeniVo10Min(Integer poeniVo10Min) {
		this.poeniVo10Min = poeniVo10Min;
	}

	public Integer getPrimenaSteta() {
		return this.primenaSteta;
	}

	public void setPrimenaSteta(Integer primenaSteta) {
		this.primenaSteta = primenaSteta;
	}

	public Integer getPrinudeniGreski() {
		return this.prinudeniGreski;
	}

	public void setPrinudeniGreski(Integer prinudeniGreski) {
		this.prinudeniGreski = prinudeniGreski;
	}

	public Integer getPrisustvoNaSoigrachi() {
		return this.prisustvoNaSoigrachi;
	}

	public void setPrisustvoNaSoigrachi(Integer prisustvoNaSoigrachi) {
		this.prisustvoNaSoigrachi = prisustvoNaSoigrachi;
	}

	public Integer getPrisustvoNaVardovi() {
		return this.prisustvoNaVardovi;
	}

	public void setPrisustvoNaVardovi(Integer prisustvoNaVardovi) {
		this.prisustvoNaVardovi = prisustvoNaVardovi;
	}

	public StatistikaNaIgrach getStatistikaNaIgrach1() {
		return this.statistikaNaIgrach1;
	}

	public void setStatistikaNaIgrach1(StatistikaNaIgrach statistikaNaIgrach1) {
		this.statistikaNaIgrach1 = statistikaNaIgrach1;
	}

	public StatistikaNaIgrach getStatistikaNaIgrach2() {
		return this.statistikaNaIgrach2;
	}

	public void setStatistikaNaIgrach2(StatistikaNaIgrach statistikaNaIgrach2) {
		this.statistikaNaIgrach2 = statistikaNaIgrach2;
	}

}