package cn.edu.njust.DAO;
import cn.edu.njust.PO.*;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Supuser entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.edu.njust.DAO.Supuser
 * @author MyEclipse Persistence Tools
 */

public class SupuserDAOImpl extends BaseDAOImpl<Supuser> implements SupuserDAO {
	private static final Log log = LogFactory.getLog(SupuserDAOImpl.class);
	// property constants
	public static final String USE_ID = "useId";
	public static final String PASSWORD = "password";
	public static final String ACADEMY = "academy";

	
	public Supuser findById(java.lang.Integer id) {
		log.debug("getting Supuser instance with id: " + id);
		try {
			Supuser instance = (Supuser) getHibernateTemplate().get(
					"cn.edu.njust.DAO.Supuser", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Supuser instance) {
		log.debug("finding Supuser instance by example");
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
		log.debug("finding Supuser instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Supuser as model where model."
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

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List findByAcademy(Object academy) {
		return findByProperty(ACADEMY, academy);
	}

	public List findAll() {
		log.debug("finding all Supuser instances");
		try {
			String queryString = "from Supuser";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Supuser merge(Supuser detachedInstance) {
		log.debug("merging Supuser instance");
		try {
			Supuser result = (Supuser) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Supuser instance) {
		log.debug("attaching dirty Supuser instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Supuser instance) {
		log.debug("attaching clean Supuser instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SupuserDAOImpl getFromApplicationContext(ApplicationContext ctx) {
		return (SupuserDAOImpl) ctx.getBean("SupuserDAO");
	}
	public List findUserAndPWD(String userId,String password){
		String hql="from Supuser u where u.useId='"+userId+"' and u.password='"+password+"'";
		return getHibernateTemplate().find(hql);
	}
}