package entity;

import java.io.Serializable;

public class Source implements Serializable {
	private static final long serialVersionUID = 1L;
	private int sourceid;
	private String name;
	private String pics;
	private  double sourceprice;
	private int quantiy;
	private int usetimes;
	private int praise;
	private String score;
	private String maxpowers;
	public int getSourceid() {
		return sourceid;
	}
	public void setSourceid(int sourceid) {
		this.sourceid = sourceid;
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
	public double getSourceprice() {
		return sourceprice;
	}
	public void setSourceprice(double sourceprice) {
		this.sourceprice = sourceprice;
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
	public String getMaxpowers() {
		return maxpowers;
	}
	public void setMaxpowers(String maxpowers) {
		this.maxpowers = maxpowers;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
