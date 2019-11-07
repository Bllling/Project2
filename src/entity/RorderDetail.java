package entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class RorderDetail implements Serializable {
	private static final long serialVersionUID = 1L;
	private String rorderid;
	private int id;
	private int uid;
	private BigDecimal cpuprice;
	private BigDecimal motherboardprice;
	private BigDecimal memoryprice;
	private BigDecimal diskprice;
	private BigDecimal ssdprice;
	private BigDecimal sourceprice;
	private BigDecimal graphicsprice;
	private BigDecimal boxprice;
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
	public BigDecimal getCpuprice() {
		return cpuprice;
	}
	public void setCpuprice(BigDecimal cpuprice) {
		this.cpuprice = cpuprice;
	}
	public BigDecimal getMotherboardprice() {
		return motherboardprice;
	}
	public void setMotherboardprice(BigDecimal motherboardprice) {
		this.motherboardprice = motherboardprice;
	}
	public BigDecimal getMemoryprice() {
		return memoryprice;
	}
	public void setMemoryprice(BigDecimal memoryprice) {
		this.memoryprice = memoryprice;
	}
	public BigDecimal getDiskprice() {
		return diskprice;
	}
	public void setDiskprice(BigDecimal diskprice) {
		this.diskprice = diskprice;
	}
	public BigDecimal getSsdprice() {
		return ssdprice;
	}
	public void setSsdprice(BigDecimal ssdprice) {
		this.ssdprice = ssdprice;
	}
	public BigDecimal getSourceprice() {
		return sourceprice;
	}
	public void setSourceprice(BigDecimal sourceprice) {
		this.sourceprice = sourceprice;
	}
	public BigDecimal getGraphicsprice() {
		return graphicsprice;
	}
	public void setGraphicsprice(BigDecimal graphicsprice) {
		this.graphicsprice = graphicsprice;
	}
	public BigDecimal getBoxprice() {
		return boxprice;
	}
	public void setBoxprice(BigDecimal boxprice) {
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
