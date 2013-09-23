package cn.edu.njust.Service;

import java.util.List;

import javax.swing.JOptionPane;

import cn.edu.njust.DAO.AcademyDAO;
import cn.edu.njust.DAO.ManagerDAO;
import cn.edu.njust.DAO.UserinfoDAO;
import cn.edu.njust.PO.Academy;
import cn.edu.njust.PO.Manager;
import cn.edu.njust.PO.Userinfo;
import cn.edu.njust.encrypt.MD5;


public class ManageOperate {
	
	private UserinfoDAO userinfoDAO;
	private ManagerDAO managerDAO;
	private AcademyDAO academyDAO;
	private MD5 md5;
	private Manager manager;
	private Userinfo userinfo;
	
	public UserinfoDAO getUserinfoDAO() {
		return userinfoDAO;
	}
	public void setUserinfoDAO(UserinfoDAO userinfoDAO) {
		this.userinfoDAO = userinfoDAO;
	}
	public ManagerDAO getManagerDAO() {
		return managerDAO;
	}
	public void setManagerDAO(ManagerDAO managerDAO) {
		this.managerDAO = managerDAO;
	}
	public AcademyDAO getAcademyDAO() {
		return academyDAO;
	}
	public void setAcademyDAO(AcademyDAO academyDAO) {
		this.academyDAO = academyDAO;
	}
	public MD5 getMd5() {
		return md5;
	}
	public void setMd5(MD5 md5) {
		this.md5 = md5;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public Userinfo getUserinfo() {
		return userinfo;
	}
	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}
	
	
	//增加管理员
	public boolean AddManager(String userId,String userName,int ac){	
		try{
			manager.setUserId(userId);
			manager.setName(userName);		
			String str=md5.toMd5Str("111111");
			manager.setPassword(str);
			Academy academy=(Academy) academyDAO.findById(ac);
			manager.setAcademy(academy);
			managerDAO.save(manager);	
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	//删除管理员
	public boolean DeleteManager(String userId){
		try{
			@SuppressWarnings("unchecked")
			List<Manager> list=managerDAO.findByUserId(userId);
			managerDAO.delete(list.get(0));
			return true;
		}catch (Exception e) {		
			return false;
		}
	}
	public boolean DeleteManager(Manager manager){
		try{
			managerDAO.delete(manager);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	//修改管理员
	public boolean ModifyManager(){
		return false;
	}
	//修改普通用户
	public boolean ModifyUser(){
		return false;
	}
	//增加普通用户
	public boolean AddUser(String userId,String userName,String dep,int ac){
		try{			
			Academy academy=(Academy) academyDAO.findById(ac);
			Userinfo userinfo=new Userinfo();
			userinfo.setUserId(userId);
			userinfo.setDep(dep);
			userinfo.setName(userName);
			userinfo.setType("教师");
			userinfo.setAcademy(academy);
			String str=md5.toMd5Str("111111");
			userinfo.setPassword(str);
			userinfoDAO.save(userinfo);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
}
