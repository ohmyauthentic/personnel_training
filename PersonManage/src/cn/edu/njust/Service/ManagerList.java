package cn.edu.njust.Service;

import cn.edu.njust.bean.PageBean;

public interface ManagerList {
	public PageBean queryForPage(int pageSize,int Page);
}
