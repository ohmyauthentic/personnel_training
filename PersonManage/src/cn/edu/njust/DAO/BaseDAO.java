package cn.edu.njust.DAO;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;

public interface BaseDAO<T> {
	public T get(Class<T> entityClass, Serializable id);
	public Serializable save(T entity);
	public void delete(T entity);
	public void delete(Class<T> entityClass,Serializable id);
	public void update(T entity);
	public List<T> find(String hql);
	public List<T> find(String hql,Object... params);
	public List<T> queryForPage(final String hql,final int offset, final int length);
	public int getAllRowCount(String hql);
}
