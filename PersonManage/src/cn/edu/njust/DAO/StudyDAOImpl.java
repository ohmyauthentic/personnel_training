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
 * A data access object (DAO) providing persistence and search support for Study
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see cn.edu.njust.DAO.Study
 * @author MyEclipse Persistence Tools
 */

public class StudyDAOImpl extends BaseDAOImpl<Study> implements StudyDAO{
	private static final Log log = LogFactory.getLog(StudyDAOImpl.class);
	// property constants
	public static final String COLLEGE = "college";
	public static final String MAJOR = "major";
	public static final String DEGREE = "degree";
	public static final String EDU_BK = "eduBk";
	public static final String _ALEVELS = "ALevels";
	public static final String _EFLAG = "EFlag";
	public static final String _DFLAG = "DFlag";

	

	public Study findById(java.lang.Integer id) {
		log.debug("getting Study instance with id: " + id);
		try {
			Study instance = (Study) getHibernateTemplate().get(
					"cn.edu.njust.DAO.Study", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Study instance) {
		log.debug("finding Study instance by example");
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
		log.debug("finding Study instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Study as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCollege(Object college) {
		return findByProperty(COLLEGE, college);
	}

	public List findByMajor(Object major) {
		return findByProperty(MAJOR, major);
	}

	public List findByDegree(Object degree) {
		return findByProperty(DEGREE, degree);
	}

	public List findByEduBk(Object eduBk) {
		return findByProperty(EDU_BK, eduBk);
	}

	public List findByALevels(Object ALevels) {
		return findByProperty(_ALEVELS, ALevels);
	}

	public List findByEFlag(Object EFlag) {
		return findByProperty(_EFLAG, EFlag);
	}

	public List findByDFlag(Object DFlag) {
		return findByProperty(_DFLAG, DFlag);
	}

	public List findAll() {
		log.debug("finding all Study instances");
		try {
			String queryString = "from Study";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Study merge(Study detachedInstance) {
		log.debug("merging Study instance");
		try {
			Study result = (Study) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Study instance) {
		log.debug("attaching dirty Study instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Study instance) {
		log.debug("attaching clean Study instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static StudyDAOImpl getFromApplicationContext(ApplicationContext ctx) {
		return (StudyDAOImpl) ctx.getBean("StudyDAO");
	}
}