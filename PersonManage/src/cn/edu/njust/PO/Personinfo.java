package cn.edu.njust.PO;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Personinfo entity. @author MyEclipse Persistence Tools
 */

public class Personinfo implements java.io.Serializable {

	// Fields

	private Integer perid;
	private String useId;
	private Date birthdate;
	private Integer sex;
	private String political;
	private String nativePlace;
	private String race;
	private String idNum;
	private String post;
	private String tp;
	private String workAd;
	private String workPh;
	private String mobile;
	private String ad;
	private String TType;
	private String dir;
	private Set achieves = new HashSet(0);
	private Set majors = new HashSet(0);
	private Set parttimes = new HashSet(0);
	private Set works = new HashSet(0);
	private Set emails = new HashSet(0);
	private Set studies = new HashSet(0);

	// Constructors

	/** default constructor */
	public Personinfo() {
	}

	/** minimal constructor */
	public Personinfo(String useId, Date birthdate, Integer sex,
			String political, String nativePlace, String race, String idNum,
			String post, String tp, String workAd, String workPh,
			String mobile, String ad) {
		this.useId = useId;
		this.birthdate = birthdate;
		this.sex = sex;
		this.political = political;
		this.nativePlace = nativePlace;
		this.race = race;
		this.idNum = idNum;
		this.post = post;
		this.tp = tp;
		this.workAd = workAd;
		this.workPh = workPh;
		this.mobile = mobile;
		this.ad = ad;
	}

	/** full constructor */
	public Personinfo(String useId, Date birthdate, Integer sex,
			String political, String nativePlace, String race, String idNum,
			String post, String tp, String workAd, String workPh,
			String mobile, String ad, String TType, String dir, Set achieves,
			Set majors, Set parttimes, Set works, Set emails, Set studies) {
		this.useId = useId;
		this.birthdate = birthdate;
		this.sex = sex;
		this.political = political;
		this.nativePlace = nativePlace;
		this.race = race;
		this.idNum = idNum;
		this.post = post;
		this.tp = tp;
		this.workAd = workAd;
		this.workPh = workPh;
		this.mobile = mobile;
		this.ad = ad;
		this.TType = TType;
		this.dir = dir;
		this.achieves = achieves;
		this.majors = majors;
		this.parttimes = parttimes;
		this.works = works;
		this.emails = emails;
		this.studies = studies;
	}

	// Property accessors

	public Integer getPerid() {
		return this.perid;
	}

	public void setPerid(Integer perid) {
		this.perid = perid;
	}

	public String getUseId() {
		return this.useId;
	}

	public void setUseId(String useId) {
		this.useId = useId;
	}

	public Date getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getPolitical() {
		return this.political;
	}

	public void setPolitical(String political) {
		this.political = political;
	}

	public String getNativePlace() {
		return this.nativePlace;
	}

	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}

	public String getRace() {
		return this.race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getIdNum() {
		return this.idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	public String getPost() {
		return this.post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getTp() {
		return this.tp;
	}

	public void setTp(String tp) {
		this.tp = tp;
	}

	public String getWorkAd() {
		return this.workAd;
	}

	public void setWorkAd(String workAd) {
		this.workAd = workAd;
	}

	public String getWorkPh() {
		return this.workPh;
	}

	public void setWorkPh(String workPh) {
		this.workPh = workPh;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAd() {
		return this.ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getTType() {
		return this.TType;
	}

	public void setTType(String TType) {
		this.TType = TType;
	}

	public String getDir() {
		return this.dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public Set getAchieves() {
		return this.achieves;
	}

	public void setAchieves(Set achieves) {
		this.achieves = achieves;
	}

	public Set getMajors() {
		return this.majors;
	}

	public void setMajors(Set majors) {
		this.majors = majors;
	}

	public Set getParttimes() {
		return this.parttimes;
	}

	public void setParttimes(Set parttimes) {
		this.parttimes = parttimes;
	}

	public Set getWorks() {
		return this.works;
	}

	public void setWorks(Set works) {
		this.works = works;
	}

	public Set getEmails() {
		return this.emails;
	}

	public void setEmails(Set emails) {
		this.emails = emails;
	}

	public Set getStudies() {
		return this.studies;
	}

	public void setStudies(Set studies) {
		this.studies = studies;
	}

}