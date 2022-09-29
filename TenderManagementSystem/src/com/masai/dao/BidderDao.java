package com.masai.dao;

import java.util.List;

import com.masai.beans.Bidder;

public interface BidderDao {

	public String acceptBid(String applicationId, String tenderId, String vendorId);

	public String rejectBid(String applicationId);

	public String bidTender(String tenderId, String vendorId, int bidAmount,String bidId);

	public List<Bidder> getAllBidsOfaTender(String tenderId);

	public List<Bidder> getAllBidsOfaVendor(String vendorId);
	
	public String getStatusOfABid(String bidId);
}
