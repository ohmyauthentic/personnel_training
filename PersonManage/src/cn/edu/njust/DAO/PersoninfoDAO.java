package cn.edu.njust.DAO;

import java.util.List;

import cn.edu.njust.PO.Personinfo;

public interface PersoninfoDAO extends BaseDAO<Personinfo> {
	public Personinfo findById(java.lang.Integer id);
	public List findByUseId(Object useId);
	public List findBySex(Object sex);
	public List findByPolitical(Object political);
	public List findByNativePlace(Object nativePlace);
	public List findByRace(Object race);
	public List findByIdNum(Object idNum);
	public List findByPost(Object post);
	public List findByTp(Object tp);
	public List findByWorkAd(Object workAd); 
	public List findByWorkPh(Object workPh);
	public List findByMobile(Object mobile);
	public List findByAd(Object ad);
	public List findByTType(Object TType);
	public List findByDir(Object dir);
	public List findAll();
}
