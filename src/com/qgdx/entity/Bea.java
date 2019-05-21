package com.qgdx.entity;

public class Bea {
	private int bid;
	private String bname;
	private String baddress;
	private String bprice;
	private String bnotes;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBaddress() {
		return baddress;
	}
	public void setBaddress(String baddress) {
		this.baddress = baddress;
	}
	public String getBprice() {
		return bprice;
	}
	public void setBprice(String bprice) {
		this.bprice = bprice;
	}
	public String getBnotes() {
		return bnotes;
	}
	public void setBnotes(String bnotes) {
		this.bnotes = bnotes;
	}
	public Bea(int bid, String bname, String baddress, String bprice, String bnotes) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.baddress = baddress;
		this.bprice = bprice;
		this.bnotes = bnotes;
	}
	public Bea() {
		super();
	}
	@Override
	public String toString() {
		return "Bea [bid=" + bid + ", bname=" + bname + ", baddress=" + baddress + ", bprice=" + bprice + ", bnotes="
				+ bnotes + "]";
	}
	
	
}
