package cn.edu.njust.Action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class AcPaperAction extends ActionSupport{
	
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
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getClass_() {
		return class_;
	}
	public void setClass_(String class_) {
		this.class_ = class_;
	}
	public String getApplier() {
		return applier;
	}
	public void setApplier(String applier) {
		this.applier = applier;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAuthor1() {
		return author1;
	}
	public void setAuthor1(String author1) {
		this.author1 = author1;
	}
	public String getAuthDep1() {
		return authDep1;
	}
	public void setAuthDep1(String authDep1) {
		this.authDep1 = authDep1;
	}
	public String getAuthJob1() {
		return authJob1;
	}
	public void setAuthJob1(String authJob1) {
		this.authJob1 = authJob1;
	}
	public String getAuthor2() {
		return author2;
	}
	public void setAuthor2(String author2) {
		this.author2 = author2;
	}
	public String getAuthDep2() {
		return authDep2;
	}
	public void setAuthDep2(String authDep2) {
		this.authDep2 = authDep2;
	}
	public String getAuthJob2() {
		return authJob2;
	}
	public void setAuthJob2(String authJob2) {
		this.authJob2 = authJob2;
	}
	public String getAuthor3() {
		return author3;
	}
	public void setAuthor3(String author3) {
		this.author3 = author3;
	}
	public String getAuthDep3() {
		return authDep3;
	}
	public void setAuthDep3(String authDep3) {
		this.authDep3 = authDep3;
	}
	public String getAuthJob3() {
		return authJob3;
	}
	public void setAuthJob3(String authJob3) {
		this.authJob3 = authJob3;
	}
	public String getFundName() {
		return fundName;
	}
	public void setFundName(String fundName) {
		this.fundName = fundName;
	}
	public String getFundId() {
		return fundId;
	}
	public void setFundId(String fundId) {
		this.fundId = fundId;
	}
	public String getJournal() {
		return journal;
	}
	public void setJournal(String journal) {
		this.journal = journal;
	}
	public String getJournalType() {
		return journalType;
	}
	public void setJournalType(String journalType) {
		this.journalType = journalType;
	}
	public String getIssn() {
		return issn;
	}
	public void setIssn(String issn) {
		this.issn = issn;
	}
	public String getCn() {
		return cn;
	}
	public void setCn(String cn) {
		this.cn = cn;
	}
	public Date getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getConTitle() {
		return conTitle;
	}
	public void setConTitle(String conTitle) {
		this.conTitle = conTitle;
	}
	public Date getConTime() {
		return conTime;
	}
	public void setConTime(Date conTime) {
		this.conTime = conTime;
	}
	public String getConPlace() {
		return conPlace;
	}
	public void setConPlace(String conPlace) {
		this.conPlace = conPlace;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getPublishNum() {
		return publishNum;
	}
	public void setPublishNum(String publishNum) {
		this.publishNum = publishNum;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Double getSumWord() {
		return sumWord;
	}
	public void setSumWord(Double sumWord) {
		this.sumWord = sumWord;
	}
	public String getBookNum() {
		return bookNum;
	}
	public void setBookNum(String bookNum) {
		this.bookNum = bookNum;
	}
	public Double getMyWord() {
		return myWord;
	}
	public void setMyWord(Double myWord) {
		this.myWord = myWord;
	}
	public String getDigest() {
		return digest;
	}
	public void setDigest(String digest) {
		this.digest = digest;
	}
	
	public void validate(){
		
	}
	
	public String execute() throws Exception{
		return SUCCESS;
	}
	

}
