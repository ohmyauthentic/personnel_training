package com.Dao.Impl;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.Dao.PostGraduateDao;
import com.pojo.PostGraduate;

/**
 * A data access object (DAO) providing persistence and search support for
 * PostGraduate entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.pojo.PostGraduate
 * @author MyEclipse Persistence Tools
 */
public class PostGraduateDAOImpl extends HibernateDaoSupport implements PostGraduateDao {
	private static final Logger log = LoggerFactory
			.getLogger(PostGraduateDAOImpl.class);
	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PostGraduateDao#save(com.pojo.PostGraduate)
	 */
	@Override
	public void save(PostGraduate transientInstance) {
		log.debug("saving PostGraduate instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PostGraduateDao#delete(com.pojo.PostGraduate)
	 */
	@Override
	public void delete(PostGraduate persistentInstance) {
		log.debug("deleting PostGraduate instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PostGraduateDao#findById(java.lang.String)
	 */
	@Override
	public PostGraduate findById(java.lang.String id) {
		log.debug("getting PostGraduate instance with id: " + id);
		try {
			PostGraduate instance = (PostGraduate) getHibernateTemplate().get(
					"com.pojo.PostGraduate", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PostGraduateDao#findByExample(com.pojo.PostGraduate)
	 */
	@Override
	public List findByExample(PostGraduate instance) {
		log.debug("finding PostGraduate instance by example");
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
	 * @see com.DaoImpl.PostGraduateDao#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding PostGraduate instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from PostGraduate as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PostGraduateDao#findByStuName(java.lang.Object)
	 */
	@Override
	public List findByStuName(Object stuName) {
		return findByProperty(STU_NAME, stuName);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PostGraduateDao#findBySex(java.lang.Object)
	 */
	@Override
	public List findBySex(Object sex) {
		return findByProperty(SEX, sex);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PostGraduateDao#findByStuSort(java.lang.Object)
	 */
	@Override
	public List findByStuSort(Object stuSort) {
		return findByProperty(STU_SORT, stuSort);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PostGraduateDao#findByType(java.lang.Object)
	 */
	@Override
	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PostGraduateDao#findByDepartment(java.lang.Object)
	 */
	@Override
	public List findByDepartment(Object department) {
		return findByProperty(DEPARTMENT, department);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PostGraduateDao#findByMajor(java.lang.Object)
	 */
	@Override
	public List findByMajor(Object major) {
		return findByProperty(MAJOR, major);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PostGraduateDao#findByGrade(java.lang.Object)
	 */
	@Override
	public List findByGrade(Object grade) {
		return findByProperty(GRADE, grade);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PostGraduateDao#findByResearchDirection(java.lang.Object)
	 */
	@Override
	public List findByResearchDirection(Object researchDirection) {
		return findByProperty(RESEARCH_DIRECTION, researchDirection);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PostGraduateDao#findByTrainSort(java.lang.Object)
	 */
	@Override
	public List findByTrainSort(Object trainSort) {
		return findByProperty(TRAIN_SORT, trainSort);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PostGraduateDao#findByTeacher(java.lang.Object)
	 */
	@Override
	public List findByTeacher(Object teacher) {
		return findByProperty(TEACHER, teacher);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PostGraduateDao#findByRemarks(java.lang.Object)
	 */
	@Override
	public List findByRemarks(Object remarks) {
		return findByProperty(REMARKS, remarks);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PostGraduateDao#findByState(java.lang.Object)
	 */
	@Override
	public List findByState(Object state) {
		return findByProperty(STATE, state);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PostGraduateDao#findByGraduateNum(java.lang.Object)
	 */
	@Override
	public List findByGraduateNum(Object graduateNum) {
		return findByProperty(GRADUATE_NUM, graduateNum);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PostGraduateDao#findByDegreeNum(java.lang.Object)
	 */
	@Override
	public List findByDegreeNum(Object degreeNum) {
		return findByProperty(DEGREE_NUM, degreeNum);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PostGraduateDao#findByIdEmployed(java.lang.Object)
	 */
	@Override
	public List findByIdEmployed(Object idEmployed) {
		return findByProperty(ID_EMPLOYED, idEmployed);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PostGraduateDao#findByGraduateDirection(java.lang.Object)
	 */
	@Override
	public List findByGraduateDirection(Object graduateDirection) {
		return findByProperty(GRADUATE_DIRECTION, graduateDirection);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PostGraduateDao#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all PostGraduate instances");
		try {
			String queryString = "from PostGraduate";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PostGraduateDao#merge(com.pojo.PostGraduate)
	 */
	@Override
	public PostGraduate merge(PostGraduate detachedInstance) {
		log.debug("merging PostGraduate instance");
		try {
			PostGraduate result = (PostGraduate) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PostGraduateDao#attachDirty(com.pojo.PostGraduate)
	 */
	@Override
	public void attachDirty(PostGraduate instance) {
		log.debug("attaching dirty PostGraduate instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.PostGraduateDao#attachClean(com.pojo.PostGraduate)
	 */
	@Override
	public void attachClean(PostGraduate instance) {
		log.debug("attaching clean PostGraduate instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PostGraduateDao getFromApplicationContext(
			ApplicationContext ctx) {
		return (PostGraduateDao) ctx.getBean("PostGraduateDAO");
	}
}