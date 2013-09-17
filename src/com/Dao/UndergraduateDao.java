package com.Dao;

import java.util.List;

import com.pojo.Undergraduate;

public interface UndergraduateDao {

	// property constants
	public static final String STU_NAME = "stuName";
	public static final String SEX = "sex";
	public static final String DEPARTMENT = "department";
	public static final String MAJOR = "major";
	public static final String GRADE = "grade";
	public static final String REMARKS = "remarks";
	public static final String STATE = "state";
	public static final String GRADUATE_NUM = "graduateNum";
	public static final String DEGREE_NUM = "degreeNum";
	public static final String ID_EMPLOYED = "idEmployed";
	public static final String GRADUATE_DIRECTION = "graduateDirection";

	public abstract void save(Undergraduate transientInstance);

	public abstract void delete(Undergraduate persistentInstance);

	public abstract Undergraduate findById(java.lang.String id);

	public abstract List findByExample(Undergraduate instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByStuName(Object stuName);

	public abstract List findBySex(Object sex);

	public abstract List findByDepartment(Object department);

	public abstract List findByMajor(Object major);

	public abstract List findByGrade(Object grade);

	public abstract List findByRemarks(Object remarks);

	public abstract List findByState(Object state);

	public abstract List findByGraduateNum(Object graduateNum);

	public abstract List findByDegreeNum(Object degreeNum);

	public abstract List findByIdEmployed(Object idEmployed);

	public abstract List findByGraduateDirection(Object graduateDirection);

	public abstract List findAll();

	public abstract Undergraduate merge(Undergraduate detachedInstance);

	public abstract void attachDirty(Undergraduate instance);

	public abstract void attachClean(Undergraduate instance);

}