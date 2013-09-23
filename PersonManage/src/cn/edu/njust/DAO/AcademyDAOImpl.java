package cn.edu.njust.DAO;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import cn.edu.njust.PO.*;
/**
 * A data access object (DAO) providing persistence and search support for
 * Academy entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.edu.njust.DAO.Academy
 * @author MyEclipse Persistence Tools
 */

public class AcademyDAOImpl extends BaseDAOImpl<Academy> implements AcademyDAO{
	private static final Log log = LogFactory.getLog(AcademyDAOImpl.class);
	// property constants
	public static final String NAME = "name";
	public static final String FLAG = "flag";
	public Academy findById(java.lang.Integer id) {
		log.debug("getting Academy instance with id: " + id);
		try {
			Academy instance = (Academy) getHibernateTemplate().get(
					"cn.edu.njust.PO.Academy", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
	
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Academy instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Academy as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByFlag(Object flag) {
		return findByProperty(FLAG, flag);
	}

	public List findAll() {
		log.debug("finding all Academy instances");
		try {			
			String queryString = "from Academy";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
}