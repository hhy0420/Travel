package com.qgdx.entity;

public class Route {
	private int rid;
	private String rstart;
	private String rend;
	private String rscenery;
	private String rnotes;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRstart() {
		return rstart;
	}
	public void setRstart(String rstart) {
		this.rstart = rstart;
	}
	public String getRend() {
		return rend;
	}
	public void setRend(String rend) {
		this.rend = rend;
	}
	public String getRscenery() {
		return rscenery;
	}
	public void setRscenery(String rscenery) {
		this.rscenery = rscenery;
	}
	public String getRnotes() {
		return rnotes;
	}
	public void setRnotes(String rnotes) {
		this.rnotes = rnotes;
	}
	public Route(int rid, String rstart, String rend, String rscenery, String rnotes) {
		super();
		this.rid = rid;
		this.rstart = rstart;
		this.rend = rend;
		this.rscenery = rscenery;
		this.rnotes = rnotes;
	}
	public Route() {
		super();
	}
	@Override
	public String toString() {
		return "Route [rid=" + rid + ", rstart=" + rstart + ", rend=" + rend + ", rscenery=" + rscenery + ", rnotes="
				+ rnotes + "]";
	}
	
	
}
