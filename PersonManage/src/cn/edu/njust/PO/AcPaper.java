package cn.edu.njust.PO;

import java.util.Date;

/**
 * AcPaper entity. @author MyEclipse Persistence Tools
 */

public class AcPaper implements java.io.Serializable {

	// Fields

	private Integer acid;
	private String title;
	private String type;
	private String class_;
	private String applier;
	private String department;
	private String telephone;
	private String author1;
	private String authDep1;
	private String authJob1;
	private String author2;
	private String authDep2;
	private String authJob2;
	private String author3;
	private String authDep3;
	private String authJob3;
	private String fundName;
	private String fundId;
	private String journal;
	private String journalType;
	private String issn;
	private String cn;
	private Date publishTime;
	private String position;
	private String conTitle;
	private Date conTime;
	private String conPlace;
	private String host;
	private String publishNum;
	private String publisher;
	private Double sumWord;
	private String bookNum;
	private Double myWord;
	private String digest;

	// Constructors

	/** default constructor */
	public AcPaper() {
	}

	/** minimal constructor */
	public AcPaper(String title, String type, String class_, String applier,
			String department, String telephone, String author1,
			String authDep1, String authJob1, String fundName, String fundId,
			String digest) {
		this.title = title;
		this.type = type;
		this.class_ = class_;
		this.applier = applier;
		this.department = department;
		this.telephone = telephone;
		this.author1 = author1;
		this.authDep1 = authDep1;
		this.authJob1 = authJob1;
		this.fundName = fundName;
		this.fundId = fundId;
		this.digest = digest;
	}

	/** full constructor */
	public AcPaper(String title, String type, String class_, String applier,
			String department, String telephone, String author1,
			String authDep1, String authJob1, String author2, String authDep2,
			String authJob2, String author3, String authDep3, String authJob3,
			String fundName, String fundId, String journal, String journalType,
			String issn, String cn, Date publishTime, String position,
			String conTitle, Date conTime, String conPlace, String host,
			String publishNum, String publisher, Double sumWord,
			String bookNum, Double myWord, String digest) {
		this.title = title;
		this.type = type;
		this.class_ = class_;
		this.applier = applier;
		this.department = department;
		this.telephone = telephone;
		this.author1 = author1;
		this.authDep1 = authDep1;
		this.authJob1 = authJob1;
		this.author2 = author2;
		this.authDep2 = authDep2;
		this.authJob2 = authJob2;
		this.author3 = author3;
		this.authDep3 = authDep3;
		this.authJob3 = authJob3;
		this.fundName = fundName;
		this.fundId = fundId;
		this.journal = journal;
		this.journalType = journalType;
		this.issn = issn;
		this.cn = cn;
		this.publishTime = publishTime;
		this.position = position;
		this.conTitle = conTitle;
		this.conTime = conTime;
		this.conPlace = conPlace;
		this.host = host;
		this.publishNum = publishNum;
		this.publisher = publisher;
		this.sumWord = sumWord;
		this.bookNum = bookNum;
		this.myWord = myWord;
		this.digest = digest;
	}

	// Property accessors

	public Integer getAcid() {
		return this.acid;
	}

	public void setAcid(Integer acid) {
		this.acid = acid;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	public String getApplier() {
		return this.applier;
	}

	public void setApplier(String applier) {
		this.applier = applier;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAuthor1() {
		return this.author1;
	}

	public void setAuthor1(String author1) {
		this.author1 = author1;
	}

	public String getAuthDep1() {
		return this.authDep1;
	}

	public void setAuthDep1(String authDep1) {
		this.authDep1 = authDep1;
	}

	public String getAuthJob1() {
		return this.authJob1;
	}

	public void setAuthJob1(String authJob1) {
		this.authJob1 = authJob1;
	}

	public String getAuthor2() {
		return this.author2;
	}

	public void setAuthor2(String author2) {
		this.author2 = author2;
	}

	public String getAuthDep2() {
		return this.authDep2;
	}

	public void setAuthDep2(String authDep2) {
		this.authDep2 = authDep2;
	}

	public String getAuthJob2() {
		return this.authJob2;
	}

	public void setAuthJob2(String authJob2) {
		this.authJob2 = authJob2;
	}

	public String getAuthor3() {
		return this.author3;
	}

	public void setAuthor3(String author3) {
		this.author3 = author3;
	}

	public String getAuthDep3() {
		return this.authDep3;
	}

	public void setAuthDep3(String authDep3) {
		this.authDep3 = authDep3;
	}

	public String getAuthJob3() {
		return this.authJob3;
	}

	public void setAuthJob3(String authJob3) {
		this.authJob3 = authJob3;
	}

	public String getFundName() {
		return this.fundName;
	}

	public void setFundName(String fundName) {
		this.fundName = fundName;
	}

	public String getFundId() {
		return this.fundId;
	}

	public void setFundId(String fundId) {
		this.fundId = fundId;
	}

	public String getJournal() {
		return this.journal;
	}

	public void setJournal(String journal) {
		this.journal = journal;
	}

	public String getJournalType() {
		return this.journalType;
	}

	public void setJournalType(String journalType) {
		this.journalType = journalType;
	}

	public String getIssn() {
		return this.issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	public String getCn() {
		return this.cn;
	}

	public void setCn(String cn) {
		this.cn = cn;
	}

	public Date getPublishTime() {
		return this.publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getConTitle() {
		return this.conTitle;
	}

	public void setConTitle(String conTitle) {
		this.conTitle = conTitle;
	}

	public Date getConTime() {
		return this.conTime;
	}

	public void setConTime(Date conTime) {
		this.conTime = conTime;
	}

	public String getConPlace() {
		return this.conPlace;
	}

	public void setConPlace(String conPlace) {
		this.conPlace = conPlace;
	}

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPublishNum() {
		return this.publishNum;
	}

	public void setPublishNum(String publishNum) {
		this.publishNum = publishNum;
	}

	public String getPublisher() {
		return this.publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Double getSumWord() {
		return this.sumWord;
	}

	public void setSumWord(Double sumWord) {
		this.sumWord = sumWord;
	}

	public String getBookNum() {
		return this.bookNum;
	}

	public void setBookNum(String bookNum) {
		this.bookNum = bookNum;
	}

	public Double getMyWord() {
		return this.myWord;
	}

	public void setMyWord(Double myWord) {
		this.myWord = myWord;
	}

	public String getDigest() {
		return this.digest;
	}

	public void setDigest(String digest) {
		this.digest = digest;
	}

}