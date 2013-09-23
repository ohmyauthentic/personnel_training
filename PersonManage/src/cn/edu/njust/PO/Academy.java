package cn.edu.njust.PO;

import java.util.HashSet;
import java.util.Set;

/**
 * Academy entity. @author MyEclipse Persistence Tools
 */

public class Academy implements java.io.Serializable {

	// Fields

	private Integer acaid;
	private String name;
	private Integer flag;
	private Set userinfos = new HashSet(0);
	private Set managers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Academy() {
	}

	/** minimal constructor */
	public Academy(String name, Integer flag) {
		this.name = name;
		this.flag = flag;
	}

	/** full constructor */
	public Academy(String name, Integer flag, Set userinfos, Set managers) {
		this.name = name;
		this.flag = flag;
		this.userinfos = userinfos;
		this.managers = managers;
	}

	// Property accessors

	public Integer getAcaid() {
		return this.acaid;
	}

	public void setAcaid(Integer acaid) {
		this.acaid = acaid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getFlag() {
		return this.flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public Set getUserinfos() {
		return this.userinfos;
	}

	public void setUserinfos(Set userinfos) {
		this.userinfos = userinfos;
	}

	public Set getManagers() {
		return this.managers;
	}

	public void setManagers(Set managers) {
		this.managers = managers;
	}

}