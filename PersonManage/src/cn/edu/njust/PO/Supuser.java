package cn.edu.njust.PO;

/**
 * Supuser entity. @author MyEclipse Persistence Tools
 */

public class Supuser implements java.io.Serializable {

	// Fields

	private Integer supid;
	private String useId;
	private String password;
	private String academy;

	// Constructors

	/** default constructor */
	public Supuser() {
	}

	/** full constructor */
	public Supuser(String useId, String password, String academy) {
		this.useId = useId;
		this.password = password;
		this.academy = academy;
	}

	// Property accessors

	public Integer getSupid() {
		return this.supid;
	}

	public void setSupid(Integer supid) {
		this.supid = supid;
	}

	public String getUseId() {
		return this.useId;
	}

	public void setUseId(String useId) {
		this.useId = useId;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAcademy() {
		return this.academy;
	}

	public void setAcademy(String academy) {
		this.academy = academy;
	}

}