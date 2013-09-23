package cn.edu.njust.PO;

import java.util.HashSet;
import java.util.Set;

/**
 * Honour entity. @author MyEclipse Persistence Tools
 */

public class Honour implements java.io.Serializable {

	// Fields

	private Integer htId;
	private String name;
	private String level;
	private Integer flag;
	private Set achieves = new HashSet(0);

	// Constructors

	/** default constructor */
	public Honour() {
	}

	/** minimal constructor */
	public Honour(String name, String level, Integer flag) {
		this.name = name;
		this.level = level;
		this.flag = flag;
	}

	/** full constructor */
	public Honour(String name, String level, Integer flag, Set achieves) {
		this.name = name;
		this.level = level;
		this.flag = flag;
		this.achieves = achieves;
	}

	// Property accessors

	public Integer getHtId() {
		return this.htId;
	}

	public void setHtId(Integer htId) {
		this.htId = htId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Integer getFlag() {
		return this.flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public Set getAchieves() {
		return this.achieves;
	}

	public void setAchieves(Set achieves) {
		this.achieves = achieves;
	}

}