package cn.edu.njust.Session;

public class UserSession {
	private String userID;//用户号
	private int poewer;//用户权限
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public int getPoewer() {
		return poewer;
	}
	public void setPoewer(int poewer) {
		this.poewer = poewer;
	}	
}
