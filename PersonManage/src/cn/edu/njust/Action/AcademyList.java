package cn.edu.njust.Action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.njust.DAO.AcademyDAO;
import cn.edu.njust.PO.Academy;

public class AcademyList extends ActionSupport{
	private List<Academy> academyList;
	private AcademyDAO academyDAO;

	public List<Academy> getAcademyList() {
		return academyList;
	}
	public void setAcademyList(List<Academy> academyList) {
		this.academyList = academyList;
	}
	public AcademyDAO getAcademyDAO() {
		return academyDAO;
	}
	public void setAcademyDAO(AcademyDAO academyDAO) {
		this.academyDAO = academyDAO;
	}
	public String execute() throws Exception{
		this.academyList=academyDAO.findAll();
		return SUCCESS;
	}

}
