package cn.edu.njust.DAO;

import java.util.List;

import cn.edu.njust.PO.Userinfo;

public interface UserinfoDAO extends BaseDAO<Userinfo> {
	public Userinfo findById(java.lang.Integer id);
	public List findByUserId(Object userId);
	public List findByName(Object name);
	public List findByPassword(Object password);
	public List findByDep(Object dep);
	public List findByType(Object type);
	public List findAll();
}