package cn.edu.njust.Action;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import cn.edu.njust.bean.PageBean;
import cn.edu.njust.DAO.ManagerDAO;
import cn.edu.njust.PO.Manager;
import cn.edu.njust.Service.UserList;
import cn.edu.njust.Session.UserSession;

public class UserListAction extends ActionSupport {
	
	private UserList userList;
	private PageBean pageBean;
	private int page;
	private ManagerDAO managerDAO;
	
	public UserList getUserList() {
		return userList;
	}

	public void setUserList(UserList userList) {
		this.userList = userList;
	}

	public PageBean getPageBean() {
		return pageBean;
	}

	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public ManagerDAO getManagerDAO() {
		return managerDAO;
	}

	public void setManagerDAO(ManagerDAO managerDAO) {
		this.managerDAO = managerDAO;
	}

	public String execute() throws Exception{
		ActionContext actionContext=ActionContext.getContext();
		UserSession userSession=(UserSession)actionContext.getSession().get("userSession");
		if(userSession.getPoewer()==1){   //
			this.pageBean=userList.queryForPage(5, page);
		}
		else if(userSession.getPoewer()==2) {   //
		   @SuppressWarnings("unchecked")
		   List<Manager> list=managerDAO.findByUserId(userSession.getUserID());
		   int ac=list.get(0).getAcademy().getAcaid();
		   this.pageBean=userList.queryForPage(5, page,ac);
		}
		return SUCCESS;
	}
	

}
