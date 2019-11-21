package entity;

import java.io.Serializable;


public class Memory implements Serializable{
	private static final long serialVersionUID = 1L;
	private int memoryid;
	private String name;
	private String pics;
	private  double memoryprice;
	private int quantiy;
	private int usetimes;
	private int praise;
	private String score;
	private String powers;
	private String volume;
	private String memorytype;
	private String frequency;
	private int state;  //状态
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getMemoryid() {
		return memoryid;
	}
	public void setMemoryid(int memoryid) {
		this.memoryid = memoryid;
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
	public double getMemoryprice() {
		return memoryprice;
	}
	public void setMemoryprice(double memoryprice) {
		this.memoryprice = memoryprice;
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
	public String getMemorytype() {
		return memorytype;
	}
	public void setMemorytype(String memorytype) {
		this.memorytype = memorytype;
	}
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
