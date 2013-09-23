package cn.edu.njust.PO;

import java.util.Date;

/**
 * Parttime entity. @author MyEclipse Persistence Tools
 */

public class Parttime implements java.io.Serializable {

	// Fields

	private Integer paId;
	private Personinfo personinfo;
	private String name;
	private Date BDate;
	private Date EDate;

	// Constructors

	/** default constructor */
	public Parttime() {
	}

	/** full constructor */
	public Parttime(Personinfo personinfo, String name, Date BDate, Date EDate) {
		this.personinfo = personinfo;
		this.name = name;
		this.BDate = BDate;
		this.EDate = EDate;
	}

	// Property accessors

	public Integer getPaId() {
		return this.paId;
	}

	public void setPaId(Integer paId) {
		this.paId = paId;
	}

	public Personinfo getPersoninfo() {
		return this.personinfo;
	}

	public void setPersoninfo(Personinfo personinfo) {
		this.personinfo = personinfo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBDate() {
		return this.BDate;
	}

	public void setBDate(Date BDate) {
		this.BDate = BDate;
	}

	public Date getEDate() {
		return this.EDate;
	}

	public void setEDate(Date EDate) {
		this.EDate = EDate;
	}

}