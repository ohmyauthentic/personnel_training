package com.Dao.Impl;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.Dao.PaperCheckDao;
import com.pojo.PaperCheck;

/**
 * A data access object (DAO) providing persistence and search support for
 * PaperCheck entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.pojo.PaperCheck
 * @author MyEclipse Persistence Tools
 */
public class PaperCheckDAOImpl extends HibernateDaoSupport implements PaperCheckDao {
	private static final Logger log = LoggerFactory
			.getLogger(PaperCheckDAOImpl.class);
	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PaperCheckDao#save(com.pojo.PaperCheck)
	 */
	@Override
	public void save(PaperCheck transientInstance) {
		log.debug("saving PaperCheck instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PaperCheckDao#delete(com.pojo.PaperCheck)
	 */
	@Override
	public void delete(PaperCheck persistentInstance) {
		log.debug("deleting PaperCheck instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PaperCheckDao#findById(java.lang.String)
	 */
	@Override
	public PaperCheck findById(java.lang.String id) {
		log.debug("getting PaperCheck instance with id: " + id);
		try {
			PaperCheck instance = (PaperCheck) getHibernateTemplate().get(
					"com.pojo.PaperCheck", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PaperCheckDao#findByExample(com.pojo.PaperCheck)
	 */
	@Override
	public List findByExample(PaperCheck instance) {
		log.debug("finding PaperCheck instance by example");
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

	/* (non-Javadoc)
	 * @see com.DaoImpl.PaperCheckDao#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding PaperCheck instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PaperCheck as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PaperCheckDao#findByCheckResult(java.lang.Object)
	 */
	@Override
	public List findByCheckResult(Object checkResult) {
		return findByProperty(CHECK_RESULT, checkResult);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PaperCheckDao#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all PaperCheck instances");
		try {
			String queryString = "from PaperCheck";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PaperCheckDao#merge(com.pojo.PaperCheck)
	 */
	@Override
	public PaperCheck merge(PaperCheck detachedInstance) {
		log.debug("merging PaperCheck instance");
		try {
			PaperCheck result = (PaperCheck) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PaperCheckDao#attachDirty(com.pojo.PaperCheck)
	 */
	@Override
	public void attachDirty(PaperCheck instance) {
		log.debug("attaching dirty PaperCheck instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PaperCheckDao#attachClean(com.pojo.PaperCheck)
	 */
	@Override
	public void attachClean(PaperCheck instance) {
		log.debug("attaching clean PaperCheck instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PaperCheckDao getFromApplicationContext(ApplicationContext ctx) {
		return (PaperCheckDao) ctx.getBean("PaperCheckDAO");
	}
}