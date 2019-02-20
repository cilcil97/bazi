package com.EsportLeagueStats.ESLS.model;

import javax.persistence.*;

@Entity
@Table(schema = "project", name="statistika_na_tim")
public class StatistikaNaTim {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name="br_pobedi")
	private Long brPobedi;

	@Column(name="poeni_vo_10_min")
	private Integer poeniVo10Min;

	//bi-directional one-to-one association to Tim
	@ManyToOne
	@JoinColumn(name="tim_id")
	private Tim tim;

	@ManyToOne
	@JoinColumn(name = "sezona_id")
	private Sezona sezona;

	public StatistikaNaTim() {
	}

	public StatistikaNaTim(Long brPobedi, Integer poeniVo10Min, Tim tim, Sezona sezona) {
		this.brPobedi = brPobedi;
		this.poeniVo10Min = poeniVo10Min;
		this.tim = tim;
		this.sezona = sezona;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getBrPobedi() {
		return brPobedi;
	}

	public void setBrPobedi(Long brPobedi) {
		this.brPobedi = brPobedi;
	}

	public Sezona getSezona() {
		return sezona;
	}

	public void setSezona(Sezona sezona) {
		this.sezona = sezona;
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