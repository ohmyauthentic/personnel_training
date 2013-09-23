package cn.edu.njust.PO;

import java.util.Date;

/**
 * Achieve entity. @author MyEclipse Persistence Tools
 */

public class Achieve implements java.io.Serializable {

	// Fields

	private Integer achId;
	private Honour honour;
	private Personinfo personinfo;
	private Date date;
	private String batch;

	// Constructors

	/** default constructor */
	public Achieve() {
	}

	/** full constructor */
	public Achieve(Honour honour, Personinfo personinfo, Date date, String batch) {
		this.honour = honour;
		this.personinfo = personinfo;
		this.date = date;
		this.batch = batch;
	}

	// Property accessors

	public Integer getAchId() {
		return this.achId;
	}

	public void setAchId(Integer achId) {
		this.achId = achId;
	}

	public Honour getHonour() {
		return this.honour;
	}

	public void setHonour(Honour honour) {
		this.honour = honour;
	}

	public Personinfo getPersoninfo() {
		return this.personinfo;
	}

	public void setPersoninfo(Personinfo personinfo) {
		this.personinfo = personinfo;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getBatch() {
		return this.batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

}