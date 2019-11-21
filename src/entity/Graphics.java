package entity;

import java.io.Serializable;


public class Graphics implements Serializable{
	private static final long serialVersionUID = 1L;
	private int graphicsid;
	private String name;
	private String pics;
	private  double graphicsprice;
	private int quantiy;
	private int usetimes;
	private int praise;
	private String score;
	private String powers;
	private String memory;
	private String width;
	private int state;  //状态
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getGraphicsid() {
		return graphicsid;
	}
	public void setGraphicsid(int graphicsid) {
		this.graphicsid = graphicsid;
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
	public double getGraphicsprice() {
		return graphicsprice;
	}
	public void setGraphicsprice(double graphicsprice) {
		this.graphicsprice = graphicsprice;
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
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
