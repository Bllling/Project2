package entity;

import java.io.Serializable;


public class RorderDetail implements Serializable {
	private static final long serialVersionUID = 1L;
	private String rorderid;
	private int id;
	private int uid;
	private  double cpuprice;
	private  double motherboardprice;
	private  double memoryprice;
	private  double diskprice;
	private  double ssdprice;
	private  double sourceprice;
	private  double graphicsprice;
	private  double boxprice;
	

	private String rtime;
	private int state;
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
	
	private String city;
	private String county;
	private String raddress;
	private int arid;
	
	
	public String getRtime() {
		return rtime;
	}
	public void setRtime(String rtime) {
		this.rtime = rtime;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
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
	public int getArid() {
		return arid;
	}
	public void setArid(int arid) {
		this.arid = arid;
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
	public double getCpuprice() {
		return cpuprice;
	}
	public void setCpuprice(double cpuprice) {
		this.cpuprice = cpuprice;
	}
	public double getMotherboardprice() {
		return motherboardprice;
	}
	public void setMotherboardprice(double motherboardprice) {
		this.motherboardprice = motherboardprice;
	}
	public double getMemoryprice() {
		return memoryprice;
	}
	public void setMemoryprice(double memoryprice) {
		this.memoryprice = memoryprice;
	}
	public double getDiskprice() {
		return diskprice;
	}
	public void setDiskprice(double diskprice) {
		this.diskprice = diskprice;
	}
	public double getSsdprice() {
		return ssdprice;
	}
	public void setSsdprice(double ssdprice) {
		this.ssdprice = ssdprice;
	}
	public double getSourceprice() {
		return sourceprice;
	}
	public void setSourceprice(double sourceprice) {
		this.sourceprice = sourceprice;
	}
	public double getGraphicsprice() {
		return graphicsprice;
	}
	public void setGraphicsprice(double graphicsprice) {
		this.graphicsprice = graphicsprice;
	}
	public double getBoxprice() {
		return boxprice;
	}
	public void setBoxprice(double boxprice) {
		this.boxprice = boxprice;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
