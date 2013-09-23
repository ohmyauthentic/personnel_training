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
 * Honour entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.edu.njust.DAO.Honour
 * @author MyEclipse Persistence Tools
 */

public class HonourDAOImpl extends BaseDAOImpl<Honour> implements HonourDAO{
	private static final Log log = LogFactory.getLog(HonourDAOImpl.class);
	// property constants
	public static final String NAME = "name";
	public static final String LEVEL = "level";
	public static final String FLAG = "flag";

	
	public Honour findById(java.lang.Integer id) {
		log.debug("getting Honour instance with id: " + id);
		try {
			Honour instance = (Honour) getHibernateTemplate().get(
					"cn.edu.njust.DAO.Honour", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Honour instance) {
		log.debug("finding Honour instance by example");
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
		log.debug("finding Honour instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Honour as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByLevel(Object level) {
		return findByProperty(LEVEL, level);
	}

	public List findByFlag(Object flag) {
		return findByProperty(FLAG, flag);
	}

	public List findAll() {
		log.debug("finding all Honour instances");
		try {
			String queryString = "from Honour";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Honour merge(Honour detachedInstance) {
		log.debug("merging Honour instance");
		try {
			Honour result = (Honour) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Honour instance) {
		log.debug("attaching dirty Honour instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Honour instance) {
		log.debug("attaching clean Honour instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static HonourDAOImpl getFromApplicationContext(ApplicationContext ctx) {
		return (HonourDAOImpl) ctx.getBean("HonourDAO");
	}
}