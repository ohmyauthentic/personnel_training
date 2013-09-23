package cn.edu.njust.DAO;

import java.util.List;

import cn.edu.njust.PO.Parttime;

public interface ParttimeDAO extends BaseDAO<Parttime> {
	public Parttime findById(java.lang.Integer id);
	public List findByName(Object name);
	public List findAll();
}
