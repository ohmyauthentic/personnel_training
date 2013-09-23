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
 * A data access object (DAO) providing persistence and search support for Work
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see cn.edu.njust.DAO.Work
 * @author MyEclipse Persistence Tools
 */

public class WorkDAOImpl extends BaseDAOImpl<Work> implements WorkDAO{
	private static final Log log = LogFactory.getLog(WorkDAOImpl.class);
	// property constants
	public static final String UNIT = "unit";
	public static final String DEPARTMENT = "department";
	public static final String POST = "post";

	public Work findById(java.lang.Integer id) {
		log.debug("getting Work instance with id: " + id);
		try {
			Work instance = (Work) getHibernateTemplate().get(
					"cn.edu.njust.DAO.Work", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Work instance) {
		log.debug("finding Work instance by example");
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
		log.debug("finding Work instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Work as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUnit(Object unit) {
		return findByProperty(UNIT, unit);
	}

	public List findByDepartment(Object department) {
		return findByProperty(DEPARTMENT, department);
	}

	public List findByPost(Object post) {
		return findByProperty(POST, post);
	}

	public List findAll() {
		log.debug("finding all Work instances");
		try {
			String queryString = "from Work";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Work merge(Work detachedInstance) {
		log.debug("merging Work instance");
		try {
			Work result = (Work) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Work instance) {
		log.debug("attaching dirty Work instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Work instance) {
		log.debug("attaching clean Work instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static WorkDAOImpl getFromApplicationContext(ApplicationContext ctx) {
		return (WorkDAOImpl) ctx.getBean("WorkDAO");
	}
}