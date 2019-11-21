package entity;

import java.io.Serializable;

public class Box implements Serializable {
	private static final long serialVersionUID = 1L;
	private int boxid;
	private String name;
	private String pics;
	private double boxprice;
	private int quantiy;
	private int usetimes;
	private int praise;
	private int state;  //状态
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
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
	public String getPics() {
		return pics;
	}
	public void setPics(String pics) {
		this.pics = pics;
	}
	public double getBoxprice() {
		return boxprice;
	}
	public void setBoxprice(double boxprice) {
		this.boxprice = boxprice;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
