package cn.edu.njust.PO;

/**
 * Userinfo entity. @author MyEclipse Persistence Tools
 */

public class Userinfo implements java.io.Serializable {

	// Fields

	private Integer uid;
	private Academy academy;
	private String userId;
	private String name;
	private String password;
	private String dep;
	private String type;

	// Constructors

	/** default constructor */
	public Userinfo() {
	}

	/** minimal constructor */
	public Userinfo(String userId, String name, String password, String dep,
			String type) {
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.dep = dep;
		this.type = type;
	}

	/** full constructor */
	public Userinfo(Academy academy, String userId, String name,
			String password, String dep, String type) {
		this.academy = academy;
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.dep = dep;
		this.type = type;
	}

	// Property accessors

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Academy getAcademy() {
		return this.academy;
	}

	public void setAcademy(Academy academy) {
		this.academy = academy;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDep() {
		return this.dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}