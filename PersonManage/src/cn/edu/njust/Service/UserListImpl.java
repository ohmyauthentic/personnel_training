package cn.edu.njust.Service;

import java.util.List;

import cn.edu.njust.DAO.AcademyDAO;
import cn.edu.njust.DAO.UserinfoDAO;
import cn.edu.njust.bean.PageBean;
import cn.edu.njust.PO.Userinfo;


public class UserListImpl implements UserList {
	private UserinfoDAO userinfoDAO;
	public UserinfoDAO getUserinfoDAO() {
		return userinfoDAO;
	}
	public void setUserinfoDAO(UserinfoDAO userinfoDAO) {
		this.userinfoDAO = userinfoDAO;
	}

	@Override
	public PageBean queryForPage(int pageSize, int page) {
		final String hql = "from Userinfo ";//��ѯ���
		int allRow = userinfoDAO.getAllRowCount(hql);//�ܼ�¼��
		int totalPage = PageBean.countTotalPage(pageSize, allRow);//��ҳ��
		final int offset = PageBean.countOffset(pageSize, page);
		final int length = pageSize; //ÿҳ��¼��
		final int currentPage = PageBean.countCurrentPage(page);
		
		List<Userinfo> list = userinfoDAO.queryForPage(hql, offset, length);  //"һҳ"�ļ�¼
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
	public PageBean queryForPage(int pageSize, int page,int ac) {
		final String hql = "from Userinfo u where u.academy.acaid=' "+ac+"'";//��ѯ���
		//int allRow=academyDAO.getAllRowCount(hql);
		int allRow = userinfoDAO.getAllRowCount(hql);//�ܼ�¼��
		int totalPage = PageBean.countTotalPage(pageSize, allRow);//��ҳ��
		final int offset = PageBean.countOffset(pageSize, page);
		final int length = pageSize; //ÿҳ��¼��
		final int currentPage = PageBean.countCurrentPage(page);
		
		List<Userinfo> list = userinfoDAO.queryForPage(hql, offset, length);  //"һҳ"�ļ�¼
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
