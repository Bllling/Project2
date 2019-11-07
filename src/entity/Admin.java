package entity;

import java.io.Serializable;

public class Admin implements Serializable {
  private static final long serialVersionUID = 1L;
  private int aid;
  private String aname;
  private String apwd;
  private String aemail;
  private String atel;
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getAname() {
	return aname;
}
public void setAname(String aname) {
	this.aname = aname;
}
public String getApwd() {
	return apwd;
}
public void setApwd(String apwd) {
	this.apwd = apwd;
}
public String getAemail() {
	return aemail;
}
public void setAemail(String aemail) {
	this.aemail = aemail;
}
public String getAtel() {
	return atel;
}
public void setAtel(String atel) {
	this.atel = atel;
}
  
}
