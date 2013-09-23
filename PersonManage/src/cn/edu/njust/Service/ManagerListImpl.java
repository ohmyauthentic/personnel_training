package cn.edu.njust.Service;
import java.util.List;
import cn.edu.njust.DAO.ManagerDAO;
import cn.edu.njust.PO.Manager;
import cn.edu.njust.bean.PageBean;

public class ManagerListImpl implements ManagerList {
	private ManagerDAO managerDAO;
	
	public ManagerDAO getManagerDAO() {
		return managerDAO;
	}

	public void setManagerDAO(ManagerDAO managerDAO) {
		this.managerDAO = managerDAO;
	}

	public PageBean queryForPage(int pageSize, int page) {
		final String hql = "from Manager";//查询语句
		int allRow = managerDAO.getAllRowCount(hql);//总记录数
		int totalPage = PageBean.countTotalPage(pageSize, allRow);//总页数
		final int offset = PageBean.countOffset(pageSize, page);
		final int length = pageSize; //每页记录数
		final int currentPage = PageBean.countCurrentPage(page);
		
		List<Manager> list = managerDAO.queryForPage(hql, offset, length);  //"一页"的记录
		//System.out.print(list.get(0).get)
		//把分页信息保存到Bean中
		PageBean pageBean = new PageBean();
		pageBean.setPageSize(pageSize);
		pageBean.setCurrentPage(currentPage);
		pageBean.setAllRow(allRow);
		pageBean.setTotalPage(totalPage);
		pageBean.setList(list);
		return pageBean;
	}

}
