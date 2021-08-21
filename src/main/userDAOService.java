package com.example.Nid.SB.user;


import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import inventory.TradeDetails;

public interface userDAOService {
	    public  static Map<String,TradeDetails> tradeMap =new ConcurrentHashMap<>();
	    public void save(TradeDetails trade);
	    List<TradeDetails> findAll();
	    TradeDetails findTrade(String tradeId);
}
