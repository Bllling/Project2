package dao;

public interface IUsrDao {
	 public int login(String uname,String upwd);
	  public int updatepwd(String newpwd,String uemail); 
	  public int register(String uname,String upwd,String uemail,String utel,String upics);
}
