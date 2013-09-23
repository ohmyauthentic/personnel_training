package cn.edu.njust.DAO;
import java.util.List;

import cn.edu.njust.PO.*;
public interface AchieveDAO extends BaseDAO<Achieve> {
	public Achieve findById(java.lang.Integer id);
	public List findByBatch(Object batch) ;
	public List findAll() ;
}
