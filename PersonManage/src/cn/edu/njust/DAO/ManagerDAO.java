package cn.edu.njust.DAO;
import java.util.List;

import cn.edu.njust.PO.*;
public interface ManagerDAO extends BaseDAO<Manager> {
	public Manager findById(java.lang.Integer id);
	public List findByUserId(Object userId);
	public List findByName(Object name);
	public List findByPassword(Object password);
	public List findAll();
}
