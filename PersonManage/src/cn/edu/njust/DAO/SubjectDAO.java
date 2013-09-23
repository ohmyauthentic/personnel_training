package cn.edu.njust.DAO;

import java.util.List;

import cn.edu.njust.PO.Subject;

public interface SubjectDAO extends BaseDAO<Subject>{
	public Subject findById(java.lang.Integer id);
	public List findByCode(Object code);
	public List findByName(Object name);
	public List findByLevel(Object level);
	public List findByALevels(Object ALevels);
	public List findByFlag(Object flag) ;
	public List findAll();
	

}
