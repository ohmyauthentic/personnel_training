package cn.edu.njust.Service;

import java.util.List;
import com.opensymphony.xwork2.ActionContext;
import cn.edu.njust.DAO.UserinfoDAO;
import cn.edu.njust.DAO.ManagerDAO;
import cn.edu.njust.DAO.SupuserDAO;
import cn.edu.njust.encrypt.MD5;
import cn.edu.njust.PO.Manager;
import cn.edu.njust.PO.Supuser;
import cn.edu.njust.PO.Userinfo;
import cn.edu.njust.Session.UserSession;;

public class LoginService {	
	private SupuserDAO  supuserDao;
	private ManagerDAO managerDao;
	private UserinfoDAO    userinfoDAO;	
	private UserSession userSession;
	private MD5  md5;

	public MD5 getMd5() {
		return md5;
	}
	public void setMd5(MD5 md5) {
		this.md5 = md5;
	}
	public UserSession getUserSession() {
		return userSession;
	}
	public void setUserSession(UserSession userSession) {
		this.userSession = userSession;
	}

	public SupuserDAO getSupuserDao() {
		return supuserDao;
	}
	public void setSupuserDao(SupuserDAO supuserDao) {
		this.supuserDao = supuserDao;
	}
	public ManagerDAO getManagerDao() {
		return managerDao;
	}
	public void setManagerDao(ManagerDAO managerDao) {
		this.managerDao = managerDao;
	}
	public UserinfoDAO getUserinfoDAO() {
		return userinfoDAO;
	}
	public void setUserinfoDAO(UserinfoDAO userinfoDAO) {
		this.userinfoDAO = userinfoDAO;
	}
	public Supuser sValidate(String smId,String password) {
		@SuppressWarnings("unchecked")
		List<Supuser> list=supuserDao.findByUseId(smId);
		if(list.size()!=0){
			Supuser supuser=list.get(0);
			if(md5.checkPWD(supuser.getPassword(), password)){
				return supuser;
			}
			return null;
		}
		return null;
	}	

	public Manager mValidate(String userId,String password) {
		@SuppressWarnings("unchecked")
		List<Manager> list=managerDao.findByUserId(userId);
		if(list.size()!=0){
			Manager manager=list.get(0);
			if(md5.checkPWD(manager.getPassword(), password)){
				return manager;
			}
			else return null;
		}
		return null;
	}

	public Userinfo uValidate(String userId,String password) {
		@SuppressWarnings("unchecked")
		List<Userinfo> list=userinfoDAO.findByUserId(userId);
		if(list.size()!=0){
			Userinfo user=(Userinfo)list.get(0);
			if(md5.checkPWD(user.getPassword(), password)){
				return user;
			}
			else return null;
		}
		return null;
	}

	public int loginCheck(String userId,String password,int type){
		if(type==0){
			Userinfo user=uValidate(userId,password);
			if(user!=null){
				userSession.setUserID(userId);
				userSession.setPoewer(3);
				ActionContext ac=ActionContext.getContext();
				ac.getSession().put("userSession",userSession);
				return 2;
			}
		}
		else if(type==1){
			Manager manager=mValidate(userId,password);
			if(manager!=null){
				userSession.setUserID(userId);
				userSession.setPoewer(2);
				ActionContext ac=ActionContext.getContext();
				ac.getSession().put("userSession",userSession);
				return 1;
			}
			else{
				Supuser superUser=sValidate(userId,password);
				if(superUser!=null){
					userSession.setPoewer(1);
					userSession.setUserID(userId);
					ActionContext ac=ActionContext.getContext();
					ac.getSession().put("userSession",userSession);
					return 1;
				}
			}
		}
		return 0;
	}
}
