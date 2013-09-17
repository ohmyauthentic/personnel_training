package com.Dao;

import java.util.List;

import com.pojo.Teacher;

public interface TeacherDao {

	// property constants
	public static final String DEPARTMENT = "department";
	public static final String TEACHER_NAME = "teacherName";

	public abstract void save(Teacher transientInstance);

	public abstract void delete(Teacher persistentInstance);

	public abstract Teacher findById(java.lang.String id);

	public abstract List findByExample(Teacher instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByDepartment(Object department);

	public abstract List findByTeacherName(Object teacherName);

	public abstract List findAll();

	public abstract Teacher merge(Teacher detachedInstance);

	public abstract void attachDirty(Teacher instance);

	public abstract void attachClean(Teacher instance);

}