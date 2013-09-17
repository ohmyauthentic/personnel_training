package com.Dao;

import java.util.List;

import com.pojo.PostGraduate;

public interface PostGraduateDao {

	// property constants
	public static final String STU_NAME = "stuName";
	public static final String SEX = "sex";
	public static final String STU_SORT = "stuSort";
	public static final String TYPE = "type";
	public static final String DEPARTMENT = "department";
	public static final String MAJOR = "major";
	public static final String GRADE = "grade";
	public static final String RESEARCH_DIRECTION = "researchDirection";
	public static final String TRAIN_SORT = "trainSort";
	public static final String TEACHER = "teacher";
	public static final String REMARKS = "remarks";
	public static final String STATE = "state";
	public static final String GRADUATE_NUM = "graduateNum";
	public static final String DEGREE_NUM = "degreeNum";
	public static final String ID_EMPLOYED = "idEmployed";
	public static final String GRADUATE_DIRECTION = "graduateDirection";

	public abstract void save(PostGraduate transientInstance);

	public abstract void delete(PostGraduate persistentInstance);

	public abstract PostGraduate findById(java.lang.String id);

	public abstract List findByExample(PostGraduate instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByStuName(Object stuName);

	public abstract List findBySex(Object sex);

	public abstract List findByStuSort(Object stuSort);

	public abstract List findByType(Object type);

	public abstract List findByDepartment(Object department);

	public abstract List findByMajor(Object major);

	public abstract List findByGrade(Object grade);

	public abstract List findByResearchDirection(Object researchDirection);

	public abstract List findByTrainSort(Object trainSort);

	public abstract List findByTeacher(Object teacher);

	public abstract List findByRemarks(Object remarks);

	public abstract List findByState(Object state);

	public abstract List findByGraduateNum(Object graduateNum);

	public abstract List findByDegreeNum(Object degreeNum);

	public abstract List findByIdEmployed(Object idEmployed);

	public abstract List findByGraduateDirection(Object graduateDirection);

	public abstract List findAll();

	public abstract PostGraduate merge(PostGraduate detachedInstance);

	public abstract void attachDirty(PostGraduate instance);

	public abstract void attachClean(PostGraduate instance);

}