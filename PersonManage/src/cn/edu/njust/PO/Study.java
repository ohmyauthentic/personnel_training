package cn.edu.njust.PO;

import java.util.Date;

/**
 * Study entity. @author MyEclipse Persistence Tools
 */

public class Study implements java.io.Serializable {

	// Fields

	private Integer studyId;
	private Personinfo personinfo;
	private Date BDate;
	private Date EDate;
	private String college;
	private String major;
	private String degree;
	private String eduBk;
	private String ALevels;
	private Integer EFlag;
	private Integer DFlag;

	// Constructors

	/** default constructor */
	public Study() {
	}

	/** full constructor */
	public Study(Personinfo personinfo, Date BDate, Date EDate, String college,
			String major, String degree, String eduBk, String ALevels,
			Integer EFlag, Integer DFlag) {
		this.personinfo = personinfo;
		this.BDate = BDate;
		this.EDate = EDate;
		this.college = college;
		this.major = major;
		this.degree = degree;
		this.eduBk = eduBk;
		this.ALevels = ALevels;
		this.EFlag = EFlag;
		this.DFlag = DFlag;
	}

	// Property accessors

	public Integer getStudyId() {
		return this.studyId;
	}

	public void setStudyId(Integer studyId) {
		this.studyId = studyId;
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

	public String getCollege() {
		return this.college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getEduBk() {
		return this.eduBk;
	}

	public void setEduBk(String eduBk) {
		this.eduBk = eduBk;
	}

	public String getALevels() {
		return this.ALevels;
	}

	public void setALevels(String ALevels) {
		this.ALevels = ALevels;
	}

	public Integer getEFlag() {
		return this.EFlag;
	}

	public void setEFlag(Integer EFlag) {
		this.EFlag = EFlag;
	}

	public Integer getDFlag() {
		return this.DFlag;
	}

	public void setDFlag(Integer DFlag) {
		this.DFlag = DFlag;
	}

}