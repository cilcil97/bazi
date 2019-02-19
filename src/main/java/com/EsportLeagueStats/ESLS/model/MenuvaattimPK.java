package com.EsportLeagueStats.ESLS.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the menuvaattim database table.
 * 
 */
@Embeddable
public class MenuvaattimPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private Integer iid;

	@Column(insertable=false, updatable=false)
	private Integer tid;

	public MenuvaattimPK() {
	}
	public Integer getIid() {
		return this.iid;
	}
	public void setIid(Integer iid) {
		this.iid = iid;
	}
	public Integer getTid() {
		return this.tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MenuvaattimPK)) {
			return false;
		}
		MenuvaattimPK castOther = (MenuvaattimPK)other;
		return 
			this.iid.equals(castOther.iid)
			&& this.tid.equals(castOther.tid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.iid.hashCode();
		hash = hash * prime + this.tid.hashCode();
		
		return hash;
	}
}