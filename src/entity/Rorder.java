package entity;

import java.io.Serializable;


public class Rorder implements Serializable {
	private static final long serialVersionUID = 1L;
	private String rorderid;
	private int id;
	private int uid;
	private String rtime;
	private String province;
	private String city;
	private String county;
	private String raddress;
	private  double total;
	
	private String uname; //配置单作者
	private String cname;  //配置单名
	private String detail; //配置说明
	private String pics;   //cpu图片
	private String pics1;  //主板图片
	private String pics2;  //内存图片
	private String pics3;  //硬盘图片
	private String pics4;  //电源图片
	private String pics5;  //显卡图片
	private String pics6;  //机箱图片
	
	
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getPics() {
		return pics;
	}
	public void setPics(String pics) {
		this.pics = pics;
	}
	public String getPics1() {
		return pics1;
	}
	public void setPics1(String pics1) {
		this.pics1 = pics1;
	}
	public String getPics2() {
		return pics2;
	}
	public void setPics2(String pics2) {
		this.pics2 = pics2;
	}
	public String getPics3() {
		return pics3;
	}
	public void setPics3(String pics3) {
		this.pics3 = pics3;
	}
	public String getPics4() {
		return pics4;
	}
	public void setPics4(String pics4) {
		this.pics4 = pics4;
	}
	public String getPics5() {
		return pics5;
	}
	public void setPics5(String pics5) {
		this.pics5 = pics5;
	}
	public String getPics6() {
		return pics6;
	}
	public void setPics6(String pics6) {
		this.pics6 = pics6;
	}
	public String getRorderid() {
		return rorderid;
	}
	public void setRorderid(String rorderid) {
		this.rorderid = rorderid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getRtime() {
		return rtime;
	}
	public void setRtime(String rtime) {
		this.rtime = rtime;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getRaddress() {
		return raddress;
	}
	public void setRaddress(String raddress) {
		this.raddress = raddress;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
 
}
