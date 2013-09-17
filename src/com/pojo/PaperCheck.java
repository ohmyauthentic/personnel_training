package com.pojo;

import java.sql.Timestamp;

/**
 * PaperCheck entity. @author MyEclipse Persistence Tools
 */

public class PaperCheck implements java.io.Serializable {

	// Fields

	private String stuId;
	private Timestamp checkTime;
	private String checkResult;

	// Constructors

	/** default constructor */
	public PaperCheck() {
	}

	/** full constructor */
	public PaperCheck(Timestamp checkTime, String checkResult) {
		this.checkTime = checkTime;
		this.checkResult = checkResult;
	}

	// Property accessors

	public String getStuId() {
		return this.stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public Timestamp getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(Timestamp checkTime) {
		this.checkTime = checkTime;
	}

	public String getCheckResult() {
		return this.checkResult;
	}

	public void setCheckResult(String checkResult) {
		this.checkResult = checkResult;
	}

}