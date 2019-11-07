package entity;

import java.io.Serializable;

public class Usr  implements Serializable{
	private static final long serialVersionUID = 1L;
    private int uid;
    private String uname;
    private String upwd;
    private String uemail;
    private String utel;
    private String upics;
    public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUtel() {
		return utel;
	}
	public void setUtel(String utel) {
		this.utel = utel;
	}
	public String getUpics() {
		return upics;
	}
	public void setUpics(String upics) {
		this.upics = upics;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}
