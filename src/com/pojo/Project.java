package com.pojo;

import java.util.Date;

/**
 * Project entity. @author MyEclipse Persistence Tools
 */

public class Project implements java.io.Serializable {

	// Fields

	private String projectId;
	private String stuId;
	private String teacher;
	private String department;
	private String projectName;
	private String sort;
	private Date year;

	// Constructors

	/** default constructor */
	public Project() {
	}

	/** full constructor */
	public Project(String stuId, String teacher, String department,
			String projectName, String sort, Date year) {
		this.stuId = stuId;
		this.teacher = teacher;
		this.department = department;
		this.projectName = projectName;
		this.sort = sort;
		this.year = year;
	}

	// Property accessors

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getStuId() {
		return this.stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getTeacher() {
		return this.teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getSort() {
		return this.sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public Date getYear() {
		return this.year;
	}

	public void setYear(Date year) {
		this.year = year;
	}

}