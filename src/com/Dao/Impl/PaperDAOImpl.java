package com.Dao.Impl;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.Dao.PaperDao;
import com.pojo.Paper;

/**
 * A data access object (DAO) providing persistence and search support for Paper
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.pojo.Paper
 * @author MyEclipse Persistence Tools
 */
public class PaperDAOImpl extends HibernateDaoSupport implements PaperDao {
	private static final Logger log = LoggerFactory.getLogger(PaperDAOImpl.class);
	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PaperDao#save(com.pojo.Paper)
	 */
	@Override
	public void save(Paper transientInstance) {
		log.debug("saving Paper instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PaperDao#delete(com.pojo.Paper)
	 */
	@Override
	public void delete(Paper persistentInstance) {
		log.debug("deleting Paper instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PaperDao#findById(java.lang.String)
	 */
	@Override
	public Paper findById(java.lang.String id) {
		log.debug("getting Paper instance with id: " + id);
		try {
			Paper instance = (Paper) getHibernateTemplate().get(
					"com.pojo.Paper", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PaperDao#findByExample(com.pojo.Paper)
	 */
	@Override
	public List findByExample(Paper instance) {
		log.debug("finding Paper instance by example");
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
	 * @see com.DaoImpl.PaperDao#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Paper instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Paper as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PaperDao#findByPaperName(java.lang.Object)
	 */
	@Override
	public List findByPaperName(Object paperName) {
		return findByProperty(PAPER_NAME, paperName);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PaperDao#findByRewardSort(java.lang.Object)
	 */
	@Override
	public List findByRewardSort(Object rewardSort) {
		return findByProperty(REWARD_SORT, rewardSort);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PaperDao#findByIsCheck(java.lang.Object)
	 */
	@Override
	public List findByIsCheck(Object isCheck) {
		return findByProperty(IS_CHECK, isCheck);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PaperDao#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Paper instances");
		try {
			String queryString = "from Paper";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PaperDao#merge(com.pojo.Paper)
	 */
	@Override
	public Paper merge(Paper detachedInstance) {
		log.debug("merging Paper instance");
		try {
			Paper result = (Paper) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PaperDao#attachDirty(com.pojo.Paper)
	 */
	@Override
	public void attachDirty(Paper instance) {
		log.debug("attaching dirty Paper instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PaperDao#attachClean(com.pojo.Paper)
	 */
	@Override
	public void attachClean(Paper instance) {
		log.debug("attaching clean Paper instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PaperDao getFromApplicationContext(ApplicationContext ctx) {
		return (PaperDao) ctx.getBean("PaperDAO");
	}
}