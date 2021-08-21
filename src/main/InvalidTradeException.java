package com.example.Nid.SB.exception;

public class InvalidTradeException extends RuntimeException {
	//Id is trade id here
    private final String id;
    public InvalidTradeException(final String id) {
    	//referring to the uppermost parent
        super("Trade is invalid with id as  " + id);
        this.id = id;
    }
    public String getId() {
        return id;
    }
}