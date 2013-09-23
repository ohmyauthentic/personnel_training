package cn.edu.njust.DAO;
import java.util.List;

import  cn.edu.njust.PO.*;
public interface HonourDAO extends BaseDAO<Honour> {
	public Honour findById(java.lang.Integer id);
	public List findByName(Object name);
	public List findByLevel(Object level);
	public List findByFlag(Object flag);
	public List findAll(); 

}
