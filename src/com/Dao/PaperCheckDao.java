package com.Dao;

import java.util.List;

import com.pojo.PaperCheck;

public interface PaperCheckDao {

	// property constants
	public static final String CHECK_RESULT = "checkResult";

	public abstract void save(PaperCheck transientInstance);

	public abstract void delete(PaperCheck persistentInstance);

	public abstract PaperCheck findById(java.lang.String id);

	public abstract List findByExample(PaperCheck instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByCheckResult(Object checkResult);

	public abstract List findAll();

	public abstract PaperCheck merge(PaperCheck detachedInstance);

	public abstract void attachDirty(PaperCheck instance);

	public abstract void attachClean(PaperCheck instance);

}