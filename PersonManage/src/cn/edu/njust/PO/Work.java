package cn.edu.njust.PO;

import java.util.Date;

/**
 * Work entity. @author MyEclipse Persistence Tools
 */

public class Work implements java.io.Serializable {

	// Fields

	private Integer workId;
	private Personinfo personinfo;
	private Date BDate;
	private Date EDate;
	private String unit;
	private String department;
	private String post;

	// Constructors

	/** default constructor */
	public Work() {
	}

	/** minimal constructor */
	public Work(Personinfo personinfo, Date BDate, Date EDate, String unit,
			String department) {
		this.personinfo = personinfo;
		this.BDate = BDate;
		this.EDate = EDate;
		this.unit = unit;
		this.department = department;
	}

	/** full constructor */
	public Work(Personinfo personinfo, Date BDate, Date EDate, String unit,
			String department, String post) {
		this.personinfo = personinfo;
		this.BDate = BDate;
		this.EDate = EDate;
		this.unit = unit;
		this.department = department;
		this.post = post;
	}

	// Property accessors

	public Integer getWorkId() {
		return this.workId;
	}

	public void setWorkId(Integer workId) {
		this.workId = workId;
	}

	public Personinfo getPersoninfo() {
		return this.personinfo;
	}

	public void setPersoninfo(Personinfo personinfo) {
		this.personinfo = personinfo;
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

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPost() {
		return this.post;
	}

	public void setPost(String post) {
		this.post = post;
	}

}