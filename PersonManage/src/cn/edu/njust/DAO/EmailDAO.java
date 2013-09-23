package cn.edu.njust.DAO;
import java.util.List;

import cn.edu.njust.PO.*;
public interface EmailDAO  extends BaseDAO<Email>{
	public Email findById(java.lang.Integer id);
	public List findByEmail(Object email);
	public List findAll(); 

}
