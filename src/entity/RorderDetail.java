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

	private int cpuid;
	private int motherboardid;
	private int memoryid;
	private int diskid;
	private int sourceid;
	private int graphicsid;
	private int boxid;
	private String city;
	private String county;
	private String raddress;
	private String province;
	private String addrname;
	private String addrtel;
	

	private int arid;
	

	

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
	
	private String name;   //cpu名
	private String name1;  //主板名
	private String name2;  //内存名
	private String name3;  //硬盘名
	private String name4;  //电源名
	private String name5;  //显卡名
	private String name6;  //机箱名
	
	private String score;   //cpu跑分
	private String score1;  //主板跑分
	private String score2;  //内存跑分
	private String score3;  //硬盘跑分
	private String score4;  //电源跑分
	private String score5;  //显卡跑分
	private String score6;  //机箱跑分
	
	


	public String getAddrname() {
		return addrname;
	}
	public void setAddrname(String addrname) {
		this.addrname = addrname;
	}
	public String getAddrtel() {
		return addrtel;
	}
	public void setAddrtel(String addrtel) {
		this.addrtel = addrtel;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getScore1() {
		return score1;
	}
	public void setScore1(String score1) {
		this.score1 = score1;
	}
	public String getScore2() {
		return score2;
	}
	public void setScore2(String score2) {
		this.score2 = score2;
	}
	public String getScore3() {
		return score3;
	}
	public void setScore3(String score3) {
		this.score3 = score3;
	}
	public String getScore4() {
		return score4;
	}
	public void setScore4(String score4) {
		this.score4 = score4;
	}
	public String getScore5() {
		return score5;
	}
	public void setScore5(String score5) {
		this.score5 = score5;
	}
	public String getScore6() {
		return score6;
	}
	public void setScore6(String score6) {
		this.score6 = score6;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public String getName3() {
		return name3;
	}
	public void setName3(String name3) {
		this.name3 = name3;
	}
	public String getName4() {
		return name4;
	}
	public void setName4(String name4) {
		this.name4 = name4;
	}
	public String getName5() {
		return name5;
	}
	public void setName5(String name5) {
		this.name5 = name5;
	}
	public String getName6() {
		return name6;
	}
	public void setName6(String name6) {
		this.name6 = name6;
	}

	
	
	
	
	
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
