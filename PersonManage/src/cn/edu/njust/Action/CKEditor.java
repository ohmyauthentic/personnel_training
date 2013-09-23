package cn.edu.njust.Action;

import com.opensymphony.xwork2.ActionSupport;

public class CKEditor extends ActionSupport {
	private String title;
	private String ArtContent;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtContent() {
		return ArtContent;
	}
	public void setArtContent(String artContent) {
		ArtContent = artContent;
	}
	
	public String execute() throws Exception{
		System.out.println(getTitle()+"  "+getArtContent());
		return SUCCESS;
	}
     
     
}
