package cn.edu.njust.DAO;

import java.util.List;

import cn.edu.njust.PO.Supuser;

public interface SupuserDAO  extends BaseDAO<Supuser>{
	public Supuser findById(java.lang.Integer id);
	public List findByUseId(Object useId);
	public List findByPassword(Object password);
	public List findByAcademy(Object academy);
	public List findAll();
	public List findUserAndPWD(String userId,String password);

}
