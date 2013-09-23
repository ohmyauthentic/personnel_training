package cn.edu.njust.DAO;
import java.util.List;

import cn.edu.njust.PO.*;
public interface MajorDAO extends BaseDAO<Major> {
	public Major findById(java.lang.Integer id);
	public List findAll();

}
