package cn.edu.njust.DAO;

import java.util.List;

import cn.edu.njust.PO.Work;

public interface WorkDAO  extends BaseDAO<Work>{
	public Work findById(java.lang.Integer id);
	public List findByUnit(Object unit);
	public List findByDepartment(Object department);
	public List findByPost(Object post);
	public List findAll();

}
