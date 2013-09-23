package cn.edu.njust.DAO;
import cn.edu.njust.PO.*;
import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * AcPaper entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.edu.njust.DAO.AcPaper
 * @author MyEclipse Persistence Tools
 */

public class AcPaperDAOImpl extends BaseDAOImpl<AcPaper> implements AcPaperDAO{
	private static final Log log = LogFactory.getLog(AcPaperDAOImpl.class);
	// property constants
	public static final String TITLE = "title";
	public static final String TYPE = "type";
	public static final String CLASS_ = "class_";
	public static final String APPLIER = "applier";
	public static final String DEPARTMENT = "department";
	public static final String TELEPHONE = "telephone";
	public static final String AUTHOR1 = "author1";
	public static final String AUTH_DEP1 = "authDep1";
	public static final String AUTH_JOB1 = "authJob1";
	public static final String AUTHOR2 = "author2";
	public static final String AUTH_DEP2 = "authDep2";
	public static final String AUTH_JOB2 = "authJob2";
	public static final String AUTHOR3 = "author3";
	public static final String AUTH_DEP3 = "authDep3";
	public static final String AUTH_JOB3 = "authJob3";
	public static final String FUND_NAME = "fundName";
	public static final String FUND_ID = "fundId";
	public static final String JOURNAL = "journal";
	public static final String JOURNAL_TYPE = "journalType";
	public static final String ISSN = "issn";
	public static final String CN = "cn";
	public static final String POSITION = "position";
	public static final String CON_TITLE = "conTitle";
	public static final String CON_PLACE = "conPlace";
	public static final String HOST = "host";
	public static final String PUBLISH_NUM = "publishNum";
	public static final String PUBLISHER = "publisher";
	public static final String SUM_WORD = "sumWord";
	public static final String BOOK_NUM = "bookNum";
	public static final String MY_WORD = "myWord";
	public static final String DIGEST = "digest";

	public AcPaper findById(java.lang.Integer id) {
		log.debug("getting AcPaper instance with id: " + id);
		try {
			AcPaper instance = (AcPaper) getHibernateTemplate().get(
					"cn.edu.njust.DAO.AcPaper", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
	
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding AcPaper instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AcPaper as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTitle(Object title) {
		return findByProperty(TITLE, title);
	}

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findByClass_(Object class_) {
		return findByProperty(CLASS_, class_);
	}

	public List findByApplier(Object applier) {
		return findByProperty(APPLIER, applier);
	}

	public List findByDepartment(Object department) {
		return findByProperty(DEPARTMENT, department);
	}

	public List findByTelephone(Object telephone) {
		return findByProperty(TELEPHONE, telephone);
	}

	public List findByAuthor1(Object author1) {
		return findByProperty(AUTHOR1, author1);
	}

	public List findByAuthDep1(Object authDep1) {
		return findByProperty(AUTH_DEP1, authDep1);
	}

	public List findByAuthJob1(Object authJob1) {
		return findByProperty(AUTH_JOB1, authJob1);
	}

	public List findByAuthor2(Object author2) {
		return findByProperty(AUTHOR2, author2);
	}

	public List findByAuthDep2(Object authDep2) {
		return findByProperty(AUTH_DEP2, authDep2);
	}

	public List findByAuthJob2(Object authJob2) {
		return findByProperty(AUTH_JOB2, authJob2);
	}

	public List findByAuthor3(Object author3) {
		return findByProperty(AUTHOR3, author3);
	}

	public List findByAuthDep3(Object authDep3) {
		return findByProperty(AUTH_DEP3, authDep3);
	}

	public List findByAuthJob3(Object authJob3) {
		return findByProperty(AUTH_JOB3, authJob3);
	}

	public List findByFundName(Object fundName) {
		return findByProperty(FUND_NAME, fundName);
	}

	public List findByFundId(Object fundId) {
		return findByProperty(FUND_ID, fundId);
	}

	public List findByJournal(Object journal) {
		return findByProperty(JOURNAL, journal);
	}

	public List findByJournalType(Object journalType) {
		return findByProperty(JOURNAL_TYPE, journalType);
	}

	public List findByIssn(Object issn) {
		return findByProperty(ISSN, issn);
	}

	public List findByCn(Object cn) {
		return findByProperty(CN, cn);
	}

	public List findByPosition(Object position) {
		return findByProperty(POSITION, position);
	}

	public List findByConTitle(Object conTitle) {
		return findByProperty(CON_TITLE, conTitle);
	}

	public List findByConPlace(Object conPlace) {
		return findByProperty(CON_PLACE, conPlace);
	}

	public List findByHost(Object host) {
		return findByProperty(HOST, host);
	}

	public List findByPublishNum(Object publishNum) {
		return findByProperty(PUBLISH_NUM, publishNum);
	}

	public List findByPublisher(Object publisher) {
		return findByProperty(PUBLISHER, publisher);
	}

	public List findBySumWord(Object sumWord) {
		return findByProperty(SUM_WORD, sumWord);
	}

	public List findByBookNum(Object bookNum) {
		return findByProperty(BOOK_NUM, bookNum);
	}

	public List findByMyWord(Object myWord) {
		return findByProperty(MY_WORD, myWord);
	}

	public List findByDigest(Object digest) {
		return findByProperty(DIGEST, digest);
	}

	public List findAll() {
		log.debug("finding all AcPaper instances");
		try {
			String queryString = "from AcPaper";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
}