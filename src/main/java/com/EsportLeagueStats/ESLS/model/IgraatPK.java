package com.EsportLeagueStats.ESLS.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the igraat database table.
 * 
 */
@Embeddable
public class IgraatPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;


	@Column(insertable=false, updatable=false)
	private Integer tid1;

	@Column(insertable=false, updatable=false)
	private Integer tid2;

	@Column(insertable=false, updatable=false)
	private Integer uid;

	public IgraatPK() {
	}
	public Integer getTid1() {
		return this.tid1;
	}
	public void setTid1(Integer tid1) {
		this.tid1 = tid1;
	}
	public Integer getTid2() {
		return this.tid2;
	}
	public void setTid2(Integer tid2) {
		this.tid2 = tid2;
	}
	public Integer getUid() {
		return this.uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof IgraatPK)) {
			return false;
		}
		IgraatPK castOther = (IgraatPK)other;
		return 
			this.tid1.equals(castOther.tid1)
			&& this.tid2.equals(castOther.tid2)
			&& this.uid.equals(castOther.uid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.tid1.hashCode();
		hash = hash * prime + this.tid2.hashCode();
		hash = hash * prime + this.uid.hashCode();
		
		return hash;
	}
}