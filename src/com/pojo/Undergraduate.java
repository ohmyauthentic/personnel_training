package com.pojo;

import java.util.Date;

/**
 * Undergraduate entity. @author MyEclipse Persistence Tools
 */

public class Undergraduate implements java.io.Serializable {

	// Fields

	private String stuId;
	private String stuName;
	private String sex;
	private Date birthday;
	private Date enrollTime;
	private String department;
	private String major;
	private String grade;
	private String remarks;
	private String state;
	private Date graduateTime;
	private String graduateNum;
	private Date degreeTime;
	private String degreeNum;
	private Boolean idEmployed;
	private String graduateDirection;

	// Constructors

	/** default constructor */
	public Undergraduate() {
	}

	/** minimal constructor */
	public Undergraduate(String stuName, Date enrollTime, String department,
			String major, String state) {
		this.stuName = stuName;
		this.enrollTime = enrollTime;
		this.department = department;
		this.major = major;
		this.state = state;
	}

	/** full constructor */
	public Undergraduate(String stuName, String sex, Date birthday,
			Date enrollTime, String department, String major, String grade,
			String remarks, String state, Date graduateTime,
			String graduateNum, Date degreeTime, String degreeNum,
			Boolean idEmployed, String graduateDirection) {
		this.stuName = stuName;
		this.sex = sex;
		this.birthday = birthday;
		this.enrollTime = enrollTime;
		this.department = department;
		this.major = major;
		this.grade = grade;
		this.remarks = remarks;
		this.state = state;
		this.graduateTime = graduateTime;
		this.graduateNum = graduateNum;
		this.degreeTime = degreeTime;
		this.degreeNum = degreeNum;
		this.idEmployed = idEmployed;
		this.graduateDirection = graduateDirection;
	}

	// Property accessors

	public String getStuId() {
		return this.stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return this.stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getEnrollTime() {
		return this.enrollTime;
	}

	public void setEnrollTime(Date enrollTime) {
		this.enrollTime = enrollTime;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getGraduateTime() {
		return this.graduateTime;
	}

	public void setGraduateTime(Date graduateTime) {
		this.graduateTime = graduateTime;
	}

	public String getGraduateNum() {
		return this.graduateNum;
	}

	public void setGraduateNum(String graduateNum) {
		this.graduateNum = graduateNum;
	}

	public Date getDegreeTime() {
		return this.degreeTime;
	}

	public void setDegreeTime(Date degreeTime) {
		this.degreeTime = degreeTime;
	}

	public String getDegreeNum() {
		return this.degreeNum;
	}

	public void setDegreeNum(String degreeNum) {
		this.degreeNum = degreeNum;
	}

	public Boolean getIdEmployed() {
		return this.idEmployed;
	}

	public void setIdEmployed(Boolean idEmployed) {
		this.idEmployed = idEmployed;
	}

	public String getGraduateDirection() {
		return this.graduateDirection;
	}

	public void setGraduateDirection(String graduateDirection) {
		this.graduateDirection = graduateDirection;
	}

}