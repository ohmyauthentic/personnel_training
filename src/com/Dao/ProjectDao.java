package com.Dao;

import java.util.List;

import com.pojo.Project;

public interface ProjectDao {

	// property constants
	public static final String STU_ID = "stuId";
	public static final String TEACHER = "teacher";
	public static final String DEPARTMENT = "department";
	public static final String PROJECT_NAME = "projectName";
	public static final String SORT = "sort";

	public abstract void save(Project transientInstance);

	public abstract void delete(Project persistentInstance);

	public abstract Project findById(java.lang.String id);

	public abstract List findByExample(Project instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByStuId(Object stuId);

	public abstract List findByTeacher(Object teacher);

	public abstract List findByDepartment(Object department);

	public abstract List findByProjectName(Object projectName);

	public abstract List findBySort(Object sort);

	public abstract List findAll();

	public abstract Project merge(Project detachedInstance);

	public abstract void attachDirty(Project instance);

	public abstract void attachClean(Project instance);

}