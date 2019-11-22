package entity;

import java.io.Serializable;

public class Cpu implements Serializable {
	private static final long serialVersionUID = 1L;
	private int cpuid;
	private String name;
	private String pics;
	private  double cpuprice;
	private int quantiy;
	private int usetimes;
	private int praise;
	private String score;
	private String powers;
	private int cores;
	private int threads;
    private String frequency;
    private String maxfrequency;
    private int state;  //状态
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getCpuid() {
		return cpuid;
	}
	public void setCpuid(int cpuid) {
		this.cpuid = cpuid;
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
	public double getCpuprice() {
		return cpuprice;
	}
	public void setCpuprice(double cpuprice) {
		this.cpuprice = cpuprice;
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
	public int getCores() {
		return cores;
	}
	public void setCores(int cores) {
		this.cores = cores;
	}
	public int getThreads() {
		return threads;
	}
	public void setThreads(int threads) {
		this.threads = threads;
	}
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	public String getMaxfrequency() {
		return maxfrequency;
	}
	public void setMaxfrequency(String maxfrequency) {
		this.maxfrequency = maxfrequency;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}
