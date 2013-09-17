package com.Dao.Impl;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.Dao.SendPaperDao;
import com.pojo.SendPaper;

/**
 * A data access object (DAO) providing persistence and search support for
 * SendPaper entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.pojo.SendPaper
 * @author MyEclipse Persistence Tools
 */
public class SendPaperDAOImpl extends HibernateDaoSupport implements SendPaperDao {
	private static final Logger log = LoggerFactory
			.getLogger(SendPaperDAOImpl.class);
	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.SendPaperDao#save(com.pojo.SendPaper)
	 */
	@Override
	public void save(SendPaper transientInstance) {
		log.debug("saving SendPaper instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.SendPaperDao#delete(com.pojo.SendPaper)
	 */
	@Override
	public void delete(SendPaper persistentInstance) {
		log.debug("deleting SendPaper instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.SendPaperDao#findById(java.lang.String)
	 */
	@Override
	public SendPaper findById(java.lang.String id) {
		log.debug("getting SendPaper instance with id: " + id);
		try {
			SendPaper instance = (SendPaper) getHibernateTemplate().get(
					"com.pojo.SendPaper", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.SendPaperDao#findByExample(com.pojo.SendPaper)
	 */
	@Override
	public List findByExample(SendPaper instance) {
		log.debug("finding SendPaper instance by example");
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
	 * @see com.DaoImpl.SendPaperDao#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding SendPaper instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SendPaper as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.SendPaperDao#findByResult(java.lang.Object)
	 */
	@Override
	public List findByResult(Object result) {
		return findByProperty(RESULT, result);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.SendPaperDao#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all SendPaper instances");
		try {
			String queryString = "from SendPaper";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.SendPaperDao#merge(com.pojo.SendPaper)
	 */
	@Override
	public SendPaper merge(SendPaper detachedInstance) {
		log.debug("merging SendPaper instance");
		try {
			SendPaper result = (SendPaper) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.SendPaperDao#attachDirty(com.pojo.SendPaper)
	 */
	@Override
	public void attachDirty(SendPaper instance) {
		log.debug("attaching dirty SendPaper instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.SendPaperDao#attachClean(com.pojo.SendPaper)
	 */
	@Override
	public void attachClean(SendPaper instance) {
		log.debug("attaching clean SendPaper instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SendPaperDao getFromApplicationContext(ApplicationContext ctx) {
		return (SendPaperDao) ctx.getBean("SendPaperDAO");
	}
}