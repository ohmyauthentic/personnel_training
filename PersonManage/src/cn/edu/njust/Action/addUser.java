package cn.edu.njust.Action;

import cn.edu.njust.DAO.ManagerDAO;
import cn.edu.njust.PO.Manager;
import cn.edu.njust.Service.ManageOperate;
import cn.edu.njust.Session.UserSession;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class addUser extends ActionSupport{	
	private String userID;
	private String userName;
	private String   department;
	private int    academy;
	private ManageOperate manageOperate;
	private ManagerDAO managerDAO;	
	
	public ManagerDAO getManagerDAO() {
		return managerDAO;
	}
	public void setManagerDAO(ManagerDAO managerDAO) {
		this.managerDAO = managerDAO;
	}
	public ManageOperate getManageOperate() {
		return manageOperate;
	}
	public void setManageOperate(ManageOperate manageOperate) {
		this.manageOperate = manageOperate;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAcademy() {
		return academy;
	}
	public void setAcademy(int academy) {
		this.academy = academy;
	}
	public String execute() throws Exception{
		ActionContext actionContext=ActionContext.getContext();
		UserSession userSession=(UserSession) actionContext.getSession().get("userSession");
		int power=userSession.getPoewer();
		if(power==1){
			if(manageOperate.AddUser(userID, userName, department, academy)){
				actionContext.put("tip", "301");
				return SUCCESS;
			}else{
				actionContext.put("tip", "302");
				return ERROR;
			}
		}
		else{
			Manager manager=(Manager) managerDAO.findByUserId(userSession.getUserID()).get(0);
			int ac=manager.getAcademy().getAcaid();
			if(manageOperate.AddUser(userID, userName, department, ac)){
				actionContext.put("tip", "301");
				return SUCCESS;
			}
			else {
				actionContext.put("tip", "302");
				return ERROR;
			}
		}
	}
}

