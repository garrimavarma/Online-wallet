package com.cg.OnlineWallet.Exceptions;

public class IdNotFoundException extends RuntimeException{
	public IdNotFoundException(String msg){
        super(msg);
    }

    public IdNotFoundException(String msg,Throwable e){
        super(msg,e);
    }

}