package com.Dao.Impl;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.Dao.TeacherDao;
import com.pojo.Teacher;

/**
 * A data access object (DAO) providing persistence and search support for
 * Teacher entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.pojo.Teacher
 * @author MyEclipse Persistence Tools
 */
public class TeacherDAOImpl extends HibernateDaoSupport implements TeacherDao {
	private static final Logger log = LoggerFactory.getLogger(TeacherDAOImpl.class);
	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.TeacherDao#save(com.pojo.Teacher)
	 */
	@Override
	public void save(Teacher transientInstance) {
		log.debug("saving Teacher instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.TeacherDao#delete(com.pojo.Teacher)
	 */
	@Override
	public void delete(Teacher persistentInstance) {
		log.debug("deleting Teacher instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.TeacherDao#findById(java.lang.String)
	 */
	@Override
	public Teacher findById(java.lang.String id) {
		log.debug("getting Teacher instance with id: " + id);
		try {
			Teacher instance = (Teacher) getHibernateTemplate().get(
					"com.pojo.Teacher", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.TeacherDao#findByExample(com.pojo.Teacher)
	 */
	@Override
	public List findByExample(Teacher instance) {
		log.debug("finding Teacher instance by example");
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
	 * @see com.DaoImpl.TeacherDao#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Teacher instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Teacher as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.TeacherDao#findByDepartment(java.lang.Object)
	 */
	@Override
	public List findByDepartment(Object department) {
		return findByProperty(DEPARTMENT, department);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.TeacherDao#findByTeacherName(java.lang.Object)
	 */
	@Override
	public List findByTeacherName(Object teacherName) {
		return findByProperty(TEACHER_NAME, teacherName);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.TeacherDao#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Teacher instances");
		try {
			String queryString = "from Teacher";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.TeacherDao#merge(com.pojo.Teacher)
	 */
	@Override
	public Teacher merge(Teacher detachedInstance) {
		log.debug("merging Teacher instance");
		try {
			Teacher result = (Teacher) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.TeacherDao#attachDirty(com.pojo.Teacher)
	 */
	@Override
	public void attachDirty(Teacher instance) {
		log.debug("attaching dirty Teacher instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.TeacherDao#attachClean(com.pojo.Teacher)
	 */
	@Override
	public void attachClean(Teacher instance) {
		log.debug("attaching clean Teacher instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TeacherDao getFromApplicationContext(ApplicationContext ctx) {
		return (TeacherDao) ctx.getBean("TeacherDAO");
	}
}