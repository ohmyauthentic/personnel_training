package com.Dao.Impl;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.Dao.ProjectDao;
import com.pojo.Project;

/**
 * A data access object (DAO) providing persistence and search support for
 * Project entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.pojo.Project
 * @author MyEclipse Persistence Tools
 */
public class ProjectDAOImpl extends HibernateDaoSupport implements ProjectDao {
	private static final Logger log = LoggerFactory.getLogger(ProjectDAOImpl.class);
	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.ProjectDao#save(com.pojo.Project)
	 */
	@Override
	public void save(Project transientInstance) {
		log.debug("saving Project instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.ProjectDao#delete(com.pojo.Project)
	 */
	@Override
	public void delete(Project persistentInstance) {
		log.debug("deleting Project instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.ProjectDao#findById(java.lang.String)
	 */
	@Override
	public Project findById(java.lang.String id) {
		log.debug("getting Project instance with id: " + id);
		try {
			Project instance = (Project) getHibernateTemplate().get(
					"com.pojo.Project", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.ProjectDao#findByExample(com.pojo.Project)
	 */
	@Override
	public List findByExample(Project instance) {
		log.debug("finding Project instance by example");
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
	 * @see com.DaoImpl.ProjectDao#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Project instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Project as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.ProjectDao#findByStuId(java.lang.Object)
	 */
	@Override
	public List findByStuId(Object stuId) {
		return findByProperty(STU_ID, stuId);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.ProjectDao#findByTeacher(java.lang.Object)
	 */
	@Override
	public List findByTeacher(Object teacher) {
		return findByProperty(TEACHER, teacher);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.ProjectDao#findByDepartment(java.lang.Object)
	 */
	@Override
	public List findByDepartment(Object department) {
		return findByProperty(DEPARTMENT, department);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.ProjectDao#findByProjectName(java.lang.Object)
	 */
	@Override
	public List findByProjectName(Object projectName) {
		return findByProperty(PROJECT_NAME, projectName);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.ProjectDao#findBySort(java.lang.Object)
	 */
	@Override
	public List findBySort(Object sort) {
		return findByProperty(SORT, sort);
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.ProjectDao#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Project instances");
		try {
			String queryString = "from Project";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.ProjectDao#merge(com.pojo.Project)
	 */
	@Override
	public Project merge(Project detachedInstance) {
		log.debug("merging Project instance");
		try {
			Project result = (Project) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.ProjectDao#attachDirty(com.pojo.Project)
	 */
	@Override
	public void attachDirty(Project instance) {
		log.debug("attaching dirty Project instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.DaoImpl.ProjectDao#attachClean(com.pojo.Project)
	 */
	@Override
	public void attachClean(Project instance) {
		log.debug("attaching clean Project instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ProjectDao getFromApplicationContext(ApplicationContext ctx) {
		return (ProjectDao) ctx.getBean("ProjectDAO");
	}
}