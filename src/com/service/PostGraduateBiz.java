package com.service;

import com.Dao.PostGraduateDao;
import com.pojo.PostGraduate;

public class PostGraduateBiz {
    PostGraduateDao postGraduateDao;
    public void setPostGraduateDao(PostGraduateDao postGraduateDao){
    	this.postGraduateDao=postGraduateDao;
    }
    public void addPostGraduate(PostGraduate postGraduate){
    	postGraduateDao.save(postGraduate);
    }
    public void deletePostGraduate(PostGraduate postGraduate){
    	postGraduateDao.delete(postGraduate);   	
    }
}
