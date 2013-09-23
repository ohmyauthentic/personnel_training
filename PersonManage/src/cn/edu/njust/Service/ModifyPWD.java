package cn.edu.njust.Service;

import cn.edu.njust.DAO.ManagerDAO;
import cn.edu.njust.DAO.SupuserDAO;
import cn.edu.njust.DAO.UserinfoDAO;
import cn.edu.njust.PO.Manager;
import cn.edu.njust.PO.Supuser;
import cn.edu.njust.PO.Userinfo;
import cn.edu.njust.encrypt.MD5;

public class ModifyPWD {
	private  ManagerDAO managerDAO;
	private  UserinfoDAO userinfoDAO;
	private  SupuserDAO  supuserDAO;
	private  MD5   md5;
	
	public MD5 getMd5() {
		return md5;
	}
	public void setMd5(MD5 md5) {
		this.md5 = md5;
	}
	public ManagerDAO getManagerDAO() {
		return managerDAO;
	}
	public void setManagerDAO(ManagerDAO managerDAO) {
		this.managerDAO = managerDAO;
	}
	public UserinfoDAO getUserinfoDAO() {
		return userinfoDAO;
	}
	public void setUserinfoDAO(UserinfoDAO userinfoDAO) {
		this.userinfoDAO = userinfoDAO;
	}
	public SupuserDAO getSupuserDAO() {
		return supuserDAO;
	}
	public void setSupuserDAO(SupuserDAO supuserDAO) {
		this.supuserDAO = supuserDAO;
	}
	private void ModifyManager(String userId,String password){
		try{
		  Manager manager=(Manager) managerDAO.findByUserId(userId).get(0);
		  String str=md5.toMd5Str(password);
		  manager.setPassword(str);
		  managerDAO.update(manager);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	private void ModifyUser(String userId,String password){
		try{
			 Userinfo userinfo=(Userinfo) userinfoDAO.findByUserId(userId).get(0);
			 String str=md5.toMd5Str(password);
			 userinfo.setPassword(str);
			 userinfoDAO.update(userinfo);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
    private void ModifySuper(String userId,String password){
    	try{
    		Supuser supuser=(Supuser) supuserDAO.findByUseId(userId).get(0);
    		String str=md5.toMd5Str(password);
    		supuser.setPassword(str);
    		supuserDAO.update(supuser);
    	}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
    
    
	public void Modify(String userId,String password,int power){
		if(power==1){
			ModifySuper(userId, password);
		}
		else if(power==2){
			ModifyManager(userId, password);
		}else{
			ModifyUser(userId, password);
		}
	}

}
