package com.infotech.client;

import com.infotech.model.Message;

/*
 * Handling More Than One Type of Exception in JDK 7
 */
public class CatchMultipleExceptionTypesInJava7Test {

	public static void main(String[] args) {

		try {
			Class<?> cls = Class.forName("com.infotech.model.Message");
			Object object = cls.newInstance();
			if(object != null){
				Message message =(Message)object;
				String welcome = message.welcome("Joya");
				System.out.println(welcome);
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
			ex.printStackTrace();
		}
	}

}
