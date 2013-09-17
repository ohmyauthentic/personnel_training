package com.pojo;

import java.sql.Timestamp;

/**
 * Paper entity. @author MyEclipse Persistence Tools
 */

public class Paper implements java.io.Serializable {

	// Fields

	private String stuId;
	private String paperName;
	private Timestamp submitTime;
	private Timestamp replyTime;
	private String rewardSort;
	private Boolean isCheck;

	// Constructors

	/** default constructor */
	public Paper() {
	}

	/** full constructor */
	public Paper(String paperName, Timestamp submitTime, Timestamp replyTime,
			String rewardSort, Boolean isCheck) {
		this.paperName = paperName;
		this.submitTime = submitTime;
		this.replyTime = replyTime;
		this.rewardSort = rewardSort;
		this.isCheck = isCheck;
	}

	// Property accessors

	public String getStuId() {
		return this.stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getPaperName() {
		return this.paperName;
	}

	public void setPaperName(String paperName) {
		this.paperName = paperName;
	}

	public Timestamp getSubmitTime() {
		return this.submitTime;
	}

	public void setSubmitTime(Timestamp submitTime) {
		this.submitTime = submitTime;
	}

	public Timestamp getReplyTime() {
		return this.replyTime;
	}

	public void setReplyTime(Timestamp replyTime) {
		this.replyTime = replyTime;
	}

	public String getRewardSort() {
		return this.rewardSort;
	}

	public void setRewardSort(String rewardSort) {
		this.rewardSort = rewardSort;
	}

	public Boolean getIsCheck() {
		return this.isCheck;
	}

	public void setIsCheck(Boolean isCheck) {
		this.isCheck = isCheck;
	}

}