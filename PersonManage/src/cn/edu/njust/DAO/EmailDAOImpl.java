package cn.edu.njust.DAO;
import cn.edu.njust.PO.*;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Email
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see cn.edu.njust.DAO.Email
 * @author MyEclipse Persistence Tools
 */

public class EmailDAOImpl extends BaseDAOImpl<Email> implements EmailDAO{
	private static final Log log = LogFactory.getLog(EmailDAOImpl.class);
	// property constants
	public static final String EMAIL = "email";

	public Email findById(java.lang.Integer id) {
		log.debug("getting Email instance with id: " + id);
		try {
			Email instance = (Email) getHibernateTemplate().get(
					"cn.edu.njust.DAO.Email", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Email instance) {
		log.debug("finding Email instance by example");
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
		log.debug("finding Email instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Email as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List findAll() {
		log.debug("finding all Email instances");
		try {
			String queryString = "from Email";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Email merge(Email detachedInstance) {
		log.debug("merging Email instance");
		try {
			Email result = (Email) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Email instance) {
		log.debug("attaching dirty Email instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Email instance) {
		log.debug("attaching clean Email instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EmailDAOImpl getFromApplicationContext(ApplicationContext ctx) {
		return (EmailDAOImpl) ctx.getBean("EmailDAO");
	}
}