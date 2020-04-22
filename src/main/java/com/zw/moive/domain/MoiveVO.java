package com.zw.moive.domain;

public class MoiveVO extends Moive{

	private Integer t1;
	private Integer t2;
	private String  d1;
	private String  d2;
	private Double p1;
	private Double p2;
	public Integer getT1() {
		return t1;
	}
	public void setT1(Integer t1) {
		this.t1 = t1;
	}
	public Integer getT2() {
		return t2;
	}
	public void setT2(Integer t2) {
		this.t2 = t2;
	}
	public String getD1() {
		return d1;
	}
	public void setD1(String d1) {
		this.d1 = d1;
	}
	public String getD2() {
		return d2;
	}
	public void setD2(String d2) {
		this.d2 = d2;
	}
	public Double getP1() {
		return p1;
	}
	public void setP1(Double p1) {
		this.p1 = p1;
	}
	public Double getP2() {
		return p2;
	}
	public void setP2(Double p2) {
		this.p2 = p2;
	}
	@Override
	public String toString() {
		return "MoiveVO [t1=" + t1 + ", t2=" + t2 + ", d1=" + d1 + ", d2=" + d2 + ", p1=" + p1 + ", p2=" + p2 + "]";
	}
	
}
