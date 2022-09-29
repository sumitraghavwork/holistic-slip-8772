package com.masai.beans;

public class Bidder {

	private String bid;
	private String vid;
	private String tid;
	private int bidAmount;
//	private Date bidDeadline;
	private String status;

	public Bidder() {
		super();
	}

	public Bidder(String bid, String vid, String tid, int bidAmount, String status) {
		super();
		this.bid = bid;
		this.vid = vid;
		this.tid = tid;
		this.bidAmount = bidAmount;
		this.status = status;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getVid() {
		return vid;
	}

	public void setVid(String vid) {
		this.vid = vid;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public int getBidAmount() {
		return bidAmount;
	}

	public void setBidAmount(int bidAmount) {
		this.bidAmount = bidAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Bidder [bid=" + bid + ", vid=" + vid + ", tid=" + tid + ", bidAmount=" + bidAmount + ", status="
				+ status + "]";
	}

}
