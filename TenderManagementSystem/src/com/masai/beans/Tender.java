package com.masai.beans;

public class Tender {

	private String tid;
	private String tname;
	private String ttype;
	private int tprice;
	private String tdesc;
//	private String tdeadline;

	public Tender() {
		super();
	}

	public Tender(String tid, String tname, String ttype, int tprice, String tdesc) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.ttype = ttype;
		this.tprice = tprice;
		this.tdesc = tdesc;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTtype() {
		return ttype;
	}

	public void setTtype(String ttype) {
		this.ttype = ttype;
	}

	public int getTprice() {
		return tprice;
	}

	public void setTprice(int tprice) {
		this.tprice = tprice;
	}

	public String getTdesc() {
		return tdesc;
	}

	public void setTdesc(String tdesc) {
		this.tdesc = tdesc;
	}

	@Override
	public String toString() {
		return "Tender [tid=" + tid + ", tname=" + tname + ", ttype=" + ttype + ", tprice=" + tprice + ", tdesc="
				+ tdesc + "]";
	}

}
