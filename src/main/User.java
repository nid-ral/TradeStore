package com.example.Nid.SB.user;


import inventory.TradeDetails;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

	@Repository
	public class User implements userDAOService{
	    @Override
	    public void save(TradeDetails trade) {
	        trade.setCreatedDate(LocalDate.now());
	        tradeMap.put(trade.getTradeId(),trade);
	    }

	    @Override
	    public List<TradeDetails> findAll() {
	         return tradeMap.values().stream().
	                 collect(Collectors.toList());
	    }

	    @Override
	    public TradeDetails findTrade(String tradeId) {
	        return tradeMap.get(tradeId);
	    }
	}