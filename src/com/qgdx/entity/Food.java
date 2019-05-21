package com.qgdx.entity;

public class Food {
	private int fid;
	private String fname;
	private String fprice;
	private String fnotes;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFprice() {
		return fprice;
	}
	public void setFprice(String fprice) {
		this.fprice = fprice;
	}
	public String getFnotes() {
		return fnotes;
	}
	public void setFnotes(String fnotes) {
		this.fnotes = fnotes;
	}
	public Food(int fid, String fname, String fprice, String fnotes) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.fprice = fprice;
		this.fnotes = fnotes;
	}
	public Food() {
		super();
	}
	@Override
	public String toString() {
		return "Food [fid=" + fid + ", fname=" + fname + ", fprice=" + fprice + ", fnotes=" + fnotes + "]";
	}
	
	
}
