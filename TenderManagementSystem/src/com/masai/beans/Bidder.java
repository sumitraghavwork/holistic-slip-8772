package com.masai.beans;

import java.time.LocalDate;
import java.util.Date;

public class Bidder {

	private String bid;
	private String vid;
	private int tid;
	private int bidAmount;
//	private LocalDate bidDate;
	private String status;

	public Bidder() {
		super();
	}

	public Bidder(String bid, String vid, int tid, int bidAmount, String status) {
		super();
		this.bid = bid;
		this.vid = vid;
		this.tid = tid;
		this.bidAmount = bidAmount;
		this.status = status;
//		this.bidDate = 
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

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
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
