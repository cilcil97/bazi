package com.EsportLeagueStats.ESLS.model;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the statistika_na_tim database table.
 * 
 */
@Entity
@Table(name="statistika_na_tim")
public class StatistikaNaTim implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer tid;

	@Column(name="br_pobedi")
	private Integer brPobedi;

	@Column(name="poeni_vo_10_min")
	private Integer poeniVo10Min;

	//bi-directional one-to-one association to Tim
	@OneToOne
	@JoinColumn(name="tid")
	private Tim tim;

	public StatistikaNaTim() {
	}

	public Integer getTid() {
		return this.tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public Integer getBrPobedi() {
		return this.brPobedi;
	}

	public void setBrPobedi(Integer brPobedi) {
		this.brPobedi = brPobedi;
	}

	public Integer getPoeniVo10Min() {
		return this.poeniVo10Min;
	}

	public void setPoeniVo10Min(Integer poeniVo10Min) {
		this.poeniVo10Min = poeniVo10Min;
	}

	public Tim getTim() {
		return this.tim;
	}

	public void setTim(Tim tim) {
		this.tim = tim;
	}

}