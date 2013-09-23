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
		final String hql = "from Manager";//��ѯ���
		int allRow = managerDAO.getAllRowCount(hql);//�ܼ�¼��
		int totalPage = PageBean.countTotalPage(pageSize, allRow);//��ҳ��
		final int offset = PageBean.countOffset(pageSize, page);
		final int length = pageSize; //ÿҳ��¼��
		final int currentPage = PageBean.countCurrentPage(page);
		
		List<Manager> list = managerDAO.queryForPage(hql, offset, length);  //"һҳ"�ļ�¼
		//System.out.print(list.get(0).get)
		//�ѷ�ҳ��Ϣ���浽Bean��
		PageBean pageBean = new PageBean();
		pageBean.setPageSize(pageSize);
		pageBean.setCurrentPage(currentPage);
		pageBean.setAllRow(allRow);
		pageBean.setTotalPage(totalPage);
		pageBean.setList(list);
		return pageBean;
	}

}
