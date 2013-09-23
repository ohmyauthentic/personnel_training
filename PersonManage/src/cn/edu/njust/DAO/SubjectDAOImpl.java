package cn.edu.njust.DAO;
import cn.edu.njust.PO.*;
import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Subject entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.edu.njust.DAO.Subject
 * @author MyEclipse Persistence Tools
 */

public class SubjectDAOImpl extends BaseDAOImpl<Subject> implements SubjectDAO{
	private static final Log log = LogFactory.getLog(SubjectDAOImpl.class);
	// property constants
	public static final String CODE = "code";
	public static final String NAME = "name";
	public static final String LEVEL = "level";
	public static final String _ALEVELS = "ALevels";
	public static final String FLAG = "flag";

	public Subject findById(java.lang.Integer id) {
		log.debug("getting Subject instance with id: " + id);
		try {
			Subject instance = (Subject) getHibernateTemplate().get(
					"cn.edu.njust.DAO.Subject", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Subject instance) {
		log.debug("finding Subject instance by example");
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
		log.debug("finding Subject instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Subject as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCode(Object code) {
		return findByProperty(CODE, code);
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByLevel(Object level) {
		return findByProperty(LEVEL, level);
	}

	public List findByALevels(Object ALevels) {
		return findByProperty(_ALEVELS, ALevels);
	}

	public List findByFlag(Object flag) {
		return findByProperty(FLAG, flag);
	}

	public List findAll() {
		log.debug("finding all Subject instances");
		try {
			String queryString = "from Subject";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Subject merge(Subject detachedInstance) {
		log.debug("merging Subject instance");
		try {
			Subject result = (Subject) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Subject instance) {
		log.debug("attaching dirty Subject instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Subject instance) {
		log.debug("attaching clean Subject instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SubjectDAOImpl getFromApplicationContext(ApplicationContext ctx) {
		return (SubjectDAOImpl) ctx.getBean("SubjectDAO");
	}
}