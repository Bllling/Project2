package entity;

import java.io.Serializable;


public class MotherBoard implements Serializable {
	private static final long serialVersionUID = 1L;
	private int motherboardid;
	private String name;
	private String pics;
	private  double motherboardprice;
	private int quantiy;
	private int usetimes;
	private int praise;
	private String score;
	private String powers;
	private String maxmemory;
	private int state;  //状态
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getMotherboardid() {
		return motherboardid;
	}
	public void setMotherboardid(int motherboardid) {
		this.motherboardid = motherboardid;
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
	public double getMotherboardprice() {
		return motherboardprice;
	}
	public void setMotherboardprice(double motherboardprice) {
		this.motherboardprice = motherboardprice;
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
	public String getMaxmemory() {
		return maxmemory;
	}
	public void setMaxmemory(String maxmemory) {
		this.maxmemory = maxmemory;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
