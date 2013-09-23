package cn.edu.njust.DAO;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class BaseDAOImpl<T> extends HibernateDaoSupport implements BaseDAO<T> {

	@SuppressWarnings("unchecked")
	@Override
	public T get(Class<T> entityClass, Serializable id) {
		
		return (T) getHibernateTemplate().get(entityClass, id);
	}

	@Override
	public Serializable save(T entity) {
		return getHibernateTemplate().save(entity);
	}

	@Override
	public void delete(T entity) {
		getHibernateTemplate().delete(entity);
		
	}

	@Override
	public void delete(Class<T> entityClass, Serializable id) {
		delete(get(entityClass, id));
		
	}

	@Override
	public void update(T entity) {
		getHibernateTemplate().saveOrUpdate(entity);
		
	}
	
	@SuppressWarnings("unchecked")
	public List<T> find(String hql){
		return getHibernateTemplate().find(hql);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> find(String hql,Object... params){
		Query  query=getSessionFactory().getCurrentSession().createQuery(hql);
		for(int i=0;i<params.length;i++){
			query.setParameter(i+"", params[i]);
		}
		return query.list();
	}

	@Override
	public List<T> queryForPage(final String hql,  final int offset, final int length) {
		List list = getHibernateTemplate().executeFind(	new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,SQLException {
				Query query = session.createQuery(hql);
				query.setFirstResult(offset);
				query.setMaxResults(length);
				List list = query.list();
				return list;
			}
		});
		return list;
	}

	@Override
	public int getAllRowCount(String hql) {
		return getHibernateTemplate().find(hql).size();
	}
	
}
