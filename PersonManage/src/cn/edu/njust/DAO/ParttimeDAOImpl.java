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
 * Parttime entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.edu.njust.DAO.Parttime
 * @author MyEclipse Persistence Tools
 */

public class ParttimeDAOImpl extends BaseDAOImpl<Parttime> implements ParttimeDAO {
	private static final Log log = LogFactory.getLog(ParttimeDAOImpl.class);
	// property constants
	public static final String NAME = "name";

	public Parttime findById(java.lang.Integer id) {
		log.debug("getting Parttime instance with id: " + id);
		try {
			Parttime instance = (Parttime) getHibernateTemplate().get(
					"cn.edu.njust.DAO.Parttime", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Parttime instance) {
		log.debug("finding Parttime instance by example");
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
		log.debug("finding Parttime instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Parttime as model where model."
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

	public List findAll() {
		log.debug("finding all Parttime instances");
		try {
			String queryString = "from Parttime";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Parttime merge(Parttime detachedInstance) {
		log.debug("merging Parttime instance");
		try {
			Parttime result = (Parttime) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Parttime instance) {
		log.debug("attaching dirty Parttime instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Parttime instance) {
		log.debug("attaching clean Parttime instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ParttimeDAOImpl getFromApplicationContext(ApplicationContext ctx) {
		return (ParttimeDAOImpl) ctx.getBean("ParttimeDAO");
	}
}