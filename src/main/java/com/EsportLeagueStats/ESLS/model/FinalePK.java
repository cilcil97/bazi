package com.EsportLeagueStats.ESLS.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the finale database table.
 * 
 */
@Embeddable
public class FinalePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private Integer fid;

	@Column(insertable=false, updatable=false)
	private Integer uid;

	public FinalePK() {
	}
	public Integer getFid() {
		return this.fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
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
		if (!(other instanceof FinalePK)) {
			return false;
		}
		FinalePK castOther = (FinalePK)other;
		return 
			this.fid.equals(castOther.fid)
			&& this.uid.equals(castOther.uid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.fid.hashCode();
		hash = hash * prime + this.uid.hashCode();
		
		return hash;
	}
}