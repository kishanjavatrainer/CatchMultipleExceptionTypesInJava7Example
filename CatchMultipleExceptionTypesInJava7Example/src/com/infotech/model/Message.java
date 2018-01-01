package com.infotech.model;

public class Message {

	public String welcome(String name){
		String message;
		if(name == null || name.isEmpty()){
			message = "Hello,Stranger";
		}else{
			message = "Hello,"+name;
		}
		return message;
	}
}
