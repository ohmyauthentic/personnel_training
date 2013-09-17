package com.action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.pojo.PostGraduate;
import com.service.PostGraduateBiz;


@SuppressWarnings("serial")
public class addPostGraduateAction extends ActionSupport implements ModelDriven<PostGraduate>{

	private PostGraduate postGraduate = new PostGraduate();
	PostGraduateBiz postGraduateBiz;
	public void setPostGraduateBiz(PostGraduateBiz postGraduateBiz){
		this.postGraduateBiz=postGraduateBiz;
	}
	public String addPostGraduate(){
		postGraduateBiz.addPostGraduate(postGraduate);
		return "success";
	}
	public PostGraduate getModel() {
		// TODO Auto-generated method stub
		return null;
	}

}
