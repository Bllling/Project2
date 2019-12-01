package entity;

import java.io.Serializable;


public class Computer implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;		  //配置单号
	private int uid;
	private String rtime; //配置单发布时间
	private String uname; //用户名
	private int znumber;  //点赞数
	private int bnumber;  //浏览数
	private int cpuid;
	private int motherboardid;
	private int memoryid;
	private int diskid;
	private int sourceid;
	private int graphicsid;
	private int boxid;
	private  double sumprice;
	private String cname;  //配置单名
	private String detail; //配置说明
	private String name;   //cpu名
	private String pics;   //cpu价格
	private String name1;  //主板名
	private String pics1;  //主板价格
	private String name2;  //内存名
	private String pics2;  //内存价格
	private String name3;  //硬盘名
	private String pics3;  //硬盘价格
	private String name4;  //电源名
	private String pics4;  //电源价格
	private String name5;  //显卡名
	private String pics5;  //显卡价格
	private String name6;  //机箱名
	private String pics6;  //机箱价格
	
	private double price;  
	private double price1;
	private double price2;
	private double price3;
	private double price4;
	private double price5;
	private double price6;
	
	
	
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice1() {
		return price1;
	}
	public void setPrice1(double price1) {
		this.price1 = price1;
	}
	public double getPrice2() {
		return price2;
	}
	public void setPrice2(double price2) {
		this.price2 = price2;
	}
	public double getPrice3() {
		return price3;
	}
	public void setPrice3(double price3) {
		this.price3 = price3;
	}
	public double getPrice4() {
		return price4;
	}
	public void setPrice4(double price4) {
		this.price4 = price4;
	}
	public double getPrice5() {
		return price5;
	}
	public void setPrice5(double price5) {
		this.price5 = price5;
	}
	public double getPrice6() {
		return price6;
	}
	public void setPrice6(double price6) {
		this.price6 = price6;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPics() {
		return pics;
	}
	public void setPics(String pics) {
		this.pics = pics;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getPics1() {
		return pics1;
	}
	public void setPics1(String pics1) {
		this.pics1 = pics1;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public String getPics2() {
		return pics2;
	}
	public void setPics2(String pics2) {
		this.pics2 = pics2;
	}
	public String getName3() {
		return name3;
	}
	public void setName3(String name3) {
		this.name3 = name3;
	}
	public String getPics3() {
		return pics3;
	}
	public void setPics3(String pics3) {
		this.pics3 = pics3;
	}
	public String getName4() {
		return name4;
	}
	public void setName4(String name4) {
		this.name4 = name4;
	}
	public String getPics4() {
		return pics4;
	}
	public void setPics4(String pics4) {
		this.pics4 = pics4;
	}
	public String getName5() {
		return name5;
	}
	public void setName5(String name5) {
		this.name5 = name5;
	}
	public String getPics5() {
		return pics5;
	}
	public void setPics5(String pics5) {
		this.pics5 = pics5;
	}
	public String getName6() {
		return name6;
	}
	public void setName6(String name6) {
		this.name6 = name6;
	}
	public String getPics6() {
		return pics6;
	}
	public void setPics6(String pics6) {
		this.pics6 = pics6;
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
	public double getSumprice() {
		return sumprice;
	}
	public void setSumprice(double sumprice) {
		this.sumprice = sumprice;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getRtime() {
		return rtime;
	}
	public void setRtime(String rtime) {
		this.rtime = rtime;
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
	
	public int getZnumber() {
		return znumber;
	}
	public void setZnumber(int znumber) {
		this.znumber = znumber;
	}
	public int getBnumber() {
		return bnumber;
	}
	public void setBnumber(int bnumber) {
		this.bnumber = bnumber;
	}
	public int getCpuid() {
		return cpuid;
	}
	public void setCpuid(int cpuid) {
		this.cpuid = cpuid;
	}
	public int getMotherboardid() {
		return motherboardid;
	}
	public void setMotherboardid(int motherboardid) {
		this.motherboardid = motherboardid;
	}
	public int getMemoryid() {
		return memoryid;
	}
	public void setMemoryid(int memoryid) {
		this.memoryid = memoryid;
	}
	public int getDiskid() {
		return diskid;
	}
	public void setDiskid(int diskid) {
		this.diskid = diskid;
	}
	public int getSourceid() {
		return sourceid;
	}
	public void setSourceid(int sourceid) {
		this.sourceid = sourceid;
	}
	public int getGraphicsid() {
		return graphicsid;
	}
	public void setGraphicsid(int graphicsid) {
		this.graphicsid = graphicsid;
	}
	public int getBoxid() {
		return boxid;
	}
	public void setBoxid(int boxid) {
		this.boxid = boxid;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
