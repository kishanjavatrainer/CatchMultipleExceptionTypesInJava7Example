package com.infotech.client;

import com.infotech.exception.CustomException1;
import com.infotech.exception.CustomException2;

/*
 * Rethrowing Exceptions with More Inclusive Type Checking
 */
public class RethrowingExceptionsTest {
	public static void main(String[] args) {
		try {
			doSomeProcessInJava7(20);
		} catch (CustomException1 | CustomException2 e) {
			e.printStackTrace();
		}
		
	}
	
	// this is illegal before Java SE 7
	//we can re-throw an exception which is a supertype of the exception types 
	//declared in the throws clause.
	private static void doSomeProcessInJava7(int errorCode) throws CustomException1, CustomException2 {
	    try {
	        if (errorCode == 1) {
	            throw new CustomException1();
	        } else if(errorCode == 2) {
	            throw new CustomException2();
	        }else{
	        	System.out.println("process will continue...");
	        }
	    } catch (Exception ex) {
	        throw ex;
	    }
	}
	
	
	// this is valid before Java SE 7
	//Because the catch block re-throws the exception of type Exception, 
	//so the throws clause must declare to throw the Exception type
	//private static void doSomeProcessBeforeJava7(int errorCode) throws CustomException1, CustomException2,Exception {
	private static void doSomeProcessBeforeJava7(int errorCode) throws Exception {
		    try {
		        if (errorCode == 1) {
		            throw new CustomException1();
		        } else if(errorCode == 2) {
		            throw new CustomException2();
		        }else{
		        	System.out.println("process will continue...");
		        }
		    } catch (Exception ex) {
		        throw ex;
		    }
		}

}
