package cn.edu.njust.PO;

/**
 * Major entity. @author MyEclipse Persistence Tools
 */

public class Major implements java.io.Serializable {

	// Fields

	private Integer maId;
	private Subject subject;
	private Personinfo personinfo;

	// Constructors

	/** default constructor */
	public Major() {
	}

	/** full constructor */
	public Major(Subject subject, Personinfo personinfo) {
		this.subject = subject;
		this.personinfo = personinfo;
	}

	// Property accessors

	public Integer getMaId() {
		return this.maId;
	}

	public void setMaId(Integer maId) {
		this.maId = maId;
	}

	public Subject getSubject() {
		return this.subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Personinfo getPersoninfo() {
		return this.personinfo;
	}

	public void setPersoninfo(Personinfo personinfo) {
		this.personinfo = personinfo;
	}

}