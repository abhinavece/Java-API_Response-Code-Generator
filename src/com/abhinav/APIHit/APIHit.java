package com.abhinav.APIHit;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

public class APIHit {
	
	protected void getConnectionWithAuthorization(String urlLink) throws IOException {
		
		URL url = new URL(urlLink);
		
		HttpURLConnection cnxn = (HttpURLConnection) url.openConnection();
		
		cnxn.setDoInput(true);
		// Build the string to be used for Basic Authentication
		String userPassword = "stamps_com" + ":" + "ZF78qZ8cVmSqjEeu";
		// Base64 encode the authentication string
		String encoding = Base64.getEncoder().encode(userPassword.getBytes()).toString();
		// Set Basic Authentication parameters
		cnxn.setRequestProperty("Authorization", "Basic " + encoding);
		
		cnxn.setDoOutput(true);
		cnxn.setDoInput(true);
		int responseCode = cnxn.getResponseCode();

		System.out.println(urlLink + " :: " + responseCode);
	}
	
	protected void postConnectionWithAuthorization(String urlLink) throws IOException {
		URL url = new URL(urlLink);
		
		
	}


}

