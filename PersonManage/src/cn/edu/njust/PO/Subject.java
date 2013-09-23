package cn.edu.njust.PO;

import java.util.HashSet;
import java.util.Set;

/**
 * Subject entity. @author MyEclipse Persistence Tools
 */

public class Subject implements java.io.Serializable {

	// Fields

	private Integer subid;
	private String code;
	private String name;
	private String level;
	private String ALevels;
	private Integer flag;
	private Set majors = new HashSet(0);

	// Constructors

	/** default constructor */
	public Subject() {
	}

	/** minimal constructor */
	public Subject(String code, String name, String level, String ALevels,
			Integer flag) {
		this.code = code;
		this.name = name;
		this.level = level;
		this.ALevels = ALevels;
		this.flag = flag;
	}

	/** full constructor */
	public Subject(String code, String name, String level, String ALevels,
			Integer flag, Set majors) {
		this.code = code;
		this.name = name;
		this.level = level;
		this.ALevels = ALevels;
		this.flag = flag;
		this.majors = majors;
	}

	// Property accessors

	public Integer getSubid() {
		return this.subid;
	}

	public void setSubid(Integer subid) {
		this.subid = subid;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public String getALevels() {
		return this.ALevels;
	}

	public void setALevels(String ALevels) {
		this.ALevels = ALevels;
	}

	public Integer getFlag() {
		return this.flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public Set getMajors() {
		return this.majors;
	}

	public void setMajors(Set majors) {
		this.majors = majors;
	}

}