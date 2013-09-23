package cn.edu.njust.DAO;
import java.util.List;

import cn.edu.njust.PO.*;
public interface AcPaperDAO extends  BaseDAO<AcPaper>{
	public AcPaper findById(java.lang.Integer id);
	public List findByTitle(Object title);
	public List findByType(Object type);
	public List findByClass_(Object class_) ;
	public List findByApplier(Object applier);
	public List findByDepartment(Object department) ;
	public List findByTelephone(Object telephone) ;
	public List findByAuthor1(Object author1) ;
	public List findByAuthDep1(Object authDep1);
	public List findByAuthJob1(Object authJob1);
	public List findByAuthor2(Object author2) ;
	public List findByAuthDep2(Object authDep2);
	public List findByAuthJob2(Object authJob2);
	public List findByAuthor3(Object author3);
	public List findByAuthDep3(Object authDep3);
	public List findByAuthJob3(Object authJob3);
	public List findByFundName(Object fundName);
	public List findByFundId(Object fundId);
	public List findByJournal(Object journal);
	public List findByJournalType(Object journalType);
	public List findByIssn(Object issn);
	public List findByCn(Object cn) ;
	public List findByPosition(Object position);
	public List findByConTitle(Object conTitle);
	public List findByConPlace(Object conPlace) ;
	public List findByHost(Object host);
	public List findByPublishNum(Object publishNum);
	public List findByPublisher(Object publisher);
	public List findBySumWord(Object sumWord);
	public List findByBookNum(Object bookNum);
	public List findByMyWord(Object myWord) ;
	public List findByDigest(Object digest) ;
	public List findAll();

}
