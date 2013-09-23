package cn.edu.njust.DAO;

import java.util.List;

import cn.edu.njust.PO.Study;

public interface StudyDAO extends BaseDAO<Study> {
	public Study findById(java.lang.Integer id);
	public List findByCollege(Object college);
	public List findByMajor(Object major);
	public List findByDegree(Object degree);
	public List findByEduBk(Object eduBk);
	public List findByALevels(Object ALevels);
	public List findByEFlag(Object EFlag);
	public List findByDFlag(Object DFlag);
	public List findAll();
}
