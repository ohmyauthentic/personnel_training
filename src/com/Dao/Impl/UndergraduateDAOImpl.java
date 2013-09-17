package com.Dao.Impl;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.Dao.UndergraduateDao;
import com.pojo.Undergraduate;

/**
 * A data access object (DAO) providing persistence and search support for
 * Undergraduate entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.pojo.Undergraduate
 * @author MyEclipse Persistence Tools
 */
public class UndergraduateDAOImpl extends HibernateDaoSupport implements UndergraduateDao {
	private static final Logger log = LoggerFactory
			.getLogger(UndergraduateDAOImpl.class);
	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.UndergraduateDao#save(com.pojo.Undergraduate)
	 */
	@Override
	public void save(Undergraduate transientInstance) {
		log.debug("saving Undergraduate instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.UndergraduateDao#delete(com.pojo.Undergraduate)
	 */
	@Override
	public void delete(Undergraduate persistentInstance) {
		log.debug("deleting Undergraduate instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.UndergraduateDao#findById(java.lang.String)
	 */
	@Override
	public Undergraduate findById(java.lang.String id) {
		log.debug("getting Undergraduate instance with id: " + id);
		try {
			Undergraduate instance = (Undergraduate) getHibernateTemplate()
					.get("com.pojo.Undergraduate", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.UndergraduateDao#findByExample(com.pojo.Undergraduate)
	 */
	@Override
	public List findByExample(Undergraduate instance) {
		log.debug("finding Undergraduate instance by example");
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
	 * @see com.DaoImpl.UndergraduateDao#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Undergraduate instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Undergraduate as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.UndergraduateDao#findByStuName(java.lang.Object)
	 */
	@Override
	public List findByStuName(Object stuName) {
		return findByProperty(STU_NAME, stuName);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.UndergraduateDao#findBySex(java.lang.Object)
	 */
	@Override
	public List findBySex(Object sex) {
		return findByProperty(SEX, sex);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.UndergraduateDao#findByDepartment(java.lang.Object)
	 */
	@Override
	public List findByDepartment(Object department) {
		return findByProperty(DEPARTMENT, department);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.UndergraduateDao#findByMajor(java.lang.Object)
	 */
	@Override
	public List findByMajor(Object major) {
		return findByProperty(MAJOR, major);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.UndergraduateDao#findByGrade(java.lang.Object)
	 */
	@Override
	public List findByGrade(Object grade) {
		return findByProperty(GRADE, grade);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.UndergraduateDao#findByRemarks(java.lang.Object)
	 */
	@Override
	public List findByRemarks(Object remarks) {
		return findByProperty(REMARKS, remarks);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.UndergraduateDao#findByState(java.lang.Object)
	 */
	@Override
	public List findByState(Object state) {
		return findByProperty(STATE, state);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.UndergraduateDao#findByGraduateNum(java.lang.Object)
	 */
	@Override
	public List findByGraduateNum(Object graduateNum) {
		return findByProperty(GRADUATE_NUM, graduateNum);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.UndergraduateDao#findByDegreeNum(java.lang.Object)
	 */
	@Override
	public List findByDegreeNum(Object degreeNum) {
		return findByProperty(DEGREE_NUM, degreeNum);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.UndergraduateDao#findByIdEmployed(java.lang.Object)
	 */
	@Override
	public List findByIdEmployed(Object idEmployed) {
		return findByProperty(ID_EMPLOYED, idEmployed);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.UndergraduateDao#findByGraduateDirection(java.lang.Object)
	 */
	@Override
	public List findByGraduateDirection(Object graduateDirection) {
		return findByProperty(GRADUATE_DIRECTION, graduateDirection);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.UndergraduateDao#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Undergraduate instances");
		try {
			String queryString = "from Undergraduate";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.UndergraduateDao#merge(com.pojo.Undergraduate)
	 */
	@Override
	public Undergraduate merge(Undergraduate detachedInstance) {
		log.debug("merging Undergraduate instance");
		try {
			Undergraduate result = (Undergraduate) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.UndergraduateDao#attachDirty(com.pojo.Undergraduate)
	 */
	@Override
	public void attachDirty(Undergraduate instance) {
		log.debug("attaching dirty Undergraduate instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.UndergraduateDao#attachClean(com.pojo.Undergraduate)
	 */
	@Override
	public void attachClean(Undergraduate instance) {
		log.debug("attaching clean Undergraduate instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static UndergraduateDao getFromApplicationContext(
			ApplicationContext ctx) {
		return (UndergraduateDao) ctx.getBean("UndergraduateDAO");
	}
}