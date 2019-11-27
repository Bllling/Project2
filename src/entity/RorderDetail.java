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
