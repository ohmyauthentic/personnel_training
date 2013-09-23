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
 * A data access object (DAO) providing persistence and search support for
 * Achieve entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.edu.njust.DAO.Achieve
 * @author MyEclipse Persistence Tools
 */

public class AchieveDAOImpl extends BaseDAOImpl<Achieve> implements AchieveDAO{
	private static final Log log = LogFactory.getLog(AchieveDAOImpl.class);
	// property constants
	public static final String BATCH = "batch";
	public Achieve findById(java.lang.Integer id) {
		log.debug("getting Achieve instance with id: " + id);
		try {
			Achieve instance = (Achieve) getHibernateTemplate().get(
					"cn.edu.njust.DAO.Achieve", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Achieve instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Achieve as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByBatch(Object batch) {
		return findByProperty(BATCH, batch);
	}

	public List findAll() {
		log.debug("finding all Achieve instances");
		try {
			String queryString = "from Achieve";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
}