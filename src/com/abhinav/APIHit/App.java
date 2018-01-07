package com.abhinav.APIHit;

import java.io.IOException;

public class App {
	
	public static void main(String[] args) {		
		
		// Object Initialization Area
		APIHit newAPI = new APIHit();
		
		
		// Calling function
		try {
			newAPI.getConnectionWithAuthorization("https://www.google.com");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
