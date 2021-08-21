package com.example.Nid.SB;

import java.util.*;
import inventory.Service;
import inventory.TradeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class TradeControl {
	    @Autowired
	    Service tradeService;
	    /*
	     */
	    @PostMapping("/trade")
	    public ResponseEntity<String> tradeValidateStore(@RequestBody TradeDetails trade){
	       if(tradeService.isValid(trade)) {
	           tradeService.persist(trade);
	       }else{
	           throw new com.example.Nid.SB.exception.InvalidTradeException(trade.getTradeId()+"  Trade not found");
	       }
	        return ResponseEntity.status(HttpStatus.OK).build();
	    }

	    @GetMapping("/trade")
	    public List<TradeDetails> findAllTrades(){
	        return tradeService.findAll();
	    }
}
