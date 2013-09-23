package cn.edu.njust.DAO;
import java.util.List;

import cn.edu.njust.PO.*;
public interface AcademyDAO  extends BaseDAO<Academy>{
	public Academy findById(java.lang.Integer id);
	public List findByName(Object name);
	public List findByFlag(Object flag);
	public List findAll() ;
}
