package dao;

import java.util.List;
import java.util.Map;

import entity.Address;
import entity.Usr;

public interface IUsrDao {
	public Usr login(String uname,String upwd);
	public int updatepwd(String newpwd,String uemail); 
	public int register(String uname,String upwd,String uemail,String utel,String upics);
	public Usr findByName(String uname);
	public Usr findAllByID(Integer uid);
	public List<Address> findAddrsById(Integer uid);
	public Usr findUemailByUid(Integer uid);
	/**
	 * 通过ID在个人主页修改个人信息
	 * @param map
	 * @return
	 */
	public int updateUsrInfo(Map<String, String> map, Integer uid);
}
