package entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Box implements Serializable {
	private static final long serialVersionUID = 1L;
	private int boxid;
	private String name;
	private String pics;
	private BigDecimal boxprice;
	private int quantiy;
	private int usetimes;
	private int praise;
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
	public BigDecimal getBoxprice() {
		return boxprice;
	}
	public void setBoxprice(BigDecimal boxprice) {
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
