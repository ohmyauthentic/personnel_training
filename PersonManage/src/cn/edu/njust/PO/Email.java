package cn.edu.njust.PO;

/**
 * Email entity. @author MyEclipse Persistence Tools
 */

public class Email implements java.io.Serializable {

	// Fields

	private Integer MId;
	private Personinfo personinfo;
	private String email;

	// Constructors

	/** default constructor */
	public Email() {
	}

	/** full constructor */
	public Email(Personinfo personinfo, String email) {
		this.personinfo = personinfo;
		this.email = email;
	}

	// Property accessors

	public Integer getMId() {
		return this.MId;
	}

	public void setMId(Integer MId) {
		this.MId = MId;
	}

	public Personinfo getPersoninfo() {
		return this.personinfo;
	}

	public void setPersoninfo(Personinfo personinfo) {
		this.personinfo = personinfo;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}