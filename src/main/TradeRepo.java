package com.example.Nid.SB.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import inventory.TradeDetails;

	@Repository
	public interface TradeRepo extends JpaRepository<TradeDetails,String> {
	}

