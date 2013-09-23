package cn.edu.njust.Service;

import cn.edu.njust.bean.PageBean;

public interface UserList {
	public PageBean queryForPage(int pageSize,int Page);
	public PageBean queryForPage(int pageSize,int page,int ac);
}
