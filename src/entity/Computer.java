package entity;

import java.io.Serializable;

public class Computer implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private int uid;
	private String rtime;
	private int znumber;
	private int bnumber;
	private int cpuid;
	private int motherboardid;
	private int memoryid;
	private int diskid;
	private int sourceid;
	private int graphicsid;
	private int boxid;
	
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
