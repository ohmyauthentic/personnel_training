package cn.edu.njust.Action;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.net.httpserver.Authenticator.Success;

import cn.edu.njust.Service.ManagerList;
import cn.edu.njust.bean.PageBean;

public class ManagerListAction extends ActionSupport {
	private ManagerList managerList;
	private PageBean manBean;
	int page;
	public ManagerList getManagerList() {
		return managerList;
	}
	public void setManagerList(ManagerList managerList) {
		this.managerList = managerList;
	}
	public PageBean getManBean() {
		return manBean;
	}
	public void setManBean(PageBean manBean) {
		this.manBean = manBean;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	public String execute() throws Exception{
		this.manBean=managerList.queryForPage(3, page);
		return SUCCESS;
	}
	

}
