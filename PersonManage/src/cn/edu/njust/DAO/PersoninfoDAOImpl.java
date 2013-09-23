package cn.edu.njust.DAO;
import cn.edu.njust.PO.*;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Personinfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.edu.njust.DAO.Personinfo
 * @author MyEclipse Persistence Tools
 */

public class PersoninfoDAOImpl extends BaseDAOImpl<Personinfo>  implements PersoninfoDAO{
	private static final Log log = LogFactory.getLog(PersoninfoDAOImpl.class);
	// property constants
	public static final String USE_ID = "useId";
	public static final String SEX = "sex";
	public static final String POLITICAL = "political";
	public static final String NATIVE_PLACE = "nativePlace";
	public static final String RACE = "race";
	public static final String ID_NUM = "idNum";
	public static final String POST = "post";
	public static final String TP = "tp";
	public static final String WORK_AD = "workAd";
	public static final String WORK_PH = "workPh";
	public static final String MOBILE = "mobile";
	public static final String AD = "ad";
	public static final String _TTYPE = "TType";
	public static final String DIR = "dir";

	
	public Personinfo findById(java.lang.Integer id) {
		log.debug("getting Personinfo instance with id: " + id);
		try {
			Personinfo instance = (Personinfo) getHibernateTemplate().get(
					"cn.edu.njust.DAO.Personinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Personinfo instance) {
		log.debug("finding Personinfo instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Personinfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Personinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUseId(Object useId) {
		return findByProperty(USE_ID, useId);
	}

	public List findBySex(Object sex) {
		return findByProperty(SEX, sex);
	}

	public List findByPolitical(Object political) {
		return findByProperty(POLITICAL, political);
	}

	public List findByNativePlace(Object nativePlace) {
		return findByProperty(NATIVE_PLACE, nativePlace);
	}

	public List findByRace(Object race) {
		return findByProperty(RACE, race);
	}

	public List findByIdNum(Object idNum) {
		return findByProperty(ID_NUM, idNum);
	}

	public List findByPost(Object post) {
		return findByProperty(POST, post);
	}

	public List findByTp(Object tp) {
		return findByProperty(TP, tp);
	}

	public List findByWorkAd(Object workAd) {
		return findByProperty(WORK_AD, workAd);
	}

	public List findByWorkPh(Object workPh) {
		return findByProperty(WORK_PH, workPh);
	}

	public List findByMobile(Object mobile) {
		return findByProperty(MOBILE, mobile);
	}

	public List findByAd(Object ad) {
		return findByProperty(AD, ad);
	}

	public List findByTType(Object TType) {
		return findByProperty(_TTYPE, TType);
	}

	public List findByDir(Object dir) {
		return findByProperty(DIR, dir);
	}

	public List findAll() {
		log.debug("finding all Personinfo instances");
		try {
			String queryString = "from Personinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Personinfo merge(Personinfo detachedInstance) {
		log.debug("merging Personinfo instance");
		try {
			Personinfo result = (Personinfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Personinfo instance) {
		log.debug("attaching dirty Personinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Personinfo instance) {
		log.debug("attaching clean Personinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PersoninfoDAOImpl getFromApplicationContext(ApplicationContext ctx) {
		return (PersoninfoDAOImpl) ctx.getBean("PersoninfoDAO");
	}
}