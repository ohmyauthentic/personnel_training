package com.Dao;

import java.util.List;

import com.pojo.SendPaper;

public interface SendPaperDao {

	// property constants
	public static final String RESULT = "result";

	public abstract void save(SendPaper transientInstance);

	public abstract void delete(SendPaper persistentInstance);

	public abstract SendPaper findById(java.lang.String id);

	public abstract List findByExample(SendPaper instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByResult(Object result);

	public abstract List findAll();

	public abstract SendPaper merge(SendPaper detachedInstance);

	public abstract void attachDirty(SendPaper instance);

	public abstract void attachClean(SendPaper instance);

}