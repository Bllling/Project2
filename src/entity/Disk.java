package entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Disk implements Serializable{
	private static final long serialVersionUID = 1L;
	private int diskid;
	private String name;
	private String pics;
	private BigDecimal diskprice;
	private int quantiy;
	private int usetimes;
	private int praise;
	private String score;
	private String powers;
	private String volume;
	private int isssd;
	private String rpm;
	public int getDiskid() {
		return diskid;
	}
	public void setDiskid(int diskid) {
		this.diskid = diskid;
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
	public BigDecimal getDiskprice() {
		return diskprice;
	}
	public void setDiskprice(BigDecimal diskprice) {
		this.diskprice = diskprice;
	}
	public int getQuantiy() {
		return quantiy;
	}
	public void setQuantiy(int quantiy) {
		this.quantiy = quantiy;
	}
	public int getUsetimes() {
		return usetimes;
	}
	public void setUsetimes(int usetimes) {
		this.usetimes = usetimes;
	}
	public int getPraise() {
		return praise;
	}
	public void setPraise(int praise) {
		this.praise = praise;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getPowers() {
		return powers;
	}
	public void setPowers(String powers) {
		this.powers = powers;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public int getIsssd() {
		return isssd;
	}
	public void setIsssd(int isssd) {
		this.isssd = isssd;
	}
	public String getRpm() {
		return rpm;
	}
	public void setRpm(String rpm) {
		this.rpm = rpm;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
