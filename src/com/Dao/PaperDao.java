package com.Dao;

import java.util.List;

import com.pojo.Paper;

public interface PaperDao {

	// property constants
	public static final String PAPER_NAME = "paperName";
	public static final String REWARD_SORT = "rewardSort";
	public static final String IS_CHECK = "isCheck";

	public abstract void save(Paper transientInstance);

	public abstract void delete(Paper persistentInstance);

	public abstract Paper findById(java.lang.String id);

	public abstract List findByExample(Paper instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByPaperName(Object paperName);

	public abstract List findByRewardSort(Object rewardSort);

	public abstract List findByIsCheck(Object isCheck);

	public abstract List findAll();

	public abstract Paper merge(Paper detachedInstance);

	public abstract void attachDirty(Paper instance);

	public abstract void attachClean(Paper instance);

}