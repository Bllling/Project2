package biz;

import java.util.List;
import java.util.Map;

import entity.Address;
import entity.Usr;

public interface IUsrBiz {
	public Usr login(String uname,String upwd);
	public int updatepwd(String newpwd,String uemail); 
	public int register(String uname,String upwd,String uemail,String utel,String upics);
	public Usr findByName(String uname);
	public Usr findUemailByUid(Integer uid);
	/**
	 * 通过ID在用户表查询所有
	 * @param uid
	 * @return
	 */
	public Usr findAllByID(Integer uid);
	/**
	 * 通过用户ID查询地址表 查找该用户的 所有地址
	 * @param uid
	 * @return
	 */
	public List<Address> findAddrsById(Integer uid);
	/**
	 * 通过ID在个人主页修改个人信息
	 * @param map
	 * @return
	 */
	public int updateUsrInfo(Map<String, String> map, Integer uid);
}
