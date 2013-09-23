package cn.edu.njust.DAO;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import cn.edu.njust.PO.*;
public class ManagerDAOImpl extends BaseDAOImpl<Manager> implements ManagerDAO{
	
	private static final Log log = LogFactory.getLog(ManagerDAOImpl.class);
	// property constants
	public static final String USER_ID = "userId";
	public static final String NAME = "name";
	public static final String PASSWORD = "password";

	public Manager findById(java.lang.Integer id) {
		log.debug("getting Academy instance with id: " + id);
		try {
			Manager instance = (Manager) getHibernateTemplate().get(
					"cn.edu.njust.PO.Manager", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Manager instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Manager as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}
	public List findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}
	public List findAll() {
		log.debug("finding all Manager instances");
		try {			
			String queryString = "from Manager";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
}
