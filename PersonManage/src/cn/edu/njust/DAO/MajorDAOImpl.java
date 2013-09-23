package cn.edu.njust.DAO;
import cn.edu.njust.PO.*;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Major
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see cn.edu.njust.DAO.Major
 * @author MyEclipse Persistence Tools
 */

public class MajorDAOImpl extends BaseDAOImpl<Major> implements MajorDAO {
	private static final Log log = LogFactory.getLog(MajorDAOImpl.class);

	// property constants

	public Major findById(java.lang.Integer id) {
		log.debug("getting Major instance with id: " + id);
		try {
			Major instance = (Major) getHibernateTemplate().get(
					"cn.edu.njust.DAO.Major", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Major instance) {
		log.debug("finding Major instance by example");
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
		log.debug("finding Major instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Major as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Major instances");
		try {
			String queryString = "from Major";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Major merge(Major detachedInstance) {
		log.debug("merging Major instance");
		try {
			Major result = (Major) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Major instance) {
		log.debug("attaching dirty Major instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Major instance) {
		log.debug("attaching clean Major instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static MajorDAOImpl getFromApplicationContext(ApplicationContext ctx) {
		return (MajorDAOImpl) ctx.getBean("MajorDAO");
	}
}